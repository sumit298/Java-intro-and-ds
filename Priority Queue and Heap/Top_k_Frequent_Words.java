import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class Top_k_Frequent_Words {
    public static List<String> topKFrequent(String words[], int k) {
        if (words.length == 0)
            return new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        PriorityQueue<String> pq = new PriorityQueue<>(
                (w1, w2) -> map.get(w1).equals(map.get(w2)) ? w2.compareTo(w1) : map.get(w1) - map.get(w2));
        for (String word : map.keySet()) {
            pq.add(word);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        List<String> result = new ArrayList<>();
        while (!pq.isEmpty()) {
            result.add(pq.poll());
        }
        Collections.reverse(result);
        return result;

    }

    public static void main(String[] args) {
        String[] words = { "i", "love", "leetcode", "i", "love", "coding" };
        int k = 2;
        System.out.println(topKFrequent(words, k));
    }

    // This is a method that takes in a list of words (represented as an array of
    // strings) and an integer k, and returns a list of the k most frequently
    // occurring words in the input list, sorted in descending order of frequency.

    // The method first checks if the input list is empty, in which case it returns
    // an empty list. If the input list is not empty, it creates a map that stores
    // the frequency of each word in the list. It then creates a priority queue with
    // a custom comparator that compares the frequencies of two words. If the
    // frequencies are equal, the words are compared lexicographically (i.e., based
    // on their spelling). This ensures that the most frequently occurring words
    // will have the highest priority in the queue.

    // Next, the method adds all the words from the map to the priority queue. It
    // then enters a loop that continues until the priority queue has k elements. In
    // each iteration of the loop, it adds a word to the priority queue and removes
    // the least frequent word (if the queue has more than k elements).

    // Finally, the method creates a list of the k most frequent words by removing
    // them from the priority queue and adding them to the list. It then reverses
    // the list so that the words are sorted in descending order of frequency, and
    // returns the list.

    // without priority queue
    public static List<String> topKFrequent2(String words[], int k) {
        if (words.length == 0)
            return new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        List<String> candidates = new ArrayList<>(map.keySet());
        Collections.sort(candidates,
                (w1, w2) -> map.get(w1).equals(map.get(w2)) ? w1.compareTo(w2) : map.get(w2) - map.get(w1));
        return candidates.subList(0, k);
    }

}

// if(words.length==0) return new ArrayList<>();
// This line checks if the input list of words is empty. If it is, the method
// returns an empty list.

// Map<String, Integer> map = new HashMap<>();
// This line creates a map (a data structure that stores key-value pairs) that
// will store the frequency of each word in the input list.

// for(String word: words){
// map.put(word, map.getOrDefault(word, 0)+1);
// }
// This loop iterates over each word in the input list and increments the
// frequency of the word in the map by 1. If the word is not yet in the map, it
// is added to the map with a frequency of 1.

// PriorityQueue<String> pq = new PriorityQueue<>(
// (w1, w2) -> map.get(w1).equals(map.get(w2)) ? w2.compareTo(w1) :
// map.get(w1)-map.get(w2)
// );
// This line creates a priority queue (a data structure that allows you to
// retrieve the element with the highest priority) with a custom comparator that
// compares the frequencies of two words. If the frequencies are equal, the
// words are compared lexicographically (i.e., based on their spelling). This
// ensures that the most frequently occurring words will have the highest
// priority in the queue.

// for(String word: map.keySet()){
// pq.add(word);
// if(pq.size()>k){
// pq.poll();
// }
// }
// This loop iterates over each word in the map and adds it to the priority
// queue. If the priority queue has more than k elements, it removes the least
// frequent word from the queue. This ensures that the priority queue only
// contains the k most frequently occurring words.

// List<String> result = new ArrayList<>();
// while(!pq.isEmpty()){
// result.add(pq.poll());
// }
// This block of code creates a list of the k most frequent words by removing
// them from the priority queue and adding them to the list.

// Collections.reverse(result);
// return result;
// Finally, this line reverses the list so that the words are sorted in
// descending order of frequency, and the method returns the list.