.class public final Lcom/eddyizm/tempus/github/models/Assets;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private browserDownloadUrl:Ljava/lang/String;
    .annotation runtime Lka4;
        value = "browser_download_url"
    .end annotation
.end field

.field private contentType:Ljava/lang/String;
    .annotation runtime Lka4;
        value = "content_type"
    .end annotation
.end field

.field private createdAt:Ljava/lang/String;
    .annotation runtime Lka4;
        value = "created_at"
    .end annotation
.end field

.field private downloadCount:Ljava/lang/Integer;
    .annotation runtime Lka4;
        value = "download_count"
    .end annotation
.end field

.field private id:Ljava/lang/Integer;
    .annotation runtime Lka4;
        value = "id"
    .end annotation
.end field

.field private label:Ljava/lang/String;
    .annotation runtime Lka4;
        value = "label"
    .end annotation
.end field

.field private name:Ljava/lang/String;
    .annotation runtime Lka4;
        value = "name"
    .end annotation
.end field

.field private nodeId:Ljava/lang/String;
    .annotation runtime Lka4;
        value = "node_id"
    .end annotation
.end field

.field private size:Ljava/lang/Integer;
    .annotation runtime Lka4;
        value = "size"
    .end annotation
.end field

.field private state:Ljava/lang/String;
    .annotation runtime Lka4;
        value = "state"
    .end annotation
.end field

.field private updatedAt:Ljava/lang/String;
    .annotation runtime Lka4;
        value = "updated_at"
    .end annotation
.end field

.field private uploader:Lcom/eddyizm/tempus/github/models/Uploader;
    .annotation runtime Lka4;
        value = "uploader"
    .end annotation
.end field

