class TimeMap {
    private static class Node {
        int timestamp;
        String value;

        public Node(int timestamp, String value) {
            this.timestamp = timestamp;
            this.value = value;
        }
    }

    private HashMap<String, List<Node>> keyStore;

    public TimeMap() {
        keyStore = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        keyStore.putIfAbsent(key, new ArrayList());
        keyStore.get(key).add(new Node(timestamp, value));
    }
    
    public String get(String key, int timestamp) { 
        String result = "";
        if (!keyStore.containsKey(key)) {
            return result;
        }

        List<Node> values = keyStore.get(key);
        int l = 0;
        int r = values.size() - 1;
        
        while (l <= r) {
            int mid = (l + r) / 2;
            if (values.get(mid).timestamp <= timestamp) {
                result = values.get(mid).value;
                l = mid+1;
            } else {
                r = mid - 1;
            }
        }
        return result;
    }
}
 