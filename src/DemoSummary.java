/*
 * <summary></summary>
 * <author>He Han</author>
 * <email>hankcs.cn@gmail.com</email>
 * <create-date>2014/12/7 19:25</create-date>
 *
 * <copyright file="DemoChineseNameRecoginiton.java" company="上海林原信息科技有限公司">
 * Copyright (c) 2003-2014+ 上海林原信息科技有限公司. All Right Reserved+ http://www.linrunsoft.com/
 * This source is subject to the LinrunSpace License. Please contact 上海林原信息科技有限公司 to get more information.
 * </copyright>
 */


import com.hankcs.hanlp.HanLP;
import com.hankcs.hanlp.summary.TextRankSentence;

import java.util.List;

public class DemoSummary
{
    public static void main(String[] args)
    {
        String document = "北京时间7月28日，百度发布了截至6月30日的2015财年第二季度未审计财报。财报显示，"
        		+ "该季度百度在技术研发方面投入持续增加，同比上涨56.2%，为27.13亿元人民币;O2O业务变现能力进一步增强"
        		+ "，百度糯米、百度外卖和去哪儿合共交易额达405亿元人民币，较去年同期增长109%，此前，百度创始人兼CEO李"
        		+ "彦宏曾公开表示，“互联网正在加速淘汰传统产业”，而“技术将改变互联网”，从本次财报情况看，未来百度领先的技"
        		+ "术优势将成为百度O2O服务的增长引擎。第二季度，百度在技术落地，改造传统行业方面表现抢眼。以百度外卖为例，7"
        		+ "月5日，百度外卖总经理巩振兵在2015MIIC上透露，百度外卖“真正想做的事情是同城物流”。而目前百度外卖最具竞"
        		+ "争力的外卖智能调度系统，就是通过复杂的计算，由计算机把合适的订单派给合适的百度外卖骑士，彻底摆脱了传统外卖的"
        		+ "人工调度。　这套调度系统还会根据餐馆与用户的位置来为骑士规划出最优的送餐路径，让骑士的每一次出车都能最高效的"
        		+ "完成用户的点单需求。相比于快递公司的人工派单和其他外卖厂家的抢单，百度外卖的派送效率更高，骑士的收入也更加优"
        		+ "厚，为百度外卖拓展市场，提高商业变现能力提供了机会。除外卖行业，百度还用技术改造了传统客服业。研发了一套名为"
        		+ "“夜莺”的客服系统，利用人工智能技术提升O2O服务中的重要一环——客户服务的效率和品质，弥补普通客服的缺陷与不足"
        		+ "，全面改善用户的客服体验。目前，夜莺客服系统已经被应用在百度糯米、百度钱包等产品中，预计“夜莺”还将被应用于更"
        		+ "多百度及其他厂商的后台客服系统。从中长期来看，百度在技术研发和推广方面的投入还会不断提升，特别是在现有的O2O服"
        		+ "务产业链上，有大量潜在消费者的需求还没有被挖掘出来。百度糯米所建筑的O2O生活服务平台可以让消费者的需求与商家服"
        		+ "务的转化路径变得更短，让商家的营销更具实效性。　随着百度在语音识别、图像识别、ImageQA、自然语言处理和机器翻"
        		+ "译等领域的研究成果的进一步完善，将有大批类似智能调度系统、夜莺客服系统这样的人工智能技术落地，以往需要人工实现"
        		+ "的工作都将逐步转由机器完成，用户将从中获得更好的服务体验。技术作为百度的核心竞争力，将加快百度O2O服务平台的发"
        		+ "展进程，推动更多传统企业拥抱互联网转型升级，为传统行业的改造提供助力。";
        List<String> sentenceList = HanLP.extractSummary(document, 5);
        System.out.println(sentenceList);
    }
}
