.class public abstract Ldefpackage/j51;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final a:Ljava/lang/Object;

.field public static b:Ljava/util/concurrent/ExecutorService;

.field public static final c:[[D

.field public static final d:[[D

.field public static final e:[D

.field public static final f:[D

.field public static final g:[I

.field public static final h:Ljava/lang/Object;

.field public static i:Z

.field public static j:I

.field public static k:Ljava/lang/reflect/Field;

.field public static l:Z

.field public static m:Ljava/lang/Class;

.field public static n:Z

.field public static o:Ljava/lang/reflect/Field;

.field public static p:Z

.field public static q:Ljava/lang/reflect/Field;

.field public static r:Z


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ldefpackage/j51;->a:Ljava/lang/Object;

    .line 7
    .line 8
    const/4 v0, 0x3

    .line 9
    new-array v1, v0, [D

    .line 10
    .line 11
    fill-array-data v1, :array_0

    .line 12
    .line 13
    .line 14
    new-array v2, v0, [D

    .line 15
    .line 16
    fill-array-data v2, :array_1

    .line 17
    .line 18
    .line 19
    new-array v3, v0, [D

    .line 20
    .line 21
    fill-array-data v3, :array_2

    .line 22
    .line 23
    .line 24
    filled-new-array {v1, v2, v3}, [[D

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    sput-object v1, Ldefpackage/j51;->c:[[D

    .line 29
    .line 30
    new-array v1, v0, [D

    .line 31
    .line 32
    fill-array-data v1, :array_3

    .line 33
    .line 34
    .line 35
    new-array v2, v0, [D

    .line 36
    .line 37
    fill-array-data v2, :array_4

    .line 38
    .line 39
    .line 40
    new-array v3, v0, [D

    .line 41
    .line 42
    fill-array-data v3, :array_5

    .line 43
    .line 44
    .line 45
    filled-new-array {v1, v2, v3}, [[D

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    sput-object v1, Ldefpackage/j51;->d:[[D

    .line 50
    .line 51
    new-array v0, v0, [D

    .line 52
    .line 53
    fill-array-data v0, :array_6

    .line 54
    .line 55
    .line 56
    sput-object v0, Ldefpackage/j51;->e:[D

    .line 57
    .line 58
    const/16 v0, 0xff

    .line 59
    .line 60
    new-array v0, v0, [D

    .line 61
    .line 62
    fill-array-data v0, :array_7

    .line 63
    .line 64
    .line 65
    sput-object v0, Ldefpackage/j51;->f:[D

    .line 66
    .line 67
    const/16 v0, 0x200

    .line 68
    .line 69
    new-array v0, v0, [I

    .line 70
    .line 71
    fill-array-data v0, :array_8

    .line 72
    .line 73
    .line 74
    sput-object v0, Ldefpackage/j51;->g:[I

    .line 75
    .line 76
    new-instance v0, Ljava/lang/Object;

    .line 77
    .line 78
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 79
    .line 80
    .line 81
    sput-object v0, Ldefpackage/j51;->h:Ljava/lang/Object;

    .line 82
    .line 83
    return-void

    .line 84
    nop

    .line 85
    :array_0
    .array-data 8
        0x3f53aca939f9bf80L    # 0.001200833568784504
        0x3f63938d761f2c49L    # 0.002389694492170889
        0x3f32527a6d20ac99L    # 2.795742885861124E-4
    .end array-data

    .line 86
    .line 87
    .line 88
    :array_1
    .array-data 8
        0x3f434dcd39abd367L    # 5.891086651375999E-4
        0x3f686678fe3bac59L    # 0.0029785502573438758
        0x3f356f44653168daL    # 3.270666104008398E-4
    .end array-data

    :array_2
    .array-data 8
        0x3f1a99547f1efd1dL    # 1.0146692491640572E-4
        0x3f4193d4431726edL    # 5.364214359186694E-4
        0x3f6b0448268cc828L    # 0.0032979401770712076
    .end array-data

    :array_3
    .array-data 8
        0x409574e125da5040L    # 1373.2198709594231
        -0x3f6ece4cad95c798L    # -1100.4251190754821
        -0x3fe2e2a16cb12fbfL    # -7.278681089101213
    .end array-data

    :array_4
    .array-data 8
        -0x3f8f02f1ca687dc0L    # -271.815969077903
        0x40817d43adeec650L    # 559.6580465940733
        -0x3fbfc50f292cbe56L    # -32.46047482791194
    .end array-data

    :array_5
    .array-data 8
        0x3fff658a28353577L    # 1.9622899599665666
        -0x3fb369c071f80c3fL    # -57.173814538844006
        0x40734b92b7c34f82L    # 308.7233197812385
    .end array-data

    :array_6
    .array-data 8
        0x3fcb367a0f9096bcL    # 0.2126
        0x3fe6e2eb1c432ca5L    # 0.7152
        0x3fb27bb2fec56d5dL    # 0.0722
    .end array-data

    :array_7
    .array-data 8
        0x3f8f14c71b1e49e2L    # 0.015176349177441876
        0x3fa74f955456b769L    # 0.045529047532325624
        0x3fb36cfc70f2ee2dL    # 0.07588174588720938
        0x3fbb322e37ba80a6L    # 0.10623444424209313
        0x3fc17bafff41098eL    # 0.13658714259697685
        0x3fc55e48e2a4d2cbL    # 0.16693984095186062
        0x3fc940e1c6089c06L    # 0.19729253930674434
        0x3fcd237aa96c6543L    # 0.2276452376616281
        0x3fd08309c6681740L    # 0.2579979360165119
        0x3fd274563819fbdeL    # 0.28835063437139563
        0x3fd467b652dbc0b0L    # 0.3188300904430532
        0x3fd675920d7da7b7L    # 0.350925934958123
        0x3fd8a114458f16a8L    # 0.3848314933096426
        0x3fdaeab2941ce8eeL    # 0.42057480301049466
        0x3fdd52dff06864acL    # 0.458183274052838
        0x3fdfda0cd6afa026L    # 0.4976837250274023
        0x3fe14053b5ba9b10L    # 0.5391024159806381
        0x3fe2a38dcdd9d833L    # 0.5824650784040898
        0x3fe416e99d2c6dbcL    # 0.6277969426914107
        0x3fe59a9b0dabee07L    # 0.6751227633498623
        0x3fe72ed5164ae78aL    # 0.7244668422128921
        0x3fe8d3c9c675c021L    # 0.775853049866786
        0x3fea89aa50b7831bL    # 0.829304845476233
        0x3fec50a71498c460L    # 0.8848452951698498
        0x3fee28efa7cbf7abL    # 0.942497089126609
        0x3ff009596f5c1eb0L    # 1.0022825574869039
        0x3ff1070f6a38d1ecL    # 1.0642236851973577
        0x3ff20db079160f60L    # 1.1283421258858297
        0x3ff31d52fb1a7c13L    # 1.1946592148522128
        0x3ff4360cfd3e997fL    # 1.2631959812511864
        0x3ff557f43d5f1b72L    # 1.3339731595349034
        0x3ff6831e2d2090c9L    # 1.407011200216447
        0x3ff7b79ff4a81f49L    # 1.4823302800086415
        0x3ff8f58e752cb288L    # 1.5599503113873272
        0x3ffa3cfe4b63a8afL    # 1.6398909516233677
        0x3ffb8e03d1cbbd1eL    # 1.7221716113234105
        0x3ffce8b322d8ae77L    # 1.8068114625156377
        0x3ffe4d201b01e2ceL    # 1.8938294463134073
        0x3fffbb5e5ab6180fL    # 1.9832442801866852
        0x400099c0a41b0043L    # 2.075074464868551
        0x40015ace08abc052L    # 2.1693382909216234
        0x400220e0d6998f93L    # 2.2660538449872063
        0x4002ec026ede8ab3L    # 2.36523901573795
        0x4003bc3c18a5a895L    # 2.4669114995532007
        0x400491970204ce3aL    # 2.5710888059345764
        0x40056c1c40ae8440L    # 2.6777882626779785
        0x40064bd4d29bd0e9L    # 2.7870270208169257
        0x400730c99eaeafeeL    # 2.898822059350997
        0x40081b03754d97e3L    # 3.0131901897720907
        0x40090a8b10f874ddL    # 3.1301480604002863
        0x4009ff6916d77856L    # 3.2497121605402226
        0x400af9a61744174aL    # 3.3718988244681087
        0x400bf94a8e4c897dL    # 3.4967242352587946
        0x400cfe5ee43216c1L    # 3.624204428461639
        0x400e08eb6de279d2L    # 3.754355295633311
        0x400f18f86d6c9be2L    # 3.887192587735158
        0x401017470938736eL    # 4.022731918402185
        0x4010a4da3d46b461L    # 4.160988767090289
        0x40113539d8e2ff50L    # 4.301978482107941
        0x4011c869d9745cf2L    # 4.445716283538092
        0x40125e6e33f75806L    # 4.592217266055746
        0x4012f74ad52cb09aL    # 4.741496401646282
        0x40139303a1c66fdaL    # 4.893568542229298
        0x4014319c7693702aL    # 5.048448422192488
        0x4014d31928a96beaL    # 5.20615066083972
        0x4015777d858da48eL    # 5.3666897647573375
        0x40161ecd535c325bL    # 5.5300801301023865
        0x4016c90c50ee0c43L    # 5.696336044816294
        0x4017763e35fdd6a4L    # 5.865471690767354
        0x40182666b34b8667L    # 6.037501145825082
        0x4018d98972bee5cfL    # 6.212438385869475
        0x40198faa17890716L    # 6.390297286737924
        0x401a48cc3e44b09eL    # 6.571091626112461
        0x401b04f37d15cd99L    # 6.7548350853498045
        0x401bc42363c7eda2L    # 6.941541251256611
        0x401c865f7bebdd24L    # 7.131223617812143
        0x401d4bab48f46014L    # 7.323895587840543
        0x401e140a485217a5L    # 7.5195704746346665
        0x401edf7ff18e9b89L    # 7.7182615035334345
        0x401fae0fb666ceb6L    # 7.919981813454504
        0x40203fde81723bbfL    # 8.124744458384042
        0x4020aa459ebb90eeL    # 8.332562408825165
        0x4021163ee38629a1L    # 8.543448553206703
        0x402183cbfd938b07L    # 8.757415699253682
        0x4021f2ee97fb71b0L    # 8.974476575321063
        0x402263a85b36f868L    # 9.194643831691977
        0x4022d5faed2b7406L    # 9.417930041841839
        0x402349e7f13506c4L    # 9.644347703669503
        0x4023bf710830edd2L    # 9.873909240696694
        0x40243697d0878b80L    # 10.106627003236781
        0x4024af5de6363078L    # 10.342513269534024
        0x402529c4e2d8a631L    # 10.58158024687427
        0x4025a5ce5db27ccdL    # 10.8238400726681
        0x4026237bebb81e6fL    # 11.069304815507364
        0x4026a2cf1f97aa0eL    # 11.317986476196008
        0x402723c989c19785L    # 11.569896988756009
        0x4027a66cb87126f5L    # 11.825048221409341
        0x40282aba37b49ccdL    # 12.083451977536606
        0x4028b0b391754c8fL    # 12.345119996613247
        0x4029385a4d7f7392L    # 12.610063955123938
        0x4029c1aff189e588L    # 12.878295467455942
        0x402a4cb6013d8c16L    # 13.149826086772048
        0x402ad96dfe3cbaefL    # 13.42466730586372
        0x402b67d9682a59d7L    # 13.702830557985108
        0x402bf7f9bcb0e5dbL    # 13.984327217668513
        0x402c89d077894ae9L    # 14.269168601521828
        0x402d1d5f12819719L    # 14.55736596900856
        0x402db2a7058388a2L    # 14.848930523210871
        0x402e49a9c69af7d4L    # 15.143873411576273
        0x402ee268c9fc1dedL    # 15.44220572664832
        0x402f7ce58209ba02L    # 15.743938506781891
        0x40300c90afad8a5bL    # 16.04908273684337
        0x40305b8ee860f20bL    # 16.35764934889634
        0x4030ab6e21a80812L    # 16.66964922287304
        0x4030fc2f112eac90L    # 16.985093187232053
        0x40314dd26bc67044L    # 17.30399201960269
        0x4031a058e5694aa2L    # 17.62635644741625
        0x4031f3c3313c4220L    # 17.95219714852476
        0x40324812019206eaL    # 18.281524751807332
        0x40329d4607ed8070L    # 18.614349837764564
        0x4032f35ff5044e3bL    # 18.95068293910138
        0x40334a6078c13c38L    # 19.290534541298456
        0x4033a2484246aaf7L    # 19.633915083172692
        0x4033fb17fff0ec0bL    # 19.98083495742689
        0x403454d05f589306L    # 20.331304511189067
        0x4034af720d54bb29L    # 20.685334046541502
        0x40350afdb5fd424fL    # 21.042933821039977
        0x4035677404acf91aL    # 21.404114048223256
        0x4035c4d5a403c8daL    # 21.76888489811322
        0x403623233de8cf6cL    # 22.137256497705877
        0x4036825d7b8c711bL    # 22.50923893145328
        0x4036e285056a611fL    # 22.884842241736916
        0x4037439a834ba09cL    # 23.264076429332462
        0x4037a59e9c487496L    # 23.6469514538663
        0x40380891f6ca5311L    # 24.033477234264016
        0x40386c75388dc754L    # 24.42366364919083
        0x4038d14906a44df5L    # 24.817520537484558
        0x4039370e0576286fL    # 25.21505769858089
        0x40399dc4d8c428bdL    # 25.61628489293138
        0x403a056e23a9751fL    # 26.021211842414342
        0x403a6e0a889d441aL    # 26.429848230738664
        0x403ad79aa9749101L    # 26.842203703840827
        0x403b421f2763c940L    # 27.258287870275353
        0x403bad98a3007244L    # 27.678110301598522
        0x403c1a07bc42c8a7L    # 28.10168053274597
        0x403c876d12875855L    # 28.529008062403893
        0x403cf5c944908e0fL    # 28.96010235337422
        0x403d651cf0884284L    # 29.39497283293396
        0x403dd568b4013ebdL    # 29.83362889318845
        0x403e46ad2bf8bab1L    # 30.276079891419332
        0x403eb8eaf4d7d567L    # 30.722335150426627
        0x403f2c22aa75073fL    # 31.172403958865512
        0x403fa054e8158e76L    # 31.62629557157785
        0x40400ac124376ae6L    # 32.08401920991837
        0x404045d5b2d3eadeL    # 32.54558406207592
        0x404081686cad3812L    # 33.010999283389665
        0x4040bd799e4a633aL    # 33.4802739966603
        0x4040fa0993ed4580L    # 33.953417292456834
        0x4041371899932659L    # 34.430438229418264
        0x404174a6faf55f12L    # 34.911345834551085
        0x4041b2b50389fbc7L    # 35.39614910352207
        0x4041f142fe8459f4L    # 35.88485700094671
        0x4042305136d5c4beL    # 36.37747846067349
        0x40426fdff72e0ed9L    # 36.87402238606382
        0x4042afef89fc2a2bL    # 37.37449765026789
        0x4042f080396ebd4eL    # 37.87891309649659
        0x404331924f74b6c1L    # 38.38727753828926
        0x4043732615bdde1fL    # 38.89959975977785
        0x4043b53bd5bb6319L    # 39.41588851594697
        0x4043f7d3d8a06a8dL    # 39.93615253289054
        0x40443aee67629979L    # 40.460400508064545
        0x40447e8bcaba9e04L    # 40.98864111053629
        0x4044c2ac4b24b69dL    # 41.520882981230194
        0x4045075030e1373cL    # 42.05713473317016
        0x40454c77c3f50cabL    # 42.597404951718396
        0x404592234c2a3e29L    # 43.141702194811224
        0x4045d85311106d15L    # 43.6900349931913
        0x40461f0759fd5306L    # 44.24241185063697
        0x404666406e0d3e0eL    # 44.798841244188324
        0x4046adfe94238b52L    # 45.35933162437017
        0x4046f64212eb2003L    # 45.92389141541209
        0x40473f0b30d6e0b4L    # 46.49252901546552
        0x4047885a3422271aL    # 47.065252796817916
        0x4047d22f62d13639L    # 47.64207110610409
        0x40481c8b02b1acffL    # 48.22299226451468
        0x4048676d595af778L    # 48.808024568002054
        0x4048b2d6ac2ebe65L    # 49.3971762874833
        0x4048fec740595582L    # 49.9904556690408
        0x40494b3f5ad2283bL    # 50.587870934119984
        0x4049983f405c2519L    # 51.189430279724725
        0x4049e5c7358627c0L    # 51.79514187861014
        0x404a33d77eab618dL    # 52.40501387947288
        0x404a82705ff3c0f7L    # 53.0190544071392
        0x404ad1921d545781L    # 53.637271562750364
        0x404b213cfa8fbe81L    # 54.259673423945976
        0x404b71713b367a9aL    # 54.88626804504493
        0x404bc22f22a75de3L    # 55.517063457223934
        0x404c1376f40fe90dL    # 56.15206766869424
        0x404c6548f26cab1cL    # 56.79128866487574
        0x404cb7a56089a00fL    # 57.43473440856916
        0x404d0a8c81028e68L    # 58.08241284012621
        0x404d5dfe96436370L    # 58.734331877617365
        0x404db1fbe2888e90L    # 59.39049941699807
        0x404e0684a7df5b5dL    # 60.05092333227251
        0x404e5b9928264aa1L    # 60.715611475655585
        0x404eb139a50d6a71L    # 61.38457167773311
        0x404f07666016ad10L    # 62.057811747619894
        0x404f5e1f9a963eceL    # 62.7353394731159
        0x404fb56595b2db0bL    # 63.417162620860914
        0x4050069c49330fffL    # 64.10328893648692
        0x405032cc68be70e4L    # 64.79372614476921
        0x40505f4349cbbe28L    # 65.48848194977529
        0x40508c010c951223L    # 66.18756403501224
        0x4050b905d13e9baaL    # 66.89098006357258
        0x4050e651b7d6c597L    # 67.59873767827808
        0x405113e4e0565df1L    # 68.31084450182222
        0x405141bf6aa0bc9eL    # 69.02730813691093
        0x40516fe17683e997L    # 69.74813616640164
        0x40519e4b23b8c2ceL    # 70.47333615344107
        0x4051ccfc91e3217eL    # 71.20291564160104
        0x4051fbf5e091ff31L    # 71.93688215501312
        0x40522b372f3f9a53L    # 72.67524319850172
        0x40525ac09d519a4fL    # 73.41800625771542
        0x40528a924a193361L    # 74.16517879925733
        0x4052baac54d349eaL    # 74.9167682708136
        0x4052eb0edca8956eL    # 75.67278210128072
        0x40531bba00adc335L    # 76.43322770089146
        0x40534caddfe39879L    # 77.1981124613393
        0x40537dea9937144bL    # 77.96744375590167
        0x4053af704b81910dL    # 78.74122893956174
        0x4053e13f1588e598L    # 79.51947534912904
        0x4054135715ff8602L    # 80.30219030335869
        0x405445b86b84a40cL    # 81.08938110306934
        0x4054786334a44f3aL    # 81.88105503125999
        0x4054ab578fd79492L    # 82.67721935322541
        0x4054de959b849e0fL    # 83.4778813166706
        0x4055121d75fed1acL    # 84.28304815182372
        0x405545ef3d86f02fL    # 85.09272707154808
        0x40557a0b104b33a0L    # 85.90692527145302
        0x4055ae710c676d67L    # 86.72564993000343
        0x4055e3214fe52419L    # 87.54890820862819
        0x4056181bf8bbb106L    # 88.3767072518277
        0x40564d6124d05d6fL    # 89.2090541872801
        0x405682f0f1f67f71L    # 90.04595612594655
        0x4056b8cb7def969eL    # 90.88742016217518
        0x4056eef0e66b685dL    # 91.73345337380438
        0x4057256149081bfcL    # 92.58406282226491
        0x40575c1cc3525664L    # 93.43925555268066
        0x4057932372c555aeL    # 94.29903859396902
        0x4057ca7574cb0c4fL    # 95.16341895893969
        0x40580212e6bc3c09L    # 96.03240364439274
        0x405839fbe5e090aaL    # 96.9059996312159
        0x405872308f6eba68L    # 97.78421388448044
        0x4058aab1008c881eL    # 98.6670533535366
        0x4058e37d564f0129L    # 99.55452497210776
    .end array-data

    :array_8
    .array-data 4
        0x26b
        0x2d0
        0x7f
        0x1e1
        0x3a3
        0x330
        0x32d
        0xe9
        0x236
        0xf7
        0x3d9
        0x2d4
        0xcd
        0x1c6
        0x35f
        0x1eb
        0x2e5
        0xf2
        0x3b5
        0xd6
        0x2dd
        0x35b
        0x14f
        0x2c4
        0x26d
        0x23e
        0x49
        0x28e
        0x2da
        0x1d8
        0x1a3
        0x1b4
        0x116
        0x1f0
        0x363
        0xd2
        0x18f
        0x2a8
        0x1e0
        0x33
        0x36e
        0x1d1
        0x32b
        0xa9
        0x365
        0x2a3
        0x263
        0x2b9
        0x363
        0x231
        0x35e
        0x2af
        0x1fb
        0x11b
        0x1e2
        0x81
        0x327
        0x24f
        0x2dd
        0x26f
        0x96
        0xee
        0x3b
        0x17b
        0x2ac
        0x36d
        0x271
        0xa9
        0x283
        0x69
        0xaa
        0x25f
        0x208
        0x3a4
        0x2d7
        0x1dc
        0x2b5
        0x1a9
        0xae
        0x287
        0x49
        0x7a
        0x14f
        0x212
        0x1ba
        0x355
        0x2b7
        0xf9
        0x1bd
        0x203
        0x38d
        0x221
        0x2bf
        0x397
        0x36a
        0x1da
        0x372
        0x1f4
        0x252
        0x264
        0x281
        0x321
        0xdc
        0xa2
        0x333
        0x3d8
        0x24d
        0x201
        0x1ef
        0x31f
        0xa1
        0x25c
        0x3be
        0x215
        0xdd
        0x190
        0x182
        0x363
        0x258
        0x30e
        0x17e
        0x254
        0x19e
        0xab
        0x204
        0x177
        0x2aa
        0x1e5
        0x38f
        0x114
        0x62
        0x229
        0xa3
        0x162
        0x29a
        0x3a5
        0x1a8
        0x155
        0x215
        0x366
        0xe3
        0x2da
        0x1db
        0xba
        0x107
        0x287
        0x219
        0x2ae
        0x258
        0xe0
        0x1d5
        0x44
        0x302
        0x397
        0xbe
        0x175
        0x126
        0x336
        0x328
        0xce
        0xb8
        0x3af
        0x31b
        0x180
        0x17f
        0x1cd
        0x194
        0x2f6
        0x347
        0x377
        0x2cb
        0x43
        0x26a
        0x114
        0xcc
        0x396
        0x369
        0x309
        0x25c
        0x230
        0x3b7
        0xa0
        0x242
        0x2d2
        0x4f
        0x324
        0x60
        0x199
        0x2c9
        0x3ac
        0x28c
        0x3a6
        0x3ca
        0x1bf
        0x13e
        0x161
        0x35b
        0x2a0
        0x70
        0x311
        0x285
        0x35f
        0x323
        0x15e
        0x8b
        0x5d
        0x162
        0x63
        0x334
        0x38c
        0x261
        0x304
        0x9a
        0x112
        0x244
        0xb8
        0x4f
        0x272
        0x276
        0x2e6
        0x28d
        0x11a
        0x2fa
        0x26f
        0x2a8
        0x51
        0x39f
        0x272
        0x315
        0x7d
        0x19b
        0x209
        0x3aa
        0x12c
        0x335
        0x4e
        0x157
        0xaf
        0x80
        0xfa
        0xaa
        0x306
        0x3cc
        0x113
        0x3e7
        0x27f
        0x1ef
        0x4e
        0x160
        0x7e
        0x359
        0x3bc
        0x166
        0x26b
        0x244
        0x7c
        0x2e1
        0x252
        0x2bd
        0x264
        0x29d
        0x70
        0x86
        0x2b6
        0x16b
        0x3e0
        0x329
        0x2e7
        0xa8
        0x3ce
        0x3b0
        0x177
        0x2ec
        0x34
        0x258
        0x2eb
        0x282
        0xb6
        0x35e
        0x51
        0x158
        0x325
        0x3dc
        0x2e3
        0x1ff
        0x28f
        0x32e
        0x14e
        0xf9
        0x203
        0x381
        0x3bb
        0x298
        0x3d5
        0x289
        0x71
        0x3ce
        0x1cb
        0x37d
        0xe4
        0x1b1
        0x345
        0x229
        0x10c
        0x39e
        0xf0
        0x66
        0x28e
        0x1cb
        0x33
        0x2ae
        0x2f2
        0x326
        0x2f8
        0x1ed
        0x193
        0x19f
        0x18a
        0x2af
        0x2bc
        0x3b2
        0x29e
        0x290
        0x262
        0x2e2
        0x188
        0x2f8
        0x31f
        0x377
        0x28d
        0x3d2
        0x141
        0x240
        0x269
        0x272
        0x1f6
        0x37e
        0x2a7
        0xf3
        0x1b8
        0x2a8
        0x36f
        0xc2
        0x23c
        0x280
        0x2d4
        0x39e
        0x38
        0xcc
        0x2bc
        0x2c3
        0x97
        0x1c9
        0x1c1
        0x31d
        0xc3
        0x317
        0x22e
        0x3b1
        0x2a7
        0x129
        0x3b
        0x57
        0x338
        0x2c9
        0x297
        0x19c
        0x2b5
        0x156
        0x25e
        0x86
        0x6c
        0x23b
        0x16c
        0x277
        0xd4
        0xae
        0x283
        0x130
        0x149
        0x157
        0x61
        0x1ae
        0x2ef
        0x1f1
        0x13a
        0x3d7
        0x176
        0x336
        0x3a0
        0x8c
        0xce
        0x49
        0x107
        0x3d4
        0x2e0
        0x36c
        0x1de
        0x1ae
        0x131
        0xaa
        0x202
        0x16c
        0x2b4
        0x33d
        0x52
        0x357
        0x3b9
        0x2a4
        0xf6
        0x171
        0x3ca
        0x126
        0x2ee
        0x327
        0x33b
        0x96
        0x316
        0x120
        0x39b
        0x324
        0x17a
        0xd7
        0x33c
        0x250
        0x119
        0x235
        0x22b
        0x2c6
        0x52
        0x380
        0x33f
        0x223
        0x105
        0x20c
        0x1ce
        0x125
        0x1d1
        0x1f6
        0x38
        0x295
        0x335
        0x3d0
        0x3df
        0x292
        0x365
        0x389
        0x2f6
        0x2e9
        0xc1
        0x300
        0x226
        0x260
        0x3a5
        0x17a
        0x11e
        0xd7
        0x3d3
        0x318
        0x3c1
        0x3d
        0x2b0
        0x319
        0x284
        0x3da
        0x193
        0x6a
        0x16e
        0x389
        0x284
        0x174
        0x237
        0x1d2
        0x1b2
        0x285
        0xd2
        0x185
        0x226
        0x397
        0x87
        0x30c
        0x305
        0x27b
        0x185
        0x2c3
        0x64
        0x272
        0x3be
        0xa5
        0x1f8
        0x398
        0xb0
        0xc1
        0x2c9
        0x359
        0x109
        0xcb
        0x32
        0x29c
        0x6c
        0x285
        0x3de
        0x272
        0xc5
        0x1fe
        0x165
        0x166
        0x352
        0x35a
        0x16c
        0x3a8
        0x27e
    .end array-data
.end method

.method public static A(D)D
    .locals 6

    .line 1
    invoke-static {p0, p1}, Ljava/lang/Math;->abs(D)D

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-wide v2, 0x403b2147ae147ae1L    # 27.13

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    mul-double/2addr v2, v0

    .line 11
    const-wide/high16 v4, 0x4079000000000000L    # 400.0

    .line 12
    .line 13
    sub-double/2addr v4, v0

    .line 14
    div-double/2addr v2, v4

    .line 15
    const-wide/16 v0, 0x0

    .line 16
    .line 17
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(DD)D

    .line 18
    .line 19
    .line 20
    move-result-wide v2

    .line 21
    cmpg-double v4, p0, v0

    .line 22
    .line 23
    if-gez v4, :cond_0

    .line 24
    .line 25
    const/4 p0, -0x1

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    cmpl-double p0, p0, v0

    .line 28
    .line 29
    if-nez p0, :cond_1

    .line 30
    .line 31
    const/4 p0, 0x0

    .line 32
    goto :goto_0

    .line 33
    :cond_1
    const/4 p0, 0x1

    .line 34
    :goto_0
    int-to-double p0, p0

    .line 35
    const-wide v0, 0x40030c30c30c30c3L    # 2.380952380952381

    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->pow(DD)D

    .line 41
    .line 42
    .line 43
    move-result-wide v0

    .line 44
    mul-double/2addr v0, p0

    .line 45
    return-wide v0
.end method

.method public static B(D)Z
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmpg-double v0, v0, p0

    .line 4
    .line 5
    if-gtz v0, :cond_0

    .line 6
    .line 7
    const-wide/high16 v0, 0x4059000000000000L    # 100.0

    .line 8
    .line 9
    cmpg-double p0, p0, v0

    .line 10
    .line 11
    if-gtz p0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    return p0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    return p0
.end method

.method public static C(Ljava/lang/String;)Z
    .locals 1

    .line 1
    const-string v0, "Connection"

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-string v0, "Keep-Alive"

    .line 10
    .line 11
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    const-string v0, "Proxy-Authenticate"

    .line 18
    .line 19
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    const-string v0, "Proxy-Authorization"

    .line 26
    .line 27
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_0

    .line 32
    .line 33
    const-string v0, "TE"

    .line 34
    .line 35
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-nez v0, :cond_0

    .line 40
    .line 41
    const-string v0, "Trailers"

    .line 42
    .line 43
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-nez v0, :cond_0

    .line 48
    .line 49
    const-string v0, "Transfer-Encoding"

    .line 50
    .line 51
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-nez v0, :cond_0

    .line 56
    .line 57
    const-string v0, "Upgrade"

    .line 58
    .line 59
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    if-nez p0, :cond_0

    .line 64
    .line 65
    const/4 p0, 0x1

    .line 66
    return p0

    .line 67
    :cond_0
    const/4 p0, 0x0

    .line 68
    return p0
.end method

.method public static D(Ljava/lang/String;)Z
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Landroid/opengl/EGL14;->eglGetDisplay(I)Landroid/opengl/EGLDisplay;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    sget-object v2, Landroid/opengl/EGL14;->EGL_NO_DISPLAY:Landroid/opengl/EGLDisplay;

    .line 7
    .line 8
    invoke-virtual {v1, v2}, Landroid/opengl/EGLDisplay;->equals(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    const/4 v3, 0x1

    .line 13
    xor-int/2addr v2, v3

    .line 14
    const-string v4, "No EGL display."

    .line 15
    .line 16
    invoke-static {v4, v2}, Ldefpackage/j51;->m(Ljava/lang/String;Z)V

    .line 17
    .line 18
    .line 19
    new-array v2, v3, [I

    .line 20
    .line 21
    new-array v4, v3, [I

    .line 22
    .line 23
    invoke-static {v1, v2, v0, v4, v0}, Landroid/opengl/EGL14;->eglInitialize(Landroid/opengl/EGLDisplay;[II[II)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    const-string v4, "Error in eglInitialize."

    .line 28
    .line 29
    invoke-static {v4, v2}, Ldefpackage/j51;->m(Ljava/lang/String;Z)V

    .line 30
    .line 31
    .line 32
    invoke-static {}, Ldefpackage/j51;->l()V

    .line 33
    .line 34
    .line 35
    const/16 v2, 0x3055

    .line 36
    .line 37
    invoke-static {v1, v2}, Landroid/opengl/EGL14;->eglQueryString(Landroid/opengl/EGLDisplay;I)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    if-eqz v1, :cond_0

    .line 42
    .line 43
    invoke-virtual {v1, p0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    if-eqz p0, :cond_0

    .line 48
    .line 49
    return v3

    .line 50
    :cond_0
    return v0
.end method

.method public static final E(Ldefpackage/rg1;Ldefpackage/dx2;)Ldefpackage/dx2;
    .locals 3

    .line 1
    const v0, 0x1a365f2c

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Ldefpackage/rg1;->R(I)V

    .line 5
    .line 6
    .line 7
    new-instance v0, Ldefpackage/k2;

    .line 8
    .line 9
    const/16 v1, 0xa

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-direct {v0, v1, v2}, Ldefpackage/k2;-><init>(IB)V

    .line 13
    .line 14
    .line 15
    invoke-interface {p1, v0}, Ldefpackage/dx2;->a(Ldefpackage/if1;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const v0, 0x48ae8da7

    .line 23
    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    invoke-virtual {p0, v0, v1, v2, v1}, Ldefpackage/rg1;->O(ILdefpackage/k93;ILjava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    new-instance v0, Ldefpackage/d60;

    .line 30
    .line 31
    const/16 v1, 0x8

    .line 32
    .line 33
    invoke-direct {v0, v1, v2}, Ldefpackage/d60;-><init>(IB)V

    .line 34
    .line 35
    .line 36
    sget-object v1, Ldefpackage/ax2;->a:Ldefpackage/ax2;

    .line 37
    .line 38
    invoke-interface {p1, v0, v1}, Ldefpackage/dx2;->b(Ldefpackage/wf1;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    check-cast p1, Ldefpackage/dx2;

    .line 43
    .line 44
    invoke-virtual {p0, v2}, Ldefpackage/rg1;->o(Z)V

    .line 45
    .line 46
    .line 47
    :goto_0
    invoke-virtual {p0, v2}, Ldefpackage/rg1;->o(Z)V

    .line 48
    .line 49
    .line 50
    return-object p1
.end method

.method public static final F(Ldefpackage/cx2;Ldefpackage/gf1;)V
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/cx2;->t:Ldefpackage/c83;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ldefpackage/c83;

    .line 6
    .line 7
    move-object v1, p0

    .line 8
    check-cast v1, Ldefpackage/b83;

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ldefpackage/c83;-><init>(Ldefpackage/b83;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Ldefpackage/cx2;->t:Ldefpackage/c83;

    .line 14
    .line 15
    :cond_0
    invoke-static {p0}, Ldefpackage/j51;->P(Ldefpackage/eo0;)Ldefpackage/ub3;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    check-cast p0, Ldefpackage/ra;

    .line 20
    .line 21
    invoke-virtual {p0}, Ldefpackage/ra;->getSnapshotObserver()Ldefpackage/wb3;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    sget-object v1, Ldefpackage/c83;->o:Ldefpackage/k52;

    .line 26
    .line 27
    iget-object p0, p0, Ldefpackage/wb3;->a:Ldefpackage/pp3;

    .line 28
    .line 29
    invoke-virtual {p0, v0, v1, p1}, Ldefpackage/pp3;->e(Ljava/lang/Object;Ldefpackage/if1;Ldefpackage/gf1;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public static G(Ljava/lang/String;)V
    .locals 3

    .line 1
    :try_start_0
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_4

    .line 5
    const/4 v0, 0x0

    .line 6
    :try_start_1
    invoke-virtual {p0, v0}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0
    :try_end_1
    .catch Ljava/lang/InstantiationException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_0

    .line 14
    new-instance v0, Ljava/lang/RuntimeException;

    .line 15
    .line 16
    new-instance v1, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    const-string v2, "Expected instanceof GlideModule, but found: "

    .line 19
    .line 20
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    throw v0

    .line 34
    :catch_0
    move-exception v1

    .line 35
    goto :goto_0

    .line 36
    :catch_1
    move-exception v1

    .line 37
    goto :goto_1

    .line 38
    :catch_2
    move-exception v1

    .line 39
    goto :goto_2

    .line 40
    :catch_3
    move-exception v1

    .line 41
    goto :goto_3

    .line 42
    :goto_0
    invoke-static {p0, v1}, Ldefpackage/j51;->R(Ljava/lang/Class;Ljava/lang/ReflectiveOperationException;)V

    .line 43
    .line 44
    .line 45
    throw v0

    .line 46
    :goto_1
    invoke-static {p0, v1}, Ldefpackage/j51;->R(Ljava/lang/Class;Ljava/lang/ReflectiveOperationException;)V

    .line 47
    .line 48
    .line 49
    throw v0

    .line 50
    :goto_2
    invoke-static {p0, v1}, Ldefpackage/j51;->R(Ljava/lang/Class;Ljava/lang/ReflectiveOperationException;)V

    .line 51
    .line 52
    .line 53
    throw v0

    .line 54
    :goto_3
    invoke-static {p0, v1}, Ldefpackage/j51;->R(Ljava/lang/Class;Ljava/lang/ReflectiveOperationException;)V

    .line 55
    .line 56
    .line 57
    throw v0

    .line 58
    :catch_4
    move-exception p0

    .line 59
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 60
    .line 61
    const-string v1, "Unable to find GlideModule implementation"

    .line 62
    .line 63
    invoke-direct {v0, v1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 64
    .line 65
    .line 66
    throw v0
.end method

.method public static final H(ILjava/lang/String;)I
    .locals 1

    .line 1
    invoke-virtual {p1, p0}, Ljava/lang/String;->charAt(I)C

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    add-int/lit8 p0, p0, 0x1

    .line 6
    .line 7
    invoke-virtual {p1, p0}, Ljava/lang/String;->charAt(I)C

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    shl-int/lit8 p1, v0, 0x7

    .line 12
    .line 13
    add-int/2addr p1, p0

    .line 14
    return p1
.end method

.method public static I()Lorg/json/JSONObject;
    .locals 2

    .line 1
    const-string v0, "external_download_metadata"

    .line 2
    .line 3
    const-string v1, "{}"

    .line 4
    .line 5
    invoke-static {v0, v1}, Ldefpackage/b11;->m(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    .line 10
    .line 11
    invoke-direct {v1, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    .line 13
    .line 14
    return-object v1

    .line 15
    :catch_0
    new-instance v0, Lorg/json/JSONObject;

    .line 16
    .line 17
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 18
    .line 19
    .line 20
    return-object v0
.end method

.method public static declared-synchronized J(Ljava/lang/String;J)V
    .locals 3

    .line 1
    const-class v0, Ldefpackage/j51;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    if-eqz p0, :cond_1

    .line 5
    .line 6
    const-wide/16 v1, 0x0

    .line 7
    .line 8
    cmp-long v1, p1, v1

    .line 9
    .line 10
    if-gtz v1, :cond_0

    .line 11
    .line 12
    goto :goto_2

    .line 13
    :cond_0
    :try_start_0
    invoke-static {}, Ldefpackage/j51;->I()Lorg/json/JSONObject;

    .line 14
    .line 15
    .line 16
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    :try_start_1
    invoke-virtual {v1, p0, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception p0

    .line 22
    goto :goto_1

    .line 23
    :catch_0
    :goto_0
    :try_start_2
    invoke-static {v1}, Ldefpackage/j51;->U(Lorg/json/JSONObject;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 24
    .line 25
    .line 26
    monitor-exit v0

    .line 27
    return-void

    .line 28
    :goto_1
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 29
    throw p0

    .line 30
    :cond_1
    :goto_2
    monitor-exit v0

    .line 31
    return-void
.end method

.method public static declared-synchronized K(Ljava/lang/String;)V
    .locals 2

    .line 1
    const-class v0, Ldefpackage/j51;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    if-nez p0, :cond_0

    .line 5
    .line 6
    monitor-exit v0

    .line 7
    return-void

    .line 8
    :cond_0
    :try_start_0
    invoke-static {}, Ldefpackage/j51;->I()Lorg/json/JSONObject;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1, p0}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    invoke-static {v1}, Ldefpackage/j51;->U(Lorg/json/JSONObject;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    .line 18
    monitor-exit v0

    .line 19
    return-void

    .line 20
    :catchall_0
    move-exception p0

    .line 21
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 22
    throw p0
.end method

.method public static L(Ljava/util/Set;Ljava/util/Collection;)Z
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    instance-of v0, p1, Ldefpackage/hx1;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    check-cast p1, Ldefpackage/hx1;

    .line 9
    .line 10
    check-cast p1, Ldefpackage/my3;

    .line 11
    .line 12
    invoke-virtual {p1}, Ldefpackage/my3;->i()Ldefpackage/jx1;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    :cond_0
    instance-of v0, p1, Ljava/util/Set;

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    if-eqz v0, :cond_3

    .line 20
    .line 21
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    invoke-interface {p0}, Ljava/util/Set;->size()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-le v0, v2, :cond_3

    .line 30
    .line 31
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-interface {p1, v0}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-eqz v0, :cond_1

    .line 50
    .line 51
    invoke-interface {p0}, Ljava/util/Iterator;->remove()V

    .line 52
    .line 53
    .line 54
    const/4 v1, 0x1

    .line 55
    goto :goto_0

    .line 56
    :cond_2
    return v1

    .line 57
    :cond_3
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-eqz v0, :cond_4

    .line 66
    .line 67
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-interface {p0, v0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    or-int/2addr v1, v0

    .line 76
    goto :goto_1

    .line 77
    :cond_4
    return v1
.end method

.method public static final M(Ldefpackage/eo0;I)Ldefpackage/f63;
    .locals 2

    .line 1
    move-object v0, p0

    .line 2
    check-cast v0, Ldefpackage/cx2;

    .line 3
    .line 4
    iget-object v0, v0, Ldefpackage/cx2;->n:Ldefpackage/cx2;

    .line 5
    .line 6
    iget-object v0, v0, Ldefpackage/cx2;->u:Ldefpackage/f63;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ldefpackage/f63;->A0()Ldefpackage/cx2;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    if-eq v1, p0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-static {p1}, Ldefpackage/g63;->f(I)Z

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    if-eqz p0, :cond_1

    .line 23
    .line 24
    iget-object p0, v0, Ldefpackage/f63;->I:Ldefpackage/f63;

    .line 25
    .line 26
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    return-object p0

    .line 30
    :cond_1
    :goto_0
    return-object v0
.end method

.method public static final N(Ldefpackage/eo0;)Ldefpackage/f63;
    .locals 1

    .line 1
    move-object v0, p0

    .line 2
    check-cast v0, Ldefpackage/cx2;

    .line 3
    .line 4
    iget-object v0, v0, Ldefpackage/cx2;->n:Ldefpackage/cx2;

    .line 5
    .line 6
    iget-boolean v0, v0, Ldefpackage/cx2;->A:Z

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const-string v0, "Cannot get LayoutCoordinates, Modifier.Node is not attached."

    .line 11
    .line 12
    invoke-static {v0}, Ldefpackage/cz1;->b(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    const/4 v0, 0x2

    .line 16
    invoke-static {p0, v0}, Ldefpackage/j51;->M(Ldefpackage/eo0;I)Ldefpackage/f63;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {p0}, Ldefpackage/f63;->A0()Ldefpackage/cx2;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iget-boolean v0, v0, Ldefpackage/cx2;->A:Z

    .line 25
    .line 26
    if-nez v0, :cond_1

    .line 27
    .line 28
    const-string v0, "LayoutCoordinates is not attached."

    .line 29
    .line 30
    invoke-static {v0}, Ldefpackage/cz1;->b(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    :cond_1
    return-object p0
.end method

.method public static final O(Ldefpackage/eo0;)Ldefpackage/c72;
    .locals 0

    .line 1
    check-cast p0, Ldefpackage/cx2;

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/cx2;->n:Ldefpackage/cx2;

    .line 4
    .line 5
    iget-object p0, p0, Ldefpackage/cx2;->u:Ldefpackage/f63;

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    iget-object p0, p0, Ldefpackage/f63;->H:Ldefpackage/c72;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const-string p0, "Cannot obtain node coordinator. Is the Modifier.Node attached?"

    .line 13
    .line 14
    invoke-static {p0}, Ldefpackage/xa3;->l(Ljava/lang/String;)Lkotlin/KotlinNothingValueException;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    throw p0
.end method

.method public static final P(Ldefpackage/eo0;)Ldefpackage/ub3;
    .locals 0

    .line 1
    invoke-static {p0}, Ldefpackage/j51;->O(Ldefpackage/eo0;)Ldefpackage/c72;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, Ldefpackage/c72;->A:Ldefpackage/ub3;

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    const-string p0, "This node does not have an owner."

    .line 11
    .line 12
    invoke-static {p0}, Ldefpackage/xa3;->l(Ljava/lang/String;)Lkotlin/KotlinNothingValueException;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    throw p0
.end method

.method public static Q(Ldefpackage/xy4;[Ljava/lang/String;Ljava/util/Map;)Ldefpackage/xy4;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    if-nez p0, :cond_3

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return-object p0

    .line 9
    :cond_0
    array-length v2, p1

    .line 10
    if-ne v2, v1, :cond_1

    .line 11
    .line 12
    aget-object p0, p1, v0

    .line 13
    .line 14
    invoke-interface {p2, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    check-cast p0, Ldefpackage/xy4;

    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_1
    array-length v2, p1

    .line 22
    if-le v2, v1, :cond_5

    .line 23
    .line 24
    new-instance p0, Ldefpackage/xy4;

    .line 25
    .line 26
    invoke-direct {p0}, Ldefpackage/xy4;-><init>()V

    .line 27
    .line 28
    .line 29
    array-length v1, p1

    .line 30
    :goto_0
    if-ge v0, v1, :cond_2

    .line 31
    .line 32
    aget-object v2, p1, v0

    .line 33
    .line 34
    invoke-interface {p2, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    check-cast v2, Ldefpackage/xy4;

    .line 39
    .line 40
    invoke-virtual {p0, v2}, Ldefpackage/xy4;->a(Ldefpackage/xy4;)V

    .line 41
    .line 42
    .line 43
    add-int/lit8 v0, v0, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    return-object p0

    .line 47
    :cond_3
    if-eqz p1, :cond_4

    .line 48
    .line 49
    array-length v2, p1

    .line 50
    if-ne v2, v1, :cond_4

    .line 51
    .line 52
    aget-object p1, p1, v0

    .line 53
    .line 54
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    check-cast p1, Ldefpackage/xy4;

    .line 59
    .line 60
    invoke-virtual {p0, p1}, Ldefpackage/xy4;->a(Ldefpackage/xy4;)V

    .line 61
    .line 62
    .line 63
    return-object p0

    .line 64
    :cond_4
    if-eqz p1, :cond_5

    .line 65
    .line 66
    array-length v2, p1

    .line 67
    if-le v2, v1, :cond_5

    .line 68
    .line 69
    array-length v1, p1

    .line 70
    :goto_1
    if-ge v0, v1, :cond_5

    .line 71
    .line 72
    aget-object v2, p1, v0

    .line 73
    .line 74
    invoke-interface {p2, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    check-cast v2, Ldefpackage/xy4;

    .line 79
    .line 80
    invoke-virtual {p0, v2}, Ldefpackage/xy4;->a(Ldefpackage/xy4;)V

    .line 81
    .line 82
    .line 83
    add-int/lit8 v0, v0, 0x1

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_5
    return-object p0
.end method

.method public static R(Ljava/lang/Class;Ljava/lang/ReflectiveOperationException;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/RuntimeException;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v2, "Unable to instantiate GlideModule implementation for "

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-direct {v0, p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 18
    .line 19
    .line 20
    throw v0
.end method

.method public static S(D)D
    .locals 2

    .line 1
    const-wide/high16 v0, 0x4059000000000000L    # 100.0

    .line 2
    .line 3
    div-double/2addr p0, v0

    .line 4
    const-wide v0, 0x3f69a5c37387b719L    # 0.0031308

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    cmpg-double v0, p0, v0

    .line 10
    .line 11
    if-gtz v0, :cond_0

    .line 12
    .line 13
    const-wide v0, 0x4029d70a3d70a3d7L    # 12.92

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    mul-double/2addr p0, v0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const-wide v0, 0x3fdaaaaaaaaaaaabL    # 0.4166666666666667

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    invoke-static {p0, p1, v0, v1}, Ljava/lang/Math;->pow(DD)D

    .line 26
    .line 27
    .line 28
    move-result-wide p0

    .line 29
    const-wide v0, 0x3ff0e147ae147ae1L    # 1.055

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    mul-double/2addr p0, v0

    .line 35
    const-wide v0, 0x3fac28f5c28f5c29L    # 0.055

    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    sub-double/2addr p0, v0

    .line 41
    :goto_0
    const-wide v0, 0x406fe00000000000L    # 255.0

    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    mul-double/2addr p0, v0

    .line 47
    return-wide p0
.end method

.method public static T(Ljava/util/ArrayList;)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-string v1, "Failed requirement."

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-gt v2, v0, :cond_3

    .line 9
    .line 10
    const/16 v3, 0x1f5

    .line 11
    .line 12
    if-ge v0, v3, :cond_3

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    const/4 v3, 0x0

    .line 26
    move v4, v3

    .line 27
    :goto_0
    if-ge v4, v0, :cond_2

    .line 28
    .line 29
    invoke-virtual {p0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    add-int/lit8 v4, v4, 0x1

    .line 34
    .line 35
    check-cast v5, Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 38
    .line 39
    .line 40
    move-result v6

    .line 41
    if-gt v2, v6, :cond_1

    .line 42
    .line 43
    const/16 v7, 0x201

    .line 44
    .line 45
    if-ge v6, v7, :cond_1

    .line 46
    .line 47
    const-string v6, "ir_"

    .line 48
    .line 49
    invoke-static {v5, v6, v3}, Ldefpackage/xm4;->k0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    if-nez v5, :cond_1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    invoke-static {v1}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    :cond_2
    :goto_1
    return-void

    .line 60
    :cond_3
    invoke-static {v1}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method public static U(Lorg/json/JSONObject;)V
    .locals 2

    .line 1
    invoke-static {}, Lcom/eddyizm/tempus/App;->b()Lcom/eddyizm/tempus/App;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lcom/eddyizm/tempus/App;->c()Landroid/content/SharedPreferences;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const-string v1, "external_download_metadata"

    .line 17
    .line 18
    invoke-virtual {p0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-interface {v0, v1, p0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public static V(II)I
    .locals 4

    .line 1
    sget-object v0, Ljava/math/RoundingMode;->CEILING:Ljava/math/RoundingMode;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    if-eqz p1, :cond_3

    .line 7
    .line 8
    div-int v1, p0, p1

    .line 9
    .line 10
    mul-int v2, p1, v1

    .line 11
    .line 12
    sub-int v2, p0, v2

    .line 13
    .line 14
    if-nez v2, :cond_0

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_0
    xor-int/2addr p0, p1

    .line 18
    sget-object v3, Ldefpackage/lj5;->a:[I

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    aget v0, v3, v0

    .line 25
    .line 26
    shr-int/lit8 p0, p0, 0x1f

    .line 27
    .line 28
    or-int/lit8 p0, p0, 0x1

    .line 29
    .line 30
    packed-switch v0, :pswitch_data_0

    .line 31
    .line 32
    .line 33
    new-instance p0, Ljava/lang/AssertionError;

    .line 34
    .line 35
    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    .line 36
    .line 37
    .line 38
    throw p0

    .line 39
    :pswitch_0
    invoke-static {v2}, Ljava/lang/Math;->abs(I)I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    sub-int/2addr p1, v0

    .line 48
    sub-int/2addr v0, p1

    .line 49
    if-nez v0, :cond_1

    .line 50
    .line 51
    sget-object p0, Ljava/math/RoundingMode;->HALF_UP:Ljava/math/RoundingMode;

    .line 52
    .line 53
    sget-object p0, Ljava/math/RoundingMode;->HALF_EVEN:Ljava/math/RoundingMode;

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_1
    if-lez v0, :cond_2

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :pswitch_1
    if-lez p0, :cond_2

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :pswitch_2
    if-gez p0, :cond_2

    .line 63
    .line 64
    :goto_0
    :pswitch_3
    add-int/2addr v1, p0

    .line 65
    :cond_2
    :goto_1
    :pswitch_4
    return v1

    .line 66
    :pswitch_5
    new-instance p0, Ljava/lang/ArithmeticException;

    .line 67
    .line 68
    const-string p1, "mode was UNNECESSARY, but rounding was necessary"

    .line 69
    .line 70
    invoke-direct {p0, p1}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    throw p0

    .line 74
    :cond_3
    new-instance p0, Ljava/lang/ArithmeticException;

    .line 75
    .line 76
    const-string p1, "/ by zero"

    .line 77
    .line 78
    invoke-direct {p0, p1}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    throw p0

    .line 82
    nop

    .line 83
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_2
        :pswitch_3
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public static a(FFI)Ldefpackage/xd;
    .locals 8

    .line 1
    and-int/lit8 p2, p2, 0x2

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    :cond_0
    new-instance v0, Ldefpackage/xd;

    .line 7
    .line 8
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    new-instance v2, Ldefpackage/zd;

    .line 13
    .line 14
    invoke-direct {v2, p1}, Ldefpackage/zd;-><init>(F)V

    .line 15
    .line 16
    .line 17
    const-wide/high16 v3, -0x8000000000000000L

    .line 18
    .line 19
    const-wide/high16 v5, -0x8000000000000000L

    .line 20
    .line 21
    const/4 v7, 0x0

    .line 22
    invoke-direct/range {v0 .. v7}, Ldefpackage/xd;-><init>(Ljava/lang/Float;Ldefpackage/ce;JJZ)V

    .line 23
    .line 24
    .line 25
    return-object v0
.end method

.method public static final b(Ldefpackage/f13;Ldefpackage/cx2;)V
    .locals 2

    .line 1
    invoke-static {p1}, Ldefpackage/j51;->O(Ldefpackage/eo0;)Ldefpackage/c72;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Ldefpackage/c72;->y()Ldefpackage/f13;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget v0, p1, Ldefpackage/f13;->p:I

    .line 10
    .line 11
    add-int/lit8 v0, v0, -0x1

    .line 12
    .line 13
    iget-object p1, p1, Ldefpackage/f13;->n:[Ljava/lang/Object;

    .line 14
    .line 15
    array-length v1, p1

    .line 16
    if-ge v0, v1, :cond_0

    .line 17
    .line 18
    :goto_0
    if-ltz v0, :cond_0

    .line 19
    .line 20
    aget-object v1, p1, v0

    .line 21
    .line 22
    check-cast v1, Ldefpackage/c72;

    .line 23
    .line 24
    iget-object v1, v1, Ldefpackage/c72;->Q:Ldefpackage/w12;

    .line 25
    .line 26
    iget-object v1, v1, Ldefpackage/w12;->g:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v1, Ldefpackage/cx2;

    .line 29
    .line 30
    invoke-virtual {p0, v1}, Ldefpackage/f13;->b(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    add-int/lit8 v0, v0, -0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    return-void
.end method

.method public static final c(Ldefpackage/f13;)Ldefpackage/cx2;
    .locals 1

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    iget v0, p0, Ldefpackage/f13;->p:I

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    add-int/lit8 v0, v0, -0x1

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Ldefpackage/f13;->k(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, Ldefpackage/cx2;

    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 18
    return-object p0
.end method

.method public static d(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    if-eq p0, p1, :cond_3

    .line 8
    .line 9
    sget-object v0, Ldefpackage/m22;->a:Ljava/lang/Integer;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/16 v1, 0x13

    .line 18
    .line 19
    if-lt v0, v1, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 v0, 0x0

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 25
    :goto_1
    if-eqz v0, :cond_2

    .line 26
    .line 27
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_2
    sget-object v0, Ldefpackage/tg3;->a:Ljava/lang/reflect/Method;

    .line 32
    .line 33
    if-eqz v0, :cond_3

    .line 34
    .line 35
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-virtual {v0, p0, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    :cond_3
    return-void
.end method

.method public static final e(Ldefpackage/xd;Ldefpackage/rd;JLdefpackage/if1;Ldefpackage/wd0;)Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v3, p1

    .line 2
    .line 3
    move-object/from16 v0, p5

    .line 4
    .line 5
    sget-object v8, Ldefpackage/fz0;->g0:Ldefpackage/fz0;

    .line 6
    .line 7
    instance-of v1, v0, Ldefpackage/dp4;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    move-object v1, v0

    .line 12
    check-cast v1, Ldefpackage/dp4;

    .line 13
    .line 14
    iget v2, v1, Ldefpackage/dp4;->s:I

    .line 15
    .line 16
    const/high16 v4, -0x80000000

    .line 17
    .line 18
    and-int v5, v2, v4

    .line 19
    .line 20
    if-eqz v5, :cond_0

    .line 21
    .line 22
    sub-int/2addr v2, v4

    .line 23
    iput v2, v1, Ldefpackage/dp4;->s:I

    .line 24
    .line 25
    :goto_0
    move-object v9, v1

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    new-instance v1, Ldefpackage/dp4;

    .line 28
    .line 29
    invoke-direct {v1, v0}, Ldefpackage/wd0;-><init>(Ldefpackage/vd0;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :goto_1
    iget-object v0, v9, Ldefpackage/dp4;->r:Ljava/lang/Object;

    .line 34
    .line 35
    iget v1, v9, Ldefpackage/dp4;->s:I

    .line 36
    .line 37
    const/4 v10, 0x0

    .line 38
    const/4 v11, 0x2

    .line 39
    const/4 v12, 0x1

    .line 40
    sget-object v13, Ldefpackage/xe0;->n:Ldefpackage/xe0;

    .line 41
    .line 42
    if-eqz v1, :cond_3

    .line 43
    .line 44
    if-eq v1, v12, :cond_1

    .line 45
    .line 46
    if-ne v1, v11, :cond_2

    .line 47
    .line 48
    :cond_1
    iget-object v1, v9, Ldefpackage/dp4;->q:Ldefpackage/jx3;

    .line 49
    .line 50
    iget-object v2, v9, Ldefpackage/dp4;->p:Ldefpackage/if1;

    .line 51
    .line 52
    iget-object v3, v9, Ldefpackage/dp4;->o:Ldefpackage/rd;

    .line 53
    .line 54
    iget-object v4, v9, Ldefpackage/dp4;->n:Ldefpackage/xd;

    .line 55
    .line 56
    :try_start_0
    invoke-static {v0}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 57
    .line 58
    .line 59
    goto/16 :goto_7

    .line 60
    .line 61
    :catch_0
    move-exception v0

    .line 62
    goto/16 :goto_a

    .line 63
    .line 64
    :cond_2
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 65
    .line 66
    invoke-static {v0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    const/4 v0, 0x0

    .line 70
    return-object v0

    .line 71
    :cond_3
    invoke-static {v0}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    const-wide/16 v0, 0x0

    .line 75
    .line 76
    invoke-interface {v3, v0, v1}, Ldefpackage/rd;->f(J)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v15

    .line 80
    invoke-interface {v3, v0, v1}, Ldefpackage/rd;->d(J)Ldefpackage/ce;

    .line 81
    .line 82
    .line 83
    move-result-object v17

    .line 84
    new-instance v1, Ldefpackage/jx3;

    .line 85
    .line 86
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 87
    .line 88
    .line 89
    const-wide/high16 v4, -0x8000000000000000L

    .line 90
    .line 91
    cmp-long v0, p2, v4

    .line 92
    .line 93
    if-nez v0, :cond_7

    .line 94
    .line 95
    :try_start_1
    invoke-interface {v9}, Ldefpackage/vd0;->getContext()Ldefpackage/ne0;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-static {v0}, Ldefpackage/j51;->v(Ldefpackage/ne0;)F

    .line 100
    .line 101
    .line 102
    move-result v6

    .line 103
    new-instance v0, Ldefpackage/ap4;
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_3

    .line 104
    .line 105
    move-object/from16 v5, p0

    .line 106
    .line 107
    move-object/from16 v7, p4

    .line 108
    .line 109
    move-object v2, v15

    .line 110
    move-object/from16 v4, v17

    .line 111
    .line 112
    :try_start_2
    invoke-direct/range {v0 .. v7}, Ldefpackage/ap4;-><init>(Ldefpackage/jx3;Ljava/lang/Object;Ldefpackage/rd;Ldefpackage/ce;Ldefpackage/xd;FLdefpackage/if1;)V
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_2

    .line 113
    .line 114
    .line 115
    move-object v7, v1

    .line 116
    :try_start_3
    iput-object v5, v9, Ldefpackage/dp4;->n:Ldefpackage/xd;

    .line 117
    .line 118
    iput-object v3, v9, Ldefpackage/dp4;->o:Ldefpackage/rd;

    .line 119
    .line 120
    move-object/from16 v6, p4

    .line 121
    .line 122
    iput-object v6, v9, Ldefpackage/dp4;->p:Ldefpackage/if1;

    .line 123
    .line 124
    iput-object v7, v9, Ldefpackage/dp4;->q:Ldefpackage/jx3;

    .line 125
    .line 126
    iput v12, v9, Ldefpackage/dp4;->s:I

    .line 127
    .line 128
    invoke-interface {v3}, Ldefpackage/rd;->a()Z

    .line 129
    .line 130
    .line 131
    move-result v1

    .line 132
    if-eqz v1, :cond_5

    .line 133
    .line 134
    invoke-interface {v9}, Ldefpackage/vd0;->getContext()Ldefpackage/ne0;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    invoke-interface {v1, v8}, Ldefpackage/ne0;->K(Ldefpackage/me0;)Ldefpackage/le0;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    if-nez v1, :cond_4

    .line 143
    .line 144
    invoke-interface {v9}, Ldefpackage/vd0;->getContext()Ldefpackage/ne0;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    invoke-static {v1}, Ldefpackage/vr1;->x(Ldefpackage/ne0;)Ldefpackage/ed;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    invoke-virtual {v1, v0, v9}, Ldefpackage/ed;->a(Ldefpackage/if1;Ldefpackage/wd0;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    goto :goto_2

    .line 157
    :cond_4
    new-instance v0, Ljava/lang/ClassCastException;

    .line 158
    .line 159
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 160
    .line 161
    .line 162
    throw v0

    .line 163
    :cond_5
    new-instance v1, Ldefpackage/ih4;

    .line 164
    .line 165
    invoke-direct {v1, v0, v12}, Ldefpackage/ih4;-><init>(Ldefpackage/if1;I)V

    .line 166
    .line 167
    .line 168
    invoke-interface {v9}, Ldefpackage/vd0;->getContext()Ldefpackage/ne0;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    invoke-static {v0}, Ldefpackage/vr1;->x(Ldefpackage/ne0;)Ldefpackage/ed;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    invoke-virtual {v0, v1, v9}, Ldefpackage/ed;->a(Ldefpackage/if1;Ldefpackage/wd0;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v0
    :try_end_3
    .catch Ljava/util/concurrent/CancellationException; {:try_start_3 .. :try_end_3} :catch_1

    .line 180
    :goto_2
    if-ne v0, v13, :cond_6

    .line 181
    .line 182
    goto/16 :goto_9

    .line 183
    .line 184
    :cond_6
    move-object v4, v5

    .line 185
    move-object v2, v6

    .line 186
    goto :goto_6

    .line 187
    :goto_3
    move-object v4, v5

    .line 188
    :goto_4
    move-object v1, v7

    .line 189
    goto/16 :goto_a

    .line 190
    .line 191
    :catch_1
    move-exception v0

    .line 192
    goto :goto_3

    .line 193
    :catch_2
    move-exception v0

    .line 194
    :goto_5
    move-object v7, v1

    .line 195
    move-object v4, v5

    .line 196
    goto/16 :goto_a

    .line 197
    .line 198
    :catch_3
    move-exception v0

    .line 199
    move-object/from16 v5, p0

    .line 200
    .line 201
    goto :goto_5

    .line 202
    :cond_7
    move-object/from16 v5, p0

    .line 203
    .line 204
    move-object/from16 v6, p4

    .line 205
    .line 206
    move-object v7, v1

    .line 207
    :try_start_4
    new-instance v14, Ldefpackage/vd;

    .line 208
    .line 209
    invoke-interface {v3}, Ldefpackage/rd;->c()Ldefpackage/hd5;

    .line 210
    .line 211
    .line 212
    move-result-object v16

    .line 213
    invoke-interface {v3}, Ldefpackage/rd;->g()Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v20

    .line 217
    new-instance v0, Ldefpackage/bp4;

    .line 218
    .line 219
    invoke-direct {v0, v5, v10}, Ldefpackage/bp4;-><init>(Ldefpackage/xd;I)V

    .line 220
    .line 221
    .line 222
    move-wide/from16 v21, p2

    .line 223
    .line 224
    move-wide/from16 v18, p2

    .line 225
    .line 226
    move-object/from16 v23, v0

    .line 227
    .line 228
    invoke-direct/range {v14 .. v23}, Ldefpackage/vd;-><init>(Ljava/lang/Object;Ldefpackage/hd5;Ldefpackage/ce;JLjava/lang/Object;JLdefpackage/gf1;)V

    .line 229
    .line 230
    .line 231
    invoke-interface {v9}, Ldefpackage/vd0;->getContext()Ldefpackage/ne0;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    invoke-static {v0}, Ldefpackage/j51;->v(Ldefpackage/ne0;)F

    .line 236
    .line 237
    .line 238
    move-result v0

    .line 239
    move-wide/from16 v1, p2

    .line 240
    .line 241
    move-object v4, v3

    .line 242
    move v3, v0

    .line 243
    move-object v0, v14

    .line 244
    invoke-static/range {v0 .. v6}, Ldefpackage/j51;->q(Ldefpackage/vd;JFLdefpackage/rd;Ldefpackage/xd;Ldefpackage/if1;)V

    .line 245
    .line 246
    .line 247
    move-object v14, v0

    .line 248
    iput-object v14, v7, Ldefpackage/jx3;->n:Ljava/lang/Object;
    :try_end_4
    .catch Ljava/util/concurrent/CancellationException; {:try_start_4 .. :try_end_4} :catch_5

    .line 249
    .line 250
    move-object/from16 v4, p0

    .line 251
    .line 252
    move-object/from16 v3, p1

    .line 253
    .line 254
    move-object/from16 v2, p4

    .line 255
    .line 256
    :goto_6
    move-object v1, v7

    .line 257
    :cond_8
    :goto_7
    :try_start_5
    iget-object v0, v1, Ldefpackage/jx3;->n:Ljava/lang/Object;

    .line 258
    .line 259
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 260
    .line 261
    .line 262
    check-cast v0, Ldefpackage/vd;

    .line 263
    .line 264
    iget-object v0, v0, Ldefpackage/vd;->i:Ldefpackage/zd3;

    .line 265
    .line 266
    invoke-virtual {v0}, Ldefpackage/zd3;->getValue()Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object v0

    .line 270
    check-cast v0, Ljava/lang/Boolean;

    .line 271
    .line 272
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 273
    .line 274
    .line 275
    move-result v0

    .line 276
    if-eqz v0, :cond_b

    .line 277
    .line 278
    invoke-interface {v9}, Ldefpackage/vd0;->getContext()Ldefpackage/ne0;

    .line 279
    .line 280
    .line 281
    move-result-object v0

    .line 282
    invoke-static {v0}, Ldefpackage/j51;->v(Ldefpackage/ne0;)F

    .line 283
    .line 284
    .line 285
    move-result v0

    .line 286
    new-instance v5, Ldefpackage/cp4;
    :try_end_5
    .catch Ljava/util/concurrent/CancellationException; {:try_start_5 .. :try_end_5} :catch_0

    .line 287
    .line 288
    move/from16 p2, v0

    .line 289
    .line 290
    move-object/from16 p1, v1

    .line 291
    .line 292
    move-object/from16 p5, v2

    .line 293
    .line 294
    move-object/from16 p3, v3

    .line 295
    .line 296
    move-object/from16 p4, v4

    .line 297
    .line 298
    move-object/from16 p0, v5

    .line 299
    .line 300
    :try_start_6
    invoke-direct/range {p0 .. p5}, Ldefpackage/cp4;-><init>(Ldefpackage/jx3;FLdefpackage/rd;Ldefpackage/xd;Ldefpackage/if1;)V
    :try_end_6
    .catch Ljava/util/concurrent/CancellationException; {:try_start_6 .. :try_end_6} :catch_4

    .line 301
    .line 302
    .line 303
    move-object/from16 v0, p0

    .line 304
    .line 305
    move-object/from16 v1, p1

    .line 306
    .line 307
    move-object/from16 v3, p3

    .line 308
    .line 309
    move-object/from16 v4, p4

    .line 310
    .line 311
    move-object/from16 v2, p5

    .line 312
    .line 313
    :try_start_7
    iput-object v4, v9, Ldefpackage/dp4;->n:Ldefpackage/xd;

    .line 314
    .line 315
    iput-object v3, v9, Ldefpackage/dp4;->o:Ldefpackage/rd;

    .line 316
    .line 317
    iput-object v2, v9, Ldefpackage/dp4;->p:Ldefpackage/if1;

    .line 318
    .line 319
    iput-object v1, v9, Ldefpackage/dp4;->q:Ldefpackage/jx3;

    .line 320
    .line 321
    iput v11, v9, Ldefpackage/dp4;->s:I

    .line 322
    .line 323
    invoke-interface {v3}, Ldefpackage/rd;->a()Z

    .line 324
    .line 325
    .line 326
    move-result v5

    .line 327
    if-eqz v5, :cond_a

    .line 328
    .line 329
    invoke-interface {v9}, Ldefpackage/vd0;->getContext()Ldefpackage/ne0;

    .line 330
    .line 331
    .line 332
    move-result-object v5

    .line 333
    invoke-interface {v5, v8}, Ldefpackage/ne0;->K(Ldefpackage/me0;)Ldefpackage/le0;

    .line 334
    .line 335
    .line 336
    move-result-object v5

    .line 337
    if-nez v5, :cond_9

    .line 338
    .line 339
    invoke-interface {v9}, Ldefpackage/vd0;->getContext()Ldefpackage/ne0;

    .line 340
    .line 341
    .line 342
    move-result-object v5

    .line 343
    invoke-static {v5}, Ldefpackage/vr1;->x(Ldefpackage/ne0;)Ldefpackage/ed;

    .line 344
    .line 345
    .line 346
    move-result-object v5

    .line 347
    invoke-virtual {v5, v0, v9}, Ldefpackage/ed;->a(Ldefpackage/if1;Ldefpackage/wd0;)Ljava/lang/Object;

    .line 348
    .line 349
    .line 350
    move-result-object v0

    .line 351
    goto :goto_8

    .line 352
    :cond_9
    new-instance v0, Ljava/lang/ClassCastException;

    .line 353
    .line 354
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 355
    .line 356
    .line 357
    throw v0

    .line 358
    :cond_a
    new-instance v5, Ldefpackage/ih4;

    .line 359
    .line 360
    invoke-direct {v5, v0, v12}, Ldefpackage/ih4;-><init>(Ldefpackage/if1;I)V

    .line 361
    .line 362
    .line 363
    invoke-interface {v9}, Ldefpackage/vd0;->getContext()Ldefpackage/ne0;

    .line 364
    .line 365
    .line 366
    move-result-object v0

    .line 367
    invoke-static {v0}, Ldefpackage/vr1;->x(Ldefpackage/ne0;)Ldefpackage/ed;

    .line 368
    .line 369
    .line 370
    move-result-object v0

    .line 371
    invoke-virtual {v0, v5, v9}, Ldefpackage/ed;->a(Ldefpackage/if1;Ldefpackage/wd0;)Ljava/lang/Object;

    .line 372
    .line 373
    .line 374
    move-result-object v0
    :try_end_7
    .catch Ljava/util/concurrent/CancellationException; {:try_start_7 .. :try_end_7} :catch_0

    .line 375
    :goto_8
    if-ne v0, v13, :cond_8

    .line 376
    .line 377
    :goto_9
    return-object v13

    .line 378
    :catch_4
    move-exception v0

    .line 379
    move-object/from16 v1, p1

    .line 380
    .line 381
    move-object/from16 v4, p4

    .line 382
    .line 383
    goto :goto_a

    .line 384
    :cond_b
    sget-object v0, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 385
    .line 386
    return-object v0

    .line 387
    :catch_5
    move-exception v0

    .line 388
    move-object/from16 v4, p0

    .line 389
    .line 390
    goto/16 :goto_4

    .line 391
    .line 392
    :goto_a
    iget-object v2, v1, Ldefpackage/jx3;->n:Ljava/lang/Object;

    .line 393
    .line 394
    check-cast v2, Ldefpackage/vd;

    .line 395
    .line 396
    if-eqz v2, :cond_c

    .line 397
    .line 398
    iget-object v2, v2, Ldefpackage/vd;->i:Ldefpackage/zd3;

    .line 399
    .line 400
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 401
    .line 402
    invoke-virtual {v2, v3}, Ldefpackage/zd3;->setValue(Ljava/lang/Object;)V

    .line 403
    .line 404
    .line 405
    :cond_c
    iget-object v1, v1, Ldefpackage/jx3;->n:Ljava/lang/Object;

    .line 406
    .line 407
    check-cast v1, Ldefpackage/vd;

    .line 408
    .line 409
    if-eqz v1, :cond_d

    .line 410
    .line 411
    iget-wide v1, v1, Ldefpackage/vd;->g:J

    .line 412
    .line 413
    iget-wide v5, v4, Ldefpackage/xd;->p:J

    .line 414
    .line 415
    cmp-long v1, v1, v5

    .line 416
    .line 417
    if-nez v1, :cond_d

    .line 418
    .line 419
    iput-boolean v10, v4, Ldefpackage/xd;->r:Z

    .line 420
    .line 421
    :cond_d
    throw v0
.end method

.method public static f(FLdefpackage/wd;Ldefpackage/wf1;Ldefpackage/ep4;I)Ljava/lang/Object;
    .locals 9

    .line 1
    and-int/lit8 p4, p4, 0x8

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x7

    .line 6
    invoke-static {p1}, Ldefpackage/au0;->S(I)Ldefpackage/ck4;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    :cond_0
    new-instance v1, Ljava/lang/Float;

    .line 11
    .line 12
    const/4 p4, 0x0

    .line 13
    invoke-direct {v1, p4}, Ljava/lang/Float;-><init>(F)V

    .line 14
    .line 15
    .line 16
    new-instance v0, Ljava/lang/Float;

    .line 17
    .line 18
    invoke-direct {v0, p0}, Ljava/lang/Float;-><init>(F)V

    .line 19
    .line 20
    .line 21
    new-instance p0, Ljava/lang/Float;

    .line 22
    .line 23
    invoke-direct {p0, p4}, Ljava/lang/Float;-><init>(F)V

    .line 24
    .line 25
    .line 26
    sget-object p4, Ldefpackage/p35;->a:Ldefpackage/hd5;

    .line 27
    .line 28
    iget-object p4, p4, Ldefpackage/hd5;->o:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p4, Ldefpackage/if1;

    .line 31
    .line 32
    invoke-interface {p4, p0}, Ldefpackage/if1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    check-cast p0, Ldefpackage/ce;

    .line 37
    .line 38
    if-nez p0, :cond_1

    .line 39
    .line 40
    invoke-interface {p4, v1}, Ldefpackage/if1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    check-cast p0, Ldefpackage/ce;

    .line 45
    .line 46
    invoke-virtual {p0}, Ldefpackage/ce;->c()Ldefpackage/ce;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    :cond_1
    move-object v2, p0

    .line 51
    new-instance p0, Ldefpackage/yq4;

    .line 52
    .line 53
    invoke-direct {p0, p1, v1, v0, v2}, Ldefpackage/yq4;-><init>(Ldefpackage/wd;Ljava/lang/Object;Ljava/lang/Float;Ldefpackage/ce;)V

    .line 54
    .line 55
    .line 56
    new-instance v0, Ldefpackage/xd;

    .line 57
    .line 58
    const-wide/high16 v5, -0x8000000000000000L

    .line 59
    .line 60
    const/4 v7, 0x0

    .line 61
    const-wide/high16 v3, -0x8000000000000000L

    .line 62
    .line 63
    invoke-direct/range {v0 .. v7}, Ldefpackage/xd;-><init>(Ljava/lang/Float;Ldefpackage/ce;JJZ)V

    .line 64
    .line 65
    .line 66
    new-instance v7, Ldefpackage/kl3;

    .line 67
    .line 68
    const/16 p1, 0xc

    .line 69
    .line 70
    invoke-direct {v7, p1, p2}, Ldefpackage/kl3;-><init>(ILjava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    move-object v4, p0

    .line 74
    move-object v8, p3

    .line 75
    move-object v3, v0

    .line 76
    invoke-static/range {v3 .. v8}, Ldefpackage/j51;->e(Ldefpackage/xd;Ldefpackage/rd;JLdefpackage/if1;Ldefpackage/wd0;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    sget-object p1, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 81
    .line 82
    sget-object p2, Ldefpackage/xe0;->n:Ldefpackage/xe0;

    .line 83
    .line 84
    if-ne p0, p2, :cond_2

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_2
    move-object p0, p1

    .line 88
    :goto_0
    if-ne p0, p2, :cond_3

    .line 89
    .line 90
    return-object p0

    .line 91
    :cond_3
    return-object p1
.end method

.method public static final g(Ldefpackage/xd;Ldefpackage/ui0;ZLdefpackage/if1;Ldefpackage/wd0;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v0, p0, Ldefpackage/xd;->n:Ldefpackage/zd3;

    .line 2
    .line 3
    invoke-virtual {v0}, Ldefpackage/zd3;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Ldefpackage/xd;->o:Ldefpackage/ce;

    .line 8
    .line 9
    new-instance v3, Ldefpackage/ti0;

    .line 10
    .line 11
    invoke-direct {v3, p1, v0, v1}, Ldefpackage/ti0;-><init>(Ldefpackage/ui0;Ljava/lang/Object;Ldefpackage/ce;)V

    .line 12
    .line 13
    .line 14
    if-eqz p2, :cond_0

    .line 15
    .line 16
    iget-wide p1, p0, Ldefpackage/xd;->p:J

    .line 17
    .line 18
    :goto_0
    move-object v2, p0

    .line 19
    move-wide v4, p1

    .line 20
    move-object v6, p3

    .line 21
    move-object v7, p4

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    const-wide/high16 p1, -0x8000000000000000L

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :goto_1
    invoke-static/range {v2 .. v7}, Ldefpackage/j51;->e(Ldefpackage/xd;Ldefpackage/rd;JLdefpackage/if1;Ldefpackage/wd0;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    sget-object p1, Ldefpackage/xe0;->n:Ldefpackage/xe0;

    .line 31
    .line 32
    if-ne p0, p1, :cond_1

    .line 33
    .line 34
    return-object p0

    .line 35
    :cond_1
    sget-object p0, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 36
    .line 37
    return-object p0
.end method

.method public static final h(Ldefpackage/xd;Ljava/lang/Float;Ldefpackage/wd;ZLdefpackage/if1;Ldefpackage/wd0;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Ldefpackage/xd;->n:Ldefpackage/zd3;

    .line 2
    .line 3
    invoke-virtual {v0}, Ldefpackage/zd3;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Ldefpackage/xd;->o:Ldefpackage/ce;

    .line 8
    .line 9
    move-object v2, p1

    .line 10
    new-instance p1, Ldefpackage/yq4;

    .line 11
    .line 12
    invoke-direct {p1, p2, v0, v2, v1}, Ldefpackage/yq4;-><init>(Ldefpackage/wd;Ljava/lang/Object;Ljava/lang/Float;Ldefpackage/ce;)V

    .line 13
    .line 14
    .line 15
    if-eqz p3, :cond_0

    .line 16
    .line 17
    iget-wide p2, p0, Ldefpackage/xd;->p:J

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const-wide/high16 p2, -0x8000000000000000L

    .line 21
    .line 22
    :goto_0
    invoke-static/range {p0 .. p5}, Ldefpackage/j51;->e(Ldefpackage/xd;Ldefpackage/rd;JLdefpackage/if1;Ldefpackage/wd0;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    sget-object p1, Ldefpackage/xe0;->n:Ldefpackage/xe0;

    .line 27
    .line 28
    if-ne p0, p1, :cond_1

    .line 29
    .line 30
    return-object p0

    .line 31
    :cond_1
    sget-object p0, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 32
    .line 33
    return-object p0
.end method

.method public static i(DDD)Z
    .locals 4

    .line 1
    sub-double/2addr p2, p0

    .line 2
    const-wide v0, 0x403921fb54442d18L    # 25.132741228718345

    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    add-double/2addr p2, v0

    .line 8
    const-wide v2, 0x401921fb54442d18L    # 6.283185307179586

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    rem-double/2addr p2, v2

    .line 14
    sub-double/2addr p4, p0

    .line 15
    add-double/2addr p4, v0

    .line 16
    rem-double/2addr p4, v2

    .line 17
    cmpg-double p0, p2, p4

    .line 18
    .line 19
    if-gez p0, :cond_0

    .line 20
    .line 21
    const/4 p0, 0x1

    .line 22
    return p0

    .line 23
    :cond_0
    const/4 p0, 0x0

    .line 24
    return p0
.end method

.method public static final j(Ldefpackage/cx2;)Ldefpackage/u62;
    .locals 2

    .line 1
    iget v0, p0, Ldefpackage/cx2;->p:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, 0x2

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_3

    .line 7
    .line 8
    instance-of v0, p0, Ldefpackage/u62;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    check-cast p0, Ldefpackage/u62;

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_0
    instance-of v0, p0, Ldefpackage/fo0;

    .line 16
    .line 17
    if-eqz v0, :cond_3

    .line 18
    .line 19
    check-cast p0, Ldefpackage/fo0;

    .line 20
    .line 21
    iget-object p0, p0, Ldefpackage/fo0;->C:Ldefpackage/cx2;

    .line 22
    .line 23
    :goto_0
    if-eqz p0, :cond_3

    .line 24
    .line 25
    instance-of v0, p0, Ldefpackage/u62;

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    check-cast p0, Ldefpackage/u62;

    .line 30
    .line 31
    return-object p0

    .line 32
    :cond_1
    instance-of v0, p0, Ldefpackage/fo0;

    .line 33
    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    iget v0, p0, Ldefpackage/cx2;->p:I

    .line 37
    .line 38
    and-int/lit8 v0, v0, 0x2

    .line 39
    .line 40
    if-eqz v0, :cond_2

    .line 41
    .line 42
    check-cast p0, Ldefpackage/fo0;

    .line 43
    .line 44
    iget-object p0, p0, Ldefpackage/fo0;->C:Ldefpackage/cx2;

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_2
    iget-object p0, p0, Ldefpackage/cx2;->s:Ldefpackage/cx2;

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_3
    return-object v1
.end method

.method public static final k(III)I
    .locals 1

    .line 1
    ushr-int/2addr p0, p2

    .line 2
    and-int/lit16 p0, p0, 0xff

    .line 3
    .line 4
    ushr-int/2addr p1, p2

    .line 5
    and-int/lit16 p1, p1, 0xff

    .line 6
    .line 7
    int-to-float v0, p0

    .line 8
    sub-int/2addr p1, p0

    .line 9
    int-to-float p0, p1

    .line 10
    const p1, 0x3ee66666    # 0.45f

    .line 11
    .line 12
    .line 13
    mul-float/2addr p0, p1

    .line 14
    add-float/2addr p0, v0

    .line 15
    const/high16 p1, 0x3f000000    # 0.5f

    .line 16
    .line 17
    add-float/2addr p0, p1

    .line 18
    float-to-int p0, p0

    .line 19
    shl-int/2addr p0, p2

    .line 20
    return p0
.end method

.method public static l()V
    .locals 7

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "initialCapacity"

    .line 7
    .line 8
    const/4 v2, 0x4

    .line 9
    invoke-static {v2, v1}, Ldefpackage/uc5;->f(ILjava/lang/String;)V

    .line 10
    .line 11
    .line 12
    new-array v1, v2, [Ljava/lang/Object;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    move v3, v2

    .line 16
    :goto_0
    invoke-static {}, Landroid/opengl/GLES20;->glGetError()I

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    if-eqz v4, :cond_3

    .line 21
    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    const/16 v2, 0xa

    .line 25
    .line 26
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    :cond_0
    invoke-static {v4}, Landroid/opengl/GLU;->gluErrorString(I)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    if-nez v2, :cond_1

    .line 34
    .line 35
    new-instance v2, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    const-string v5, "error code: 0x"

    .line 38
    .line 39
    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-static {v4}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    :cond_1
    const-string v5, "glError: "

    .line 54
    .line 55
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    array-length v4, v1

    .line 66
    add-int/lit8 v5, v3, 0x1

    .line 67
    .line 68
    invoke-static {v4, v5}, Ldefpackage/qw1;->b(II)I

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    array-length v6, v1

    .line 73
    if-gt v4, v6, :cond_2

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_2
    invoke-static {v1, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    :goto_1
    aput-object v2, v1, v3

    .line 81
    .line 82
    const/4 v2, 0x1

    .line 83
    move v3, v5

    .line 84
    goto :goto_0

    .line 85
    :cond_3
    if-nez v2, :cond_4

    .line 86
    .line 87
    return-void

    .line 88
    :cond_4
    new-instance v2, Landroidx/media3/common/util/GlUtil$GlException;

    .line 89
    .line 90
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-static {v3, v1}, Ldefpackage/yw1;->i(I[Ljava/lang/Object;)Ldefpackage/gy3;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    invoke-direct {v2, v0, v1}, Landroidx/media3/common/util/GlUtil$GlException;-><init>(Ljava/lang/String;Ldefpackage/gy3;)V

    .line 99
    .line 100
    .line 101
    throw v2
.end method

.method public static m(Ljava/lang/String;Z)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    new-instance p1, Landroidx/media3/common/util/GlUtil$GlException;

    .line 5
    .line 6
    sget-object v0, Ldefpackage/yw1;->o:Ldefpackage/vw1;

    .line 7
    .line 8
    sget-object v0, Ldefpackage/gy3;->r:Ldefpackage/gy3;

    .line 9
    .line 10
    invoke-direct {p1, p0, v0}, Landroidx/media3/common/util/GlUtil$GlException;-><init>(Ljava/lang/String;Ldefpackage/gy3;)V

    .line 11
    .line 12
    .line 13
    throw p1
.end method

.method public static n(D)D
    .locals 5

    .line 1
    invoke-static {p0, p1}, Ljava/lang/Math;->abs(D)D

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-wide v2, 0x3fdae147ae147ae1L    # 0.42

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->pow(DD)D

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    const-wide/16 v2, 0x0

    .line 15
    .line 16
    cmpg-double v4, p0, v2

    .line 17
    .line 18
    if-gez v4, :cond_0

    .line 19
    .line 20
    const/4 p0, -0x1

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    cmpl-double p0, p0, v2

    .line 23
    .line 24
    if-nez p0, :cond_1

    .line 25
    .line 26
    const/4 p0, 0x0

    .line 27
    goto :goto_0

    .line 28
    :cond_1
    const/4 p0, 0x1

    .line 29
    :goto_0
    int-to-double p0, p0

    .line 30
    const-wide/high16 v2, 0x4079000000000000L    # 400.0

    .line 31
    .line 32
    mul-double/2addr p0, v2

    .line 33
    mul-double/2addr p0, v0

    .line 34
    const-wide v2, 0x403b2147ae147ae1L    # 27.13

    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    add-double/2addr v0, v2

    .line 40
    div-double/2addr p0, v0

    .line 41
    return-wide p0
.end method

.method public static declared-synchronized o()V
    .locals 2

    .line 1
    const-class v0, Ldefpackage/j51;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    .line 5
    .line 6
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-static {v1}, Ldefpackage/j51;->U(Lorg/json/JSONObject;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    .line 12
    monitor-exit v0

    .line 13
    return-void

    .line 14
    :catchall_0
    move-exception v1

    .line 15
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 16
    throw v1
.end method

.method public static p(Ldefpackage/xd;FFI)Ldefpackage/xd;
    .locals 8

    .line 1
    and-int/lit8 v0, p3, 0x1

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Ldefpackage/xd;->n:Ldefpackage/zd3;

    .line 6
    .line 7
    invoke-virtual {p1}, Ldefpackage/zd3;->getValue()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Ljava/lang/Number;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    :cond_0
    and-int/lit8 p3, p3, 0x2

    .line 18
    .line 19
    if-eqz p3, :cond_1

    .line 20
    .line 21
    iget-object p2, p0, Ldefpackage/xd;->o:Ldefpackage/ce;

    .line 22
    .line 23
    check-cast p2, Ldefpackage/zd;

    .line 24
    .line 25
    iget p2, p2, Ldefpackage/zd;->a:F

    .line 26
    .line 27
    :cond_1
    iget-wide v3, p0, Ldefpackage/xd;->p:J

    .line 28
    .line 29
    iget-wide v5, p0, Ldefpackage/xd;->q:J

    .line 30
    .line 31
    iget-boolean v7, p0, Ldefpackage/xd;->r:Z

    .line 32
    .line 33
    new-instance v0, Ldefpackage/xd;

    .line 34
    .line 35
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    new-instance v2, Ldefpackage/zd;

    .line 43
    .line 44
    invoke-direct {v2, p2}, Ldefpackage/zd;-><init>(F)V

    .line 45
    .line 46
    .line 47
    invoke-direct/range {v0 .. v7}, Ldefpackage/xd;-><init>(Ljava/lang/Float;Ldefpackage/ce;JJZ)V

    .line 48
    .line 49
    .line 50
    return-object v0
.end method

.method public static final q(Ldefpackage/vd;JFLdefpackage/rd;Ldefpackage/xd;Ldefpackage/if1;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpg-float v0, p3, v0

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    invoke-interface {p4}, Ldefpackage/rd;->b()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    iget-wide v0, p0, Ldefpackage/vd;->c:J

    .line 12
    .line 13
    sub-long v0, p1, v0

    .line 14
    .line 15
    long-to-float v0, v0

    .line 16
    div-float/2addr v0, p3

    .line 17
    float-to-long v0, v0

    .line 18
    :goto_0
    iput-wide p1, p0, Ldefpackage/vd;->g:J

    .line 19
    .line 20
    iget-object p1, p0, Ldefpackage/vd;->i:Ldefpackage/zd3;

    .line 21
    .line 22
    invoke-interface {p4, v0, v1}, Ldefpackage/rd;->f(J)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    iget-object p3, p0, Ldefpackage/vd;->e:Ldefpackage/zd3;

    .line 27
    .line 28
    invoke-virtual {p3, p2}, Ldefpackage/zd3;->setValue(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    invoke-interface {p4, v0, v1}, Ldefpackage/rd;->d(J)Ldefpackage/ce;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    iput-object p2, p0, Ldefpackage/vd;->f:Ldefpackage/ce;

    .line 36
    .line 37
    invoke-interface {p4, v0, v1}, Ldefpackage/rd;->e(J)Z

    .line 38
    .line 39
    .line 40
    move-result p2

    .line 41
    if-eqz p2, :cond_1

    .line 42
    .line 43
    iget-wide v0, p0, Ldefpackage/vd;->g:J

    .line 44
    .line 45
    iput-wide v0, p0, Ldefpackage/vd;->h:J

    .line 46
    .line 47
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 48
    .line 49
    invoke-virtual {p1, p2}, Ldefpackage/zd3;->setValue(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    :cond_1
    invoke-virtual {p3}, Ldefpackage/zd3;->getValue()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    iget-object p3, p5, Ldefpackage/xd;->n:Ldefpackage/zd3;

    .line 57
    .line 58
    invoke-virtual {p3, p2}, Ldefpackage/zd3;->setValue(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    iget-object p2, p5, Ldefpackage/xd;->o:Ldefpackage/ce;

    .line 62
    .line 63
    iget-object p3, p0, Ldefpackage/vd;->f:Ldefpackage/ce;

    .line 64
    .line 65
    invoke-virtual {p2}, Ldefpackage/ce;->b()I

    .line 66
    .line 67
    .line 68
    move-result p4

    .line 69
    const/4 v0, 0x0

    .line 70
    :goto_1
    if-ge v0, p4, :cond_2

    .line 71
    .line 72
    invoke-virtual {p3, v0}, Ldefpackage/ce;->a(I)F

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    invoke-virtual {p2, v0, v1}, Ldefpackage/ce;->d(IF)V

    .line 77
    .line 78
    .line 79
    add-int/lit8 v0, v0, 0x1

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_2
    iget-wide p2, p0, Ldefpackage/vd;->h:J

    .line 83
    .line 84
    iput-wide p2, p5, Ldefpackage/xd;->q:J

    .line 85
    .line 86
    iget-wide p2, p0, Ldefpackage/vd;->g:J

    .line 87
    .line 88
    iput-wide p2, p5, Ldefpackage/xd;->p:J

    .line 89
    .line 90
    invoke-virtual {p1}, Ldefpackage/zd3;->getValue()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    check-cast p1, Ljava/lang/Boolean;

    .line 95
    .line 96
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    iput-boolean p1, p5, Ldefpackage/xd;->r:Z

    .line 101
    .line 102
    invoke-interface {p6, p0}, Ldefpackage/if1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    return-void
.end method

.method public static r(Ljava/util/Set;Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    instance-of v0, p1, Ljava/util/Set;

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    check-cast p1, Ljava/util/Set;

    .line 9
    .line 10
    :try_start_0
    invoke-interface {p0}, Ljava/util/Set;->size()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    invoke-interface {p1}, Ljava/util/Set;->size()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-ne v0, v1, :cond_1

    .line 19
    .line 20
    invoke-interface {p0, p1}, Ljava/util/Set;->containsAll(Ljava/util/Collection;)Z

    .line 21
    .line 22
    .line 23
    move-result p0
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    if-eqz p0, :cond_1

    .line 25
    .line 26
    :goto_0
    const/4 p0, 0x1

    .line 27
    return p0

    .line 28
    :catch_0
    :cond_1
    const/4 p0, 0x0

    .line 29
    return p0
.end method

.method public static s(Ljava/util/Set;Ldefpackage/ro3;)Ldefpackage/hb4;
    .locals 5

    .line 1
    instance-of v0, p0, Ljava/util/SortedSet;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x2

    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    check-cast p0, Ljava/util/SortedSet;

    .line 9
    .line 10
    instance-of v0, p0, Ldefpackage/hb4;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    check-cast p0, Ldefpackage/hb4;

    .line 15
    .line 16
    iget-object v0, p0, Ldefpackage/hb4;->o:Ldefpackage/ro3;

    .line 17
    .line 18
    new-instance v4, Ldefpackage/so3;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    new-array v3, v3, [Ldefpackage/ro3;

    .line 24
    .line 25
    aput-object v0, v3, v2

    .line 26
    .line 27
    aput-object p1, v3, v1

    .line 28
    .line 29
    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-direct {v4, p1}, Ldefpackage/so3;-><init>(Ljava/util/List;)V

    .line 34
    .line 35
    .line 36
    new-instance p1, Ldefpackage/ib4;

    .line 37
    .line 38
    iget-object p0, p0, Ldefpackage/hb4;->n:Ljava/util/Set;

    .line 39
    .line 40
    check-cast p0, Ljava/util/SortedSet;

    .line 41
    .line 42
    invoke-direct {p1, p0, v4}, Ldefpackage/hb4;-><init>(Ljava/util/Set;Ldefpackage/ro3;)V

    .line 43
    .line 44
    .line 45
    return-object p1

    .line 46
    :cond_0
    new-instance v0, Ldefpackage/ib4;

    .line 47
    .line 48
    invoke-direct {v0, p0, p1}, Ldefpackage/hb4;-><init>(Ljava/util/Set;Ldefpackage/ro3;)V

    .line 49
    .line 50
    .line 51
    return-object v0

    .line 52
    :cond_1
    instance-of v0, p0, Ldefpackage/hb4;

    .line 53
    .line 54
    if-eqz v0, :cond_2

    .line 55
    .line 56
    check-cast p0, Ldefpackage/hb4;

    .line 57
    .line 58
    iget-object v0, p0, Ldefpackage/hb4;->o:Ldefpackage/ro3;

    .line 59
    .line 60
    new-instance v4, Ldefpackage/so3;

    .line 61
    .line 62
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    new-array v3, v3, [Ldefpackage/ro3;

    .line 66
    .line 67
    aput-object v0, v3, v2

    .line 68
    .line 69
    aput-object p1, v3, v1

    .line 70
    .line 71
    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-direct {v4, p1}, Ldefpackage/so3;-><init>(Ljava/util/List;)V

    .line 76
    .line 77
    .line 78
    new-instance p1, Ldefpackage/hb4;

    .line 79
    .line 80
    iget-object p0, p0, Ldefpackage/hb4;->n:Ljava/util/Set;

    .line 81
    .line 82
    check-cast p0, Ljava/util/Set;

    .line 83
    .line 84
    invoke-direct {p1, p0, v4}, Ldefpackage/hb4;-><init>(Ljava/util/Set;Ldefpackage/ro3;)V

    .line 85
    .line 86
    .line 87
    return-object p1

    .line 88
    :cond_2
    new-instance v0, Ldefpackage/hb4;

    .line 89
    .line 90
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    check-cast p0, Ljava/util/Set;

    .line 94
    .line 95
    invoke-direct {v0, p0, p1}, Ldefpackage/hb4;-><init>(Ljava/util/Set;Ldefpackage/ro3;)V

    .line 96
    .line 97
    .line 98
    return-object v0
.end method

.method public static t(Ldefpackage/mw2;Ldefpackage/r62;Ldefpackage/zs4;Ldefpackage/oo0;Ldefpackage/ha1;)Ldefpackage/mw2;
    .locals 2

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Ldefpackage/mw2;->a:Ldefpackage/r62;

    .line 4
    .line 5
    if-ne p1, v0, :cond_0

    .line 6
    .line 7
    invoke-static {p2, p1}, Ldefpackage/ud3;->g0(Ldefpackage/zs4;Ldefpackage/r62;)Ldefpackage/zs4;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v1, p0, Ldefpackage/mw2;->b:Ldefpackage/zs4;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ldefpackage/zs4;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-interface {p3}, Ldefpackage/oo0;->g()F

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    iget-object v1, p0, Ldefpackage/mw2;->c:Ldefpackage/ro0;

    .line 24
    .line 25
    iget v1, v1, Ldefpackage/ro0;->n:F

    .line 26
    .line 27
    cmpg-float v0, v0, v1

    .line 28
    .line 29
    if-nez v0, :cond_0

    .line 30
    .line 31
    iget-object v0, p0, Ldefpackage/mw2;->d:Ldefpackage/ha1;

    .line 32
    .line 33
    if-ne p4, v0, :cond_0

    .line 34
    .line 35
    return-object p0

    .line 36
    :cond_0
    sget-object p0, Ldefpackage/mw2;->h:Ldefpackage/mw2;

    .line 37
    .line 38
    if-eqz p0, :cond_1

    .line 39
    .line 40
    iget-object v0, p0, Ldefpackage/mw2;->a:Ldefpackage/r62;

    .line 41
    .line 42
    if-ne p1, v0, :cond_1

    .line 43
    .line 44
    invoke-static {p2, p1}, Ldefpackage/ud3;->g0(Ldefpackage/zs4;Ldefpackage/r62;)Ldefpackage/zs4;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iget-object v1, p0, Ldefpackage/mw2;->b:Ldefpackage/zs4;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ldefpackage/zs4;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_1

    .line 55
    .line 56
    invoke-interface {p3}, Ldefpackage/oo0;->g()F

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    iget-object v1, p0, Ldefpackage/mw2;->c:Ldefpackage/ro0;

    .line 61
    .line 62
    iget v1, v1, Ldefpackage/ro0;->n:F

    .line 63
    .line 64
    cmpg-float v0, v0, v1

    .line 65
    .line 66
    if-nez v0, :cond_1

    .line 67
    .line 68
    iget-object v0, p0, Ldefpackage/mw2;->d:Ldefpackage/ha1;

    .line 69
    .line 70
    if-ne p4, v0, :cond_1

    .line 71
    .line 72
    return-object p0

    .line 73
    :cond_1
    new-instance p0, Ldefpackage/mw2;

    .line 74
    .line 75
    invoke-static {p2, p1}, Ldefpackage/ud3;->g0(Ldefpackage/zs4;Ldefpackage/r62;)Ldefpackage/zs4;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    invoke-interface {p3}, Ldefpackage/oo0;->g()F

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    invoke-interface {p3}, Ldefpackage/oo0;->J()F

    .line 84
    .line 85
    .line 86
    move-result p3

    .line 87
    new-instance v1, Ldefpackage/ro0;

    .line 88
    .line 89
    invoke-direct {v1, v0, p3}, Ldefpackage/ro0;-><init>(FF)V

    .line 90
    .line 91
    .line 92
    invoke-direct {p0, p1, p2, v1, p4}, Ldefpackage/mw2;-><init>(Ldefpackage/r62;Ldefpackage/zs4;Ldefpackage/ro0;Ldefpackage/ha1;)V

    .line 93
    .line 94
    .line 95
    sput-object p0, Ldefpackage/mw2;->h:Ldefpackage/mw2;

    .line 96
    .line 97
    return-object p0
.end method

.method public static final u(Landroid/view/View;)Ldefpackage/ba2;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    :goto_0
    const/4 v0, 0x0

    .line 5
    if-eqz p0, :cond_3

    .line 6
    .line 7
    const v1, 0x7f0a0658

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    instance-of v2, v1, Ldefpackage/ba2;

    .line 15
    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    check-cast v1, Ldefpackage/ba2;

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_0
    move-object v1, v0

    .line 22
    :goto_1
    if-eqz v1, :cond_1

    .line 23
    .line 24
    return-object v1

    .line 25
    :cond_1
    invoke-static {p0}, Ldefpackage/au0;->z(Landroid/view/View;)Landroid/view/ViewParent;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    instance-of v1, p0, Landroid/view/View;

    .line 30
    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    check-cast p0, Landroid/view/View;

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    move-object p0, v0

    .line 37
    goto :goto_0

    .line 38
    :cond_3
    return-object v0
.end method

.method public static final v(Ldefpackage/ne0;)F
    .locals 1

    .line 1
    sget-object v0, Ldefpackage/rv2;->q:Ldefpackage/rv2;

    .line 2
    .line 3
    invoke-interface {p0, v0}, Ldefpackage/ne0;->K(Ldefpackage/me0;)Ldefpackage/le0;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ldefpackage/qx2;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-interface {p0}, Ldefpackage/qx2;->v()F

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/high16 p0, 0x3f800000    # 1.0f

    .line 17
    .line 18
    :goto_0
    const/4 v0, 0x0

    .line 19
    cmpl-float v0, p0, v0

    .line 20
    .line 21
    if-ltz v0, :cond_1

    .line 22
    .line 23
    return p0

    .line 24
    :cond_1
    const-string v0, "negative scale factor"

    .line 25
    .line 26
    invoke-static {v0}, Ldefpackage/qo3;->b(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return p0
.end method

.method public static declared-synchronized w(Ljava/lang/String;)Ljava/lang/Long;
    .locals 6

    .line 1
    const-class v0, Ldefpackage/j51;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    monitor-exit v0

    .line 8
    return-object v1

    .line 9
    :cond_0
    :try_start_0
    invoke-static {}, Ldefpackage/j51;->I()Lorg/json/JSONObject;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {v2, p0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 14
    .line 15
    .line 16
    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    if-nez v3, :cond_1

    .line 18
    .line 19
    monitor-exit v0

    .line 20
    return-object v1

    .line 21
    :cond_1
    const-wide/16 v3, -0x1

    .line 22
    .line 23
    :try_start_1
    invoke-virtual {v2, p0, v3, v4}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 24
    .line 25
    .line 26
    move-result-wide v2

    .line 27
    const-wide/16 v4, 0x0

    .line 28
    .line 29
    cmp-long p0, v2, v4

    .line 30
    .line 31
    if-lez p0, :cond_2

    .line 32
    .line 33
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 34
    .line 35
    .line 36
    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 37
    goto :goto_0

    .line 38
    :catchall_0
    move-exception p0

    .line 39
    goto :goto_1

    .line 40
    :cond_2
    :goto_0
    monitor-exit v0

    .line 41
    return-object v1

    .line 42
    :goto_1
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 43
    throw p0
.end method

.method public static x(Ljava/util/Set;)I
    .locals 3

    .line 1
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x0

    .line 6
    move v1, v0

    .line 7
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-eqz v2, :cond_1

    .line 12
    .line 13
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    goto :goto_1

    .line 24
    :cond_0
    move v2, v0

    .line 25
    :goto_1
    add-int/2addr v1, v2

    .line 26
    not-int v1, v1

    .line 27
    not-int v1, v1

    .line 28
    goto :goto_0

    .line 29
    :cond_1
    return v1
.end method

.method public static y([D)D
    .locals 12

    .line 1
    sget-object v0, Ldefpackage/j51;->c:[[D

    .line 2
    .line 3
    invoke-static {p0, v0}, Ldefpackage/ud3;->a0([D[[D)[D

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const/4 v0, 0x0

    .line 8
    aget-wide v0, p0, v0

    .line 9
    .line 10
    invoke-static {v0, v1}, Ldefpackage/j51;->n(D)D

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    const/4 v2, 0x1

    .line 15
    aget-wide v2, p0, v2

    .line 16
    .line 17
    invoke-static {v2, v3}, Ldefpackage/j51;->n(D)D

    .line 18
    .line 19
    .line 20
    move-result-wide v2

    .line 21
    const/4 v4, 0x2

    .line 22
    aget-wide v4, p0, v4

    .line 23
    .line 24
    invoke-static {v4, v5}, Ldefpackage/j51;->n(D)D

    .line 25
    .line 26
    .line 27
    move-result-wide v4

    .line 28
    const-wide/high16 v6, 0x4026000000000000L    # 11.0

    .line 29
    .line 30
    mul-double v8, v0, v6

    .line 31
    .line 32
    const-wide/high16 v10, -0x3fd8000000000000L    # -12.0

    .line 33
    .line 34
    mul-double/2addr v10, v2

    .line 35
    add-double/2addr v10, v8

    .line 36
    add-double/2addr v10, v4

    .line 37
    div-double/2addr v10, v6

    .line 38
    add-double/2addr v0, v2

    .line 39
    const-wide/high16 v2, 0x4000000000000000L    # 2.0

    .line 40
    .line 41
    mul-double/2addr v4, v2

    .line 42
    sub-double/2addr v0, v4

    .line 43
    const-wide/high16 v2, 0x4022000000000000L    # 9.0

    .line 44
    .line 45
    div-double/2addr v0, v2

    .line 46
    invoke-static {v0, v1, v10, v11}, Ljava/lang/Math;->atan2(DD)D

    .line 47
    .line 48
    .line 49
    move-result-wide v0

    .line 50
    return-wide v0
.end method

.method public static z(Ljava/util/Set;Ldefpackage/jx1;)Ldefpackage/gb4;
    .locals 1

    .line 1
    const-string v0, "set1"

    .line 2
    .line 3
    invoke-static {p0, v0}, Ldefpackage/rr2;->s(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "set2"

    .line 7
    .line 8
    invoke-static {p1, v0}, Ldefpackage/rr2;->s(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Ldefpackage/gb4;

    .line 12
    .line 13
    invoke-direct {v0, p0, p1}, Ldefpackage/gb4;-><init>(Ljava/util/Set;Ljava/util/Set;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method
