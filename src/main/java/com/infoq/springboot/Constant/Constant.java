package com.infoq.springboot.Constant;

/**
 * Created by nick on 2016/3/18.
 */
public class Constant {

    public static final String TEST_TASK = "tast_task";
    public static final String DOCTOR_ACCEPT = "doctor_accept";
    public static final String USER_RAISE_QUESTION = "user_raise_question";
    public static final String DOCTOR_REFUSE = "doctor_refuse";
    public static final String DOCTOR_ANSWER = "doctor_answer";
    public static final String USER_RAISE_QUESTION_COMMENT = "user_raise_question_comment";
    public static final String DOCTOR_EVALUATED = "doctor_evaluated";//医生收到评价
    public static final String DOCTOR_NOREPLY = "doctor_noreply";//医生接收后15分钟未回复
    public static final String DOCTOR_USER_RAISE_QUESTION = "doctor_user_raise_question";//用户提交问诊问题
    public static final String USER_QUESTION_IS_REPLIED = "user_question_is_replied";//用户的问题被回复
    public static final String VERIFICATION_BIND_MEDIC = "bind_medic_notice";
    public static final Integer PIC_INQURY = 1;//图文咨询
    public static final Integer REPORT_ANS = 2;//解读报告


    public static final String TASK_TRACKER_NODE_GROUP = "healthcloud_task_track";
    public static final String JOB_CLIENT_NODE_GROUP = "healthcloud_jobclient";
    public static final String JOB_CLIENT_DATA_PATH = "/usr/local/lts/jobclient";
    public static final String TASK_TRACKER_DATA_PATH = "/usr/local/lts/jobtracker";
    public static final String QUESTION_NOT_RESPONSE = "您的问题被关闭";
    public static final String DOCTOR_NOT_RESPONSE_IN_30_MINS = "您有一条问题已被关闭";
    public static final String USER_NOT_COMMENT_IN_24_HOURS = "您的问题已结束";
    public static final String QUESTION_NOT_RESPONSE_DESC = "医生未及时回复您的%s，点击查看具体原因";
    public static final String USER_NOT_COMMENT_DESC = "您的%s已结束，请评价医生";
    public static final String QUESTION_NOT_ACCEPT_DESC = "医生未接受您的%s，点击查看具体原因";
    public static final String QUESTION_IS_REPLIED_TITLE = "您的问题已回复";
    public static final String QUESTION_IS_REPLIED_DESC = "医生回复了您的%s，点击查看";


    public static final String DOCTOR_EVALUATED_TITLE = "您有新的用户评价您啦";
    public static final String DOCTOR_EVALUATED_DESC = "您有新的用户评价您啦";
    public static final String DOCTOR_NOREPLY_TITLE = "您有一条问题需要处理";
    public static final String DOCTOR_NOREPLY_DESC = "您有一条问题超过15分钟未回复,请赶紧去解答吧";
    public static final String DOCTOR_NOT_RESPONSE_DESC = "您有一条问题30分钟内未回复，已被关闭";
    public static final String DOCTOR_USER_RAISE_QUESTION_TITLE = "您有新的问诊,来看看吧";
    public static final String DOCTOR_USER_RAISE_QUESTION_DESC = "您有新的问诊,来看看吧";

    public static final String DOCTOR_QUESTION_NOT_PROCESS_JUMP_URL = "com.wondersgroup.healthcloud://doctor/inquiry/todo_list?tab=2&orderID=%s&orderStatus=%s";
    public static final String DOCTOR_EVALUATED_JUMP_URL = "com.wondersgroup.healthcloud://doctor/inquiry/patient_evalution?doctor_id=%s&orderID=%s&orderStatus=%s";
    public static final String DOCTOR_NOREPLY_JUMP_URL = "com.wondersgroup.healthcloud://doctor/inquiry/my_chat?orderID=%s&groupId=%s&inquiryStatus=%s&inquiryDesc=%s";
    public static final String DOCTOR_USER_RAISE_QUESTION_JUMP_URL = "com.wondersgroup.healthcloud://doctor/inquiry/todo_list?tab=0&orderID=%s&orderStatus=%s";

    public static final String USER_QUESTION_NOT_ACCEPT_JUMP_URL = "";
    public static final String USER_DIAGNOSIS_LIST_JUMP_URL = "com.wondersgroup.healthcloud://patient/inquiry/detail?orderID=%s&orderStatus=%s";
    public static final String USER_QUESTION_IS_REPLIED_JUMP_URL = "com.wondersgroup.healthcloud://patient/inquiry/my_chat?orderId=%s&groupId=%s&inquiryStatus=%s&inquiryDesc=%s&doctorUid=%s";
    public static final String USER_24H_NOT_EVALUATED_JUMP_URL = "com.wondersgroup.healthcloud://patient/inquiry/my_chat?orderId=%s&groupId=%s&inquiryStatus=%s&inquiryDesc=%s&doctorUid=%s";


}
