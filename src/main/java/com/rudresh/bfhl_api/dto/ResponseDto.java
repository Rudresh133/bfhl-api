package com.rudresh.bfhl_api.dto;

import java.util.List;
import java.util.Map;

public class ResponseDto {

    private boolean is_success;
    private String request_id;

    private List<String> odd_numbers;
    private List<String> even_numbers;
    private List<String> alphabets;
    private List<String> special_characters;

    private String sum;
    private String largest_number;
    private String smallest_number;

    private int alphabet_count;
    private int number_count;
    private int special_character_count;

    private boolean contains_duplicates;
    private int unique_element_count;

    private long processing_time_ms;

    private int vowel_count;

    private List<String> sorted_numbers;

    private Map<String,Integer> alphabet_frequency;

    public boolean isIs_success() {
        return is_success;
    }

    public void set_success(boolean is_success) {
        this.is_success = is_success;
    }

    public String getRequest_id() {
        return request_id;
    }

    public void setRequest_id(String request_id) {
        this.request_id = request_id;
    }

    public List<String> getOdd_numbers() {
        return odd_numbers;
    }

    public void setOdd_numbers(List<String> odd_numbers) {
        this.odd_numbers = odd_numbers;
    }

    public List<String> getEven_numbers() {
        return even_numbers;
    }

    public void setEven_numbers(List<String> even_numbers) {
        this.even_numbers = even_numbers;
    }

    public List<String> getAlphabets() {
        return alphabets;
    }

    public void setAlphabets(List<String> alphabets) {
        this.alphabets = alphabets;
    }

    public List<String> getSpecial_characters() {
        return special_characters;
    }

    public void setSpecial_characters(List<String> special_characters) {
        this.special_characters = special_characters;
    }

    public String getSum() {
        return sum;
    }

    public void setSum(String sum) {
        this.sum = sum;
    }

    public String getLargest_number() {
        return largest_number;
    }

    public void setLargest_number(String largest_number) {
        this.largest_number = largest_number;
    }

    public String getSmallest_number() {
        return smallest_number;
    }

    public void setSmallest_number(String smallest_number) {
        this.smallest_number = smallest_number;
    }

    public int getAlphabet_count() {
        return alphabet_count;
    }

    public void setAlphabet_count(int alphabet_count) {
        this.alphabet_count = alphabet_count;
    }

    public int getNumber_count() {
        return number_count;
    }

    public void setNumber_count(int number_count) {
        this.number_count = number_count;
    }

    public int getSpecial_character_count() {
        return special_character_count;
    }

    public void setSpecial_character_count(int special_character_count) {
        this.special_character_count = special_character_count;
    }

    public boolean isContains_duplicates() {
        return contains_duplicates;
    }

    public void setContains_duplicates(boolean contains_duplicates) {
        this.contains_duplicates = contains_duplicates;
    }

    public int getUnique_element_count() {
        return unique_element_count;
    }

    public void setUnique_element_count(int unique_element_count) {
        this.unique_element_count = unique_element_count;
    }

    public long getProcessing_time_ms() {
        return processing_time_ms;
    }

    public void setProcessing_time_ms(long processing_time_ms) {
        this.processing_time_ms = processing_time_ms;
    }

    public int getVowel_count() {
        return vowel_count;
    }

    public void setVowel_count(int vowel_count) {
        this.vowel_count = vowel_count;
    }

    public List<String> getSorted_numbers() {
        return sorted_numbers;
    }

    public void setSorted_numbers(List<String> sorted_numbers) {
        this.sorted_numbers = sorted_numbers;
    }

    public Map<String, Integer> getAlphabet_frequency() {
        return alphabet_frequency;
    }

    public void setAlphabet_frequency(Map<String, Integer> alphabet_frequency) {
        this.alphabet_frequency = alphabet_frequency;
    }
}