package com.academy.tests.serialization;

import com.academy.tests.fold.left.Entry;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {

//        ObjectMapper mapper = new ObjectMapper();
        XmlMapper mapper = new XmlMapper();

        mapper.registerModule(new JavaTimeModule());
        mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

        System.out.println(
                mapper.writeValueAsString(Entry.Builder.newWithdraw(new BigDecimal(100)))
        );
        System.out.println(
                 mapper.writeValueAsString(Entry.Builder.newDeposit(new BigDecimal(20)))
        );


        List<Entry> entries = Arrays.asList(
                Entry.Builder.newWithdraw(new BigDecimal(100)),
                Entry.Builder.newWithdraw(new BigDecimal(100)),
                Entry.Builder.newWithdraw(new BigDecimal(100)),
                Entry.Builder.newWithdraw(new BigDecimal(100)),
                Entry.Builder.newWithdraw(new BigDecimal(100)),
                Entry.Builder.newWithdraw(new BigDecimal(100)),
                Entry.Builder.newWithdraw(new BigDecimal(100)),
                Entry.Builder.newWithdraw(new BigDecimal(100)),
                Entry.Builder.newWithdraw(new BigDecimal(100)),
                Entry.Builder.newWithdraw(new BigDecimal(100)),
                Entry.Builder.newWithdraw(new BigDecimal(100)),
                Entry.Builder.newWithdraw(new BigDecimal(100)),
                Entry.Builder.newWithdraw(new BigDecimal(100)),
                Entry.Builder.newWithdraw(new BigDecimal(100))
        );


        System.out.println( mapper.writeValueAsString(entries));

//        String jsonText = "{\"occurAt\":\"2019-09-30T16:03:18.809042\",\"value\":20,\"type\":\"DEPOSIT\"}";
//
//        Entry entry = mapper.readValue(jsonText, Entry.class);
//
//        System.out.println(entry.getValue());
//        System.out.println(entry.getOccurAt());
//        System.out.println(entry.getType());
//
//        String jsonText2  = "[{\"occurAt\":\"2019-09-30T16:16:47.211725\",\"value\":100,\"type\":\"WITHDRAW\"},{\"occurAt\":\"2019-09-30T16:16:47.211754\",\"value\":100,\"type\":\"WITHDRAW\"},{\"occurAt\":\"2019-09-30T16:16:47.211769\",\"value\":100,\"type\":\"WITHDRAW\"},{\"occurAt\":\"2019-09-30T16:16:47.211782\",\"value\":100,\"type\":\"WITHDRAW\"},{\"occurAt\":\"2019-09-30T16:16:47.211794\",\"value\":100,\"type\":\"WITHDRAW\"},{\"occurAt\":\"2019-09-30T16:16:47.211805\",\"value\":100,\"type\":\"WITHDRAW\"},{\"occurAt\":\"2019-09-30T16:16:47.211817\",\"value\":100,\"type\":\"WITHDRAW\"},{\"occurAt\":\"2019-09-30T16:16:47.211828\",\"value\":100,\"type\":\"WITHDRAW\"},{\"occurAt\":\"2019-09-30T16:16:47.21184\",\"value\":100,\"type\":\"WITHDRAW\"},{\"occurAt\":\"2019-09-30T16:16:47.211851\",\"value\":100,\"type\":\"WITHDRAW\"},{\"occurAt\":\"2019-09-30T16:16:47.211861\",\"value\":100,\"type\":\"WITHDRAW\"},{\"occurAt\":\"2019-09-30T16:16:47.211872\",\"value\":100,\"type\":\"WITHDRAW\"},{\"occurAt\":\"2019-09-30T16:16:47.211882\",\"value\":100,\"type\":\"WITHDRAW\"},{\"occurAt\":\"2019-09-30T16:16:47.211893\",\"value\":100,\"type\":\"WITHDRAW\"}]";
//
//        List<Entry> entries2 = mapper.readValue(jsonText2, new TypeReference<List<Entry>>(){});
//
//        entries2.forEach(System.out::println);

    }
}
