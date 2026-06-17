package com.rudresh.bfhl_api.service.impl;

	import com.rudresh.bfhl_api.dto.RequestDto;
	import com.rudresh.bfhl_api.dto.ResponseDto;
	import com.rudresh.bfhl_api.service.ApiService;
	import org.springframework.stereotype.Service;

	import java.util.*;
	import java.util.regex.Matcher;
	import java.util.regex.Pattern;

	@Service
	public class ApiServiceImpl implements ApiService {

	    @Override
	    public ResponseDto process(RequestDto request, String requestId) {

	        long start = System.currentTimeMillis();
	        ResponseDto response = new ResponseDto();
	        List<String> oddNumbers = new ArrayList<>();
	        List<String> evenNumbers = new ArrayList<>();
	        List<String> alphabets = new ArrayList<>();
	        List<String> specialCharacters = new ArrayList<>();
	        List<String> sortedNumbers = new ArrayList<>();

	        Map<String, Integer> alphabetFrequency = new HashMap<>();

	        Set<String> uniqueValues = new LinkedHashSet<>();

	        boolean containsDuplicates = false;

	        double sum = 0;
	        Double largest = null;
	        Double smallest = null;

	        int vowelCount = 0;
	        int alphabetCount = 0;
	        int numberCount = 0;
	        int specialCount = 0;

	        for (String item : request.getData()) {

	            if (item == null || item.trim().isEmpty()) {
	                continue;
	            }

	            if (!uniqueValues.add(item)) {
	                containsDuplicates = true;
	                continue;
	            }

	            if (item.matches("-?\\d+(\\.\\d+)?")) {

	                double num = Double.parseDouble(item);

	                sum += num;
	                numberCount++;

	                sortedNumbers.add(item);

	                if (largest == null || num > largest)
	                    largest = num;

	                if (smallest == null || num < smallest)
	                    smallest = num;

	                if (num % 2 == 0)
	                    evenNumbers.add(item);
	                else
	                    oddNumbers.add(item);
	            }

	            else if (item.matches("[a-zA-Z]+")) {

	                String upper = item.toUpperCase();

	                alphabets.add(upper);

	                alphabetCount += upper.length();

	                for (char c : upper.toCharArray()) {

	                    alphabetFrequency.put(
	                            String.valueOf(c),
	                            alphabetFrequency.getOrDefault(
	                                    String.valueOf(c), 0) + 1);

	                    if ("AEIOU".indexOf(c) >= 0)
	                        vowelCount++;
	                }
	            }

	            else if (item.matches(".*[a-zA-Z].*")
	                    && item.matches(".*\\d.*")) {

	                Matcher letters =
	                        Pattern.compile("[A-Za-z]+")
	                                .matcher(item);

	                while (letters.find()) {

	                    String word =
	                            letters.group().toUpperCase();

	                    alphabets.add(word);

	                    alphabetCount += word.length();

	                    for (char c : word.toCharArray()) {

	                        alphabetFrequency.put(
	                                String.valueOf(c),
	                                alphabetFrequency.getOrDefault(
	                                        String.valueOf(c), 0) + 1);

	                        if ("AEIOU".indexOf(c) >= 0)
	                            vowelCount++;
	                    }
	                }

	                Matcher numbers =
	                        Pattern.compile("\\d+")
	                                .matcher(item);

	                while (numbers.find()) {

	                    String numStr =
	                            numbers.group();

	                    double num =
	                            Double.parseDouble(numStr);

	                    sum += num;
	                    numberCount++;

	                    sortedNumbers.add(numStr);

	                    if (largest == null || num > largest)
	                        largest = num;

	                    if (smallest == null || num < smallest)
	                        smallest = num;

	                    if (num % 2 == 0)
	                        evenNumbers.add(numStr);
	                    else
	                        oddNumbers.add(numStr);
	                }
	            }

	            else {

	                specialCharacters.add(item);
	                specialCount++;
	            }
	        }

	        sortedNumbers.sort((a, b) ->
	                Double.compare(
	                        Double.parseDouble(a),
	                        Double.parseDouble(b)));

	        response.set_success(true);
	        response.setRequest_id(requestId);

	        response.setOdd_numbers(oddNumbers);
	        response.setEven_numbers(evenNumbers);
	        response.setAlphabets(alphabets);
	        response.setSpecial_characters(specialCharacters);

	        response.setSum(String.valueOf(sum));

	        response.setLargest_number(
	                largest == null ? null :
	                        String.valueOf(largest));

	        response.setSmallest_number(
	                smallest == null ? null :
	                        String.valueOf(smallest));

	        response.setAlphabet_count(alphabetCount);
	        response.setNumber_count(numberCount);
	        response.setSpecial_character_count(specialCount);

	        response.setContains_duplicates(
	                containsDuplicates);

	        response.setUnique_element_count(
	                uniqueValues.size());

	        response.setVowel_count(vowelCount);

	        response.setSorted_numbers(
	                sortedNumbers);

	        response.setAlphabet_frequency(
	                alphabetFrequency);

	        response.setProcessing_time_ms(
	                System.currentTimeMillis() - start);

	        return response;
	    }
	}


