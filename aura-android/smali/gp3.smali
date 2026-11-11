.class public final Lgp3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lretrofit2/Callback;
.implements Lkg1;
.implements Lez;
.implements Llm3;
.implements Lrh0;
.implements Lr83;
.implements Lb93;


# instance fields
.field public final synthetic n:I

.field public o:Ljava/lang/Object;

.field public p:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 0

    iput p1, p0, Lgp3;->n:I

    packed-switch p1, :pswitch_data_0

    .line 1123
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1124
    sget-object p1, Lqr2;->q:Lom0;

    iput-object p1, p0, Lgp3;->o:Ljava/lang/Object;

    return-void

    .line 1125
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1126
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lgp3;->o:Ljava/lang/Object;

    .line 1127
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lgp3;->p:Ljava/lang/Object;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0xc
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(II)V
    .locals 1

    const/16 v0, 0xa

    iput v0, p0, Lgp3;->n:I

    .line 1134
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1135
    filled-new-array {p1, p2}, [I

    move-result-object p1

    iput-object p1, p0, Lgp3;->o:Ljava/lang/Object;

    const/4 p1, 0x2

    .line 1136
    new-array p1, p1, [F

    fill-array-data p1, :array_0

    iput-object p1, p0, Lgp3;->p:Ljava/lang/Object;

    return-void

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public constructor <init>(III)V
    .locals 1

    const/16 v0, 0xa

    iput v0, p0, Lgp3;->n:I

    .line 1137
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1138
    filled-new-array {p1, p2, p3}, [I

    move-result-object p1

    iput-object p1, p0, Lgp3;->o:Ljava/lang/Object;

    const/4 p1, 0x3

    .line 1139
    new-array p1, p1, [F

    fill-array-data p1, :array_0

    iput-object p1, p0, Lgp3;->p:Ljava/lang/Object;

    return-void

    :array_0
    .array-data 4
        0x0
        0x3f000000    # 0.5f
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1100
    iput p1, p0, Lgp3;->n:I

    iput-object p2, p0, Lgp3;->p:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1097
    iput p1, p0, Lgp3;->n:I

    iput-object p2, p0, Lgp3;->o:Ljava/lang/Object;

    iput-object p3, p0, Lgp3;->p:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(IZ)V
    .locals 0

    .line 1098
    iput p1, p0, Lgp3;->n:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/widget/EditText;)V
    .locals 2

    const/4 v0, 0x2

    iput v0, p0, Lgp3;->n:I

    .line 1114
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1115
    iput-object p1, p0, Lgp3;->o:Ljava/lang/Object;

    .line 1116
    new-instance v0, Lzg5;

    .line 1117
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 1118
    new-instance v1, Lxc5;

    invoke-direct {v1, p1}, Lxc5;-><init>(Landroid/widget/EditText;)V

    iput-object v1, v0, Lzg5;->n:Ljava/lang/Object;

    .line 1119
    iput-object v0, p0, Lgp3;->p:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroidx/work/impl/WorkDatabase;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lgp3;->n:I

    .line 1105
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1106
    iput-object p1, p0, Lgp3;->o:Ljava/lang/Object;

    .line 1107
    new-instance v0, Lvo0;

    .line 1108
    invoke-direct {v0, p1}, Lvo0;-><init>(Ls24;)V

    .line 1109
    iput-object v0, p0, Lgp3;->p:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/io/File;)V
    .locals 2

    const/4 v0, 0x3

    iput v0, p0, Lgp3;->n:I

    .line 1120
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1121
    iput-object p1, p0, Lgp3;->o:Ljava/lang/Object;

    .line 1122
    new-instance v0, Ljava/io/File;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ".bak"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lgp3;->p:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;ZI)V
    .locals 0

    .line 1099
    iput p4, p0, Lgp3;->n:I

    iput-object p1, p0, Lgp3;->p:Ljava/lang/Object;

    iput-object p2, p0, Lgp3;->o:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 4

    const/16 v0, 0xa

    iput v0, p0, Lgp3;->n:I

    .line 1128
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1129
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 1130
    new-array v1, v0, [I

    iput-object v1, p0, Lgp3;->o:Ljava/lang/Object;

    .line 1131
    new-array v1, v0, [F

    iput-object v1, p0, Lgp3;->p:Ljava/lang/Object;

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 1132
    iget-object v2, p0, Lgp3;->o:Ljava/lang/Object;

    check-cast v2, [I

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    aput v3, v2, v1

    .line 1133
    iget-object v2, p0, Lgp3;->p:Ljava/lang/Object;

    check-cast v2, [F

    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Float;

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v3

    aput v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public constructor <init>(Ljo;)V
    .locals 1

    const/16 v0, 0x10

    iput v0, p0, Lgp3;->n:I

    .line 1110
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgp3;->o:Ljava/lang/Object;

    .line 1111
    new-instance p1, Lfl;

    const/4 v0, 0x0

    .line 1112
    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 1113
    iput-object p1, p0, Lgp3;->p:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lpn4;I)V
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    iput v2, v0, Lgp3;->n:I

    .line 8
    .line 9
    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 10
    .line 11
    sget-object v8, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    .line 12
    .line 13
    const-string v12, "https://localhost/rest/"

    .line 14
    .line 15
    const-string v13, ""

    .line 16
    .line 17
    const/4 v15, 0x2

    .line 18
    const/4 v3, 0x1

    .line 19
    const-class v4, Lcom/eddyizm/tempus/subsonic/models/Bookmarks;

    .line 20
    .line 21
    const-class v6, Ljava/util/Date;

    .line 22
    .line 23
    sparse-switch v2, :sswitch_data_0

    .line 24
    .line 25
    .line 26
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object v1, v0, Lgp3;->o:Ljava/lang/Object;

    .line 30
    .line 31
    new-instance v2, Lok1;

    .line 32
    .line 33
    invoke-direct {v2}, Lok1;-><init>()V

    .line 34
    .line 35
    .line 36
    new-instance v7, Lr01;

    .line 37
    .line 38
    invoke-direct {v7}, Lr01;-><init>()V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2, v6, v7}, Lok1;->a(Ljava/lang/Class;Lg32;)V

    .line 42
    .line 43
    .line 44
    new-instance v6, Llt;

    .line 45
    .line 46
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v2, v4, v6}, Lok1;->a(Ljava/lang/Class;Lg32;)V

    .line 50
    .line 51
    .line 52
    iput-boolean v3, v2, Lok1;->j:Z

    .line 53
    .line 54
    new-instance v3, Ljava/util/ArrayList;

    .line 55
    .line 56
    iget-object v4, v2, Lok1;->e:Ljava/util/ArrayList;

    .line 57
    .line 58
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 59
    .line 60
    .line 61
    move-result v6

    .line 62
    iget-object v7, v2, Lok1;->f:Ljava/util/ArrayList;

    .line 63
    .line 64
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 65
    .line 66
    .line 67
    move-result v16

    .line 68
    add-int v16, v16, v6

    .line 69
    .line 70
    add-int/lit8 v6, v16, 0x3

    .line 71
    .line 72
    invoke-direct {v3, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 76
    .line 77
    .line 78
    invoke-static {v3}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    .line 79
    .line 80
    .line 81
    new-instance v6, Ljava/util/ArrayList;

    .line 82
    .line 83
    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 84
    .line 85
    .line 86
    invoke-static {v6}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 90
    .line 91
    .line 92
    iget v6, v2, Lok1;->g:I

    .line 93
    .line 94
    iget v9, v2, Lok1;->h:I

    .line 95
    .line 96
    sget-object v10, Lbk0;->b:Lak0;

    .line 97
    .line 98
    sget-boolean v16, Lgk4;->a:Z

    .line 99
    .line 100
    if-eq v6, v15, :cond_1

    .line 101
    .line 102
    if-eq v9, v15, :cond_1

    .line 103
    .line 104
    invoke-virtual {v10, v6, v9}, Lbk0;->a(II)Ldz4;

    .line 105
    .line 106
    .line 107
    move-result-object v10

    .line 108
    if-eqz v16, :cond_0

    .line 109
    .line 110
    sget-object v15, Lgk4;->c:Lfk4;

    .line 111
    .line 112
    invoke-virtual {v15, v6, v9}, Lbk0;->a(II)Ldz4;

    .line 113
    .line 114
    .line 115
    move-result-object v15

    .line 116
    sget-object v11, Lgk4;->b:Lfk4;

    .line 117
    .line 118
    invoke-virtual {v11, v6, v9}, Lbk0;->a(II)Ldz4;

    .line 119
    .line 120
    .line 121
    move-result-object v6

    .line 122
    goto :goto_0

    .line 123
    :cond_0
    const/4 v6, 0x0

    .line 124
    const/4 v15, 0x0

    .line 125
    :goto_0
    invoke-virtual {v3, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    if-eqz v16, :cond_1

    .line 129
    .line 130
    invoke-virtual {v3, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    :cond_1
    new-instance v16, Lnk1;

    .line 137
    .line 138
    iget-object v6, v2, Lok1;->a:Lu21;

    .line 139
    .line 140
    iget v9, v2, Lok1;->c:I

    .line 141
    .line 142
    new-instance v10, Ljava/util/HashMap;

    .line 143
    .line 144
    iget-object v11, v2, Lok1;->d:Ljava/util/HashMap;

    .line 145
    .line 146
    invoke-direct {v10, v11}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 147
    .line 148
    .line 149
    iget-boolean v11, v2, Lok1;->i:Z

    .line 150
    .line 151
    iget-boolean v15, v2, Lok1;->j:Z

    .line 152
    .line 153
    iget-boolean v14, v2, Lok1;->k:Z

    .line 154
    .line 155
    move-object/from16 v24, v3

    .line 156
    .line 157
    iget v3, v2, Lok1;->b:I

    .line 158
    .line 159
    move/from16 v23, v3

    .line 160
    .line 161
    new-instance v3, Ljava/util/ArrayList;

    .line 162
    .line 163
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 164
    .line 165
    .line 166
    new-instance v3, Ljava/util/ArrayList;

    .line 167
    .line 168
    invoke-direct {v3, v7}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 169
    .line 170
    .line 171
    iget v3, v2, Lok1;->l:I

    .line 172
    .line 173
    iget v4, v2, Lok1;->m:I

    .line 174
    .line 175
    new-instance v7, Ljava/util/ArrayList;

    .line 176
    .line 177
    iget-object v2, v2, Lok1;->n:Ljava/util/LinkedList;

    .line 178
    .line 179
    invoke-direct {v7, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 180
    .line 181
    .line 182
    move/from16 v25, v3

    .line 183
    .line 184
    move/from16 v26, v4

    .line 185
    .line 186
    move-object/from16 v17, v6

    .line 187
    .line 188
    move-object/from16 v27, v7

    .line 189
    .line 190
    move/from16 v18, v9

    .line 191
    .line 192
    move-object/from16 v19, v10

    .line 193
    .line 194
    move/from16 v20, v11

    .line 195
    .line 196
    move/from16 v22, v14

    .line 197
    .line 198
    move/from16 v21, v15

    .line 199
    .line 200
    invoke-direct/range {v16 .. v27}, Lnk1;-><init>(Lu21;ILjava/util/Map;ZZZILjava/util/List;IILjava/util/List;)V

    .line 201
    .line 202
    .line 203
    new-instance v2, Lretrofit2/Retrofit$Builder;

    .line 204
    .line 205
    invoke-direct {v2}, Lretrofit2/Retrofit$Builder;-><init>()V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v1}, Lpn4;->j()Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v1

    .line 212
    if-eqz v1, :cond_2

    .line 213
    .line 214
    invoke-static {v1}, Lqm4;->K0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 215
    .line 216
    .line 217
    move-result-object v1

    .line 218
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v1

    .line 222
    goto :goto_1

    .line 223
    :cond_2
    const/4 v1, 0x0

    .line 224
    :goto_1
    if-nez v1, :cond_3

    .line 225
    .line 226
    goto :goto_2

    .line 227
    :cond_3
    move-object v13, v1

    .line 228
    :goto_2
    :try_start_0
    new-instance v1, Lfr1;

    .line 229
    .line 230
    invoke-direct {v1}, Lfr1;-><init>()V

    .line 231
    .line 232
    .line 233
    const/4 v3, 0x0

    .line 234
    invoke-virtual {v1, v3, v13}, Lfr1;->e(Lgr1;Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {v1}, Lfr1;->b()Lgr1;

    .line 238
    .line 239
    .line 240
    move-result-object v14
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 241
    goto :goto_3

    .line 242
    :catch_0
    const/4 v14, 0x0

    .line 243
    :goto_3
    if-eqz v14, :cond_4

    .line 244
    .line 245
    iget-object v1, v14, Lgr1;->d:Ljava/lang/String;

    .line 246
    .line 247
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 248
    .line 249
    .line 250
    move-result v1

    .line 251
    if-lez v1, :cond_4

    .line 252
    .line 253
    move-object v12, v13

    .line 254
    :cond_4
    invoke-virtual {v2, v12}, Lretrofit2/Retrofit$Builder;->baseUrl(Ljava/lang/String;)Lretrofit2/Retrofit$Builder;

    .line 255
    .line 256
    .line 257
    move-result-object v1

    .line 258
    invoke-static/range {v16 .. v16}, Lretrofit2/converter/gson/GsonConverterFactory;->create(Lnk1;)Lretrofit2/converter/gson/GsonConverterFactory;

    .line 259
    .line 260
    .line 261
    move-result-object v2

    .line 262
    invoke-virtual {v1, v2}, Lretrofit2/Retrofit$Builder;->addConverterFactory(Lretrofit2/Converter$Factory;)Lretrofit2/Retrofit$Builder;

    .line 263
    .line 264
    .line 265
    move-result-object v1

    .line 266
    new-instance v2, Lcx;

    .line 267
    .line 268
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 269
    .line 270
    .line 271
    new-instance v3, Lrx;

    .line 272
    .line 273
    invoke-direct {v3, v2}, Lrx;-><init>(Lcx;)V

    .line 274
    .line 275
    .line 276
    const v4, 0x278d00

    .line 277
    .line 278
    .line 279
    iput v4, v2, Lcx;->a:I

    .line 280
    .line 281
    new-instance v2, Ln83;

    .line 282
    .line 283
    invoke-direct {v2}, Ln83;-><init>()V

    .line 284
    .line 285
    .line 286
    const-wide/16 v6, 0x2

    .line 287
    .line 288
    invoke-virtual {v2, v6, v7, v8}, Ln83;->a(JLjava/util/concurrent/TimeUnit;)V

    .line 289
    .line 290
    .line 291
    const-wide/16 v6, 0x14

    .line 292
    .line 293
    invoke-virtual {v2, v6, v7, v5}, Ln83;->b(JLjava/util/concurrent/TimeUnit;)V

    .line 294
    .line 295
    .line 296
    const-wide/16 v6, 0x1e

    .line 297
    .line 298
    invoke-static {v6, v7, v5}, Lze5;->b(JLjava/util/concurrent/TimeUnit;)I

    .line 299
    .line 300
    .line 301
    move-result v4

    .line 302
    iput v4, v2, Ln83;->z:I

    .line 303
    .line 304
    invoke-static {v6, v7, v5}, Lze5;->b(JLjava/util/concurrent/TimeUnit;)I

    .line 305
    .line 306
    .line 307
    move-result v4

    .line 308
    iput v4, v2, Ln83;->A:I

    .line 309
    .line 310
    new-instance v4, Ldr1;

    .line 311
    .line 312
    invoke-direct {v4}, Ldr1;-><init>()V

    .line 313
    .line 314
    .line 315
    sget-object v5, Lcr1;->n:Lcr1;

    .line 316
    .line 317
    iput-object v5, v4, Ldr1;->b:Lcr1;

    .line 318
    .line 319
    iget-object v5, v2, Ln83;->c:Ljava/util/ArrayList;

    .line 320
    .line 321
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 322
    .line 323
    .line 324
    iget-object v4, v2, Ln83;->c:Ljava/util/ArrayList;

    .line 325
    .line 326
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 327
    .line 328
    .line 329
    new-instance v3, Lhx;

    .line 330
    .line 331
    invoke-static {}, Lcom/eddyizm/tempus/App;->a()Landroid/content/Context;

    .line 332
    .line 333
    .line 334
    move-result-object v4

    .line 335
    invoke-virtual {v4}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 336
    .line 337
    .line 338
    move-result-object v4

    .line 339
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 340
    .line 341
    .line 342
    invoke-direct {v3, v4}, Lhx;-><init>(Ljava/io/File;)V

    .line 343
    .line 344
    .line 345
    iput-object v3, v2, Ln83;->l:Lhx;

    .line 346
    .line 347
    sget-object v3, Lx30;->b:Ljavax/net/ssl/SSLSocketFactory;

    .line 348
    .line 349
    if-eqz v3, :cond_5

    .line 350
    .line 351
    sget-object v4, Lx30;->a:Ljavax/net/ssl/X509TrustManager;

    .line 352
    .line 353
    invoke-virtual {v2, v3, v4}, Ln83;->c(Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/X509TrustManager;)V

    .line 354
    .line 355
    .line 356
    :cond_5
    new-instance v3, Lo83;

    .line 357
    .line 358
    invoke-direct {v3, v2}, Lo83;-><init>(Ln83;)V

    .line 359
    .line 360
    .line 361
    invoke-virtual {v1, v3}, Lretrofit2/Retrofit$Builder;->client(Lo83;)Lretrofit2/Retrofit$Builder;

    .line 362
    .line 363
    .line 364
    move-result-object v1

    .line 365
    invoke-virtual {v1}, Lretrofit2/Retrofit$Builder;->build()Lretrofit2/Retrofit;

    .line 366
    .line 367
    .line 368
    move-result-object v1

    .line 369
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 370
    .line 371
    .line 372
    const-class v2, Lov;

    .line 373
    .line 374
    invoke-virtual {v1, v2}, Lretrofit2/Retrofit;->create(Ljava/lang/Class;)Ljava/lang/Object;

    .line 375
    .line 376
    .line 377
    move-result-object v1

    .line 378
    check-cast v1, Lov;

    .line 379
    .line 380
    iput-object v1, v0, Lgp3;->p:Ljava/lang/Object;

    .line 381
    .line 382
    return-void

    .line 383
    :sswitch_0
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 384
    .line 385
    .line 386
    iput-object v1, v0, Lgp3;->o:Ljava/lang/Object;

    .line 387
    .line 388
    new-instance v2, Lok1;

    .line 389
    .line 390
    invoke-direct {v2}, Lok1;-><init>()V

    .line 391
    .line 392
    .line 393
    new-instance v7, Lr01;

    .line 394
    .line 395
    invoke-direct {v7}, Lr01;-><init>()V

    .line 396
    .line 397
    .line 398
    invoke-virtual {v2, v6, v7}, Lok1;->a(Ljava/lang/Class;Lg32;)V

    .line 399
    .line 400
    .line 401
    new-instance v6, Llt;

    .line 402
    .line 403
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 404
    .line 405
    .line 406
    invoke-virtual {v2, v4, v6}, Lok1;->a(Ljava/lang/Class;Lg32;)V

    .line 407
    .line 408
    .line 409
    iput-boolean v3, v2, Lok1;->j:Z

    .line 410
    .line 411
    new-instance v3, Ljava/util/ArrayList;

    .line 412
    .line 413
    iget-object v4, v2, Lok1;->e:Ljava/util/ArrayList;

    .line 414
    .line 415
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 416
    .line 417
    .line 418
    move-result v6

    .line 419
    iget-object v7, v2, Lok1;->f:Ljava/util/ArrayList;

    .line 420
    .line 421
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 422
    .line 423
    .line 424
    move-result v9

    .line 425
    add-int/2addr v9, v6

    .line 426
    add-int/lit8 v9, v9, 0x3

    .line 427
    .line 428
    invoke-direct {v3, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 429
    .line 430
    .line 431
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 432
    .line 433
    .line 434
    invoke-static {v3}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    .line 435
    .line 436
    .line 437
    new-instance v6, Ljava/util/ArrayList;

    .line 438
    .line 439
    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 440
    .line 441
    .line 442
    invoke-static {v6}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    .line 443
    .line 444
    .line 445
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 446
    .line 447
    .line 448
    iget v6, v2, Lok1;->g:I

    .line 449
    .line 450
    iget v9, v2, Lok1;->h:I

    .line 451
    .line 452
    sget-object v10, Lbk0;->b:Lak0;

    .line 453
    .line 454
    sget-boolean v11, Lgk4;->a:Z

    .line 455
    .line 456
    if-eq v6, v15, :cond_7

    .line 457
    .line 458
    if-eq v9, v15, :cond_7

    .line 459
    .line 460
    invoke-virtual {v10, v6, v9}, Lbk0;->a(II)Ldz4;

    .line 461
    .line 462
    .line 463
    move-result-object v10

    .line 464
    if-eqz v11, :cond_6

    .line 465
    .line 466
    sget-object v14, Lgk4;->c:Lfk4;

    .line 467
    .line 468
    invoke-virtual {v14, v6, v9}, Lbk0;->a(II)Ldz4;

    .line 469
    .line 470
    .line 471
    move-result-object v14

    .line 472
    sget-object v15, Lgk4;->b:Lfk4;

    .line 473
    .line 474
    invoke-virtual {v15, v6, v9}, Lbk0;->a(II)Ldz4;

    .line 475
    .line 476
    .line 477
    move-result-object v6

    .line 478
    goto :goto_4

    .line 479
    :cond_6
    const/4 v6, 0x0

    .line 480
    const/4 v14, 0x0

    .line 481
    :goto_4
    invoke-virtual {v3, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 482
    .line 483
    .line 484
    if-eqz v11, :cond_7

    .line 485
    .line 486
    invoke-virtual {v3, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 487
    .line 488
    .line 489
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 490
    .line 491
    .line 492
    :cond_7
    new-instance v16, Lnk1;

    .line 493
    .line 494
    iget-object v6, v2, Lok1;->a:Lu21;

    .line 495
    .line 496
    iget v9, v2, Lok1;->c:I

    .line 497
    .line 498
    new-instance v10, Ljava/util/HashMap;

    .line 499
    .line 500
    iget-object v11, v2, Lok1;->d:Ljava/util/HashMap;

    .line 501
    .line 502
    invoke-direct {v10, v11}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 503
    .line 504
    .line 505
    iget-boolean v11, v2, Lok1;->i:Z

    .line 506
    .line 507
    iget-boolean v14, v2, Lok1;->j:Z

    .line 508
    .line 509
    iget-boolean v15, v2, Lok1;->k:Z

    .line 510
    .line 511
    move-object/from16 v24, v3

    .line 512
    .line 513
    iget v3, v2, Lok1;->b:I

    .line 514
    .line 515
    move/from16 v23, v3

    .line 516
    .line 517
    new-instance v3, Ljava/util/ArrayList;

    .line 518
    .line 519
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 520
    .line 521
    .line 522
    new-instance v3, Ljava/util/ArrayList;

    .line 523
    .line 524
    invoke-direct {v3, v7}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 525
    .line 526
    .line 527
    iget v3, v2, Lok1;->l:I

    .line 528
    .line 529
    iget v4, v2, Lok1;->m:I

    .line 530
    .line 531
    new-instance v7, Ljava/util/ArrayList;

    .line 532
    .line 533
    iget-object v2, v2, Lok1;->n:Ljava/util/LinkedList;

    .line 534
    .line 535
    invoke-direct {v7, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 536
    .line 537
    .line 538
    move/from16 v25, v3

    .line 539
    .line 540
    move/from16 v26, v4

    .line 541
    .line 542
    move-object/from16 v17, v6

    .line 543
    .line 544
    move-object/from16 v27, v7

    .line 545
    .line 546
    move/from16 v18, v9

    .line 547
    .line 548
    move-object/from16 v19, v10

    .line 549
    .line 550
    move/from16 v20, v11

    .line 551
    .line 552
    move/from16 v21, v14

    .line 553
    .line 554
    move/from16 v22, v15

    .line 555
    .line 556
    invoke-direct/range {v16 .. v27}, Lnk1;-><init>(Lu21;ILjava/util/Map;ZZZILjava/util/List;IILjava/util/List;)V

    .line 557
    .line 558
    .line 559
    new-instance v2, Lretrofit2/Retrofit$Builder;

    .line 560
    .line 561
    invoke-direct {v2}, Lretrofit2/Retrofit$Builder;-><init>()V

    .line 562
    .line 563
    .line 564
    invoke-virtual {v1}, Lpn4;->j()Ljava/lang/String;

    .line 565
    .line 566
    .line 567
    move-result-object v1

    .line 568
    if-eqz v1, :cond_8

    .line 569
    .line 570
    invoke-static {v1}, Lqm4;->K0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 571
    .line 572
    .line 573
    move-result-object v1

    .line 574
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 575
    .line 576
    .line 577
    move-result-object v1

    .line 578
    goto :goto_5

    .line 579
    :cond_8
    const/4 v1, 0x0

    .line 580
    :goto_5
    if-nez v1, :cond_9

    .line 581
    .line 582
    goto :goto_6

    .line 583
    :cond_9
    move-object v13, v1

    .line 584
    :goto_6
    :try_start_1
    new-instance v1, Lfr1;

    .line 585
    .line 586
    invoke-direct {v1}, Lfr1;-><init>()V

    .line 587
    .line 588
    .line 589
    const/4 v3, 0x0

    .line 590
    invoke-virtual {v1, v3, v13}, Lfr1;->e(Lgr1;Ljava/lang/String;)V

    .line 591
    .line 592
    .line 593
    invoke-virtual {v1}, Lfr1;->b()Lgr1;

    .line 594
    .line 595
    .line 596
    move-result-object v14
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1

    .line 597
    goto :goto_7

    .line 598
    :catch_1
    const/4 v14, 0x0

    .line 599
    :goto_7
    if-eqz v14, :cond_a

    .line 600
    .line 601
    iget-object v1, v14, Lgr1;->d:Ljava/lang/String;

    .line 602
    .line 603
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 604
    .line 605
    .line 606
    move-result v1

    .line 607
    if-lez v1, :cond_a

    .line 608
    .line 609
    move-object v12, v13

    .line 610
    :cond_a
    invoke-virtual {v2, v12}, Lretrofit2/Retrofit$Builder;->baseUrl(Ljava/lang/String;)Lretrofit2/Retrofit$Builder;

    .line 611
    .line 612
    .line 613
    move-result-object v1

    .line 614
    invoke-static/range {v16 .. v16}, Lretrofit2/converter/gson/GsonConverterFactory;->create(Lnk1;)Lretrofit2/converter/gson/GsonConverterFactory;

    .line 615
    .line 616
    .line 617
    move-result-object v2

    .line 618
    invoke-virtual {v1, v2}, Lretrofit2/Retrofit$Builder;->addConverterFactory(Lretrofit2/Converter$Factory;)Lretrofit2/Retrofit$Builder;

    .line 619
    .line 620
    .line 621
    move-result-object v1

    .line 622
    new-instance v2, Lcx;

    .line 623
    .line 624
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 625
    .line 626
    .line 627
    new-instance v3, Lrx;

    .line 628
    .line 629
    invoke-direct {v3, v2}, Lrx;-><init>(Lcx;)V

    .line 630
    .line 631
    .line 632
    const v4, 0x278d00

    .line 633
    .line 634
    .line 635
    iput v4, v2, Lcx;->a:I

    .line 636
    .line 637
    new-instance v2, Ln83;

    .line 638
    .line 639
    invoke-direct {v2}, Ln83;-><init>()V

    .line 640
    .line 641
    .line 642
    const-wide/16 v6, 0x2

    .line 643
    .line 644
    invoke-virtual {v2, v6, v7, v8}, Ln83;->a(JLjava/util/concurrent/TimeUnit;)V

    .line 645
    .line 646
    .line 647
    const-wide/16 v6, 0x14

    .line 648
    .line 649
    invoke-virtual {v2, v6, v7, v5}, Ln83;->b(JLjava/util/concurrent/TimeUnit;)V

    .line 650
    .line 651
    .line 652
    const-wide/16 v6, 0x1e

    .line 653
    .line 654
    invoke-static {v6, v7, v5}, Lze5;->b(JLjava/util/concurrent/TimeUnit;)I

    .line 655
    .line 656
    .line 657
    move-result v4

    .line 658
    iput v4, v2, Ln83;->z:I

    .line 659
    .line 660
    invoke-static {v6, v7, v5}, Lze5;->b(JLjava/util/concurrent/TimeUnit;)I

    .line 661
    .line 662
    .line 663
    move-result v4

    .line 664
    iput v4, v2, Ln83;->A:I

    .line 665
    .line 666
    new-instance v4, Ldr1;

    .line 667
    .line 668
    invoke-direct {v4}, Ldr1;-><init>()V

    .line 669
    .line 670
    .line 671
    sget-object v5, Lcr1;->n:Lcr1;

    .line 672
    .line 673
    iput-object v5, v4, Ldr1;->b:Lcr1;

    .line 674
    .line 675
    iget-object v5, v2, Ln83;->c:Ljava/util/ArrayList;

    .line 676
    .line 677
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 678
    .line 679
    .line 680
    iget-object v4, v2, Ln83;->c:Ljava/util/ArrayList;

    .line 681
    .line 682
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 683
    .line 684
    .line 685
    new-instance v3, Lhx;

    .line 686
    .line 687
    invoke-static {}, Lcom/eddyizm/tempus/App;->a()Landroid/content/Context;

    .line 688
    .line 689
    .line 690
    move-result-object v4

    .line 691
    invoke-virtual {v4}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 692
    .line 693
    .line 694
    move-result-object v4

    .line 695
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 696
    .line 697
    .line 698
    invoke-direct {v3, v4}, Lhx;-><init>(Ljava/io/File;)V

    .line 699
    .line 700
    .line 701
    iput-object v3, v2, Ln83;->l:Lhx;

    .line 702
    .line 703
    sget-object v3, Lx30;->b:Ljavax/net/ssl/SSLSocketFactory;

    .line 704
    .line 705
    if-eqz v3, :cond_b

    .line 706
    .line 707
    sget-object v4, Lx30;->a:Ljavax/net/ssl/X509TrustManager;

    .line 708
    .line 709
    invoke-virtual {v2, v3, v4}, Ln83;->c(Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/X509TrustManager;)V

    .line 710
    .line 711
    .line 712
    :cond_b
    new-instance v3, Lo83;

    .line 713
    .line 714
    invoke-direct {v3, v2}, Lo83;-><init>(Ln83;)V

    .line 715
    .line 716
    .line 717
    invoke-virtual {v1, v3}, Lretrofit2/Retrofit$Builder;->client(Lo83;)Lretrofit2/Retrofit$Builder;

    .line 718
    .line 719
    .line 720
    move-result-object v1

    .line 721
    invoke-virtual {v1}, Lretrofit2/Retrofit$Builder;->build()Lretrofit2/Retrofit;

    .line 722
    .line 723
    .line 724
    move-result-object v1

    .line 725
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 726
    .line 727
    .line 728
    const-class v2, Lgq4;

    .line 729
    .line 730
    invoke-virtual {v1, v2}, Lretrofit2/Retrofit;->create(Ljava/lang/Class;)Ljava/lang/Object;

    .line 731
    .line 732
    .line 733
    move-result-object v1

    .line 734
    check-cast v1, Lgq4;

    .line 735
    .line 736
    iput-object v1, v0, Lgp3;->p:Ljava/lang/Object;

    .line 737
    .line 738
    return-void

    .line 739
    :sswitch_1
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 740
    .line 741
    .line 742
    iput-object v1, v0, Lgp3;->o:Ljava/lang/Object;

    .line 743
    .line 744
    new-instance v2, Lok1;

    .line 745
    .line 746
    invoke-direct {v2}, Lok1;-><init>()V

    .line 747
    .line 748
    .line 749
    new-instance v7, Lr01;

    .line 750
    .line 751
    invoke-direct {v7}, Lr01;-><init>()V

    .line 752
    .line 753
    .line 754
    invoke-virtual {v2, v6, v7}, Lok1;->a(Ljava/lang/Class;Lg32;)V

    .line 755
    .line 756
    .line 757
    new-instance v6, Llt;

    .line 758
    .line 759
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 760
    .line 761
    .line 762
    invoke-virtual {v2, v4, v6}, Lok1;->a(Ljava/lang/Class;Lg32;)V

    .line 763
    .line 764
    .line 765
    iput-boolean v3, v2, Lok1;->j:Z

    .line 766
    .line 767
    new-instance v3, Ljava/util/ArrayList;

    .line 768
    .line 769
    iget-object v4, v2, Lok1;->e:Ljava/util/ArrayList;

    .line 770
    .line 771
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 772
    .line 773
    .line 774
    move-result v6

    .line 775
    iget-object v7, v2, Lok1;->f:Ljava/util/ArrayList;

    .line 776
    .line 777
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 778
    .line 779
    .line 780
    move-result v9

    .line 781
    add-int/2addr v9, v6

    .line 782
    add-int/lit8 v9, v9, 0x3

    .line 783
    .line 784
    invoke-direct {v3, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 785
    .line 786
    .line 787
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 788
    .line 789
    .line 790
    invoke-static {v3}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    .line 791
    .line 792
    .line 793
    new-instance v6, Ljava/util/ArrayList;

    .line 794
    .line 795
    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 796
    .line 797
    .line 798
    invoke-static {v6}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    .line 799
    .line 800
    .line 801
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 802
    .line 803
    .line 804
    iget v6, v2, Lok1;->g:I

    .line 805
    .line 806
    iget v9, v2, Lok1;->h:I

    .line 807
    .line 808
    sget-object v10, Lbk0;->b:Lak0;

    .line 809
    .line 810
    sget-boolean v11, Lgk4;->a:Z

    .line 811
    .line 812
    if-eq v6, v15, :cond_d

    .line 813
    .line 814
    if-eq v9, v15, :cond_d

    .line 815
    .line 816
    invoke-virtual {v10, v6, v9}, Lbk0;->a(II)Ldz4;

    .line 817
    .line 818
    .line 819
    move-result-object v10

    .line 820
    if-eqz v11, :cond_c

    .line 821
    .line 822
    sget-object v14, Lgk4;->c:Lfk4;

    .line 823
    .line 824
    invoke-virtual {v14, v6, v9}, Lbk0;->a(II)Ldz4;

    .line 825
    .line 826
    .line 827
    move-result-object v14

    .line 828
    sget-object v15, Lgk4;->b:Lfk4;

    .line 829
    .line 830
    invoke-virtual {v15, v6, v9}, Lbk0;->a(II)Ldz4;

    .line 831
    .line 832
    .line 833
    move-result-object v6

    .line 834
    goto :goto_8

    .line 835
    :cond_c
    const/4 v6, 0x0

    .line 836
    const/4 v14, 0x0

    .line 837
    :goto_8
    invoke-virtual {v3, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 838
    .line 839
    .line 840
    if-eqz v11, :cond_d

    .line 841
    .line 842
    invoke-virtual {v3, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 843
    .line 844
    .line 845
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 846
    .line 847
    .line 848
    :cond_d
    new-instance v16, Lnk1;

    .line 849
    .line 850
    iget-object v6, v2, Lok1;->a:Lu21;

    .line 851
    .line 852
    iget v9, v2, Lok1;->c:I

    .line 853
    .line 854
    new-instance v10, Ljava/util/HashMap;

    .line 855
    .line 856
    iget-object v11, v2, Lok1;->d:Ljava/util/HashMap;

    .line 857
    .line 858
    invoke-direct {v10, v11}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 859
    .line 860
    .line 861
    iget-boolean v11, v2, Lok1;->i:Z

    .line 862
    .line 863
    iget-boolean v14, v2, Lok1;->j:Z

    .line 864
    .line 865
    iget-boolean v15, v2, Lok1;->k:Z

    .line 866
    .line 867
    iget v1, v2, Lok1;->b:I

    .line 868
    .line 869
    move/from16 v23, v1

    .line 870
    .line 871
    new-instance v1, Ljava/util/ArrayList;

    .line 872
    .line 873
    invoke-direct {v1, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 874
    .line 875
    .line 876
    new-instance v1, Ljava/util/ArrayList;

    .line 877
    .line 878
    invoke-direct {v1, v7}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 879
    .line 880
    .line 881
    iget v1, v2, Lok1;->l:I

    .line 882
    .line 883
    iget v4, v2, Lok1;->m:I

    .line 884
    .line 885
    new-instance v7, Ljava/util/ArrayList;

    .line 886
    .line 887
    iget-object v2, v2, Lok1;->n:Ljava/util/LinkedList;

    .line 888
    .line 889
    invoke-direct {v7, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 890
    .line 891
    .line 892
    move/from16 v25, v1

    .line 893
    .line 894
    move-object/from16 v24, v3

    .line 895
    .line 896
    move/from16 v26, v4

    .line 897
    .line 898
    move-object/from16 v17, v6

    .line 899
    .line 900
    move-object/from16 v27, v7

    .line 901
    .line 902
    move/from16 v18, v9

    .line 903
    .line 904
    move-object/from16 v19, v10

    .line 905
    .line 906
    move/from16 v20, v11

    .line 907
    .line 908
    move/from16 v21, v14

    .line 909
    .line 910
    move/from16 v22, v15

    .line 911
    .line 912
    invoke-direct/range {v16 .. v27}, Lnk1;-><init>(Lu21;ILjava/util/Map;ZZZILjava/util/List;IILjava/util/List;)V

    .line 913
    .line 914
    .line 915
    new-instance v1, Lretrofit2/Retrofit$Builder;

    .line 916
    .line 917
    invoke-direct {v1}, Lretrofit2/Retrofit$Builder;-><init>()V

    .line 918
    .line 919
    .line 920
    invoke-virtual/range {p1 .. p1}, Lpn4;->j()Ljava/lang/String;

    .line 921
    .line 922
    .line 923
    move-result-object v2

    .line 924
    if-eqz v2, :cond_e

    .line 925
    .line 926
    invoke-static {v2}, Lqm4;->K0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 927
    .line 928
    .line 929
    move-result-object v2

    .line 930
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 931
    .line 932
    .line 933
    move-result-object v3

    .line 934
    goto :goto_9

    .line 935
    :cond_e
    const/4 v3, 0x0

    .line 936
    :goto_9
    if-nez v3, :cond_f

    .line 937
    .line 938
    goto :goto_a

    .line 939
    :cond_f
    move-object v13, v3

    .line 940
    :goto_a
    :try_start_2
    new-instance v2, Lfr1;

    .line 941
    .line 942
    invoke-direct {v2}, Lfr1;-><init>()V
    :try_end_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_2

    .line 943
    .line 944
    .line 945
    const/4 v3, 0x0

    .line 946
    :try_start_3
    invoke-virtual {v2, v3, v13}, Lfr1;->e(Lgr1;Ljava/lang/String;)V

    .line 947
    .line 948
    .line 949
    invoke-virtual {v2}, Lfr1;->b()Lgr1;

    .line 950
    .line 951
    .line 952
    move-result-object v14
    :try_end_3
    .catch Ljava/lang/IllegalArgumentException; {:try_start_3 .. :try_end_3} :catch_3

    .line 953
    goto :goto_b

    .line 954
    :catch_2
    const/4 v3, 0x0

    .line 955
    :catch_3
    move-object v14, v3

    .line 956
    :goto_b
    if-eqz v14, :cond_10

    .line 957
    .line 958
    iget-object v2, v14, Lgr1;->d:Ljava/lang/String;

    .line 959
    .line 960
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 961
    .line 962
    .line 963
    move-result v2

    .line 964
    if-lez v2, :cond_10

    .line 965
    .line 966
    move-object v12, v13

    .line 967
    :cond_10
    invoke-virtual {v1, v12}, Lretrofit2/Retrofit$Builder;->baseUrl(Ljava/lang/String;)Lretrofit2/Retrofit$Builder;

    .line 968
    .line 969
    .line 970
    move-result-object v1

    .line 971
    invoke-static/range {v16 .. v16}, Lretrofit2/converter/gson/GsonConverterFactory;->create(Lnk1;)Lretrofit2/converter/gson/GsonConverterFactory;

    .line 972
    .line 973
    .line 974
    move-result-object v2

    .line 975
    invoke-virtual {v1, v2}, Lretrofit2/Retrofit$Builder;->addConverterFactory(Lretrofit2/Converter$Factory;)Lretrofit2/Retrofit$Builder;

    .line 976
    .line 977
    .line 978
    move-result-object v1

    .line 979
    new-instance v2, Lcx;

    .line 980
    .line 981
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 982
    .line 983
    .line 984
    new-instance v3, Lrx;

    .line 985
    .line 986
    invoke-direct {v3, v2}, Lrx;-><init>(Lcx;)V

    .line 987
    .line 988
    .line 989
    const v4, 0x278d00

    .line 990
    .line 991
    .line 992
    iput v4, v2, Lcx;->a:I

    .line 993
    .line 994
    new-instance v2, Ln83;

    .line 995
    .line 996
    invoke-direct {v2}, Ln83;-><init>()V

    .line 997
    .line 998
    .line 999
    const-wide/16 v6, 0x2

    .line 1000
    .line 1001
    invoke-virtual {v2, v6, v7, v8}, Ln83;->a(JLjava/util/concurrent/TimeUnit;)V

    .line 1002
    .line 1003
    .line 1004
    const-wide/16 v6, 0x14

    .line 1005
    .line 1006
    invoke-virtual {v2, v6, v7, v5}, Ln83;->b(JLjava/util/concurrent/TimeUnit;)V

    .line 1007
    .line 1008
    .line 1009
    const-wide/16 v6, 0x1e

    .line 1010
    .line 1011
    invoke-static {v6, v7, v5}, Lze5;->b(JLjava/util/concurrent/TimeUnit;)I

    .line 1012
    .line 1013
    .line 1014
    move-result v4

    .line 1015
    iput v4, v2, Ln83;->z:I

    .line 1016
    .line 1017
    invoke-static {v6, v7, v5}, Lze5;->b(JLjava/util/concurrent/TimeUnit;)I

    .line 1018
    .line 1019
    .line 1020
    move-result v4

    .line 1021
    iput v4, v2, Ln83;->A:I

    .line 1022
    .line 1023
    new-instance v4, Ldr1;

    .line 1024
    .line 1025
    invoke-direct {v4}, Ldr1;-><init>()V

    .line 1026
    .line 1027
    .line 1028
    sget-object v5, Lcr1;->n:Lcr1;

    .line 1029
    .line 1030
    iput-object v5, v4, Ldr1;->b:Lcr1;

    .line 1031
    .line 1032
    iget-object v5, v2, Ln83;->c:Ljava/util/ArrayList;

    .line 1033
    .line 1034
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1035
    .line 1036
    .line 1037
    iget-object v4, v2, Ln83;->c:Ljava/util/ArrayList;

    .line 1038
    .line 1039
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1040
    .line 1041
    .line 1042
    new-instance v3, Lhx;

    .line 1043
    .line 1044
    invoke-static {}, Lcom/eddyizm/tempus/App;->a()Landroid/content/Context;

    .line 1045
    .line 1046
    .line 1047
    move-result-object v4

    .line 1048
    invoke-virtual {v4}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 1049
    .line 1050
    .line 1051
    move-result-object v4

    .line 1052
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1053
    .line 1054
    .line 1055
    invoke-direct {v3, v4}, Lhx;-><init>(Ljava/io/File;)V

    .line 1056
    .line 1057
    .line 1058
    iput-object v3, v2, Ln83;->l:Lhx;

    .line 1059
    .line 1060
    sget-object v3, Lx30;->b:Ljavax/net/ssl/SSLSocketFactory;

    .line 1061
    .line 1062
    if-eqz v3, :cond_11

    .line 1063
    .line 1064
    sget-object v4, Lx30;->a:Ljavax/net/ssl/X509TrustManager;

    .line 1065
    .line 1066
    invoke-virtual {v2, v3, v4}, Ln83;->c(Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/X509TrustManager;)V

    .line 1067
    .line 1068
    .line 1069
    :cond_11
    new-instance v3, Lo83;

    .line 1070
    .line 1071
    invoke-direct {v3, v2}, Lo83;-><init>(Ln83;)V

    .line 1072
    .line 1073
    .line 1074
    invoke-virtual {v1, v3}, Lretrofit2/Retrofit$Builder;->client(Lo83;)Lretrofit2/Retrofit$Builder;

    .line 1075
    .line 1076
    .line 1077
    move-result-object v1

    .line 1078
    invoke-virtual {v1}, Lretrofit2/Retrofit$Builder;->build()Lretrofit2/Retrofit;

    .line 1079
    .line 1080
    .line 1081
    move-result-object v1

    .line 1082
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1083
    .line 1084
    .line 1085
    const-class v2, Lzi2;

    .line 1086
    .line 1087
    invoke-virtual {v1, v2}, Lretrofit2/Retrofit;->create(Ljava/lang/Class;)Ljava/lang/Object;

    .line 1088
    .line 1089
    .line 1090
    move-result-object v1

    .line 1091
    check-cast v1, Lzi2;

    .line 1092
    .line 1093
    iput-object v1, v0, Lgp3;->p:Ljava/lang/Object;

    .line 1094
    .line 1095
    return-void

    .line 1096
    nop

    .line 1097
    :sswitch_data_0
    .sparse-switch
        0xd -> :sswitch_1
        0x15 -> :sswitch_0
    .end sparse-switch
.end method

.method public constructor <init>(Lxm2;)V
    .locals 1

    const/16 v0, 0x13

    iput v0, p0, Lgp3;->n:I

    .line 1101
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgp3;->o:Ljava/lang/Object;

    .line 1102
    new-instance v0, Lrm3;

    .line 1103
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object p1, v0, Lrm3;->n:Ljava/lang/Object;

    .line 1104
    iput-object v0, p0, Lgp3;->p:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(Ljw;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lgp3;->p:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Lxc5;

    .line 4
    .line 5
    iget-object p1, p1, Lxc5;->p:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p1, Ljava/util/Map;

    .line 8
    .line 9
    iget-object p0, p0, Lgp3;->o:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Lcr4;

    .line 12
    .line 13
    invoke-interface {p1, p0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public b(Ljava/lang/Exception;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lgp3;->p:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lfj4;

    .line 4
    .line 5
    iget-object v1, p0, Lgp3;->o:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ltw2;

    .line 8
    .line 9
    iget-object v0, v0, Lfj4;->s:Ltw2;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lgp3;->p:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Lfj4;

    .line 18
    .line 19
    iget-object p0, p0, Lgp3;->o:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p0, Ltw2;

    .line 22
    .line 23
    iget-object v1, v0, Lfj4;->o:Lxi0;

    .line 24
    .line 25
    iget-object v0, v0, Lfj4;->t:Lqh0;

    .line 26
    .line 27
    iget-object p0, p0, Ltw2;->c:Lsh0;

    .line 28
    .line 29
    invoke-interface {p0}, Lsh0;->e()I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    invoke-virtual {v1, v0, p1, p0, v2}, Lxi0;->b(Lf42;Ljava/lang/Exception;Lsh0;I)V

    .line 34
    .line 35
    .line 36
    :cond_0
    return-void
.end method

.method public c(J)Z
    .locals 6

    .line 1
    iget-object p0, p0, Lgp3;->p:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lrf2;

    .line 4
    .line 5
    iget-object p0, p0, Lrf2;->n:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Ljava/util/List;

    .line 8
    .line 9
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x0

    .line 14
    move v2, v1

    .line 15
    :goto_0
    if-ge v2, v0, :cond_1

    .line 16
    .line 17
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    move-object v4, v3

    .line 22
    check-cast v4, Lqn3;

    .line 23
    .line 24
    iget-wide v4, v4, Lqn3;->a:J

    .line 25
    .line 26
    invoke-static {v4, v5, p1, p2}, Lvr1;->n(JJ)Z

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    if-eqz v4, :cond_0

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    const/4 v3, 0x0

    .line 37
    :goto_1
    check-cast v3, Lqn3;

    .line 38
    .line 39
    if-eqz v3, :cond_2

    .line 40
    .line 41
    iget-boolean p0, v3, Lqn3;->h:Z

    .line 42
    .line 43
    return p0

    .line 44
    :cond_2
    return v1
.end method

.method public cancel()V
    .locals 2

    .line 1
    iget-object v0, p0, Lgp3;->p:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lfl;

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-virtual {v0, v1, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    iget-object p0, p0, Lgp3;->o:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, Ljo;

    .line 15
    .line 16
    invoke-virtual {p0}, Ljo;->invoke()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public d()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lgp3;->o:Ljava/lang/Object;

    .line 3
    .line 4
    iput-object v0, p0, Lgp3;->p:Ljava/lang/Object;

    .line 5
    .line 6
    return-void
.end method

.method public e(Ljava/lang/String;)Lretrofit2/Call;
    .locals 2

    .line 1
    const-string v0, "BrowsingClient"

    .line 2
    .line 3
    const-string v1, "getAlbum()"

    .line 4
    .line 5
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lgp3;->p:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lov;

    .line 11
    .line 12
    iget-object p0, p0, Lgp3;->o:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, Lpn4;

    .line 15
    .line 16
    invoke-virtual {p0}, Lpn4;->f()Ljava/util/HashMap;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-interface {v0, p0, p1}, Lov;->f(Ljava/util/Map;Ljava/lang/String;)Lretrofit2/Call;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method

.method public f(Ljava/lang/Object;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lgp3;->p:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lfj4;

    .line 4
    .line 5
    iget-object v1, p0, Lgp3;->o:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ltw2;

    .line 8
    .line 9
    iget-object v0, v0, Lfj4;->s:Ltw2;

    .line 10
    .line 11
    if-eqz v0, :cond_2

    .line 12
    .line 13
    if-ne v0, v1, :cond_2

    .line 14
    .line 15
    iget-object v0, p0, Lgp3;->p:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Lfj4;

    .line 18
    .line 19
    iget-object p0, p0, Lgp3;->o:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p0, Ltw2;

    .line 22
    .line 23
    iget-object v1, v0, Lfj4;->n:Lwi0;

    .line 24
    .line 25
    iget-object v1, v1, Lwi0;->p:Lxq0;

    .line 26
    .line 27
    if-eqz p1, :cond_1

    .line 28
    .line 29
    iget-object v2, p0, Ltw2;->c:Lsh0;

    .line 30
    .line 31
    invoke-interface {v2}, Lsh0;->e()I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    invoke-virtual {v1, v2}, Lxq0;->a(I)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_1

    .line 40
    .line 41
    iput-object p1, v0, Lfj4;->r:Ljava/lang/Object;

    .line 42
    .line 43
    iget-object p0, v0, Lfj4;->o:Lxi0;

    .line 44
    .line 45
    const/4 p1, 0x2

    .line 46
    iput p1, p0, Lxi0;->R:I

    .line 47
    .line 48
    iget-object p1, p0, Lxi0;->C:Lm11;

    .line 49
    .line 50
    iget-boolean v0, p1, Lm11;->z:Z

    .line 51
    .line 52
    if-eqz v0, :cond_0

    .line 53
    .line 54
    iget-object p1, p1, Lm11;->v:Lli1;

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    iget-object p1, p1, Lm11;->u:Lli1;

    .line 58
    .line 59
    :goto_0
    invoke-virtual {p1, p0}, Lli1;->execute(Ljava/lang/Runnable;)V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :cond_1
    move-object v1, v0

    .line 64
    iget-object v0, v1, Lfj4;->o:Lxi0;

    .line 65
    .line 66
    move-object v2, v1

    .line 67
    iget-object v1, p0, Ltw2;->a:Lf42;

    .line 68
    .line 69
    iget-object v3, p0, Ltw2;->c:Lsh0;

    .line 70
    .line 71
    invoke-interface {v3}, Lsh0;->e()I

    .line 72
    .line 73
    .line 74
    move-result v4

    .line 75
    iget-object v5, v2, Lfj4;->t:Lqh0;

    .line 76
    .line 77
    move-object v2, p1

    .line 78
    invoke-virtual/range {v0 .. v5}, Lxi0;->a(Lf42;Ljava/lang/Object;Lsh0;ILf42;)V

    .line 79
    .line 80
    .line 81
    :cond_2
    return-void
.end method

.method public g()V
    .locals 3

    .line 1
    iget-object p0, p0, Lgp3;->p:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lgm3;

    .line 4
    .line 5
    iget-object v0, p0, Lgm3;->f:Lim3;

    .line 6
    .line 7
    iget-object v1, p0, Lgm3;->e:Ljava/lang/String;

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    invoke-static {v0, v1, v2}, Lim3;->c(Lim3;Ljava/lang/String;Z)V

    .line 11
    .line 12
    .line 13
    iget-object p0, p0, Lgm3;->b:Lpz1;

    .line 14
    .line 15
    invoke-virtual {p0}, Lpz1;->g()V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public h(Ljava/lang/Object;)V
    .locals 9

    .line 1
    check-cast p1, Lgr2;

    .line 2
    .line 3
    iget-object v0, p0, Lgp3;->p:Ljava/lang/Object;

    .line 4
    .line 5
    move-object v5, v0

    .line 6
    check-cast v5, Ljn2;

    .line 7
    .line 8
    iget-object p0, p0, Lgp3;->o:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, Llb4;

    .line 11
    .line 12
    iget-object v0, p1, Lgr2;->a:Lyw1;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    new-instance v1, Lm92;

    .line 21
    .line 22
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 23
    .line 24
    .line 25
    move-result-wide v3

    .line 26
    new-instance v6, Lxa4;

    .line 27
    .line 28
    const-string p1, "no error message provided"

    .line 29
    .line 30
    sget-object v0, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 31
    .line 32
    const/4 v2, -0x2

    .line 33
    invoke-direct {v6, p1, v2, v0}, Lxa4;-><init>(Ljava/lang/String;ILandroid/os/Bundle;)V

    .line 34
    .line 35
    .line 36
    const/4 v7, 0x0

    .line 37
    const/4 v8, 0x4

    .line 38
    invoke-direct/range {v1 .. v8}, Lm92;-><init>(IJLjn2;Lxa4;Ljava/lang/Object;I)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, v1}, Lu0;->l(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_0
    iget p1, p1, Lgr2;->b:I

    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    add-int/lit8 v1, v1, -0x1

    .line 52
    .line 53
    invoke-static {p1, v1}, Ljava/lang/Math;->min(II)I

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    const/4 v1, 0x0

    .line 58
    invoke-static {v1, p1}, Ljava/lang/Math;->max(II)I

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    check-cast p1, Lgn2;

    .line 67
    .line 68
    invoke-static {p1}, Lyw1;->o(Ljava/lang/Object;)Lgy3;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-static {p1, v5}, Lm92;->c(Lgy3;Ljn2;)Lm92;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-virtual {p0, p1}, Lu0;->l(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    return-void
.end method

.method public i(Ljava/lang/String;)Lretrofit2/Call;
    .locals 2

    .line 1
    const-string v0, "BrowsingClient"

    .line 2
    .line 3
    const-string v1, "getArtist()"

    .line 4
    .line 5
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lgp3;->p:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lov;

    .line 11
    .line 12
    iget-object p0, p0, Lgp3;->o:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, Lpn4;

    .line 15
    .line 16
    invoke-virtual {p0}, Lpn4;->f()Ljava/util/HashMap;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-interface {v0, p0, p1}, Lov;->e(Ljava/util/Map;Ljava/lang/String;)Lretrofit2/Call;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method

.method public j()Lretrofit2/Call;
    .locals 2

    .line 1
    const-string v0, "BrowsingClient"

    .line 2
    .line 3
    const-string v1, "getArtists()"

    .line 4
    .line 5
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lgp3;->p:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lov;

    .line 11
    .line 12
    iget-object p0, p0, Lgp3;->o:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, Lpn4;

    .line 15
    .line 16
    invoke-virtual {p0}, Lpn4;->f()Ljava/util/HashMap;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-static {}, Lud3;->k()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-interface {v0, p0, v1}, Lov;->k(Ljava/util/Map;Ljava/lang/String;)Lretrofit2/Call;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0
.end method

.method public k(Landroid/text/method/KeyListener;)Landroid/text/method/KeyListener;
    .locals 1

    .line 1
    instance-of v0, p1, Landroid/text/method/NumberKeyListener;

    .line 2
    .line 3
    if-nez v0, :cond_3

    .line 4
    .line 5
    iget-object p0, p0, Lgp3;->p:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Lzg5;

    .line 8
    .line 9
    iget-object p0, p0, Lzg5;->n:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Lxc5;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    instance-of p0, p1, Ld01;

    .line 17
    .line 18
    if-eqz p0, :cond_0

    .line 19
    .line 20
    return-object p1

    .line 21
    :cond_0
    if-nez p1, :cond_1

    .line 22
    .line 23
    const/4 p0, 0x0

    .line 24
    return-object p0

    .line 25
    :cond_1
    instance-of p0, p1, Landroid/text/method/NumberKeyListener;

    .line 26
    .line 27
    if-eqz p0, :cond_2

    .line 28
    .line 29
    return-object p1

    .line 30
    :cond_2
    new-instance p0, Ld01;

    .line 31
    .line 32
    invoke-direct {p0, p1}, Ld01;-><init>(Landroid/text/method/KeyListener;)V

    .line 33
    .line 34
    .line 35
    return-object p0

    .line 36
    :cond_3
    return-object p1
.end method

.method public l(Ljava/lang/String;)Ljava/lang/Long;
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    const-string v1, "SELECT long_value FROM Preference where `key`=?"

    .line 3
    .line 4
    invoke-static {v0, v1}, Lw24;->b(ILjava/lang/String;)Lw24;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    invoke-virtual {v1, v0, p1}, Lw24;->h(ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, Lgp3;->o:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Ls24;

    .line 14
    .line 15
    invoke-virtual {p0}, Ls24;->b()V

    .line 16
    .line 17
    .line 18
    invoke-static {p0, v1}, Lxl;->H(Ls24;Lwo4;)Landroid/database/Cursor;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    :try_start_0
    invoke-interface {p0}, Landroid/database/Cursor;->moveToFirst()Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    const/4 v0, 0x0

    .line 27
    if-eqz p1, :cond_1

    .line 28
    .line 29
    const/4 p1, 0x0

    .line 30
    invoke-interface {p0, p1}, Landroid/database/Cursor;->isNull(I)Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    invoke-interface {p0, p1}, Landroid/database/Cursor;->getLong(I)J

    .line 38
    .line 39
    .line 40
    move-result-wide v2

    .line 41
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 42
    .line 43
    .line 44
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    goto :goto_0

    .line 46
    :catchall_0
    move-exception p1

    .line 47
    goto :goto_1

    .line 48
    :cond_1
    :goto_0
    invoke-interface {p0}, Landroid/database/Cursor;->close()V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1}, Lw24;->j()V

    .line 52
    .line 53
    .line 54
    return-object v0

    .line 55
    :goto_1
    invoke-interface {p0}, Landroid/database/Cursor;->close()V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1}, Lw24;->j()V

    .line 59
    .line 60
    .line 61
    throw p1
.end method

.method public m(Ljava/lang/String;)Lretrofit2/Call;
    .locals 2

    .line 1
    const-string v0, "BrowsingClient"

    .line 2
    .line 3
    const-string v1, "getSong()"

    .line 4
    .line 5
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lgp3;->p:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lov;

    .line 11
    .line 12
    iget-object p0, p0, Lgp3;->o:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, Lpn4;

    .line 15
    .line 16
    invoke-virtual {p0}, Lpn4;->f()Ljava/util/HashMap;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-interface {v0, p0, p1}, Lov;->c(Ljava/util/Map;Ljava/lang/String;)Lretrofit2/Call;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method

.method public n(Lfp3;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lgp3;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ls24;

    .line 4
    .line 5
    invoke-virtual {v0}, Ls24;->b()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Ls24;->c()V

    .line 9
    .line 10
    .line 11
    :try_start_0
    iget-object p0, p0, Lgp3;->p:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Lvo0;

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Lvo0;->m(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ls24;->t()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ls24;->o()V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :catchall_0
    move-exception p0

    .line 26
    invoke-virtual {v0}, Ls24;->o()V

    .line 27
    .line 28
    .line 29
    throw p0
.end method

.method public o(Ljava/lang/Throwable;)V
    .locals 9

    .line 1
    iget-object v0, p0, Lgp3;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Llb4;

    .line 4
    .line 5
    iget-object p0, p0, Lgp3;->p:Ljava/lang/Object;

    .line 6
    .line 7
    move-object v5, p0

    .line 8
    check-cast v5, Ljn2;

    .line 9
    .line 10
    new-instance v1, Lm92;

    .line 11
    .line 12
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 13
    .line 14
    .line 15
    move-result-wide v3

    .line 16
    new-instance v6, Lxa4;

    .line 17
    .line 18
    const-string p0, "no error message provided"

    .line 19
    .line 20
    sget-object v2, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 21
    .line 22
    move-object v7, v2

    .line 23
    const/4 v2, -0x1

    .line 24
    invoke-direct {v6, p0, v2, v7}, Lxa4;-><init>(Ljava/lang/String;ILandroid/os/Bundle;)V

    .line 25
    .line 26
    .line 27
    const/4 v7, 0x0

    .line 28
    const/4 v8, 0x4

    .line 29
    invoke-direct/range {v1 .. v8}, Lm92;-><init>(IJLjn2;Lxa4;Ljava/lang/Object;I)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v1}, Lu0;->l(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    new-instance p0, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    const-string v0, "Failed fetching recent media item at boot time: "

    .line 38
    .line 39
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    const-string v0, "MediaSessionImpl"

    .line 54
    .line 55
    invoke-static {v0, p0, p1}, Ll93;->G(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method public onFailure(Lretrofit2/Call;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lgp3;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Ljava/util/function/Consumer;

    .line 4
    .line 5
    iget-object p0, p0, Lgp3;->p:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Ljava/lang/String;

    .line 8
    .line 9
    sget-object p2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 10
    .line 11
    invoke-static {p0, p2}, Lkb4;->d(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-interface {p1, p0}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public onResponse(Lretrofit2/Call;Lretrofit2/Response;)V
    .locals 1

    .line 1
    new-instance p1, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2}, Lretrofit2/Response;->isSuccessful()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 23
    .line 24
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getAlbum()Lcom/eddyizm/tempus/subsonic/models/AlbumWithSongsID3;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    if-eqz v0, :cond_0

    .line 33
    .line 34
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    check-cast v0, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 39
    .line 40
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getAlbum()Lcom/eddyizm/tempus/subsonic/models/AlbumWithSongsID3;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/AlbumWithSongsID3;->getSongs()Ljava/util/List;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    if-eqz v0, :cond_0

    .line 53
    .line 54
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    check-cast p2, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 59
    .line 60
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getAlbum()Lcom/eddyizm/tempus/subsonic/models/AlbumWithSongsID3;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/AlbumWithSongsID3;->getSongs()Ljava/util/List;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 73
    .line 74
    .line 75
    :cond_0
    iget-object p2, p0, Lgp3;->o:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast p2, Ljava/util/function/Consumer;

    .line 78
    .line 79
    iget-object p0, p0, Lgp3;->p:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast p0, Ljava/lang/String;

    .line 82
    .line 83
    invoke-static {p0, p1}, Lkb4;->d(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    invoke-interface {p2, p0}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    return-void
.end method

.method public onSuccess()V
    .locals 3

    .line 1
    iget-object v0, p0, Lgp3;->p:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lgm3;

    .line 4
    .line 5
    iget-object v1, v0, Lgm3;->f:Lim3;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    iput-object v2, v1, Lim3;->f:Ljava/lang/String;

    .line 9
    .line 10
    iget-object v0, v0, Lgm3;->e:Ljava/lang/String;

    .line 11
    .line 12
    invoke-virtual {v1, v0}, Lim3;->e(Ljava/lang/String;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    iget v0, v1, Lim3;->h:I

    .line 19
    .line 20
    iput v0, v1, Lim3;->i:I

    .line 21
    .line 22
    iget-object v0, v1, Lim3;->j:Lk03;

    .line 23
    .line 24
    iget-object p0, p0, Lgp3;->o:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p0, Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-virtual {v0, p0}, Lad2;->k(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    :cond_0
    return-void
.end method

.method public p(Landroid/util/AttributeSet;I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lgp3;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/widget/EditText;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-object v1, Lst3;->i:[I

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-virtual {v0, p1, v1, p2, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const/16 p2, 0xe

    .line 17
    .line 18
    :try_start_0
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/4 v1, 0x1

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 26
    .line 27
    .line 28
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception p0

    .line 31
    goto :goto_1

    .line 32
    :cond_0
    :goto_0
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, v1}, Lgp3;->v(Z)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :goto_1
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 40
    .line 41
    .line 42
    throw p0
.end method

.method public q(J)Landroid/view/autofill/AutofillId;
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lgp3;->o:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-static {v0}, Lkz;->d(Ljava/lang/Object;)Landroid/view/contentcapture/ContentCaptureSession;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object p0, p0, Lgp3;->p:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, Landroid/view/View;

    .line 16
    .line 17
    invoke-static {p0}, Lbu;->l(Landroid/view/View;)Lhg3;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    iget-object p0, p0, Lhg3;->o:Ljava/lang/Object;

    .line 25
    .line 26
    invoke-static {p0}, Ltn;->f(Ljava/lang/Object;)Landroid/view/autofill/AutofillId;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-static {v0, p0, p1, p2}, Lyh;->d(Landroid/view/contentcapture/ContentCaptureSession;Landroid/view/autofill/AutofillId;J)Landroid/view/autofill/AutofillId;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0

    .line 35
    :cond_0
    const/4 p0, 0x0

    .line 36
    return-object p0
.end method

.method public r(Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;)La01;
    .locals 1

    .line 1
    iget-object p0, p0, Lgp3;->p:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lzg5;

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const/4 p0, 0x0

    .line 11
    goto :goto_1

    .line 12
    :cond_0
    iget-object p0, p0, Lzg5;->n:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, Lxc5;

    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    instance-of v0, p1, La01;

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    new-instance v0, La01;

    .line 25
    .line 26
    iget-object p0, p0, Lxc5;->o:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast p0, Landroid/widget/EditText;

    .line 29
    .line 30
    invoke-direct {v0, p2, p1, p0}, La01;-><init>(Landroid/view/inputmethod/EditorInfo;Landroid/view/inputmethod/InputConnection;Landroid/widget/TextView;)V

    .line 31
    .line 32
    .line 33
    move-object p1, v0

    .line 34
    :goto_0
    move-object p0, p1

    .line 35
    :goto_1
    check-cast p0, La01;

    .line 36
    .line 37
    return-object p0
.end method

.method public s(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    iget-object p0, p0, Lgp3;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lxm2;

    .line 4
    .line 5
    iget-object v0, p0, Lxm2;->d:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lj54;

    .line 8
    .line 9
    iget-boolean v1, p0, Lxm2;->a:Z

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Lxm2;->a()V

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-interface {v0}, Lba2;->h()Lea2;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    iget-object v1, v1, Lea2;->h:Lr92;

    .line 21
    .line 22
    sget-object v2, Lr92;->q:Lr92;

    .line 23
    .line 24
    invoke-virtual {v1, v2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-gez v1, :cond_3

    .line 29
    .line 30
    iget-boolean v0, p0, Lxm2;->b:Z

    .line 31
    .line 32
    if-nez v0, :cond_2

    .line 33
    .line 34
    const/4 v0, 0x0

    .line 35
    if-eqz p1, :cond_1

    .line 36
    .line 37
    const-string v1, "androidx.lifecycle.BundlableSavedStateRegistry.key"

    .line 38
    .line 39
    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-eqz v2, :cond_1

    .line 44
    .line 45
    invoke-static {v1, p1}, Ljz4;->w(Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    :cond_1
    iput-object v0, p0, Lxm2;->h:Ljava/lang/Cloneable;

    .line 50
    .line 51
    const/4 p1, 0x1

    .line 52
    iput-boolean p1, p0, Lxm2;->b:Z

    .line 53
    .line 54
    return-void

    .line 55
    :cond_2
    const-string p0, "SavedStateRegistry was already restored."

    .line 56
    .line 57
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :cond_3
    invoke-interface {v0}, Lba2;->h()Lea2;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    iget-object p0, p0, Lea2;->h:Lr92;

    .line 66
    .line 67
    const-string p1, "performRestore cannot be called when owner is "

    .line 68
    .line 69
    invoke-static {p0, p1}, Lnz2;->u(Ljava/lang/Object;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    return-void
.end method

.method public t(Landroid/os/Bundle;)V
    .locals 4

    .line 1
    iget-object p0, p0, Lgp3;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lxm2;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    new-array v1, v0, [Lkd3;

    .line 7
    .line 8
    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, [Lkd3;

    .line 13
    .line 14
    invoke-static {v0}, Lfh0;->g([Lkd3;)Landroid/os/Bundle;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v1, p0, Lxm2;->h:Ljava/lang/Cloneable;

    .line 19
    .line 20
    check-cast v1, Landroid/os/Bundle;

    .line 21
    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    iget-object v1, p0, Lxm2;->f:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v1, Lxi4;

    .line 30
    .line 31
    monitor-enter v1

    .line 32
    :try_start_0
    iget-object p0, p0, Lxm2;->g:Ljava/io/Serializable;

    .line 33
    .line 34
    check-cast p0, Ljava/util/LinkedHashMap;

    .line 35
    .line 36
    invoke-virtual {p0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-eqz v2, :cond_1

    .line 49
    .line 50
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    check-cast v2, Ljava/util/Map$Entry;

    .line 55
    .line 56
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    check-cast v3, Ljava/lang/String;

    .line 61
    .line 62
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    check-cast v2, Li54;

    .line 67
    .line 68
    invoke-interface {v2}, Li54;->a()Landroid/os/Bundle;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0, v3, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :catchall_0
    move-exception p0

    .line 80
    goto :goto_1

    .line 81
    :cond_1
    monitor-exit v1

    .line 82
    invoke-virtual {v0}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 83
    .line 84
    .line 85
    move-result p0

    .line 86
    if-nez p0, :cond_2

    .line 87
    .line 88
    const-string p0, "androidx.lifecycle.BundlableSavedStateRegistry.key"

    .line 89
    .line 90
    invoke-virtual {p1, p0, v0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 91
    .line 92
    .line 93
    :cond_2
    return-void

    .line 94
    :goto_1
    monitor-exit v1

    .line 95
    throw p0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    iget v0, p0, Lgp3;->n:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    iget-object v0, p0, Lgp3;->o:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Lai4;

    .line 14
    .line 15
    const-string v1, "[ "

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    :goto_0
    const/16 v2, 0x9

    .line 21
    .line 22
    if-ge v0, v2, :cond_0

    .line 23
    .line 24
    invoke-static {v1}, Lxa3;->i(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    iget-object v2, p0, Lgp3;->o:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v2, Lai4;

    .line 31
    .line 32
    iget-object v2, v2, Lai4;->u:[F

    .line 33
    .line 34
    aget v2, v2, v0

    .line 35
    .line 36
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string v2, " "

    .line 40
    .line 41
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    add-int/lit8 v0, v0, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    const-string v0, "] "

    .line 52
    .line 53
    invoke-static {v1, v0}, Lb11;->s(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    iget-object p0, p0, Lgp3;->o:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast p0, Lai4;

    .line 60
    .line 61
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    return-object p0

    .line 69
    :pswitch_data_0
    .packed-switch 0x12
        :pswitch_0
    .end packed-switch
.end method

.method public u()Lretrofit2/Call;
    .locals 7

    .line 1
    const-string v0, "SystemClient"

    .line 2
    .line 3
    const-string v1, "ping()"

    .line 4
    .line 5
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lud3;->x()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    iget-object v1, p0, Lgp3;->p:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Lgq4;

    .line 15
    .line 16
    iget-object p0, p0, Lgp3;->o:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p0, Lpn4;

    .line 19
    .line 20
    invoke-virtual {p0}, Lpn4;->f()Ljava/util/HashMap;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-interface {v1, v2}, Lgq4;->b(Ljava/util/Map;)Lretrofit2/Call;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {p0}, Lpn4;->j()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-static {}, Lud3;->v()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    sget-object v3, Lra0;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 37
    .line 38
    sget-object v3, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 39
    .line 40
    if-eqz p0, :cond_4

    .line 41
    .line 42
    if-eqz v2, :cond_4

    .line 43
    .line 44
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    if-nez v4, :cond_0

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    const/4 v4, 0x1

    .line 52
    new-array v4, v4, [C

    .line 53
    .line 54
    const/4 v5, 0x0

    .line 55
    const/16 v6, 0x2f

    .line 56
    .line 57
    aput-char v6, v4, v5

    .line 58
    .line 59
    invoke-static {v2, v4}, Lqm4;->L0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    if-nez v4, :cond_1

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_1
    invoke-static {p0, v2, v5}, Lxm4;->k0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 71
    .line 72
    .line 73
    move-result v4

    .line 74
    if-nez v4, :cond_2

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_2
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 78
    .line 79
    .line 80
    move-result v4

    .line 81
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 82
    .line 83
    .line 84
    move-result v5

    .line 85
    if-eq v4, v5, :cond_3

    .line 86
    .line 87
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 92
    .line 93
    .line 94
    move-result p0

    .line 95
    if-ne p0, v6, :cond_4

    .line 96
    .line 97
    :cond_3
    invoke-interface {v1}, Lretrofit2/Call;->timeout()Lfu4;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    int-to-long v4, v0

    .line 102
    invoke-virtual {p0, v4, v5, v3}, Lfu4;->g(JLjava/util/concurrent/TimeUnit;)Lfu4;

    .line 103
    .line 104
    .line 105
    return-object v1

    .line 106
    :cond_4
    :goto_0
    mul-int/lit8 v0, v0, 0x2

    .line 107
    .line 108
    const/16 p0, 0xa

    .line 109
    .line 110
    invoke-static {v0, p0}, Ljava/lang/Math;->min(II)I

    .line 111
    .line 112
    .line 113
    move-result p0

    .line 114
    invoke-interface {v1}, Lretrofit2/Call;->timeout()Lfu4;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    int-to-long v4, p0

    .line 119
    invoke-virtual {v0, v4, v5, v3}, Lfu4;->g(JLjava/util/concurrent/TimeUnit;)Lfu4;

    .line 120
    .line 121
    .line 122
    return-object v1
.end method

.method public v(Z)V
    .locals 4

    .line 1
    iget-object p0, p0, Lgp3;->p:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lzg5;

    .line 4
    .line 5
    iget-object p0, p0, Lzg5;->n:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Lxc5;

    .line 8
    .line 9
    iget-object p0, p0, Lxc5;->p:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Ll01;

    .line 12
    .line 13
    iget-boolean v0, p0, Ll01;->p:Z

    .line 14
    .line 15
    if-eq v0, p1, :cond_1

    .line 16
    .line 17
    iget-object v0, p0, Ll01;->o:Lk01;

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-static {}, Ltz0;->a()Ltz0;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iget-object v1, p0, Ll01;->o:Lk01;

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    const-string v2, "initCallback cannot be null"

    .line 31
    .line 32
    invoke-static {v1, v2}, Ll93;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    iget-object v2, v0, Ltz0;->a:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-interface {v3}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 42
    .line 43
    .line 44
    :try_start_0
    iget-object v0, v0, Ltz0;->b:Lqi;

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Lqi;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    .line 48
    .line 49
    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :catchall_0
    move-exception p0

    .line 58
    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 63
    .line 64
    .line 65
    throw p0

    .line 66
    :cond_0
    :goto_0
    iput-boolean p1, p0, Ll01;->p:Z

    .line 67
    .line 68
    if-eqz p1, :cond_1

    .line 69
    .line 70
    iget-object p0, p0, Ll01;->n:Landroid/widget/EditText;

    .line 71
    .line 72
    invoke-static {}, Ltz0;->a()Ltz0;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-virtual {p1}, Ltz0;->b()I

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    invoke-static {p0, p1}, Ll01;->a(Landroid/widget/EditText;I)V

    .line 81
    .line 82
    .line 83
    :cond_1
    return-void
.end method

.method public w(ILjava/lang/String;)Lretrofit2/Call;
    .locals 2

    .line 1
    const-string v0, "MediaAnnotationClient"

    .line 2
    .line 3
    const-string v1, "setRating()"

    .line 4
    .line 5
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lgp3;->p:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lzi2;

    .line 11
    .line 12
    iget-object p0, p0, Lgp3;->o:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, Lpn4;

    .line 15
    .line 16
    invoke-virtual {p0}, Lpn4;->f()Ljava/util/HashMap;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-interface {v0, p0, p2, p1}, Lzi2;->a(Ljava/util/Map;Ljava/lang/String;I)Lretrofit2/Call;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method

.method public x(Landroid/view/View;Lpb5;)Lpb5;
    .locals 3

    .line 1
    iget-object v0, p0, Lgp3;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lb85;

    .line 4
    .line 5
    new-instance v1, Lc85;

    .line 6
    .line 7
    iget-object p0, p0, Lgp3;->p:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Lc85;

    .line 10
    .line 11
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iget v2, p0, Lc85;->a:I

    .line 15
    .line 16
    iput v2, v1, Lc85;->a:I

    .line 17
    .line 18
    iget v2, p0, Lc85;->b:I

    .line 19
    .line 20
    iput v2, v1, Lc85;->b:I

    .line 21
    .line 22
    iget v2, p0, Lc85;->c:I

    .line 23
    .line 24
    iput v2, v1, Lc85;->c:I

    .line 25
    .line 26
    iget p0, p0, Lc85;->d:I

    .line 27
    .line 28
    iput p0, v1, Lc85;->d:I

    .line 29
    .line 30
    invoke-interface {v0, p1, p2, v1}, Lb85;->m(Landroid/view/View;Lpb5;Lc85;)Lpb5;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
.end method

.method public y()Lel;
    .locals 4

    .line 1
    iget-object v0, p0, Lgp3;->p:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/io/File;

    .line 4
    .line 5
    iget-object p0, p0, Lgp3;->o:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Ljava/io/File;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0, v0}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-nez v1, :cond_1

    .line 26
    .line 27
    new-instance v1, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    const-string v2, "Couldn\'t rename file "

    .line 30
    .line 31
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string v2, " to backup file "

    .line 38
    .line 39
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    const-string v1, "AtomicFile"

    .line 50
    .line 51
    invoke-static {v1, v0}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    .line 56
    .line 57
    .line 58
    :cond_1
    :goto_0
    :try_start_0
    new-instance v0, Lel;

    .line 59
    .line 60
    invoke-direct {v0, p0}, Lel;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 61
    .line 62
    .line 63
    return-object v0

    .line 64
    :catch_0
    move-exception v0

    .line 65
    invoke-virtual {p0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    const-string v2, "Couldn\'t create "

    .line 70
    .line 71
    if-eqz v1, :cond_2

    .line 72
    .line 73
    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    if-eqz v1, :cond_2

    .line 78
    .line 79
    :try_start_1
    new-instance v0, Lel;

    .line 80
    .line 81
    invoke-direct {v0, p0}, Lel;-><init>(Ljava/io/File;)V
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    .line 82
    .line 83
    .line 84
    return-object v0

    .line 85
    :catch_1
    move-exception v0

    .line 86
    new-instance v1, Ljava/io/IOException;

    .line 87
    .line 88
    new-instance v3, Ljava/lang/StringBuilder;

    .line 89
    .line 90
    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    invoke-direct {v1, p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 101
    .line 102
    .line 103
    throw v1

    .line 104
    :cond_2
    new-instance v1, Ljava/io/IOException;

    .line 105
    .line 106
    new-instance v3, Ljava/lang/StringBuilder;

    .line 107
    .line 108
    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    invoke-direct {v1, p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 119
    .line 120
    .line 121
    throw v1
.end method