.field private url:Ljava/lang/String;
    .annotation runtime Lka4;
        value = "url"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 16

    .line 192
    const/16 v14, 0x1fff

    const/4 v15, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object/from16 v0, p0

    invoke-direct/range {v0 .. v15}, Lcom/eddyizm/tempus/github/models/Assets;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/eddyizm/tempus/github/models/Uploader;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILxj0;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/eddyizm/tempus/github/models/Uploader;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 178
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 179
    iput-object p1, p0, Lcom/eddyizm/tempus/github/models/Assets;->url:Ljava/lang/String;

    .line 180
    iput-object p2, p0, Lcom/eddyizm/tempus/github/models/Assets;->id:Ljava/lang/Integer;

    .line 181
    iput-object p3, p0, Lcom/eddyizm/tempus/github/models/Assets;->nodeId:Ljava/lang/String;

    .line 182
    iput-object p4, p0, Lcom/eddyizm/tempus/github/models/Assets;->name:Ljava/lang/String;

    .line 183
    iput-object p5, p0, Lcom/eddyizm/tempus/github/models/Assets;->label:Ljava/lang/String;

    .line 184
    iput-object p6, p0, Lcom/eddyizm/tempus/github/models/Assets;->uploader:Lcom/eddyizm/tempus/github/models/Uploader;

    .line 185
    iput-object p7, p0, Lcom/eddyizm/tempus/github/models/Assets;->contentType:Ljava/lang/String;

    .line 186
    iput-object p8, p0, Lcom/eddyizm/tempus/github/models/Assets;->state:Ljava/lang/String;

    .line 187
    iput-object p9, p0, Lcom/eddyizm/tempus/github/models/Assets;->size:Ljava/lang/Integer;

    .line 188
    iput-object p10, p0, Lcom/eddyizm/tempus/github/models/Assets;->downloadCount:Ljava/lang/Integer;

    .line 189
    iput-object p11, p0, Lcom/eddyizm/tempus/github/models/Assets;->createdAt:Ljava/lang/String;

    .line 190
    iput-object p12, p0, Lcom/eddyizm/tempus/github/models/Assets;->updatedAt:Ljava/lang/String;

    .line 191
    iput-object p13, p0, Lcom/eddyizm/tempus/github/models/Assets;->browserDownloadUrl:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/eddyizm/tempus/github/models/Uploader;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILxj0;)V
    .locals 29

    .line 1
    move/from16 v0, p14

    .line 2
    .line 3
    and-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    move-object v1, v2

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move-object/from16 v1, p1

    .line 11
    .line 12
    :goto_0
    and-int/lit8 v3, v0, 0x2

    .line 13
    .line 14
    if-eqz v3, :cond_1

    .line 15
    .line 16
    move-object v3, v2

    .line 17
    goto :goto_1

    .line 18
    :cond_1
    move-object/from16 v3, p2

    .line 19
    .line 20
    :goto_1
    and-int/lit8 v4, v0, 0x4

    .line 21
    .line 22
    if-eqz v4, :cond_2

    .line 23
    .line 24
    move-object v4, v2

    .line 25
    goto :goto_2

    .line 26
    :cond_2
    move-object/from16 v4, p3

    .line 27
    .line 28
    :goto_2
    and-int/lit8 v5, v0, 0x8

    .line 29
    .line 30
    if-eqz v5, :cond_3

    .line 31
    .line 32
    move-object v5, v2

    .line 33
    goto :goto_3

    .line 34
    :cond_3
    move-object/from16 v5, p4

    .line 35
    .line 36
    :goto_3
    and-int/lit8 v6, v0, 0x10

    .line 37
    .line 38
    if-eqz v6, :cond_4

    .line 39
    .line 40
    move-object v6, v2

    .line 41
    goto :goto_4

    .line 42
    :cond_4
    move-object/from16 v6, p5

    .line 43
    .line 44
    :goto_4
    and-int/lit8 v7, v0, 0x20

    .line 45
    .line 46
    if-eqz v7, :cond_5

    .line 47
    .line 48
    new-instance v8, Lcom/eddyizm/tempus/github/models/Uploader;

    .line 49
    .line 50
    const v27, 0x3ffff

    .line 51
    .line 52
    .line 53
    const/16 v28, 0x0

    .line 54
    .line 55
    const/4 v9, 0x0

    .line 56
    const/4 v10, 0x0

    .line 57
    const/4 v11, 0x0

    .line 58
    const/4 v12, 0x0

    .line 59
    const/4 v13, 0x0

    .line 60
    const/4 v14, 0x0

    .line 61
    const/4 v15, 0x0

    .line 62
    const/16 v16, 0x0

    .line 63
    .line 64
    const/16 v17, 0x0

    .line 65
    .line 66
    const/16 v18, 0x0

    .line 67
    .line 68
    const/16 v19, 0x0

    .line 69
    .line 70
    const/16 v20, 0x0

    .line 71
    .line 72
    const/16 v21, 0x0

    .line 73
    .line 74
    const/16 v22, 0x0

    .line 75
    .line 76
    const/16 v23, 0x0

    .line 77
    .line 78
    const/16 v24, 0x0

    .line 79
    .line 80
    const/16 v25, 0x0

    .line 81
    .line 82
    const/16 v26, 0x0

    .line 83
    .line 84
    invoke-direct/range {v8 .. v28}, Lcom/eddyizm/tempus/github/models/Uploader;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ILxj0;)V

    .line 85
    .line 86
    .line 87
    goto :goto_5

    .line 88
    :cond_5
    move-object/from16 v8, p6

    .line 89
    .line 90
    :goto_5
    and-int/lit8 v7, v0, 0x40

    .line 91
    .line 92
    if-eqz v7, :cond_6

    .line 93
    .line 94
    move-object v7, v2

    .line 95
    goto :goto_6

    .line 96
    :cond_6
    move-object/from16 v7, p7

    .line 97
    .line 98
    :goto_6
    and-int/lit16 v9, v0, 0x80

    .line 99
    .line 100
    if-eqz v9, :cond_7

    .line 101
    .line 102
    move-object v9, v2

    .line 103
    goto :goto_7

    .line 104
    :cond_7
    move-object/from16 v9, p8

    .line 105
    .line 106
    :goto_7
    and-int/lit16 v10, v0, 0x100

    .line 107
    .line 108
    if-eqz v10, :cond_8

    .line 109
    .line 110
    move-object v10, v2

    .line 111
    goto :goto_8

    .line 112
    :cond_8
    move-object/from16 v10, p9

    .line 113
    .line 114
    :goto_8
    and-int/lit16 v11, v0, 0x200

    .line 115
    .line 116
    if-eqz v11, :cond_9

    .line 117
    .line 118
    move-object v11, v2

    .line 119
    goto :goto_9

    .line 120
    :cond_9
    move-object/from16 v11, p10

    .line 121
    .line 122
    :goto_9
    and-int/lit16 v12, v0, 0x400

    .line 123
    .line 124
    if-eqz v12, :cond_a

    .line 125
    .line 126
    move-object v12, v2

    .line 127
    goto :goto_a

    .line 128
    :cond_a
    move-object/from16 v12, p11

    .line 129
    .line 130
    :goto_a
    and-int/lit16 v13, v0, 0x800

    .line 131
    .line 132
    if-eqz v13, :cond_b

    .line 133
    .line 134
    move-object v13, v2

    .line 135
    goto :goto_b

    .line 136
    :cond_b
    move-object/from16 v13, p12

    .line 137
    .line 138
    :goto_b
    and-int/lit16 v0, v0, 0x1000

    .line 139
    .line 140
    if-eqz v0, :cond_c

    .line 141
    .line 142
    move-object/from16 p14, v2

    .line 143
    .line 144
    :goto_c
    move-object/from16 p1, p0

    .line 145
    .line 146
    move-object/from16 p2, v1

    .line 147
    .line 148
    move-object/from16 p3, v3

    .line 149
    .line 150
    move-object/from16 p4, v4

    .line 151
    .line 152
    move-object/from16 p5, v5

    .line 153
    .line 154
    move-object/from16 p6, v6

    .line 155
    .line 156
    move-object/from16 p8, v7

    .line 157
    .line 158
    move-object/from16 p7, v8

    .line 159
    .line 160
    move-object/from16 p9, v9

    .line 161
    .line 162
    move-object/from16 p10, v10

    .line 163
    .line 164
    move-object/from16 p11, v11

    .line 165
    .line 166
    move-object/from16 p12, v12

    .line 167
    .line 168
    move-object/from16 p13, v13

    .line 169
    .line 170
    goto :goto_d

    .line 171
    :cond_c
    move-object/from16 p14, p13

    .line 172
    .line 173
    goto :goto_c

    .line 174
    :goto_d
    invoke-direct/range {p1 .. p14}, Lcom/eddyizm/tempus/github/models/Assets;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/eddyizm/tempus/github/models/Uploader;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    return-void
