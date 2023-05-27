package com.callBackend.callFlow.routes;

import com.callBackend.callFlow.models.ResponseMessage;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.RequestBody;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/call")

public class CallRoute {
//    @GetMapping("/callCustomer")
//    public ResponseEntity<ResponseMessage> callCustomer() {
//
//        try{
//            OkHttpClient client = new OkHttpClient();
//
//            MediaType mediaType = MediaType.parse("application/json");
//            RequestBody body = RequestBody.create(mediaType,
//                    "{\"callFlowConfiguration\":" +
//                            "{\"initiateCall_1\":" +
//                            "{\"callerId\":\"8047538114\"," +
//                            "\"mergingStrategy\":\"SEQUENTIAL\"," +
//                            "\"minParticipantToTerminate\":0," +
//                            "\"maxParticipant\":2," +
//                            "\"callBackURLs\":" + "[" +
//                            "{\"eventType\":\"ALL\"," +
//                            "\"notifyURL\":\"http://abcd.in/dummyCallback\"," +
//                            "\"method\":\"POST\"," +
//                            "\"headers\":{\"Content-Type\":\"application/json\"}}" +
//                            "]," +
//                            "\"participants\":[" +
//                            "{\"participantAddress\":\"9999999997\"," +
//                            "\"callerId\":\"8047538114\"," +
//                            "\"participantName\":\"A\"," +
//                            "\"maxRetries\":1," +
//                            "\"maxTime\":0," +
//                           "\"maxConversationDuration\":0" +
//                            "}" + "]," +
//                            "\"maxTime\":0" +
//                            "}," +
//                            "\"record\":{" +
//                                "\"enabled\":false," +
//                                "\"recordConfig\":{\"beep\":true}" +
//                            "}," +
//                                "\"addParticipant_1\":{" +
//                                    "\"mergingStrategy\":\"SEQUENTIAL\"," +
//                            "        \"participants\":[" +
//                                                "{\"participantAddress\":\"9999999991\"," +
//                                                    "\"callerId\":\"9999999992\"," +
//                                                    "\"enableEarlyMedia\":true," +
//                                                    "\"participantName\":\"A\"," +
//                                                    "\"maxRetries\":1,\"maxTime\":0}]}," +
//                                                    "\"playAudio_1\":{\"audioURL\":\"http://abcd.in/welcome_jll.wav\"}," +
//                                                    "\"playAudio_2\":{\"audioURL\":\"http://abcd.in/prompts/ring2.wav\"}" +
//                            "}," +
//                                "\"callFlowId\":\"Dz1WDCde3+5W6uacPYZRyb8fwSVW9aPJTBPy7+SgJfpinJbkYHGs6bCHmIh3WUETFL6zBQjwbIpZN3fimgePdw==\"," +
//                            "\"callType\":\"OUTBOUND\"," +
//                            "\"callerId\":9999999999," +
//                            "\"callingParticipant\":9999999997," +
//                            "\"customerId\":\"TEST_CUSTOMER\"," +
//                            "\"events\":[" +
//                                "{" +
//                                        "\"allowedEvents\":" + "[\"CallEarlyAnswered\"]," +
//                            "           \"eventType\":\"ALL\"," +
//                                        "\"headers\":" +
//                                                "{" +
//                            "                       \"property1\":" + "\"string\"," +
//                                                    "\"property2\":\"string\"}," +
//                                                    "\"method\":\"POST\"," +
//                                                    "\"notifyURL\":\"string\"," +
//                                                    "\"projectId\":\"string\"," +
//                                                    "\"serviceId\":\"string\"" +
//                                "}]," +
//                            "\"metaData\":{}," +
//                            "\"vmSessionId\":\"5ef123456781234g\"}");
//            Request request = new Request.Builder()
//                    .url("http://openapi.airtel.in/gateway/airtel-xchange/v2/api-docs/v1/executeCallFlow?customer=SOME_STRING_VALUE")
//                    .post(body)
//                    .addHeader("accept", "application/json")
//                    .addHeader("content-type", "*/*")
//                    .build();
//
//            Response response = client.newCall(request).execute();
//        }
//        catch(Exception e){
//
//        }
//
//
//    }

}
