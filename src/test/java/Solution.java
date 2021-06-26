import lombok.extern.slf4j.Slf4j;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Slf4j
class Solution {

//  A precedence rule is given as "P>E", which means that letter "P" is followed by letter "E". Write a function, given an array of precedence rules, that finds the word represented by the given rules. Note: Each represented word contains a set of unique characters, i.e. the word does not contain duplicate letters.
    public String findWordV1(String[] input) {
        Set<Character> start = new HashSet<>();
        Set<Character> end = new HashSet<>();
        Map<Character, Character> map = new HashMap<>();
        for (String in : input) {
            final char s = in.charAt(0);
            final char e = in.charAt(2);
            start.add(s);
            end.add(e);
            map.put(s, e);
        }

        start.removeAll(end);
        final Character s = start.iterator().next(); //find the head

        final StringBuilder sb = new StringBuilder();
        sb.append(s);
        while(!map.isEmpty()) {
            final Character t = map.remove(sb.charAt(sb.length() - 1));
            sb.append(t);
        }
        return sb.toString();
    }

    public String findWordV0(String[] input) {
        final Set<String> set = Stream.of(input).collect(Collectors.toSet());
        final Map<Character, Node> map = new HashMap<>();
        while (set.size() != 0) {
            final Iterator<String> iterator = set.iterator();
            Set<String> toBeRemoved = new HashSet<>();
            while (iterator.hasNext()) {
                final String next = iterator.next();
                final Node[] nodes = get(next);
                if (!map.containsKey(nodes[0].value) && !map.containsKey(nodes[1].value)) {
                    map.put(nodes[0].value, nodes[0]);
                    map.put(nodes[1].value, nodes[1]);
                    nodes[0].next = nodes[1];
                    nodes[1].pre = nodes[0];
                    toBeRemoved.add(next);
                } else if (map.containsKey(nodes[0].value) && map.containsKey(nodes[1].value)) {
                    map.get(nodes[0].value).next = map.get(nodes[1].value);
                    map.get(nodes[1].value).pre = map.get(nodes[0].value);
                    toBeRemoved.add(next);
                } else if (map.containsKey(nodes[0].value)) {
                    final Node head = map.get(nodes[0].value);
                    head.next = nodes[1];
                    nodes[1].pre = head;
                    map.put(nodes[1].value, nodes[1]);
                    toBeRemoved.add(next);
                } else if (map.containsKey(nodes[1].value)) {
                    map.put(nodes[0].value, nodes[0]);
                    nodes[0].next = map.get(nodes[1].value);
                    map.get(nodes[1].value).pre = nodes[0];
                    toBeRemoved.add(next);
                }
            }
            set.removeAll(toBeRemoved);
            log.info("Set: {}", set);
        }

        Node pointer = map.get(input[0].charAt(0));
        while (pointer.pre != null) {
            pointer = pointer.pre;
        }

        StringBuilder stringBuilder = new StringBuilder();
        while (pointer != null) {
            stringBuilder.append(pointer.value);
            pointer = pointer.next;
        }

        return stringBuilder.toString();
    }

    private Node[] get(String in) {
        return new Node[]{new Node(in.charAt(0)), new Node(in.charAt(2))};
    }

    class Node {
        char value;
        Node next;
        Node pre;

        public Node(final char value) {
            this.value = value;
        }
    }

}