.end method

.method public static synthetic copy$default(Lcom/eddyizm/tempus/github/models/Assets;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/eddyizm/tempus/github/models/Uploader;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/eddyizm/tempus/github/models/Assets;
    .locals 12

    .line 1
    move/from16 v0, p14

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    iget-object p1, p0, Lcom/eddyizm/tempus/github/models/Assets;->url:Ljava/lang/String;

    :cond_0
    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/eddyizm/tempus/github/models/Assets;->id:Ljava/lang/Integer;

    goto :goto_0

    :cond_1
    move-object v1, p2

    :goto_0
    and-int/lit8 v2, v0, 0x4

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/eddyizm/tempus/github/models/Assets;->nodeId:Ljava/lang/String;

    goto :goto_1

    :cond_2
    move-object v2, p3

    :goto_1
    and-int/lit8 v3, v0, 0x8

    if-eqz v3, :cond_3

    iget-object v3, p0, Lcom/eddyizm/tempus/github/models/Assets;->name:Ljava/lang/String;

    goto :goto_2

    :cond_3
    move-object/from16 v3, p4

    :goto_2
    and-int/lit8 v4, v0, 0x10

    if-eqz v4, :cond_4

    iget-object v4, p0, Lcom/eddyizm/tempus/github/models/Assets;->label:Ljava/lang/String;

    goto :goto_3

    :cond_4
    move-object/from16 v4, p5

    :goto_3
    and-int/lit8 v5, v0, 0x20

    if-eqz v5, :cond_5

    iget-object v5, p0, Lcom/eddyizm/tempus/github/models/Assets;->uploader:Lcom/eddyizm/tempus/github/models/Uploader;

    goto :goto_4

    :cond_5
    move-object/from16 v5, p6

    :goto_4
    and-int/lit8 v6, v0, 0x40

    if-eqz v6, :cond_6

    iget-object v6, p0, Lcom/eddyizm/tempus/github/models/Assets;->contentType:Ljava/lang/String;

    goto :goto_5

    :cond_6
    move-object/from16 v6, p7

    :goto_5
    and-int/lit16 v7, v0, 0x80

    if-eqz v7, :cond_7

    iget-object v7, p0, Lcom/eddyizm/tempus/github/models/Assets;->state:Ljava/lang/String;

    goto :goto_6

    :cond_7
    move-object/from16 v7, p8

    :goto_6
    and-int/lit16 v8, v0, 0x100

    if-eqz v8, :cond_8

    iget-object v8, p0, Lcom/eddyizm/tempus/github/models/Assets;->size:Ljava/lang/Integer;

    goto :goto_7

    :cond_8
    move-object/from16 v8, p9

    :goto_7
    and-int/lit16 v9, v0, 0x200

    if-eqz v9, :cond_9

    iget-object v9, p0, Lcom/eddyizm/tempus/github/models/Assets;->downloadCount:Ljava/lang/Integer;

    goto :goto_8

    :cond_9
    move-object/from16 v9, p10

    :goto_8
    and-int/lit16 v10, v0, 0x400

    if-eqz v10, :cond_a

    iget-object v10, p0, Lcom/eddyizm/tempus/github/models/Assets;->createdAt:Ljava/lang/String;

    goto :goto_9

    :cond_a
    move-object/from16 v10, p11

    :goto_9
    and-int/lit16 v11, v0, 0x800

    if-eqz v11, :cond_b

    iget-object v11, p0, Lcom/eddyizm/tempus/github/models/Assets;->updatedAt:Ljava/lang/String;

    goto :goto_a

    :cond_b
    move-object/from16 v11, p12

    :goto_a
    and-int/lit16 v0, v0, 0x1000

    if-eqz v0, :cond_c

    iget-object v0, p0, Lcom/eddyizm/tempus/github/models/Assets;->browserDownloadUrl:Ljava/lang/String;

    move-object/from16 p15, v0

    :goto_b
    move-object p2, p0

    move-object p3, p1

    move-object/from16 p4, v1

    move-object/from16 p5, v2

    move-object/from16 p6, v3

    move-object/from16 p7, v4

    move-object/from16 p8, v5

    move-object/from16 p9, v6

    move-object/from16 p10, v7

    move-object/from16 p11, v8

    move-object/from16 p12, v9

    move-object/from16 p13, v10

    move-object/from16 p14, v11

    goto :goto_c

    :cond_c
    move-object/from16 p15, p13

    goto :goto_b

    :goto_c
    invoke-virtual/range {p2 .. p15}, Lcom/eddyizm/tempus/github/models/Assets;->copy(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/eddyizm/tempus/github/models/Uploader;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/eddyizm/tempus/github/models/Assets;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/Assets;->url:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component10()Ljava/lang/Integer;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/Assets;->downloadCount:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component11()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/Assets;->createdAt:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component12()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/Assets;->updatedAt:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component13()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/Assets;->browserDownloadUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component2()Ljava/lang/Integer;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/Assets;->id:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component3()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/Assets;->nodeId:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component4()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/Assets;->name:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component5()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/Assets;->label:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component6()Lcom/eddyizm/tempus/github/models/Uploader;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/Assets;->uploader:Lcom/eddyizm/tempus/github/models/Uploader;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component7()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/Assets;->contentType:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component8()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/Assets;->state:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component9()Ljava/lang/Integer;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/Assets;->size:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object p0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/eddyizm/tempus/github/models/Uploader;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/eddyizm/tempus/github/models/Assets;
    .locals 0

    .line 1
    new-instance p0, Lcom/eddyizm/tempus/github/models/Assets;

    .line 2
    .line 3
    invoke-direct/range {p0 .. p13}, Lcom/eddyizm/tempus/github/models/Assets;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/eddyizm/tempus/github/models/Uploader;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lcom/eddyizm/tempus/github/models/Assets;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lcom/eddyizm/tempus/github/models/Assets;

    .line 12
    .line 13
    iget-object v1, p0, Lcom/eddyizm/tempus/github/models/Assets;->url:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v3, p1, Lcom/eddyizm/tempus/github/models/Assets;->url:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v1, v3}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    iget-object v1, p0, Lcom/eddyizm/tempus/github/models/Assets;->id:Ljava/lang/Integer;

    .line 25
    .line 26
    iget-object v3, p1, Lcom/eddyizm/tempus/github/models/Assets;->id:Ljava/lang/Integer;

    .line 27
    .line 28
    invoke-static {v1, v3}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_3

    .line 33
    .line 34
    return v2

    .line 35
    :cond_3
    iget-object v1, p0, Lcom/eddyizm/tempus/github/models/Assets;->nodeId:Ljava/lang/String;

    .line 36
    .line 37
    iget-object v3, p1, Lcom/eddyizm/tempus/github/models/Assets;->nodeId:Ljava/lang/String;

    .line 38
    .line 39
    invoke-static {v1, v3}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-nez v1, :cond_4

    .line 44
    .line 45
    return v2

    .line 46
    :cond_4
    iget-object v1, p0, Lcom/eddyizm/tempus/github/models/Assets;->name:Ljava/lang/String;

    .line 47
    .line 48
    iget-object v3, p1, Lcom/eddyizm/tempus/github/models/Assets;->name:Ljava/lang/String;

    .line 49
    .line 50
    invoke-static {v1, v3}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-nez v1, :cond_5

    .line 55
    .line 56
    return v2

    .line 57
    :cond_5
    iget-object v1, p0, Lcom/eddyizm/tempus/github/models/Assets;->label:Ljava/lang/String;

    .line 58
    .line 59
    iget-object v3, p1, Lcom/eddyizm/tempus/github/models/Assets;->label:Ljava/lang/String;

    .line 60
    .line 61
    invoke-static {v1, v3}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-nez v1, :cond_6

    .line 66
    .line 67
    return v2

    .line 68
    :cond_6
    iget-object v1, p0, Lcom/eddyizm/tempus/github/models/Assets;->uploader:Lcom/eddyizm/tempus/github/models/Uploader;

    .line 69
    .line 70
    iget-object v3, p1, Lcom/eddyizm/tempus/github/models/Assets;->uploader:Lcom/eddyizm/tempus/github/models/Uploader;

    .line 71
    .line 72
    invoke-static {v1, v3}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    if-nez v1, :cond_7

    .line 77
    .line 78
    return v2

    .line 79
    :cond_7
    iget-object v1, p0, Lcom/eddyizm/tempus/github/models/Assets;->contentType:Ljava/lang/String;

    .line 80
    .line 81
    iget-object v3, p1, Lcom/eddyizm/tempus/github/models/Assets;->contentType:Ljava/lang/String;

    .line 82
    .line 83
    invoke-static {v1, v3}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    if-nez v1, :cond_8

    .line 88
    .line 89
    return v2

    .line 90
    :cond_8
    iget-object v1, p0, Lcom/eddyizm/tempus/github/models/Assets;->state:Ljava/lang/String;

    .line 91
    .line 92
    iget-object v3, p1, Lcom/eddyizm/tempus/github/models/Assets;->state:Ljava/lang/String;

    .line 93
    .line 94
    invoke-static {v1, v3}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    if-nez v1, :cond_9

    .line 99
    .line 100
    return v2

    .line 101
    :cond_9
    iget-object v1, p0, Lcom/eddyizm/tempus/github/models/Assets;->size:Ljava/lang/Integer;

    .line 102
    .line 103
    iget-object v3, p1, Lcom/eddyizm/tempus/github/models/Assets;->size:Ljava/lang/Integer;

    .line 104
    .line 105
    invoke-static {v1, v3}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    if-nez v1, :cond_a

    .line 110
    .line 111
    return v2

    .line 112
    :cond_a
    iget-object v1, p0, Lcom/eddyizm/tempus/github/models/Assets;->downloadCount:Ljava/lang/Integer;

    .line 113
    .line 114
    iget-object v3, p1, Lcom/eddyizm/tempus/github/models/Assets;->downloadCount:Ljava/lang/Integer;

    .line 115
    .line 116
    invoke-static {v1, v3}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    if-nez v1, :cond_b

    .line 121
    .line 122
    return v2

    .line 123
    :cond_b
    iget-object v1, p0, Lcom/eddyizm/tempus/github/models/Assets;->createdAt:Ljava/lang/String;

    .line 124
    .line 125
    iget-object v3, p1, Lcom/eddyizm/tempus/github/models/Assets;->createdAt:Ljava/lang/String;

    .line 126
    .line 127
    invoke-static {v1, v3}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result v1

    .line 131
    if-nez v1, :cond_c

    .line 132
    .line 133
    return v2

    .line 134
    :cond_c
    iget-object v1, p0, Lcom/eddyizm/tempus/github/models/Assets;->updatedAt:Ljava/lang/String;

    .line 135
    .line 136
    iget-object v3, p1, Lcom/eddyizm/tempus/github/models/Assets;->updatedAt:Ljava/lang/String;

    .line 137
    .line 138
    invoke-static {v1, v3}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result v1

    .line 142
    if-nez v1, :cond_d

    .line 143
    .line 144
    return v2

    .line 145
    :cond_d
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/Assets;->browserDownloadUrl:Ljava/lang/String;

    .line 146
    .line 147
    iget-object p1, p1, Lcom/eddyizm/tempus/github/models/Assets;->browserDownloadUrl:Ljava/lang/String;

    .line 148
    .line 149
    invoke-static {p0, p1}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result p0

    .line 153
    if-nez p0, :cond_e

    .line 154
    .line 155
    return v2

    .line 156
    :cond_e
    return v0
.end method

.method public final getBrowserDownloadUrl()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/Assets;->browserDownloadUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getContentType()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/Assets;->contentType:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getCreatedAt()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/Assets;->createdAt:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getDownloadCount()Ljava/lang/Integer;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/Assets;->downloadCount:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getId()Ljava/lang/Integer;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/Assets;->id:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getLabel()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/Assets;->label:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/Assets;->name:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getNodeId()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/Assets;->nodeId:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getSize()Ljava/lang/Integer;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/Assets;->size:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getState()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/Assets;->state:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getUpdatedAt()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/Assets;->updatedAt:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getUploader()Lcom/eddyizm/tempus/github/models/Uploader;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/Assets;->uploader:Lcom/eddyizm/tempus/github/models/Uploader;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getUrl()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/Assets;->url:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/eddyizm/tempus/github/models/Assets;->url:Ljava/lang/String;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    move v0, v1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    .line 13
    .line 14
    iget-object v2, p0, Lcom/eddyizm/tempus/github/models/Assets;->id:Ljava/lang/Integer;

    .line 15
    .line 16
    if-nez v2, :cond_1

    .line 17
    .line 18
    move v2, v1

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    :goto_1
    add-int/2addr v0, v2

    .line 25
    mul-int/lit8 v0, v0, 0x1f

    .line 26
    .line 27
    iget-object v2, p0, Lcom/eddyizm/tempus/github/models/Assets;->nodeId:Ljava/lang/String;

    .line 28
    .line 29
    if-nez v2, :cond_2

    .line 30
    .line 31
    move v2, v1

    .line 32
    goto :goto_2

    .line 33
    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    :goto_2
    add-int/2addr v0, v2

    .line 38
    mul-int/lit8 v0, v0, 0x1f

    .line 39
    .line 40
    iget-object v2, p0, Lcom/eddyizm/tempus/github/models/Assets;->name:Ljava/lang/String;

    .line 41
    .line 42
    if-nez v2, :cond_3

    .line 43
    .line 44
    move v2, v1

    .line 45
    goto :goto_3

    .line 46
    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    :goto_3
    add-int/2addr v0, v2

    .line 51
    mul-int/lit8 v0, v0, 0x1f

    .line 52
    .line 53
    iget-object v2, p0, Lcom/eddyizm/tempus/github/models/Assets;->label:Ljava/lang/String;

    .line 54
    .line 55
    if-nez v2, :cond_4

    .line 56
    .line 57
    move v2, v1

    .line 58
    goto :goto_4

    .line 59
    :cond_4
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    :goto_4
    add-int/2addr v0, v2

    .line 64
    mul-int/lit8 v0, v0, 0x1f

    .line 65
    .line 66
    iget-object v2, p0, Lcom/eddyizm/tempus/github/models/Assets;->uploader:Lcom/eddyizm/tempus/github/models/Uploader;

    .line 67
    .line 68
    if-nez v2, :cond_5

    .line 69
    .line 70
    move v2, v1

    .line 71
    goto :goto_5

    .line 72
    :cond_5
    invoke-virtual {v2}, Lcom/eddyizm/tempus/github/models/Uploader;->hashCode()I

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    :goto_5
    add-int/2addr v0, v2

    .line 77
    mul-int/lit8 v0, v0, 0x1f

    .line 78
    .line 79
    iget-object v2, p0, Lcom/eddyizm/tempus/github/models/Assets;->contentType:Ljava/lang/String;

    .line 80
    .line 81
    if-nez v2, :cond_6

    .line 82
    .line 83
    move v2, v1

    .line 84
    goto :goto_6

    .line 85
    :cond_6
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    :goto_6
    add-int/2addr v0, v2

    .line 90
    mul-int/lit8 v0, v0, 0x1f

    .line 91
    .line 92
    iget-object v2, p0, Lcom/eddyizm/tempus/github/models/Assets;->state:Ljava/lang/String;

    .line 93
    .line 94
    if-nez v2, :cond_7

    .line 95
    .line 96
    move v2, v1

    .line 97
    goto :goto_7

    .line 98
    :cond_7
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 99
    .line 100
    .line 101
    move-result v2

    .line 102
    :goto_7
    add-int/2addr v0, v2

    .line 103
    mul-int/lit8 v0, v0, 0x1f

    .line 104
    .line 105
    iget-object v2, p0, Lcom/eddyizm/tempus/github/models/Assets;->size:Ljava/lang/Integer;

    .line 106
    .line 107
    if-nez v2, :cond_8

    .line 108
    .line 109
    move v2, v1

    .line 110
    goto :goto_8

    .line 111
    :cond_8
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 112
    .line 113
    .line 114
    move-result v2

    .line 115
    :goto_8
    add-int/2addr v0, v2

    .line 116
    mul-int/lit8 v0, v0, 0x1f

    .line 117
    .line 118
    iget-object v2, p0, Lcom/eddyizm/tempus/github/models/Assets;->downloadCount:Ljava/lang/Integer;

    .line 119
    .line 120
    if-nez v2, :cond_9

    .line 121
    .line 122
    move v2, v1

    .line 123
    goto :goto_9

    .line 124
    :cond_9
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 125
    .line 126
    .line 127
    move-result v2

    .line 128
    :goto_9
    add-int/2addr v0, v2

    .line 129
    mul-int/lit8 v0, v0, 0x1f

    .line 130
    .line 131
    iget-object v2, p0, Lcom/eddyizm/tempus/github/models/Assets;->createdAt:Ljava/lang/String;

    .line 132
    .line 133
    if-nez v2, :cond_a

    .line 134
    .line 135
    move v2, v1

    .line 136
    goto :goto_a

    .line 137
    :cond_a
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 138
    .line 139
    .line 140
    move-result v2

    .line 141
    :goto_a
    add-int/2addr v0, v2

    .line 142
    mul-int/lit8 v0, v0, 0x1f

    .line 143
    .line 144
    iget-object v2, p0, Lcom/eddyizm/tempus/github/models/Assets;->updatedAt:Ljava/lang/String;

    .line 145
    .line 146
    if-nez v2, :cond_b

    .line 147
    .line 148
    move v2, v1

    .line 149
    goto :goto_b

    .line 150
    :cond_b
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 151
    .line 152
    .line 153
    move-result v2

    .line 154
    :goto_b
    add-int/2addr v0, v2

    .line 155
    mul-int/lit8 v0, v0, 0x1f

    .line 156
    .line 157
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/Assets;->browserDownloadUrl:Ljava/lang/String;

    .line 158
    .line 159
    if-nez p0, :cond_c

    .line 160
    .line 161
    goto :goto_c

    .line 162
    :cond_c
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 163
    .line 164
    .line 165
    move-result v1

    .line 166
    :goto_c
    add-int/2addr v0, v1

    .line 167
    return v0
.end method

.method public final setBrowserDownloadUrl(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/github/models/Assets;->browserDownloadUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setContentType(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/github/models/Assets;->contentType:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setCreatedAt(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/github/models/Assets;->createdAt:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setDownloadCount(Ljava/lang/Integer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/github/models/Assets;->downloadCount:Ljava/lang/Integer;

    .line 2
    .line 3
    return-void
.end method

.method public final setId(Ljava/lang/Integer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/github/models/Assets;->id:Ljava/lang/Integer;

    .line 2
    .line 3
    return-void
.end method

.method public final setLabel(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/github/models/Assets;->label:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setName(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/github/models/Assets;->name:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setNodeId(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/github/models/Assets;->nodeId:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setSize(Ljava/lang/Integer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/github/models/Assets;->size:Ljava/lang/Integer;

    .line 2
    .line 3
    return-void
.end method

.method public final setState(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/github/models/Assets;->state:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setUpdatedAt(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/github/models/Assets;->updatedAt:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setUploader(Lcom/eddyizm/tempus/github/models/Uploader;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/github/models/Assets;->uploader:Lcom/eddyizm/tempus/github/models/Uploader;

    .line 2
    .line 3
    return-void
.end method

.method public final setUrl(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/github/models/Assets;->url:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 14

    .line 1
    iget-object v0, p0, Lcom/eddyizm/tempus/github/models/Assets;->url:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/eddyizm/tempus/github/models/Assets;->id:Ljava/lang/Integer;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/eddyizm/tempus/github/models/Assets;->nodeId:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/eddyizm/tempus/github/models/Assets;->name:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p0, Lcom/eddyizm/tempus/github/models/Assets;->label:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v5, p0, Lcom/eddyizm/tempus/github/models/Assets;->uploader:Lcom/eddyizm/tempus/github/models/Uploader;

    .line 12
    .line 13
    iget-object v6, p0, Lcom/eddyizm/tempus/github/models/Assets;->contentType:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v7, p0, Lcom/eddyizm/tempus/github/models/Assets;->state:Ljava/lang/String;

    .line 16
    .line 17
    iget-object v8, p0, Lcom/eddyizm/tempus/github/models/Assets;->size:Ljava/lang/Integer;

    .line 18
    .line 19
    iget-object v9, p0, Lcom/eddyizm/tempus/github/models/Assets;->downloadCount:Ljava/lang/Integer;

    .line 20
    .line 21
    iget-object v10, p0, Lcom/eddyizm/tempus/github/models/Assets;->createdAt:Ljava/lang/String;

    .line 22
    .line 23
    iget-object v11, p0, Lcom/eddyizm/tempus/github/models/Assets;->updatedAt:Ljava/lang/String;

    .line 24
    .line 25
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/Assets;->browserDownloadUrl:Ljava/lang/String;

    .line 26
    .line 27
    new-instance v12, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    const-string v13, "Assets(url="

    .line 30
    .line 31
    invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string v0, ", id="

    .line 38
    .line 39
    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string v0, ", nodeId="

    .line 46
    .line 47
    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string v0, ", name="

    .line 51
    .line 52
    const-string v1, ", label="

    .line 53
    .line 54
    invoke-static {v12, v2, v0, v3, v1}, Lf34;->n(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    const-string v0, ", uploader="

    .line 61
    .line 62
    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v12, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    const-string v0, ", contentType="

    .line 69
    .line 70
    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string v0, ", state="

    .line 74
    .line 75
    const-string v1, ", size="

    .line 76
    .line 77
    invoke-static {v12, v6, v0, v7, v1}, Lf34;->n(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    const-string v0, ", downloadCount="

    .line 84
    .line 85
    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    const-string v0, ", createdAt="

    .line 92
    .line 93
    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    const-string v0, ", updatedAt="

    .line 97
    .line 98
    const-string v1, ", browserDownloadUrl="

    .line 99
    .line 100
    invoke-static {v12, v10, v0, v11, v1}, Lf34;->n(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    const-string v0, ")"

    .line 104
    .line 105
    invoke-static {v12, p0, v0}, Lb11;->q(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    return-object p0
.end method
