package com.example.datastructurespractice.Medium;

public class EnglishWords {
        private static final String[] LESS_THAN_20 = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        private static final String[] TENS = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        private static final String[] THOUSANDS = {"", "Thousand", "Million", "Billion"};

        public static String numberToWords(int num) {
            if (num == 0) return "Zero";

            int i = 0;
            StringBuilder words = new StringBuilder();

            while (num > 0) {
                if (num % 1000 != 0)
                    words.insert(0, numberToWordsLessThanOneThousand(num % 1000) + THOUSANDS[i] + " ");
                num /= 1000;
                i++;
            }

            return words.toString().trim();
        }

        private static String numberToWordsLessThanOneThousand(int num) {
            if (num == 0)
                return "";
            else if (num < 20)
                return LESS_THAN_20[num] + " ";
            else if (num < 100)
                return TENS[num / 10] + " " + numberToWordsLessThanOneThousand(num % 10);
            else
                return LESS_THAN_20[num / 100] + " Hundred " + numberToWordsLessThanOneThousand(num % 100);
        }

}
