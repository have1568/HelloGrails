package hellograils

import com.alibaba.fastjson.JSONObject
import grails.gorm.transactions.Rollback
import grails.testing.mixin.integration.Integration
import spock.lang.Specification

@Integration
@Rollback
class CountryPhoneCodeSpec extends Specification {

    def setup() {
        CountryPhoneCode.deleteAll()
        List<CountryPhoneCode> codes = JSONObject.parseArray("[{\"shortName\":\"AD\",\"chineseName\":\"安道尔共和国\",\"englishName\":\"Andorra\",\"phoneCode\":\"376\"},{\"shortName\":\"AE\",\"chineseName\":\"阿拉伯联合酋长国\",\"englishName\":\"United Arab Emirates\",\"phoneCode\":\"971\"},{\"shortName\":\"AF\",\"chineseName\":\"阿富汗\",\"englishName\":\"Afghanistan\",\"phoneCode\":\"93\"},{\"shortName\":\"AG\",\"chineseName\":\"安提瓜和巴布达\",\"englishName\":\"Antigua and Barbuda\",\"phoneCode\":\"1268\"},{\"shortName\":\"AI\",\"chineseName\":\"安圭拉岛\",\"englishName\":\"Anguilla\",\"phoneCode\":\"1264\"},{\"shortName\":\"AL\",\"chineseName\":\"阿尔巴尼亚\",\"englishName\":\"Albania\",\"phoneCode\":\"355\"},{\"shortName\":\"AM\",\"chineseName\":\"亚美尼亚\",\"englishName\":\"Armenia\",\"phoneCode\":\"374\"},{\"shortName\":\" \",\"chineseName\":\"阿森松\",\"englishName\":\"Ascension\",\"phoneCode\":\"247\"},{\"shortName\":\"AO\",\"chineseName\":\"安哥拉\",\"englishName\":\"Angola\",\"phoneCode\":\"244\"},{\"shortName\":\"AR\",\"chineseName\":\"阿根廷\",\"englishName\":\"Argentina\",\"phoneCode\":\"54\"},{\"shortName\":\"AT\",\"chineseName\":\"奥地利\",\"englishName\":\"Austria\",\"phoneCode\":\"43\"},{\"shortName\":\"AU\",\"chineseName\":\"澳大利亚\",\"englishName\":\"Australia\",\"phoneCode\":\"61\"},{\"shortName\":\"AZ\",\"chineseName\":\"阿塞拜疆\",\"englishName\":\"Azerbaijan\",\"phoneCode\":\"994\"},{\"shortName\":\"BB\",\"chineseName\":\"巴巴多斯\",\"englishName\":\"Barbados\",\"phoneCode\":\"1246\"},{\"shortName\":\"BD\",\"chineseName\":\"孟加拉国\",\"englishName\":\"Bangladesh\",\"phoneCode\":\"880\"},{\"shortName\":\"BE\",\"chineseName\":\"比利时\",\"englishName\":\"Belgium\",\"phoneCode\":\"32\"},{\"shortName\":\"BF\",\"chineseName\":\"布基纳法索\",\"englishName\":\"Burkina-faso\",\"phoneCode\":\"226\"},{\"shortName\":\"BG\",\"chineseName\":\"保加利亚\",\"englishName\":\"Bulgaria\",\"phoneCode\":\"359\"},{\"shortName\":\"BH\",\"chineseName\":\"巴林\",\"englishName\":\"Bahrain\",\"phoneCode\":\"973\"},{\"shortName\":\"BI\",\"chineseName\":\"布隆迪\",\"englishName\":\"Burundi\",\"phoneCode\":\"257\"},{\"shortName\":\"BJ\",\"chineseName\":\"贝宁\",\"englishName\":\"Benin\",\"phoneCode\":\"229\"},{\"shortName\":\"BL\",\"chineseName\":\"巴勒斯坦\",\"englishName\":\"Palestine\",\"phoneCode\":\"970\"},{\"shortName\":\"BM\",\"chineseName\":\"百慕大群岛\",\"englishName\":\"Bermuda Is.\",\"phoneCode\":\"1441\"},{\"shortName\":\"BN\",\"chineseName\":\"文莱\",\"englishName\":\"Brunei\",\"phoneCode\":\"673\"},{\"shortName\":\"BO\",\"chineseName\":\"玻利维亚\",\"englishName\":\"Bolivia\",\"phoneCode\":\"591\"},{\"shortName\":\"BR\",\"chineseName\":\"巴西\",\"englishName\":\"Brazil\",\"phoneCode\":\"55\"},{\"shortName\":\"BS\",\"chineseName\":\"巴哈马\",\"englishName\":\"Bahamas\",\"phoneCode\":\"1242\"},{\"shortName\":\"BW\",\"chineseName\":\"博茨瓦纳\",\"englishName\":\"Botswana\",\"phoneCode\":\"267\"},{\"shortName\":\"BY\",\"chineseName\":\"白俄罗斯\",\"englishName\":\"Belarus\",\"phoneCode\":\"375\"},{\"shortName\":\"BZ\",\"chineseName\":\"伯利兹\",\"englishName\":\"Belize\",\"phoneCode\":\"501\"},{\"shortName\":\"CA\",\"chineseName\":\"加拿大\",\"englishName\":\"Canada\",\"phoneCode\":\"1\"},{\"shortName\":\" \",\"chineseName\":\"开曼群岛\",\"englishName\":\"Cayman Is.\",\"phoneCode\":\"1345\"},{\"shortName\":\"CF\",\"chineseName\":\"中非共和国\",\"englishName\":\"Central African Republic\",\"phoneCode\":\"236\"},{\"shortName\":\"CG\",\"chineseName\":\"刚果\",\"englishName\":\"Congo\",\"phoneCode\":\"242\"},{\"shortName\":\"CH\",\"chineseName\":\"瑞士\",\"englishName\":\"Switzerland\",\"phoneCode\":\"41\"},{\"shortName\":\"CK\",\"chineseName\":\"库克群岛\",\"englishName\":\"Cook Is.\",\"phoneCode\":\"682\"},{\"shortName\":\"CL\",\"chineseName\":\"智利\",\"englishName\":\"Chile\",\"phoneCode\":\"56\"},{\"shortName\":\"CM\",\"chineseName\":\"喀麦隆\",\"englishName\":\"Cameroon\",\"phoneCode\":\"237\"},{\"shortName\":\"CN\",\"chineseName\":\"中国\",\"englishName\":\"China\",\"phoneCode\":\"86\"},{\"shortName\":\"CO\",\"chineseName\":\"哥伦比亚\",\"englishName\":\"Colombia\",\"phoneCode\":\"57\"},{\"shortName\":\"CR\",\"chineseName\":\"哥斯达黎加\",\"englishName\":\"Costa Rica\",\"phoneCode\":\"506\"},{\"shortName\":\"CS\",\"chineseName\":\"捷克\",\"englishName\":\"Czech\",\"phoneCode\":\"420\"},{\"shortName\":\"CU\",\"chineseName\":\"古巴\",\"englishName\":\"Cuba\",\"phoneCode\":\"53\"},{\"shortName\":\"CY\",\"chineseName\":\"塞浦路斯\",\"englishName\":\"Cyprus\",\"phoneCode\":\"357\"},{\"shortName\":\"CZ\",\"chineseName\":\"捷克\",\"englishName\":\"Czech Republic \",\"phoneCode\":\"420\"},{\"shortName\":\"DE\",\"chineseName\":\"德国\",\"englishName\":\"Germany \",\"phoneCode\":\"49\"},{\"shortName\":\"DJ\",\"chineseName\":\"吉布提\",\"englishName\":\"Djibouti\",\"phoneCode\":\"253\"},{\"shortName\":\"DK\",\"chineseName\":\"丹麦\",\"englishName\":\"Denmark\",\"phoneCode\":\"45\"},{\"shortName\":\"DO\",\"chineseName\":\"多米尼加共和国\",\"englishName\":\"Dominica Rep.\",\"phoneCode\":\"1890\"},{\"shortName\":\"DZ\",\"chineseName\":\"阿尔及利亚\",\"englishName\":\"Algeria\",\"phoneCode\":\"213\"},{\"shortName\":\"EC\",\"chineseName\":\"厄瓜多尔\",\"englishName\":\"Ecuador\",\"phoneCode\":\"593\"},{\"shortName\":\"EE\",\"chineseName\":\"爱沙尼亚\",\"englishName\":\"Estonia\",\"phoneCode\":\"372\"},{\"shortName\":\"EG\",\"chineseName\":\"埃及\",\"englishName\":\"Egypt\",\"phoneCode\":\"20\"},{\"shortName\":\"ES\",\"chineseName\":\"西班牙\",\"englishName\":\"Spain\",\"phoneCode\":\"34\"},{\"shortName\":\"ET\",\"chineseName\":\"埃塞俄比亚\",\"englishName\":\"Ethiopia\",\"phoneCode\":\"251\"},{\"shortName\":\"FI\",\"chineseName\":\"芬兰\",\"englishName\":\"Finland\",\"phoneCode\":\"358\"},{\"shortName\":\"FJ\",\"chineseName\":\"斐济\",\"englishName\":\"Fiji\",\"phoneCode\":\"679\"},{\"shortName\":\"FR\",\"chineseName\":\"法国\",\"englishName\":\"France\",\"phoneCode\":\"33\"},{\"shortName\":\"GA\",\"chineseName\":\"加蓬\",\"englishName\":\"Gabon\",\"phoneCode\":\"241\"},{\"shortName\":\"GB\",\"chineseName\":\"英国\",\"englishName\":\"United Kiongdom\",\"phoneCode\":\"44\"},{\"shortName\":\"GD\",\"chineseName\":\"格林纳达\",\"englishName\":\"Grenada\",\"phoneCode\":\"1809\"},{\"shortName\":\"GE\",\"chineseName\":\"格鲁吉亚\",\"englishName\":\"Georgia \",\"phoneCode\":\"995\"},{\"shortName\":\"GF\",\"chineseName\":\"法属圭亚那\",\"englishName\":\"French Guiana\",\"phoneCode\":\"594\"},{\"shortName\":\"GH\",\"chineseName\":\"加纳\",\"englishName\":\"Ghana\",\"phoneCode\":\"233\"},{\"shortName\":\"GI\",\"chineseName\":\"直布罗陀\",\"englishName\":\"Gibraltar\",\"phoneCode\":\"350\"},{\"shortName\":\"GM\",\"chineseName\":\"冈比亚\",\"englishName\":\"Gambia\",\"phoneCode\":\"220\"},{\"shortName\":\"GN\",\"chineseName\":\"几内亚\",\"englishName\":\"Guinea\",\"phoneCode\":\"224\"},{\"shortName\":\"GR\",\"chineseName\":\"希腊\",\"englishName\":\"Greece\",\"phoneCode\":\"30\"},{\"shortName\":\"GT\",\"chineseName\":\"危地马拉\",\"englishName\":\"Guatemala\",\"phoneCode\":\"502\"},{\"shortName\":\"GU\",\"chineseName\":\"关岛\",\"englishName\":\"Guam\",\"phoneCode\":\"1671\"},{\"shortName\":\"GY\",\"chineseName\":\"圭亚那\",\"englishName\":\"Guyana\",\"phoneCode\":\"592\"},{\"shortName\":\"HK\",\"chineseName\":\"香港特别行政区\",\"englishName\":\"Hongkong\",\"phoneCode\":\"852\"},{\"shortName\":\"HN\",\"chineseName\":\"洪都拉斯\",\"englishName\":\"Honduras\",\"phoneCode\":\"504\"},{\"shortName\":\"HT\",\"chineseName\":\"海地\",\"englishName\":\"Haiti\",\"phoneCode\":\"509\"},{\"shortName\":\"HU\",\"chineseName\":\"匈牙利\",\"englishName\":\"Hungary\",\"phoneCode\":\"36\"},{\"shortName\":\"ID\",\"chineseName\":\"印度尼西亚\",\"englishName\":\"Indonesia\",\"phoneCode\":\"62\"},{\"shortName\":\"IE\",\"chineseName\":\"爱尔兰\",\"englishName\":\"Ireland\",\"phoneCode\":\"353\"},{\"shortName\":\"IL\",\"chineseName\":\"以色列\",\"englishName\":\"Israel\",\"phoneCode\":\"972\"},{\"shortName\":\"IN\",\"chineseName\":\"印度\",\"englishName\":\"India\",\"phoneCode\":\"91\"},{\"shortName\":\"IQ\",\"chineseName\":\"伊拉克\",\"englishName\":\"Iraq\",\"phoneCode\":\"964\"},{\"shortName\":\"IR\",\"chineseName\":\"伊朗\",\"englishName\":\"Iran\",\"phoneCode\":\"98\"},{\"shortName\":\"IS\",\"chineseName\":\"冰岛\",\"englishName\":\"Iceland\",\"phoneCode\":\"354\"},{\"shortName\":\"IT\",\"chineseName\":\"意大利\",\"englishName\":\"Italy\",\"phoneCode\":\"39\"},{\"shortName\":\" \",\"chineseName\":\"科特迪瓦\",\"englishName\":\"Ivory Coast\",\"phoneCode\":\"225\"},{\"shortName\":\"JM\",\"chineseName\":\"牙买加\",\"englishName\":\"Jamaica\",\"phoneCode\":\"1876\"},{\"shortName\":\"JO\",\"chineseName\":\"约旦\",\"englishName\":\"Jordan\",\"phoneCode\":\"962\"},{\"shortName\":\"JP\",\"chineseName\":\"日本\",\"englishName\":\"Japan\",\"phoneCode\":\"81\"},{\"shortName\":\"KE\",\"chineseName\":\"肯尼亚\",\"englishName\":\"Kenya\",\"phoneCode\":\"254\"},{\"shortName\":\"KG\",\"chineseName\":\"吉尔吉斯坦\",\"englishName\":\"Kyrgyzstan \",\"phoneCode\":\"331\"},{\"shortName\":\"KH\",\"chineseName\":\"柬埔寨\",\"englishName\":\"Kampuchea (Cambodia )\",\"phoneCode\":\"855\"},{\"shortName\":\"KP\",\"chineseName\":\"朝鲜\",\"englishName\":\"North Korea\",\"phoneCode\":\"850\"},{\"shortName\":\"KR\",\"chineseName\":\"韩国\",\"englishName\":\"Korea\",\"phoneCode\":\"82\"},{\"shortName\":\"KT\",\"chineseName\":\"科特迪瓦共和国\",\"englishName\":\"Republic of Ivory Coast\",\"phoneCode\":\"225\"},{\"shortName\":\"KW\",\"chineseName\":\"科威特\",\"englishName\":\"Kuwait\",\"phoneCode\":\"965\"},{\"shortName\":\"KZ\",\"chineseName\":\"哈萨克斯坦\",\"englishName\":\"\\n Kazakstan\\n \",\"phoneCode\":\"327\"},{\"shortName\":\"LA\",\"chineseName\":\"老挝\",\"englishName\":\"Laos\",\"phoneCode\":\"856\"},{\"shortName\":\"LB\",\"chineseName\":\"黎巴嫩\",\"englishName\":\"Lebanon\",\"phoneCode\":\"961\"},{\"shortName\":\"LC\",\"chineseName\":\"圣卢西亚\",\"englishName\":\"St.Lucia\",\"phoneCode\":\"1758\"},{\"shortName\":\"LI\",\"chineseName\":\"列支敦士登\",\"englishName\":\"Liechtenstein\",\"phoneCode\":\"423\"},{\"shortName\":\"LK\",\"chineseName\":\"斯里兰卡\",\"englishName\":\"Sri Lanka\",\"phoneCode\":\"94\"},{\"shortName\":\"LR\",\"chineseName\":\"利比里亚\",\"englishName\":\"Liberia\",\"phoneCode\":\"231\"},{\"shortName\":\"LS\",\"chineseName\":\"莱索托\",\"englishName\":\"Lesotho\",\"phoneCode\":\"266\"},{\"shortName\":\"LT\",\"chineseName\":\"立陶宛\",\"englishName\":\"Lithuania\",\"phoneCode\":\"370\"},{\"shortName\":\"LU\",\"chineseName\":\"卢森堡\",\"englishName\":\"Luxembourg\",\"phoneCode\":\"352\"},{\"shortName\":\"LV\",\"chineseName\":\"拉脱维亚\",\"englishName\":\"Latvia \",\"phoneCode\":\"371\"},{\"shortName\":\"LY\",\"chineseName\":\"利比亚\",\"englishName\":\"Libya\",\"phoneCode\":\"218\"},{\"shortName\":\"MA\",\"chineseName\":\"摩洛哥\",\"englishName\":\"Morocco\",\"phoneCode\":\"212\"},{\"shortName\":\"MC\",\"chineseName\":\"摩纳哥\",\"englishName\":\"Monaco\",\"phoneCode\":\"377\"},{\"shortName\":\"MD\",\"chineseName\":\"摩尔多瓦\",\"englishName\":\"Moldova, Republic of \",\"phoneCode\":\"373\"},{\"shortName\":\"MG\",\"chineseName\":\"马达加斯加\",\"englishName\":\"Madagascar\",\"phoneCode\":\"261\"},{\"shortName\":\"ML\",\"chineseName\":\"马里\",\"englishName\":\"Mali\",\"phoneCode\":\"223\"},{\"shortName\":\"MM\",\"chineseName\":\"缅甸\",\"englishName\":\"Burma\",\"phoneCode\":\"95\"},{\"shortName\":\"MN\",\"chineseName\":\"蒙古\",\"englishName\":\"Mongolia \",\"phoneCode\":\"976\"},{\"shortName\":\"MO\",\"chineseName\":\"澳门\",\"englishName\":\"Macao\",\"phoneCode\":\"853\"},{\"shortName\":\"MS\",\"chineseName\":\"蒙特塞拉特岛\",\"englishName\":\"Montserrat Is\",\"phoneCode\":\"1664\"},{\"shortName\":\"MT\",\"chineseName\":\"马耳他\",\"englishName\":\"Malta\",\"phoneCode\":\"356\"},{\"shortName\":\" \",\"chineseName\":\"马里亚那群岛\",\"englishName\":\"Mariana Is\",\"phoneCode\":\"1670\"},{\"shortName\":\" \",\"chineseName\":\"马提尼克\",\"englishName\":\"Martinique\",\"phoneCode\":\"596\"},{\"shortName\":\"MU\",\"chineseName\":\"毛里求斯\",\"englishName\":\"Mauritius\",\"phoneCode\":\"230\"},{\"shortName\":\"MV\",\"chineseName\":\"马尔代夫\",\"englishName\":\"Maldives\",\"phoneCode\":\"960\"},{\"shortName\":\"MW\",\"chineseName\":\"马拉维\",\"englishName\":\"Malawi\",\"phoneCode\":\"265\"},{\"shortName\":\"MX\",\"chineseName\":\"墨西哥\",\"englishName\":\"Mexico\",\"phoneCode\":\"52\"},{\"shortName\":\"MY\",\"chineseName\":\"马来西亚\",\"englishName\":\"Malaysia\",\"phoneCode\":\"60\"},{\"shortName\":\"MZ\",\"chineseName\":\"莫桑比克\",\"englishName\":\"Mozambique\",\"phoneCode\":\"258\"},{\"shortName\":\"NA\",\"chineseName\":\"纳米比亚\",\"englishName\":\"Namibia \",\"phoneCode\":\"264\"},{\"shortName\":\"NE\",\"chineseName\":\"尼日尔\",\"englishName\":\"Niger\",\"phoneCode\":\"977\"},{\"shortName\":\"NG\",\"chineseName\":\"尼日利亚\",\"englishName\":\"Nigeria\",\"phoneCode\":\"234\"},{\"shortName\":\"NI\",\"chineseName\":\"尼加拉瓜\",\"englishName\":\"Nicaragua\",\"phoneCode\":\"505\"},{\"shortName\":\"NL\",\"chineseName\":\"荷兰\",\"englishName\":\"Netherlands\",\"phoneCode\":\"31\"},{\"shortName\":\"NO\",\"chineseName\":\"挪威\",\"englishName\":\"Norway\",\"phoneCode\":\"47\"},{\"shortName\":\"NP\",\"chineseName\":\"尼泊尔\",\"englishName\":\"Nepal\",\"phoneCode\":\"977\"},{\"shortName\":\" \",\"chineseName\":\"荷属安的列斯\",\"englishName\":\"Netheriands Antilles\",\"phoneCode\":\"599\"},{\"shortName\":\"NR\",\"chineseName\":\"瑙鲁\",\"englishName\":\"Nauru\",\"phoneCode\":\"674\"},{\"shortName\":\"NZ\",\"chineseName\":\"新西兰\",\"englishName\":\"New Zealand\",\"phoneCode\":\"64\"},{\"shortName\":\"OM\",\"chineseName\":\"阿曼\",\"englishName\":\"Oman\",\"phoneCode\":\"968\"},{\"shortName\":\"PA\",\"chineseName\":\"巴拿马\",\"englishName\":\"Panama\",\"phoneCode\":\"507\"},{\"shortName\":\"PE\",\"chineseName\":\"秘鲁\",\"englishName\":\"Peru\",\"phoneCode\":\"51\"},{\"shortName\":\"PF\",\"chineseName\":\"法属玻利尼西亚\",\"englishName\":\"French Polynesia\",\"phoneCode\":\"689\"},{\"shortName\":\"PG\",\"chineseName\":\"巴布亚新几内亚\",\"englishName\":\"Papua New Cuinea\",\"phoneCode\":\"675\"},{\"shortName\":\"PH\",\"chineseName\":\"菲律宾\",\"englishName\":\"Philippines\",\"phoneCode\":\"63\"},{\"shortName\":\"PK\",\"chineseName\":\"巴基斯坦\",\"englishName\":\"Pakistan\",\"phoneCode\":\"92\"},{\"shortName\":\"PL\",\"chineseName\":\"波兰\",\"englishName\":\"Poland\",\"phoneCode\":\"48\"},{\"shortName\":\"PR\",\"chineseName\":\"波多黎各\",\"englishName\":\"Puerto Rico\",\"phoneCode\":\"1787\"},{\"shortName\":\"PT\",\"chineseName\":\"葡萄牙\",\"englishName\":\"Portugal\",\"phoneCode\":\"351\"},{\"shortName\":\"PY\",\"chineseName\":\"巴拉圭\",\"englishName\":\"Paraguay\",\"phoneCode\":\"595\"},{\"shortName\":\"QA\",\"chineseName\":\"卡塔尔\",\"englishName\":\"Qatar\",\"phoneCode\":\"974\"},{\"shortName\":\" \",\"chineseName\":\"留尼旺\",\"englishName\":\"Reunion\",\"phoneCode\":\"262\"},{\"shortName\":\"RO\",\"chineseName\":\"罗马尼亚\",\"englishName\":\"Romania\",\"phoneCode\":\"40\"},{\"shortName\":\"RU\",\"chineseName\":\"俄罗斯\",\"englishName\":\"Russia\",\"phoneCode\":\"7\"},{\"shortName\":\"SA\",\"chineseName\":\"沙特阿拉伯\",\"englishName\":\"Saudi Arabia\",\"phoneCode\":\"966\"},{\"shortName\":\"SB\",\"chineseName\":\"所罗门群岛\",\"englishName\":\"Solomon Is\",\"phoneCode\":\"677\"},{\"shortName\":\"SC\",\"chineseName\":\"塞舌尔\",\"englishName\":\"Seychelles\",\"phoneCode\":\"248\"},{\"shortName\":\"SD\",\"chineseName\":\"苏丹\",\"englishName\":\"Sudan\",\"phoneCode\":\"249\"},{\"shortName\":\"SE\",\"chineseName\":\"瑞典\",\"englishName\":\"Sweden\",\"phoneCode\":\"46\"},{\"shortName\":\"SG\",\"chineseName\":\"新加坡\",\"englishName\":\"Singapore\",\"phoneCode\":\"65\"},{\"shortName\":\"SI\",\"chineseName\":\"斯洛文尼亚\",\"englishName\":\"Slovenia\",\"phoneCode\":\"386\"},{\"shortName\":\"SK\",\"chineseName\":\"斯洛伐克\",\"englishName\":\"Slovakia\",\"phoneCode\":\"421\"},{\"shortName\":\"SL\",\"chineseName\":\"塞拉利昂\",\"englishName\":\"Sierra Leone\",\"phoneCode\":\"232\"},{\"shortName\":\"SM\",\"chineseName\":\"圣马力诺\",\"englishName\":\"San Marino\",\"phoneCode\":\"378\"},{\"shortName\":\" \",\"chineseName\":\"东萨摩亚(美)\",\"englishName\":\"Samoa Eastern\",\"phoneCode\":\"684\"},{\"shortName\":\" \",\"chineseName\":\"西萨摩亚\",\"englishName\":\"San Marino\",\"phoneCode\":\"685\"},{\"shortName\":\"SN\",\"chineseName\":\"塞内加尔\",\"englishName\":\"Senegal\",\"phoneCode\":\"221\"},{\"shortName\":\"SO\",\"chineseName\":\"索马里\",\"englishName\":\"Somali\",\"phoneCode\":\"252\"},{\"shortName\":\"SR\",\"chineseName\":\"苏里南\",\"englishName\":\"Suriname\",\"phoneCode\":\"597\"},{\"shortName\":\"ST\",\"chineseName\":\"圣多美和普林西比\",\"englishName\":\"Sao Tome and Principe\",\"phoneCode\":\"239\"},{\"shortName\":\"SV\",\"chineseName\":\"萨尔瓦多\",\"englishName\":\"EI Salvador\",\"phoneCode\":\"503\"},{\"shortName\":\"SY\",\"chineseName\":\"叙利亚\",\"englishName\":\"Syria\",\"phoneCode\":\"963\"},{\"shortName\":\"SZ\",\"chineseName\":\"斯威士兰\",\"englishName\":\"Swaziland\",\"phoneCode\":\"268\"},{\"shortName\":\"TD\",\"chineseName\":\"乍得\",\"englishName\":\"Chad\",\"phoneCode\":\"235\"},{\"shortName\":\"TG\",\"chineseName\":\"多哥\",\"englishName\":\"Togo\",\"phoneCode\":\"228\"},{\"shortName\":\"TH\",\"chineseName\":\"泰国\",\"englishName\":\"Thailand\",\"phoneCode\":\"66\"},{\"shortName\":\"TJ\",\"chineseName\":\"塔吉克斯坦\",\"englishName\":\"Tajikstan\",\"phoneCode\":\"992\"},{\"shortName\":\"TM\",\"chineseName\":\"土库曼斯坦\",\"englishName\":\"Turkmenistan \",\"phoneCode\":\"993\"},{\"shortName\":\"TN\",\"chineseName\":\"突尼斯\",\"englishName\":\"Tunisia\",\"phoneCode\":\"216\"},{\"shortName\":\"TO\",\"chineseName\":\"汤加\",\"englishName\":\"Tonga\",\"phoneCode\":\"676\"},{\"shortName\":\"TR\",\"chineseName\":\"土耳其\",\"englishName\":\"Turkey\",\"phoneCode\":\"90\"},{\"shortName\":\"TT\",\"chineseName\":\"特立尼达和多巴哥\",\"englishName\":\"Trinidad and Tobago\",\"phoneCode\":\"1809\"},{\"shortName\":\"TW\",\"chineseName\":\"台湾省\",\"englishName\":\"Taiwan\",\"phoneCode\":\"886\"},{\"shortName\":\"TZ\",\"chineseName\":\"坦桑尼亚\",\"englishName\":\"Tanzania\",\"phoneCode\":\"255\"},{\"shortName\":\"UA\",\"chineseName\":\"乌克兰\",\"englishName\":\"Ukraine\",\"phoneCode\":\"380\"},{\"shortName\":\"UG\",\"chineseName\":\"乌干达\",\"englishName\":\"Uganda\",\"phoneCode\":\"256\"},{\"shortName\":\"US\",\"chineseName\":\"美国\",\"englishName\":\"United States of America\",\"phoneCode\":\"1\"},{\"shortName\":\"UY\",\"chineseName\":\"乌拉圭\",\"englishName\":\"Uruguay\",\"phoneCode\":\"598\"},{\"shortName\":\"UZ\",\"chineseName\":\"乌兹别克斯坦\",\"englishName\":\"Uzbekistan\",\"phoneCode\":\"233\"},{\"shortName\":\"VC\",\"chineseName\":\"圣文森特岛\",\"englishName\":\"Saint Vincent\",\"phoneCode\":\"1784\"},{\"shortName\":\"VE\",\"chineseName\":\"委内瑞拉\",\"englishName\":\"Venezuela\",\"phoneCode\":\"58\"},{\"shortName\":\"VN\",\"chineseName\":\"越南\",\"englishName\":\"Vietnam\",\"phoneCode\":\"84\"},{\"shortName\":\"YE\",\"chineseName\":\"也门\",\"englishName\":\"Yemen\",\"phoneCode\":\"967\"},{\"shortName\":\"YU\",\"chineseName\":\"南斯拉夫\",\"englishName\":\"Yugoslavia\",\"phoneCode\":\"381\"},{\"shortName\":\"ZA\",\"chineseName\":\"南非\",\"englishName\":\"South Africa\",\"phoneCode\":\"27\"},{\"shortName\":\"ZM\",\"chineseName\":\"赞比亚\",\"englishName\":\"Zambia\",\"phoneCode\":\"260\"},{\"shortName\":\"ZR\",\"chineseName\":\"扎伊尔\",\"englishName\":\"Zaire\",\"phoneCode\":\"243\"},{\"shortName\":\"ZW\",\"chineseName\":\"津巴布韦\",\"englishName\":\"Zimbabwe\",\"phoneCode\":\"263\"}]", CountryPhoneCode.class)
        for (CountryPhoneCode code : codes) {
            println(code.getChineseName())
            code.save(flush: true)
        }
    }

    def cleanup() {
    }

    void "test something"() {
        expect: "fix me"
        CountryPhoneCode.findAll().each { println(it) }
        CountryPhoneCode.findAll().size() > 100
    }
}