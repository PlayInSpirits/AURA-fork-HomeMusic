.class public Ldefpackage/rm3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/u74;
.implements Ldefpackage/f51;
.implements Ldefpackage/eg1;
.implements Ldefpackage/ak2;


# instance fields
.field public n:Ljava/lang/Object;

.field public o:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    packed-switch p1, :pswitch_data_0

    .line 1095
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1096
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Ldefpackage/rm3;->n:Ljava/lang/Object;

    .line 1097
    new-instance p1, Ldefpackage/zg5;

    const/16 v0, 0x15

    invoke-direct {p1, v0}, Ldefpackage/zg5;-><init>(I)V

    iput-object p1, p0, Ldefpackage/rm3;->o:Ljava/lang/Object;

    return-void

    .line 1098
    :pswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1099
    new-instance p1, Ldefpackage/yd4;

    const/4 v0, 0x0

    .line 1100
    invoke-direct {p1, v0}, Ldefpackage/yd4;-><init>(I)V

    .line 1101
    iput-object p1, p0, Ldefpackage/rm3;->n:Ljava/lang/Object;

    .line 1102
    new-instance p1, Ldefpackage/xe2;

    const/4 v0, 0x0

    .line 1103
    invoke-direct {p1, v0}, Ldefpackage/xe2;-><init>(Ljava/lang/Object;)V

    .line 1104
    iput-object p1, p0, Ldefpackage/rm3;->o:Ljava/lang/Object;

    return-void

    .line 1105
    :pswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1106
    new-instance p1, Ljava/util/LinkedHashSet;

    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object p1, p0, Ldefpackage/rm3;->n:Ljava/lang/Object;

    return-void

    .line 1107
    :pswitch_3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1108
    sget-object p1, Ldefpackage/v54;->a:[J

    .line 1109
    new-instance p1, Ldefpackage/w03;

    invoke-direct {p1}, Ldefpackage/w03;-><init>()V

    .line 1110
    iput-object p1, p0, Ldefpackage/rm3;->n:Ljava/lang/Object;

    return-void

    .line 1111
    :pswitch_4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1112
    new-instance p1, Ldefpackage/f13;

    const/16 v0, 0x10

    new-array v0, v0, [Ldefpackage/c72;

    invoke-direct {p1, v0}, Ldefpackage/f13;-><init>([Ljava/lang/Object;)V

    .line 1113
    iput-object p1, p0, Ldefpackage/rm3;->n:Ljava/lang/Object;

    return-void

    :pswitch_data_0
    .packed-switch 0x10
        :pswitch_4
        :pswitch_0
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public constructor <init>(Landroid/media/MediaCodec;Ldefpackage/ns3;)V
    .locals 1

    .line 1117
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1118
    iput-object p1, p0, Ldefpackage/rm3;->n:Ljava/lang/Object;

    .line 1119
    iput-object p2, p0, Ldefpackage/rm3;->o:Ljava/lang/Object;

    .line 1120
    sget p0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x23

    if-lt p0, v0, :cond_1

    if-eqz p2, :cond_1

    .line 1121
    iget-object p0, p2, Ldefpackage/ns3;->q:Ljava/lang/Object;

    check-cast p0, Landroid/media/LoudnessCodecController;

    if-eqz p0, :cond_0

    invoke-static {p0, p1}, Ldefpackage/vk;->i(Landroid/media/LoudnessCodecController;Landroid/media/MediaCodec;)Z

    move-result p0

    if-nez p0, :cond_0

    goto :goto_0

    .line 1122
    :cond_0
    iget-object p0, p2, Ldefpackage/ns3;->o:Ljava/lang/Object;

    check-cast p0, Ljava/util/HashSet;

    invoke-virtual {p0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result p0

    invoke-static {p0}, Ldefpackage/rr2;->w(Z)V

    :cond_1
    :goto_0
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1094
    iput-object p1, p0, Ldefpackage/rm3;->o:Ljava/lang/Object;

    iput-object p2, p0, Ldefpackage/rm3;->n:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Z)V
    .locals 0

    .line 1093
    iput-object p1, p0, Ldefpackage/rm3;->n:Ljava/lang/Object;

    iput-object p2, p0, Ldefpackage/rm3;->o:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ldefpackage/mj0;)V
    .locals 1

    .line 1123
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1124
    iput-object p1, p0, Ldefpackage/rm3;->n:Ljava/lang/Object;

    .line 1125
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, Ldefpackage/rm3;->o:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ldefpackage/pn4;I)V
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    sget-object v4, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 6
    .line 7
    sget-object v7, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    .line 8
    .line 9
    const-string v11, "https://localhost/rest/"

    .line 10
    .line 11
    const-string v12, ""

    .line 12
    .line 13
    const/4 v14, 0x2

    .line 14
    const/4 v15, 0x1

    .line 15
    const-class v2, Lcom/eddyizm/tempus/subsonic/models/Bookmarks;

    .line 16
    .line 17
    const-class v3, Ljava/util/Date;

    .line 18
    .line 19
    sparse-switch p2, :sswitch_data_0

    .line 20
    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object v1, v0, Ldefpackage/rm3;->n:Ljava/lang/Object;

    .line 26
    .line 27
    new-instance v5, Ldefpackage/ok1;

    .line 28
    .line 29
    invoke-direct {v5}, Ldefpackage/ok1;-><init>()V

    .line 30
    .line 31
    .line 32
    new-instance v6, Ldefpackage/r01;

    .line 33
    .line 34
    invoke-direct {v6}, Ldefpackage/r01;-><init>()V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v5, v3, v6}, Ldefpackage/ok1;->a(Ljava/lang/Class;Ldefpackage/g32;)V

    .line 38
    .line 39
    .line 40
    new-instance v3, Ldefpackage/lt;

    .line 41
    .line 42
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v5, v2, v3}, Ldefpackage/ok1;->a(Ljava/lang/Class;Ldefpackage/g32;)V

    .line 46
    .line 47
    .line 48
    iput-boolean v15, v5, Ldefpackage/ok1;->j:Z

    .line 49
    .line 50
    new-instance v2, Ljava/util/ArrayList;

    .line 51
    .line 52
    iget-object v3, v5, Ldefpackage/ok1;->e:Ljava/util/ArrayList;

    .line 53
    .line 54
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 55
    .line 56
    .line 57
    move-result v6

    .line 58
    iget-object v15, v5, Ldefpackage/ok1;->f:Ljava/util/ArrayList;

    .line 59
    .line 60
    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    .line 61
    .line 62
    .line 63
    move-result v16

    .line 64
    add-int v16, v16, v6

    .line 65
    .line 66
    add-int/lit8 v6, v16, 0x3

    .line 67
    .line 68
    invoke-direct {v2, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 72
    .line 73
    .line 74
    invoke-static {v2}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    .line 75
    .line 76
    .line 77
    new-instance v6, Ljava/util/ArrayList;

    .line 78
    .line 79
    invoke-direct {v6, v15}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 80
    .line 81
    .line 82
    invoke-static {v6}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 86
    .line 87
    .line 88
    iget v6, v5, Ldefpackage/ok1;->g:I

    .line 89
    .line 90
    iget v8, v5, Ldefpackage/ok1;->h:I

    .line 91
    .line 92
    sget-object v9, Ldefpackage/bk0;->b:Ldefpackage/ak0;

    .line 93
    .line 94
    sget-boolean v16, Ldefpackage/gk4;->a:Z

    .line 95
    .line 96
    if-eq v6, v14, :cond_1

    .line 97
    .line 98
    if-eq v8, v14, :cond_1

    .line 99
    .line 100
    invoke-virtual {v9, v6, v8}, Ldefpackage/bk0;->a(II)Ldefpackage/dz4;

    .line 101
    .line 102
    .line 103
    move-result-object v9

    .line 104
    if-eqz v16, :cond_0

    .line 105
    .line 106
    sget-object v14, Ldefpackage/gk4;->c:Ldefpackage/fk4;

    .line 107
    .line 108
    invoke-virtual {v14, v6, v8}, Ldefpackage/bk0;->a(II)Ldefpackage/dz4;

    .line 109
    .line 110
    .line 111
    move-result-object v14

    .line 112
    sget-object v10, Ldefpackage/gk4;->b:Ldefpackage/fk4;

    .line 113
    .line 114
    invoke-virtual {v10, v6, v8}, Ldefpackage/bk0;->a(II)Ldefpackage/dz4;

    .line 115
    .line 116
    .line 117
    move-result-object v6

    .line 118
    goto :goto_0

    .line 119
    :cond_0
    const/4 v6, 0x0

    .line 120
    const/4 v14, 0x0

    .line 121
    :goto_0
    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    if-eqz v16, :cond_1

    .line 125
    .line 126
    invoke-virtual {v2, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    :cond_1
    new-instance v16, Ldefpackage/nk1;

    .line 133
    .line 134
    iget-object v6, v5, Ldefpackage/ok1;->a:Ldefpackage/u21;

    .line 135
    .line 136
    iget v8, v5, Ldefpackage/ok1;->c:I

    .line 137
    .line 138
    new-instance v9, Ljava/util/HashMap;

    .line 139
    .line 140
    iget-object v10, v5, Ldefpackage/ok1;->d:Ljava/util/HashMap;

    .line 141
    .line 142
    invoke-direct {v9, v10}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 143
    .line 144
    .line 145
    iget-boolean v10, v5, Ldefpackage/ok1;->i:Z

    .line 146
    .line 147
    iget-boolean v14, v5, Ldefpackage/ok1;->j:Z

    .line 148
    .line 149
    iget-boolean v13, v5, Ldefpackage/ok1;->k:Z

    .line 150
    .line 151
    move-object/from16 v24, v2

    .line 152
    .line 153
    iget v2, v5, Ldefpackage/ok1;->b:I

    .line 154
    .line 155
    move/from16 v23, v2

    .line 156
    .line 157
    new-instance v2, Ljava/util/ArrayList;

    .line 158
    .line 159
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 160
    .line 161
    .line 162
    new-instance v2, Ljava/util/ArrayList;

    .line 163
    .line 164
    invoke-direct {v2, v15}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 165
    .line 166
    .line 167
    iget v2, v5, Ldefpackage/ok1;->l:I

    .line 168
    .line 169
    iget v3, v5, Ldefpackage/ok1;->m:I

    .line 170
    .line 171
    new-instance v15, Ljava/util/ArrayList;

    .line 172
    .line 173
    iget-object v5, v5, Ldefpackage/ok1;->n:Ljava/util/LinkedList;

    .line 174
    .line 175
    invoke-direct {v15, v5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 176
    .line 177
    .line 178
    move/from16 v25, v2

    .line 179
    .line 180
    move/from16 v26, v3

    .line 181
    .line 182
    move-object/from16 v17, v6

    .line 183
    .line 184
    move/from16 v18, v8

    .line 185
    .line 186
    move-object/from16 v19, v9

    .line 187
    .line 188
    move/from16 v20, v10

    .line 189
    .line 190
    move/from16 v22, v13

    .line 191
    .line 192
    move/from16 v21, v14

    .line 193
    .line 194
    move-object/from16 v27, v15

    .line 195
    .line 196
    invoke-direct/range {v16 .. v27}, Ldefpackage/nk1;-><init>(Ldefpackage/u21;ILjava/util/Map;ZZZILjava/util/List;IILjava/util/List;)V

    .line 197
    .line 198
    .line 199
    new-instance v2, Lretrofit2/Retrofit$Builder;

    .line 200
    .line 201
    invoke-direct {v2}, Lretrofit2/Retrofit$Builder;-><init>()V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v1}, Ldefpackage/pn4;->j()Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v1

    .line 208
    if-eqz v1, :cond_2

    .line 209
    .line 210
    invoke-static {v1}, Ldefpackage/qm4;->K0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 211
    .line 212
    .line 213
    move-result-object v1

    .line 214
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v1

    .line 218
    goto :goto_1

    .line 219
    :cond_2
    const/4 v1, 0x0

    .line 220
    :goto_1
    if-nez v1, :cond_3

    .line 221
    .line 222
    goto :goto_2

    .line 223
    :cond_3
    move-object v12, v1

    .line 224
    :goto_2
    :try_start_0
    new-instance v1, Ldefpackage/fr1;

    .line 225
    .line 226
    invoke-direct {v1}, Ldefpackage/fr1;-><init>()V

    .line 227
    .line 228
    .line 229
    const/4 v3, 0x0

    .line 230
    invoke-virtual {v1, v3, v12}, Ldefpackage/fr1;->e(Ldefpackage/gr1;Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v1}, Ldefpackage/fr1;->b()Ldefpackage/gr1;

    .line 234
    .line 235
    .line 236
    move-result-object v13
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 237
    goto :goto_3

    .line 238
    :catch_0
    const/4 v13, 0x0

    .line 239
    :goto_3
    if-eqz v13, :cond_4

    .line 240
    .line 241
    iget-object v1, v13, Ldefpackage/gr1;->d:Ljava/lang/String;

    .line 242
    .line 243
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 244
    .line 245
    .line 246
    move-result v1

    .line 247
    if-lez v1, :cond_4

    .line 248
    .line 249
    move-object v11, v12

    .line 250
    :cond_4
    invoke-virtual {v2, v11}, Lretrofit2/Retrofit$Builder;->baseUrl(Ljava/lang/String;)Lretrofit2/Retrofit$Builder;

    .line 251
    .line 252
    .line 253
    move-result-object v1

    .line 254
    invoke-static/range {v16 .. v16}, Lretrofit2/converter/gson/GsonConverterFactory;->create(Ldefpackage/nk1;)Lretrofit2/converter/gson/GsonConverterFactory;

    .line 255
    .line 256
    .line 257
    move-result-object v2

    .line 258
    invoke-virtual {v1, v2}, Lretrofit2/Retrofit$Builder;->addConverterFactory(Lretrofit2/Converter$Factory;)Lretrofit2/Retrofit$Builder;

    .line 259
    .line 260
    .line 261
    move-result-object v1

    .line 262
    new-instance v2, Ldefpackage/cx;

    .line 263
    .line 264
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 265
    .line 266
    .line 267
    new-instance v3, Ldefpackage/rx;

    .line 268
    .line 269
    invoke-direct {v3, v2}, Ldefpackage/rx;-><init>(Ldefpackage/cx;)V

    .line 270
    .line 271
    .line 272
    const v5, 0x278d00

    .line 273
    .line 274
    .line 275
    iput v5, v2, Ldefpackage/cx;->a:I

    .line 276
    .line 277
    new-instance v2, Ldefpackage/n83;

    .line 278
    .line 279
    invoke-direct {v2}, Ldefpackage/n83;-><init>()V

    .line 280
    .line 281
    .line 282
    const-wide/16 v5, 0x2

    .line 283
    .line 284
    invoke-virtual {v2, v5, v6, v7}, Ldefpackage/n83;->a(JLjava/util/concurrent/TimeUnit;)V

    .line 285
    .line 286
    .line 287
    const-wide/16 v5, 0x14

    .line 288
    .line 289
    invoke-virtual {v2, v5, v6, v4}, Ldefpackage/n83;->b(JLjava/util/concurrent/TimeUnit;)V

    .line 290
    .line 291
    .line 292
    const-wide/16 v5, 0x1e

    .line 293
    .line 294
    invoke-static {v5, v6, v4}, Ldefpackage/ze5;->b(JLjava/util/concurrent/TimeUnit;)I

    .line 295
    .line 296
    .line 297
    move-result v7

    .line 298
    iput v7, v2, Ldefpackage/n83;->z:I

    .line 299
    .line 300
    invoke-static {v5, v6, v4}, Ldefpackage/ze5;->b(JLjava/util/concurrent/TimeUnit;)I

    .line 301
    .line 302
    .line 303
    move-result v4

    .line 304
    iput v4, v2, Ldefpackage/n83;->A:I

    .line 305
    .line 306
    new-instance v4, Ldefpackage/dr1;

    .line 307
    .line 308
    invoke-direct {v4}, Ldefpackage/dr1;-><init>()V

    .line 309
    .line 310
    .line 311
    sget-object v5, Ldefpackage/cr1;->n:Ldefpackage/cr1;

    .line 312
    .line 313
    iput-object v5, v4, Ldefpackage/dr1;->b:Ldefpackage/cr1;

    .line 314
    .line 315
    iget-object v5, v2, Ldefpackage/n83;->c:Ljava/util/ArrayList;

    .line 316
    .line 317
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 318
    .line 319
    .line 320
    iget-object v4, v2, Ldefpackage/n83;->c:Ljava/util/ArrayList;

    .line 321
    .line 322
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 323
    .line 324
    .line 325
    new-instance v3, Ldefpackage/hx;

    .line 326
    .line 327
    invoke-static {}, Lcom/eddyizm/tempus/App;->a()Landroid/content/Context;

    .line 328
    .line 329
    .line 330
    move-result-object v4

    .line 331
    invoke-virtual {v4}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 332
    .line 333
    .line 334
    move-result-object v4

    .line 335
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 336
    .line 337
    .line 338
    invoke-direct {v3, v4}, Ldefpackage/hx;-><init>(Ljava/io/File;)V

    .line 339
    .line 340
    .line 341
    iput-object v3, v2, Ldefpackage/n83;->l:Ldefpackage/hx;

    .line 342
    .line 343
    sget-object v3, Ldefpackage/x30;->b:Ljavax/net/ssl/SSLSocketFactory;

    .line 344
    .line 345
    if-eqz v3, :cond_5

    .line 346
    .line 347
    sget-object v4, Ldefpackage/x30;->a:Ljavax/net/ssl/X509TrustManager;

    .line 348
    .line 349
    invoke-virtual {v2, v3, v4}, Ldefpackage/n83;->c(Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/X509TrustManager;)V

    .line 350
    .line 351
    .line 352
    :cond_5
    new-instance v3, Ldefpackage/o83;

    .line 353
    .line 354
    invoke-direct {v3, v2}, Ldefpackage/o83;-><init>(Ldefpackage/n83;)V

    .line 355
    .line 356
    .line 357
    invoke-virtual {v1, v3}, Lretrofit2/Retrofit$Builder;->client(Ldefpackage/o83;)Lretrofit2/Retrofit$Builder;

    .line 358
    .line 359
    .line 360
    move-result-object v1

    .line 361
    invoke-virtual {v1}, Lretrofit2/Retrofit$Builder;->build()Lretrofit2/Retrofit;

    .line 362
    .line 363
    .line 364
    move-result-object v1

    .line 365
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 366
    .line 367
    .line 368
    const-class v2, Ldefpackage/mt;

    .line 369
    .line 370
    invoke-virtual {v1, v2}, Lretrofit2/Retrofit;->create(Ljava/lang/Class;)Ljava/lang/Object;

    .line 371
    .line 372
    .line 373
    move-result-object v1

    .line 374
    check-cast v1, Ldefpackage/mt;

    .line 375
    .line 376
    iput-object v1, v0, Ldefpackage/rm3;->o:Ljava/lang/Object;

    .line 377
    .line 378
    return-void

    .line 379
    :sswitch_0
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 380
    .line 381
    .line 382
    iput-object v1, v0, Ldefpackage/rm3;->n:Ljava/lang/Object;

    .line 383
    .line 384
    new-instance v5, Ldefpackage/ok1;

    .line 385
    .line 386
    invoke-direct {v5}, Ldefpackage/ok1;-><init>()V

    .line 387
    .line 388
    .line 389
    new-instance v6, Ldefpackage/r01;

    .line 390
    .line 391
    invoke-direct {v6}, Ldefpackage/r01;-><init>()V

    .line 392
    .line 393
    .line 394
    invoke-virtual {v5, v3, v6}, Ldefpackage/ok1;->a(Ljava/lang/Class;Ldefpackage/g32;)V

    .line 395
    .line 396
    .line 397
    new-instance v3, Ldefpackage/lt;

    .line 398
    .line 399
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 400
    .line 401
    .line 402
    invoke-virtual {v5, v2, v3}, Ldefpackage/ok1;->a(Ljava/lang/Class;Ldefpackage/g32;)V

    .line 403
    .line 404
    .line 405
    iput-boolean v15, v5, Ldefpackage/ok1;->j:Z

    .line 406
    .line 407
    new-instance v2, Ljava/util/ArrayList;

    .line 408
    .line 409
    iget-object v3, v5, Ldefpackage/ok1;->e:Ljava/util/ArrayList;

    .line 410
    .line 411
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 412
    .line 413
    .line 414
    move-result v6

    .line 415
    iget-object v8, v5, Ldefpackage/ok1;->f:Ljava/util/ArrayList;

    .line 416
    .line 417
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 418
    .line 419
    .line 420
    move-result v9

    .line 421
    add-int/2addr v9, v6

    .line 422
    add-int/lit8 v9, v9, 0x3

    .line 423
    .line 424
    invoke-direct {v2, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 425
    .line 426
    .line 427
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 428
    .line 429
    .line 430
    invoke-static {v2}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    .line 431
    .line 432
    .line 433
    new-instance v6, Ljava/util/ArrayList;

    .line 434
    .line 435
    invoke-direct {v6, v8}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 436
    .line 437
    .line 438
    invoke-static {v6}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    .line 439
    .line 440
    .line 441
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 442
    .line 443
    .line 444
    iget v6, v5, Ldefpackage/ok1;->g:I

    .line 445
    .line 446
    iget v9, v5, Ldefpackage/ok1;->h:I

    .line 447
    .line 448
    sget-object v10, Ldefpackage/bk0;->b:Ldefpackage/ak0;

    .line 449
    .line 450
    sget-boolean v13, Ldefpackage/gk4;->a:Z

    .line 451
    .line 452
    if-eq v6, v14, :cond_7

    .line 453
    .line 454
    if-eq v9, v14, :cond_7

    .line 455
    .line 456
    invoke-virtual {v10, v6, v9}, Ldefpackage/bk0;->a(II)Ldefpackage/dz4;

    .line 457
    .line 458
    .line 459
    move-result-object v10

    .line 460
    if-eqz v13, :cond_6

    .line 461
    .line 462
    sget-object v14, Ldefpackage/gk4;->c:Ldefpackage/fk4;

    .line 463
    .line 464
    invoke-virtual {v14, v6, v9}, Ldefpackage/bk0;->a(II)Ldefpackage/dz4;

    .line 465
    .line 466
    .line 467
    move-result-object v14

    .line 468
    sget-object v15, Ldefpackage/gk4;->b:Ldefpackage/fk4;

    .line 469
    .line 470
    invoke-virtual {v15, v6, v9}, Ldefpackage/bk0;->a(II)Ldefpackage/dz4;

    .line 471
    .line 472
    .line 473
    move-result-object v6

    .line 474
    goto :goto_4

    .line 475
    :cond_6
    const/4 v6, 0x0

    .line 476
    const/4 v14, 0x0

    .line 477
    :goto_4
    invoke-virtual {v2, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 478
    .line 479
    .line 480
    if-eqz v13, :cond_7

    .line 481
    .line 482
    invoke-virtual {v2, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 483
    .line 484
    .line 485
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 486
    .line 487
    .line 488
    :cond_7
    new-instance v16, Ldefpackage/nk1;

    .line 489
    .line 490
    iget-object v6, v5, Ldefpackage/ok1;->a:Ldefpackage/u21;

    .line 491
    .line 492
    iget v9, v5, Ldefpackage/ok1;->c:I

    .line 493
    .line 494
    new-instance v10, Ljava/util/HashMap;

    .line 495
    .line 496
    iget-object v13, v5, Ldefpackage/ok1;->d:Ljava/util/HashMap;

    .line 497
    .line 498
    invoke-direct {v10, v13}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 499
    .line 500
    .line 501
    iget-boolean v13, v5, Ldefpackage/ok1;->i:Z

    .line 502
    .line 503
    iget-boolean v14, v5, Ldefpackage/ok1;->j:Z

    .line 504
    .line 505
    iget-boolean v15, v5, Ldefpackage/ok1;->k:Z

    .line 506
    .line 507
    move-object/from16 v24, v2

    .line 508
    .line 509
    iget v2, v5, Ldefpackage/ok1;->b:I

    .line 510
    .line 511
    move/from16 v23, v2

    .line 512
    .line 513
    new-instance v2, Ljava/util/ArrayList;

    .line 514
    .line 515
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 516
    .line 517
    .line 518
    new-instance v2, Ljava/util/ArrayList;

    .line 519
    .line 520
    invoke-direct {v2, v8}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 521
    .line 522
    .line 523
    iget v2, v5, Ldefpackage/ok1;->l:I

    .line 524
    .line 525
    iget v3, v5, Ldefpackage/ok1;->m:I

    .line 526
    .line 527
    new-instance v8, Ljava/util/ArrayList;

    .line 528
    .line 529
    iget-object v5, v5, Ldefpackage/ok1;->n:Ljava/util/LinkedList;

    .line 530
    .line 531
    invoke-direct {v8, v5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 532
    .line 533
    .line 534
    move/from16 v25, v2

    .line 535
    .line 536
    move/from16 v26, v3

    .line 537
    .line 538
    move-object/from16 v17, v6

    .line 539
    .line 540
    move-object/from16 v27, v8

    .line 541
    .line 542
    move/from16 v18, v9

    .line 543
    .line 544
    move-object/from16 v19, v10

    .line 545
    .line 546
    move/from16 v20, v13

    .line 547
    .line 548
    move/from16 v21, v14

    .line 549
    .line 550
    move/from16 v22, v15

    .line 551
    .line 552
    invoke-direct/range {v16 .. v27}, Ldefpackage/nk1;-><init>(Ldefpackage/u21;ILjava/util/Map;ZZZILjava/util/List;IILjava/util/List;)V

    .line 553
    .line 554
    .line 555
    new-instance v2, Lretrofit2/Retrofit$Builder;

    .line 556
    .line 557
    invoke-direct {v2}, Lretrofit2/Retrofit$Builder;-><init>()V

    .line 558
    .line 559
    .line 560
    invoke-virtual {v1}, Ldefpackage/pn4;->j()Ljava/lang/String;

    .line 561
    .line 562
    .line 563
    move-result-object v1

    .line 564
    if-eqz v1, :cond_8

    .line 565
    .line 566
    invoke-static {v1}, Ldefpackage/qm4;->K0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 567
    .line 568
    .line 569
    move-result-object v1

    .line 570
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 571
    .line 572
    .line 573
    move-result-object v1

    .line 574
    goto :goto_5

    .line 575
    :cond_8
    const/4 v1, 0x0

    .line 576
    :goto_5
    if-nez v1, :cond_9

    .line 577
    .line 578
    goto :goto_6

    .line 579
    :cond_9
    move-object v12, v1

    .line 580
    :goto_6
    :try_start_1
    new-instance v1, Ldefpackage/fr1;

    .line 581
    .line 582
    invoke-direct {v1}, Ldefpackage/fr1;-><init>()V

    .line 583
    .line 584
    .line 585
    const/4 v3, 0x0

    .line 586
    invoke-virtual {v1, v3, v12}, Ldefpackage/fr1;->e(Ldefpackage/gr1;Ljava/lang/String;)V

    .line 587
    .line 588
    .line 589
    invoke-virtual {v1}, Ldefpackage/fr1;->b()Ldefpackage/gr1;

    .line 590
    .line 591
    .line 592
    move-result-object v13
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1

    .line 593
    goto :goto_7

    .line 594
    :catch_1
    const/4 v13, 0x0

    .line 595
    :goto_7
    if-eqz v13, :cond_a

    .line 596
    .line 597
    iget-object v1, v13, Ldefpackage/gr1;->d:Ljava/lang/String;

    .line 598
    .line 599
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 600
    .line 601
    .line 602
    move-result v1

    .line 603
    if-lez v1, :cond_a

    .line 604
    .line 605
    move-object v11, v12

    .line 606
    :cond_a
    invoke-virtual {v2, v11}, Lretrofit2/Retrofit$Builder;->baseUrl(Ljava/lang/String;)Lretrofit2/Retrofit$Builder;

    .line 607
    .line 608
    .line 609
    move-result-object v1

    .line 610
    invoke-static/range {v16 .. v16}, Lretrofit2/converter/gson/GsonConverterFactory;->create(Ldefpackage/nk1;)Lretrofit2/converter/gson/GsonConverterFactory;

    .line 611
    .line 612
    .line 613
    move-result-object v2

    .line 614
    invoke-virtual {v1, v2}, Lretrofit2/Retrofit$Builder;->addConverterFactory(Lretrofit2/Converter$Factory;)Lretrofit2/Retrofit$Builder;

    .line 615
    .line 616
    .line 617
    move-result-object v1

    .line 618
    new-instance v2, Ldefpackage/cx;

    .line 619
    .line 620
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 621
    .line 622
    .line 623
    new-instance v3, Ldefpackage/rx;

    .line 624
    .line 625
    invoke-direct {v3, v2}, Ldefpackage/rx;-><init>(Ldefpackage/cx;)V

    .line 626
    .line 627
    .line 628
    const v5, 0x278d00

    .line 629
    .line 630
    .line 631
    iput v5, v2, Ldefpackage/cx;->a:I

    .line 632
    .line 633
    new-instance v2, Ldefpackage/n83;

    .line 634
    .line 635
    invoke-direct {v2}, Ldefpackage/n83;-><init>()V

    .line 636
    .line 637
    .line 638
    const-wide/16 v5, 0x2

    .line 639
    .line 640
    invoke-virtual {v2, v5, v6, v7}, Ldefpackage/n83;->a(JLjava/util/concurrent/TimeUnit;)V

    .line 641
    .line 642
    .line 643
    const-wide/16 v5, 0x14

    .line 644
    .line 645
    invoke-virtual {v2, v5, v6, v4}, Ldefpackage/n83;->b(JLjava/util/concurrent/TimeUnit;)V

    .line 646
    .line 647
    .line 648
    const-wide/16 v5, 0x1e

    .line 649
    .line 650
    invoke-static {v5, v6, v4}, Ldefpackage/ze5;->b(JLjava/util/concurrent/TimeUnit;)I

    .line 651
    .line 652
    .line 653
    move-result v7

    .line 654
    iput v7, v2, Ldefpackage/n83;->z:I

    .line 655
    .line 656
    invoke-static {v5, v6, v4}, Ldefpackage/ze5;->b(JLjava/util/concurrent/TimeUnit;)I

    .line 657
    .line 658
    .line 659
    move-result v4

    .line 660
    iput v4, v2, Ldefpackage/n83;->A:I

    .line 661
    .line 662
    new-instance v4, Ldefpackage/dr1;

    .line 663
    .line 664
    invoke-direct {v4}, Ldefpackage/dr1;-><init>()V

    .line 665
    .line 666
    .line 667
    sget-object v5, Ldefpackage/cr1;->n:Ldefpackage/cr1;

    .line 668
    .line 669
    iput-object v5, v4, Ldefpackage/dr1;->b:Ldefpackage/cr1;

    .line 670
    .line 671
    iget-object v5, v2, Ldefpackage/n83;->c:Ljava/util/ArrayList;

    .line 672
    .line 673
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 674
    .line 675
    .line 676
    iget-object v4, v2, Ldefpackage/n83;->c:Ljava/util/ArrayList;

    .line 677
    .line 678
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 679
    .line 680
    .line 681
    new-instance v3, Ldefpackage/hx;

    .line 682
    .line 683
    invoke-static {}, Lcom/eddyizm/tempus/App;->a()Landroid/content/Context;

    .line 684
    .line 685
    .line 686
    move-result-object v4

    .line 687
    invoke-virtual {v4}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 688
    .line 689
    .line 690
    move-result-object v4

    .line 691
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 692
    .line 693
    .line 694
    invoke-direct {v3, v4}, Ldefpackage/hx;-><init>(Ljava/io/File;)V

    .line 695
    .line 696
    .line 697
    iput-object v3, v2, Ldefpackage/n83;->l:Ldefpackage/hx;

    .line 698
    .line 699
    sget-object v3, Ldefpackage/x30;->b:Ljavax/net/ssl/SSLSocketFactory;

    .line 700
    .line 701
    if-eqz v3, :cond_b

    .line 702
    .line 703
    sget-object v4, Ldefpackage/x30;->a:Ljavax/net/ssl/X509TrustManager;

    .line 704
    .line 705
    invoke-virtual {v2, v3, v4}, Ldefpackage/n83;->c(Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/X509TrustManager;)V

    .line 706
    .line 707
    .line 708
    :cond_b
    new-instance v3, Ldefpackage/o83;

    .line 709
    .line 710
    invoke-direct {v3, v2}, Ldefpackage/o83;-><init>(Ldefpackage/n83;)V

    .line 711
    .line 712
    .line 713
    invoke-virtual {v1, v3}, Lretrofit2/Retrofit$Builder;->client(Ldefpackage/o83;)Lretrofit2/Retrofit$Builder;

    .line 714
    .line 715
    .line 716
    move-result-object v1

    .line 717
    invoke-virtual {v1}, Lretrofit2/Retrofit$Builder;->build()Lretrofit2/Retrofit;

    .line 718
    .line 719
    .line 720
    move-result-object v1

    .line 721
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 722
    .line 723
    .line 724
    const-class v2, Ldefpackage/qm3;

    .line 725
    .line 726
    invoke-virtual {v1, v2}, Lretrofit2/Retrofit;->create(Ljava/lang/Class;)Ljava/lang/Object;

    .line 727
    .line 728
    .line 729
    move-result-object v1

    .line 730
    check-cast v1, Ldefpackage/qm3;

    .line 731
    .line 732
    iput-object v1, v0, Ldefpackage/rm3;->o:Ljava/lang/Object;

    .line 733
    .line 734
    return-void

    .line 735
    :sswitch_1
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 736
    .line 737
    .line 738
    iput-object v1, v0, Ldefpackage/rm3;->n:Ljava/lang/Object;

    .line 739
    .line 740
    new-instance v5, Ldefpackage/ok1;

    .line 741
    .line 742
    invoke-direct {v5}, Ldefpackage/ok1;-><init>()V

    .line 743
    .line 744
    .line 745
    new-instance v6, Ldefpackage/r01;

    .line 746
    .line 747
    invoke-direct {v6}, Ldefpackage/r01;-><init>()V

    .line 748
    .line 749
    .line 750
    invoke-virtual {v5, v3, v6}, Ldefpackage/ok1;->a(Ljava/lang/Class;Ldefpackage/g32;)V

    .line 751
    .line 752
    .line 753
    new-instance v3, Ldefpackage/lt;

    .line 754
    .line 755
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 756
    .line 757
    .line 758
    invoke-virtual {v5, v2, v3}, Ldefpackage/ok1;->a(Ljava/lang/Class;Ldefpackage/g32;)V

    .line 759
    .line 760
    .line 761
    iput-boolean v15, v5, Ldefpackage/ok1;->j:Z

    .line 762
    .line 763
    new-instance v2, Ljava/util/ArrayList;

    .line 764
    .line 765
    iget-object v3, v5, Ldefpackage/ok1;->e:Ljava/util/ArrayList;

    .line 766
    .line 767
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 768
    .line 769
    .line 770
    move-result v6

    .line 771
    iget-object v8, v5, Ldefpackage/ok1;->f:Ljava/util/ArrayList;

    .line 772
    .line 773
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 774
    .line 775
    .line 776
    move-result v9

    .line 777
    add-int/2addr v9, v6

    .line 778
    add-int/lit8 v9, v9, 0x3

    .line 779
    .line 780
    invoke-direct {v2, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 781
    .line 782
    .line 783
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 784
    .line 785
    .line 786
    invoke-static {v2}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    .line 787
    .line 788
    .line 789
    new-instance v6, Ljava/util/ArrayList;

    .line 790
    .line 791
    invoke-direct {v6, v8}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 792
    .line 793
    .line 794
    invoke-static {v6}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    .line 795
    .line 796
    .line 797
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 798
    .line 799
    .line 800
    iget v6, v5, Ldefpackage/ok1;->g:I

    .line 801
    .line 802
    iget v9, v5, Ldefpackage/ok1;->h:I

    .line 803
    .line 804
    sget-object v10, Ldefpackage/bk0;->b:Ldefpackage/ak0;

    .line 805
    .line 806
    sget-boolean v13, Ldefpackage/gk4;->a:Z

    .line 807
    .line 808
    if-eq v6, v14, :cond_d

    .line 809
    .line 810
    if-eq v9, v14, :cond_d

    .line 811
    .line 812
    invoke-virtual {v10, v6, v9}, Ldefpackage/bk0;->a(II)Ldefpackage/dz4;

    .line 813
    .line 814
    .line 815
    move-result-object v10

    .line 816
    if-eqz v13, :cond_c

    .line 817
    .line 818
    sget-object v14, Ldefpackage/gk4;->c:Ldefpackage/fk4;

    .line 819
    .line 820
    invoke-virtual {v14, v6, v9}, Ldefpackage/bk0;->a(II)Ldefpackage/dz4;

    .line 821
    .line 822
    .line 823
    move-result-object v14

    .line 824
    sget-object v15, Ldefpackage/gk4;->b:Ldefpackage/fk4;

    .line 825
    .line 826
    invoke-virtual {v15, v6, v9}, Ldefpackage/bk0;->a(II)Ldefpackage/dz4;

    .line 827
    .line 828
    .line 829
    move-result-object v6

    .line 830
    goto :goto_8

    .line 831
    :cond_c
    const/4 v6, 0x0

    .line 832
    const/4 v14, 0x0

    .line 833
    :goto_8
    invoke-virtual {v2, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 834
    .line 835
    .line 836
    if-eqz v13, :cond_d

    .line 837
    .line 838
    invoke-virtual {v2, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 839
    .line 840
    .line 841
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 842
    .line 843
    .line 844
    :cond_d
    new-instance v16, Ldefpackage/nk1;

    .line 845
    .line 846
    iget-object v6, v5, Ldefpackage/ok1;->a:Ldefpackage/u21;

    .line 847
    .line 848
    iget v9, v5, Ldefpackage/ok1;->c:I

    .line 849
    .line 850
    new-instance v10, Ljava/util/HashMap;

    .line 851
    .line 852
    iget-object v13, v5, Ldefpackage/ok1;->d:Ljava/util/HashMap;

    .line 853
    .line 854
    invoke-direct {v10, v13}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 855
    .line 856
    .line 857
    iget-boolean v13, v5, Ldefpackage/ok1;->i:Z

    .line 858
    .line 859
    iget-boolean v14, v5, Ldefpackage/ok1;->j:Z

    .line 860
    .line 861
    iget-boolean v15, v5, Ldefpackage/ok1;->k:Z

    .line 862
    .line 863
    iget v1, v5, Ldefpackage/ok1;->b:I

    .line 864
    .line 865
    move/from16 v23, v1

    .line 866
    .line 867
    new-instance v1, Ljava/util/ArrayList;

    .line 868
    .line 869
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 870
    .line 871
    .line 872
    new-instance v1, Ljava/util/ArrayList;

    .line 873
    .line 874
    invoke-direct {v1, v8}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 875
    .line 876
    .line 877
    iget v1, v5, Ldefpackage/ok1;->l:I

    .line 878
    .line 879
    iget v3, v5, Ldefpackage/ok1;->m:I

    .line 880
    .line 881
    new-instance v8, Ljava/util/ArrayList;

    .line 882
    .line 883
    iget-object v5, v5, Ldefpackage/ok1;->n:Ljava/util/LinkedList;

    .line 884
    .line 885
    invoke-direct {v8, v5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 886
    .line 887
    .line 888
    move/from16 v25, v1

    .line 889
    .line 890
    move-object/from16 v24, v2

    .line 891
    .line 892
    move/from16 v26, v3

    .line 893
    .line 894
    move-object/from16 v17, v6

    .line 895
    .line 896
    move-object/from16 v27, v8

    .line 897
    .line 898
    move/from16 v18, v9

    .line 899
    .line 900
    move-object/from16 v19, v10

    .line 901
    .line 902
    move/from16 v20, v13

    .line 903
    .line 904
    move/from16 v21, v14

    .line 905
    .line 906
    move/from16 v22, v15

    .line 907
    .line 908
    invoke-direct/range {v16 .. v27}, Ldefpackage/nk1;-><init>(Ldefpackage/u21;ILjava/util/Map;ZZZILjava/util/List;IILjava/util/List;)V

    .line 909
    .line 910
    .line 911
    new-instance v1, Lretrofit2/Retrofit$Builder;

    .line 912
    .line 913
    invoke-direct {v1}, Lretrofit2/Retrofit$Builder;-><init>()V

    .line 914
    .line 915
    .line 916
    invoke-virtual/range {p1 .. p1}, Ldefpackage/pn4;->j()Ljava/lang/String;

    .line 917
    .line 918
    .line 919
    move-result-object v2

    .line 920
    if-eqz v2, :cond_e

    .line 921
    .line 922
    invoke-static {v2}, Ldefpackage/qm4;->K0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 923
    .line 924
    .line 925
    move-result-object v2

    .line 926
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 927
    .line 928
    .line 929
    move-result-object v3

    .line 930
    goto :goto_9

    .line 931
    :cond_e
    const/4 v3, 0x0

    .line 932
    :goto_9
    if-nez v3, :cond_f

    .line 933
    .line 934
    goto :goto_a

    .line 935
    :cond_f
    move-object v12, v3

    .line 936
    :goto_a
    :try_start_2
    new-instance v2, Ldefpackage/fr1;

    .line 937
    .line 938
    invoke-direct {v2}, Ldefpackage/fr1;-><init>()V
    :try_end_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_2

    .line 939
    .line 940
    .line 941
    const/4 v3, 0x0

    .line 942
    :try_start_3
    invoke-virtual {v2, v3, v12}, Ldefpackage/fr1;->e(Ldefpackage/gr1;Ljava/lang/String;)V

    .line 943
    .line 944
    .line 945
    invoke-virtual {v2}, Ldefpackage/fr1;->b()Ldefpackage/gr1;

    .line 946
    .line 947
    .line 948
    move-result-object v13
    :try_end_3
    .catch Ljava/lang/IllegalArgumentException; {:try_start_3 .. :try_end_3} :catch_3

    .line 949
    goto :goto_b

    .line 950
    :catch_2
    const/4 v3, 0x0

    .line 951
    :catch_3
    move-object v13, v3

    .line 952
    :goto_b
    if-eqz v13, :cond_10

    .line 953
    .line 954
    iget-object v2, v13, Ldefpackage/gr1;->d:Ljava/lang/String;

    .line 955
    .line 956
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 957
    .line 958
    .line 959
    move-result v2

    .line 960
    if-lez v2, :cond_10

    .line 961
    .line 962
    move-object v11, v12

    .line 963
    :cond_10
    invoke-virtual {v1, v11}, Lretrofit2/Retrofit$Builder;->baseUrl(Ljava/lang/String;)Lretrofit2/Retrofit$Builder;

    .line 964
    .line 965
    .line 966
    move-result-object v1

    .line 967
    invoke-static/range {v16 .. v16}, Lretrofit2/converter/gson/GsonConverterFactory;->create(Ldefpackage/nk1;)Lretrofit2/converter/gson/GsonConverterFactory;

    .line 968
    .line 969
    .line 970
    move-result-object v2

    .line 971
    invoke-virtual {v1, v2}, Lretrofit2/Retrofit$Builder;->addConverterFactory(Lretrofit2/Converter$Factory;)Lretrofit2/Retrofit$Builder;

    .line 972
    .line 973
    .line 974
    move-result-object v1

    .line 975
    new-instance v2, Ldefpackage/cx;

    .line 976
    .line 977
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 978
    .line 979
    .line 980
    new-instance v3, Ldefpackage/rx;

    .line 981
    .line 982
    invoke-direct {v3, v2}, Ldefpackage/rx;-><init>(Ldefpackage/cx;)V

    .line 983
    .line 984
    .line 985
    const v5, 0x278d00

    .line 986
    .line 987
    .line 988
    iput v5, v2, Ldefpackage/cx;->a:I

    .line 989
    .line 990
    new-instance v2, Ldefpackage/n83;

    .line 991
    .line 992
    invoke-direct {v2}, Ldefpackage/n83;-><init>()V

    .line 993
    .line 994
    .line 995
    const-wide/16 v5, 0x2

    .line 996
    .line 997
    invoke-virtual {v2, v5, v6, v7}, Ldefpackage/n83;->a(JLjava/util/concurrent/TimeUnit;)V

    .line 998
    .line 999
    .line 1000
    const-wide/16 v5, 0x14

    .line 1001
    .line 1002
    invoke-virtual {v2, v5, v6, v4}, Ldefpackage/n83;->b(JLjava/util/concurrent/TimeUnit;)V

    .line 1003
    .line 1004
    .line 1005
    const-wide/16 v5, 0x1e

    .line 1006
    .line 1007
    invoke-static {v5, v6, v4}, Ldefpackage/ze5;->b(JLjava/util/concurrent/TimeUnit;)I

    .line 1008
    .line 1009
    .line 1010
    move-result v7

    .line 1011
    iput v7, v2, Ldefpackage/n83;->z:I

    .line 1012
    .line 1013
    invoke-static {v5, v6, v4}, Ldefpackage/ze5;->b(JLjava/util/concurrent/TimeUnit;)I

    .line 1014
    .line 1015
    .line 1016
    move-result v4

    .line 1017
    iput v4, v2, Ldefpackage/n83;->A:I

    .line 1018
    .line 1019
    new-instance v4, Ldefpackage/dr1;

    .line 1020
    .line 1021
    invoke-direct {v4}, Ldefpackage/dr1;-><init>()V

    .line 1022
    .line 1023
    .line 1024
    sget-object v5, Ldefpackage/cr1;->n:Ldefpackage/cr1;

    .line 1025
    .line 1026
    iput-object v5, v4, Ldefpackage/dr1;->b:Ldefpackage/cr1;

    .line 1027
    .line 1028
    iget-object v5, v2, Ldefpackage/n83;->c:Ljava/util/ArrayList;

    .line 1029
    .line 1030
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1031
    .line 1032
    .line 1033
    iget-object v4, v2, Ldefpackage/n83;->c:Ljava/util/ArrayList;

    .line 1034
    .line 1035
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1036
    .line 1037
    .line 1038
    new-instance v3, Ldefpackage/hx;

    .line 1039
    .line 1040
    invoke-static {}, Lcom/eddyizm/tempus/App;->a()Landroid/content/Context;

    .line 1041
    .line 1042
    .line 1043
    move-result-object v4

    .line 1044
    invoke-virtual {v4}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 1045
    .line 1046
    .line 1047
    move-result-object v4

    .line 1048
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1049
    .line 1050
    .line 1051
    invoke-direct {v3, v4}, Ldefpackage/hx;-><init>(Ljava/io/File;)V

    .line 1052
    .line 1053
    .line 1054
    iput-object v3, v2, Ldefpackage/n83;->l:Ldefpackage/hx;

    .line 1055
    .line 1056
    sget-object v3, Ldefpackage/x30;->b:Ljavax/net/ssl/SSLSocketFactory;

    .line 1057
    .line 1058
    if-eqz v3, :cond_11

    .line 1059
    .line 1060
    sget-object v4, Ldefpackage/x30;->a:Ljavax/net/ssl/X509TrustManager;

    .line 1061
    .line 1062
    invoke-virtual {v2, v3, v4}, Ldefpackage/n83;->c(Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/X509TrustManager;)V

    .line 1063
    .line 1064
    .line 1065
    :cond_11
    new-instance v3, Ldefpackage/o83;

    .line 1066
    .line 1067
    invoke-direct {v3, v2}, Ldefpackage/o83;-><init>(Ldefpackage/n83;)V

    .line 1068
    .line 1069
    .line 1070
    invoke-virtual {v1, v3}, Lretrofit2/Retrofit$Builder;->client(Ldefpackage/o83;)Lretrofit2/Retrofit$Builder;

    .line 1071
    .line 1072
    .line 1073
    move-result-object v1

    .line 1074
    invoke-virtual {v1}, Lretrofit2/Retrofit$Builder;->build()Lretrofit2/Retrofit;

    .line 1075
    .line 1076
    .line 1077
    move-result-object v1

    .line 1078
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1079
    .line 1080
    .line 1081
    const-class v2, Ldefpackage/in2;

    .line 1082
    .line 1083
    invoke-virtual {v1, v2}, Lretrofit2/Retrofit;->create(Ljava/lang/Class;)Ljava/lang/Object;

    .line 1084
    .line 1085
    .line 1086
    move-result-object v1

    .line 1087
    check-cast v1, Ldefpackage/in2;

    .line 1088
    .line 1089
    iput-object v1, v0, Ldefpackage/rm3;->o:Ljava/lang/Object;

    .line 1090
    .line 1091
    return-void

    .line 1092
    nop

    .line 1093
    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_1
        0x11 -> :sswitch_0
    .end sparse-switch
.end method

.method public constructor <init>(Ldefpackage/pq3;Ldefpackage/bq4;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1114
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1115
    iput-object p1, p0, Ldefpackage/rm3;->n:Ljava/lang/Object;

    .line 1116
    iput-object p2, p0, Ldefpackage/rm3;->o:Ljava/lang/Object;

    return-void
.end method

.method public static D(Ldefpackage/c72;)V
    .locals 10

    .line 1
    iget v0, p0, Ldefpackage/c72;->Y:I

    .line 2
    .line 3
    if-lez v0, :cond_b

    .line 4
    .line 5
    iget-object v0, p0, Ldefpackage/c72;->R:Ldefpackage/f72;

    .line 6
    .line 7
    iget-object v0, v0, Ldefpackage/f72;->d:Ldefpackage/y62;

    .line 8
    .line 9
    sget-object v1, Ldefpackage/y62;->r:Ldefpackage/y62;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    if-ne v0, v1, :cond_a

    .line 13
    .line 14
    invoke-virtual {p0}, Ldefpackage/c72;->p()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_a

    .line 19
    .line 20
    invoke-virtual {p0}, Ldefpackage/c72;->q()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_a

    .line 25
    .line 26
    iget-boolean v0, p0, Ldefpackage/c72;->Z:Z

    .line 27
    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    goto/16 :goto_5

    .line 31
    .line 32
    :cond_0
    invoke-virtual {p0}, Ldefpackage/c72;->H()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-nez v0, :cond_1

    .line 37
    .line 38
    goto/16 :goto_5

    .line 39
    .line 40
    :cond_1
    iget-object v0, p0, Ldefpackage/c72;->Q:Ldefpackage/w12;

    .line 41
    .line 42
    iget-object v0, v0, Ldefpackage/w12;->g:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v0, Ldefpackage/cx2;

    .line 45
    .line 46
    iget v1, v0, Ldefpackage/cx2;->q:I

    .line 47
    .line 48
    const/16 v3, 0x100

    .line 49
    .line 50
    and-int/2addr v1, v3

    .line 51
    if-eqz v1, :cond_a

    .line 52
    .line 53
    :goto_0
    if-eqz v0, :cond_a

    .line 54
    .line 55
    iget v1, v0, Ldefpackage/cx2;->p:I

    .line 56
    .line 57
    and-int/2addr v1, v3

    .line 58
    if-eqz v1, :cond_9

    .line 59
    .line 60
    const/4 v1, 0x0

    .line 61
    move-object v4, v0

    .line 62
    move-object v5, v1

    .line 63
    :goto_1
    if-eqz v4, :cond_9

    .line 64
    .line 65
    instance-of v6, v4, Ldefpackage/vi1;

    .line 66
    .line 67
    if-eqz v6, :cond_2

    .line 68
    .line 69
    check-cast v4, Ldefpackage/vi1;

    .line 70
    .line 71
    invoke-static {v4, v3}, Ldefpackage/j51;->M(Ldefpackage/eo0;I)Ldefpackage/f63;

    .line 72
    .line 73
    .line 74
    move-result-object v6

    .line 75
    invoke-interface {v4, v6}, Ldefpackage/vi1;->L(Ldefpackage/f63;)V

    .line 76
    .line 77
    .line 78
    goto :goto_4

    .line 79
    :cond_2
    iget v6, v4, Ldefpackage/cx2;->p:I

    .line 80
    .line 81
    and-int/2addr v6, v3

    .line 82
    if-eqz v6, :cond_8

    .line 83
    .line 84
    instance-of v6, v4, Ldefpackage/fo0;

    .line 85
    .line 86
    if-eqz v6, :cond_8

    .line 87
    .line 88
    move-object v6, v4

    .line 89
    check-cast v6, Ldefpackage/fo0;

    .line 90
    .line 91
    iget-object v6, v6, Ldefpackage/fo0;->C:Ldefpackage/cx2;

    .line 92
    .line 93
    move v7, v2

    .line 94
    :goto_2
    const/4 v8, 0x1

    .line 95
    if-eqz v6, :cond_7

    .line 96
    .line 97
    iget v9, v6, Ldefpackage/cx2;->p:I

    .line 98
    .line 99
    and-int/2addr v9, v3

    .line 100
    if-eqz v9, :cond_6

    .line 101
    .line 102
    add-int/lit8 v7, v7, 0x1

    .line 103
    .line 104
    if-ne v7, v8, :cond_3

    .line 105
    .line 106
    move-object v4, v6

    .line 107
    goto :goto_3

    .line 108
    :cond_3
    if-nez v5, :cond_4

    .line 109
    .line 110
    new-instance v5, Ldefpackage/f13;

    .line 111
    .line 112
    const/16 v8, 0x10

    .line 113
    .line 114
    new-array v8, v8, [Ldefpackage/cx2;

    .line 115
    .line 116
    invoke-direct {v5, v8}, Ldefpackage/f13;-><init>([Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    :cond_4
    if-eqz v4, :cond_5

    .line 120
    .line 121
    invoke-virtual {v5, v4}, Ldefpackage/f13;->b(Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    move-object v4, v1

    .line 125
    :cond_5
    invoke-virtual {v5, v6}, Ldefpackage/f13;->b(Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    :cond_6
    :goto_3
    iget-object v6, v6, Ldefpackage/cx2;->s:Ldefpackage/cx2;

    .line 129
    .line 130
    goto :goto_2

    .line 131
    :cond_7
    if-ne v7, v8, :cond_8

    .line 132
    .line 133
    goto :goto_1

    .line 134
    :cond_8
    :goto_4
    invoke-static {v5}, Ldefpackage/j51;->c(Ldefpackage/f13;)Ldefpackage/cx2;

    .line 135
    .line 136
    .line 137
    move-result-object v4

    .line 138
    goto :goto_1

    .line 139
    :cond_9
    iget v1, v0, Ldefpackage/cx2;->q:I

    .line 140
    .line 141
    and-int/2addr v1, v3

    .line 142
    if-eqz v1, :cond_a

    .line 143
    .line 144
    iget-object v0, v0, Ldefpackage/cx2;->s:Ldefpackage/cx2;

    .line 145
    .line 146
    goto :goto_0

    .line 147
    :cond_a
    :goto_5
    iput-boolean v2, p0, Ldefpackage/c72;->X:Z

    .line 148
    .line 149
    invoke-virtual {p0}, Ldefpackage/c72;->y()Ldefpackage/f13;

    .line 150
    .line 151
    .line 152
    move-result-object p0

    .line 153
    iget-object v0, p0, Ldefpackage/f13;->n:[Ljava/lang/Object;

    .line 154
    .line 155
    iget p0, p0, Ldefpackage/f13;->p:I

    .line 156
    .line 157
    :goto_6
    if-ge v2, p0, :cond_b

    .line 158
    .line 159
    aget-object v1, v0, v2

    .line 160
    .line 161
    check-cast v1, Ldefpackage/c72;

    .line 162
    .line 163
    invoke-static {v1}, Ldefpackage/rm3;->D(Ldefpackage/c72;)V

    .line 164
    .line 165
    .line 166
    add-int/lit8 v2, v2, 0x1

    .line 167
    .line 168
    goto :goto_6

    .line 169
    :cond_b
    return-void
.end method


# virtual methods
.method public A(Ljava/lang/String;)Landroid/os/Bundle;
    .locals 3

    .line 1
    iget-object p0, p0, Ldefpackage/rm3;->n:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ldefpackage/xm2;

    .line 4
    .line 5
    iget-boolean v0, p0, Ldefpackage/xm2;->b:Z

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_3

    .line 9
    .line 10
    iget-object v0, p0, Ldefpackage/xm2;->h:Ljava/lang/Cloneable;

    .line 11
    .line 12
    check-cast v0, Landroid/os/Bundle;

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    return-object v1

    .line 17
    :cond_0
    invoke-virtual {v0, p1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_1

    .line 22
    .line 23
    invoke-static {p1, v0}, Ldefpackage/jz4;->w(Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    goto :goto_0

    .line 28
    :cond_1
    move-object v2, v1

    .line 29
    :goto_0
    invoke-virtual {v0, p1}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-eqz p1, :cond_2

    .line 37
    .line 38
    iput-object v1, p0, Ldefpackage/xm2;->h:Ljava/lang/Cloneable;

    .line 39
    .line 40
    :cond_2
    return-object v2

    .line 41
    :cond_3
    const-string p0, "You can \'consumeRestoredStateForKey\' only after the corresponding component has moved to the \'CREATED\' state"

    .line 42
    .line 43
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-object v1
.end method

.method public B(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object p0, p0, Ldefpackage/rm3;->n:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ldefpackage/s24;

    .line 4
    .line 5
    new-instance v0, Ldefpackage/rs0;

    .line 6
    .line 7
    const/16 v1, 0x10

    .line 8
    .line 9
    invoke-direct {v0, v1, p1}, Ldefpackage/rs0;-><init>(ILjava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    const/4 v1, 0x1

    .line 14
    invoke-static {p0, p1, v1, v0}, Ldefpackage/xl;->E(Ldefpackage/s24;ZZLdefpackage/if1;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public C()V
    .locals 6

    .line 1
    iget-object v0, p0, Ldefpackage/rm3;->n:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ldefpackage/f13;

    .line 4
    .line 5
    sget-object v1, Ldefpackage/ca1;->t:Ldefpackage/ca1;

    .line 6
    .line 7
    iget-object v2, v0, Ldefpackage/f13;->n:[Ljava/lang/Object;

    .line 8
    .line 9
    iget v3, v0, Ldefpackage/f13;->p:I

    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    invoke-static {v2, v4, v3, v1}, Ljava/util/Arrays;->sort([Ljava/lang/Object;IILjava/util/Comparator;)V

    .line 13
    .line 14
    .line 15
    iget v1, v0, Ldefpackage/f13;->p:I

    .line 16
    .line 17
    iget-object v2, p0, Ldefpackage/rm3;->o:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v2, [Ldefpackage/c72;

    .line 20
    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    array-length v3, v2

    .line 24
    if-ge v3, v1, :cond_1

    .line 25
    .line 26
    :cond_0
    const/16 v2, 0x10

    .line 27
    .line 28
    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    new-array v2, v2, [Ldefpackage/c72;

    .line 33
    .line 34
    :cond_1
    const/4 v3, 0x0

    .line 35
    iput-object v3, p0, Ldefpackage/rm3;->o:Ljava/lang/Object;

    .line 36
    .line 37
    :goto_0
    if-ge v4, v1, :cond_2

    .line 38
    .line 39
    iget-object v5, v0, Ldefpackage/f13;->n:[Ljava/lang/Object;

    .line 40
    .line 41
    aget-object v5, v5, v4

    .line 42
    .line 43
    aput-object v5, v2, v4

    .line 44
    .line 45
    add-int/lit8 v4, v4, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    invoke-virtual {v0}, Ldefpackage/f13;->g()V

    .line 49
    .line 50
    .line 51
    add-int/lit8 v1, v1, -0x1

    .line 52
    .line 53
    :goto_1
    const/4 v0, -0x1

    .line 54
    if-ge v0, v1, :cond_4

    .line 55
    .line 56
    aget-object v0, v2, v1

    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    iget-boolean v4, v0, Ldefpackage/c72;->X:Z

    .line 62
    .line 63
    if-eqz v4, :cond_3

    .line 64
    .line 65
    invoke-static {v0}, Ldefpackage/rm3;->D(Ldefpackage/c72;)V

    .line 66
    .line 67
    .line 68
    :cond_3
    aput-object v3, v2, v1

    .line 69
    .line 70
    add-int/lit8 v1, v1, -0x1

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_4
    iput-object v2, p0, Ldefpackage/rm3;->o:Ljava/lang/Object;

    .line 74
    .line 75
    return-void
.end method

.method public varargs E([Ljava/lang/Object;)Ldefpackage/k51;
    .locals 3

    .line 1
    iget-object v0, p0, Ldefpackage/rm3;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    iget-object v1, p0, Ldefpackage/rm3;->o:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v2, 0x0

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    :goto_0
    move-object p0, v2

    .line 19
    goto :goto_1

    .line 20
    :catchall_0
    move-exception p0

    .line 21
    goto :goto_2

    .line 22
    :cond_0
    :try_start_1
    iget-object v1, p0, Ldefpackage/rm3;->n:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v1, Ldefpackage/mj0;

    .line 25
    .line 26
    invoke-virtual {v1}, Ldefpackage/mj0;->d()Ljava/lang/reflect/Constructor;

    .line 27
    .line 28
    .line 29
    move-result-object p0
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 30
    :try_start_2
    monitor-exit v0

    .line 31
    goto :goto_1

    .line 32
    :catch_0
    move-exception p0

    .line 33
    new-instance p1, Ljava/lang/RuntimeException;

    .line 34
    .line 35
    const-string v1, "Error instantiating extension"

    .line 36
    .line 37
    invoke-direct {p1, v1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 38
    .line 39
    .line 40
    throw p1

    .line 41
    :catch_1
    iget-object p0, p0, Ldefpackage/rm3;->o:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 44
    .line 45
    const/4 v1, 0x1

    .line 46
    invoke-virtual {p0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 47
    .line 48
    .line 49
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 50
    goto :goto_0

    .line 51
    :goto_1
    if-nez p0, :cond_1

    .line 52
    .line 53
    return-object v2

    .line 54
    :cond_1
    :try_start_3
    invoke-virtual {p0, p1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    check-cast p0, Ldefpackage/k51;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    .line 59
    .line 60
    return-object p0

    .line 61
    :catch_2
    move-exception p0

    .line 62
    const-string p1, "Unexpected error creating extractor"

    .line 63
    .line 64
    invoke-static {p1, p0}, Ldefpackage/mj0;->j(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 65
    .line 66
    .line 67
    return-object v2

    .line 68
    :goto_2
    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 69
    throw p0
.end method

.method public F(Ljava/lang/String;)Lretrofit2/Call;
    .locals 2

    .line 1
    const-string v0, "BrowsingClient"

    .line 2
    .line 3
    const-string v1, "getPlaylist()"

    .line 4
    .line 5
    invoke-static {v0, v1}, Landroid/util/Ldefpackage/og;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Ldefpackage/rm3;->o:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Ldefpackage/qm3;

    .line 11
    .line 12
    iget-object p0, p0, Ldefpackage/rm3;->n:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, Ldefpackage/pn4;

    .line 15
    .line 16
    invoke-virtual {p0}, Ldefpackage/pn4;->f()Ljava/util/HashMap;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-interface {v0, p0, p1}, Ldefpackage/qm3;->c(Ljava/util/Map;Ljava/lang/String;)Lretrofit2/Call;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method

.method public G(Ljava/lang/String;)Ldefpackage/i54;
    .locals 4

    .line 1
    iget-object p0, p0, Ldefpackage/rm3;->n:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ldefpackage/xm2;

    .line 4
    .line 5
    iget-object v0, p0, Ldefpackage/xm2;->f:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Ldefpackage/xi4;

    .line 8
    .line 9
    monitor-enter v0

    .line 10
    :try_start_0
    iget-object p0, p0, Ldefpackage/xm2;->g:Ljava/io/Serializable;

    .line 11
    .line 12
    check-cast p0, Ljava/util/LinkedHashMap;

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    const/4 v2, 0x0

    .line 27
    if-eqz v1, :cond_2

    .line 28
    .line 29
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    check-cast v1, Ljava/util/Map$Entry;

    .line 34
    .line 35
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    check-cast v3, Ljava/lang/String;

    .line 40
    .line 41
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    check-cast v1, Ldefpackage/i54;

    .line 46
    .line 47
    invoke-static {v3, p1}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    if-eqz v3, :cond_1

    .line 52
    .line 53
    move-object v2, v1

    .line 54
    :cond_1
    if-eqz v2, :cond_0

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :catchall_0
    move-exception p0

    .line 58
    goto :goto_1

    .line 59
    :cond_2
    :goto_0
    monitor-exit v0

    .line 60
    return-object v2

    .line 61
    :goto_1
    monitor-exit v0

    .line 62
    throw p0
.end method

.method public H(Ldefpackage/d5;)V
    .locals 3

    .line 1
    iget-object v0, p0, Ldefpackage/rm3;->n:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ldefpackage/bq4;

    .line 4
    .line 5
    iget-object v1, v0, Ldefpackage/bq4;->n:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Landroid/view/ActionMode$Callback;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Ldefpackage/bq4;->i(Ldefpackage/d5;)Ldefpackage/jo4;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-interface {v1, p1}, Landroid/view/ActionMode$Callback;->onDestroyActionMode(Landroid/view/ActionMode;)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Ldefpackage/rm3;->o:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p1, Ldefpackage/bg;

    .line 19
    .line 20
    iget-object v0, p1, Ldefpackage/bg;->I:Landroid/widget/PopupWindow;

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    iget-object v0, p1, Ldefpackage/bg;->y:Landroid/view/Window;

    .line 25
    .line 26
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iget-object v1, p1, Ldefpackage/bg;->J:Ldefpackage/qf;

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 33
    .line 34
    .line 35
    :cond_0
    iget-object v0, p1, Ldefpackage/bg;->H:Landroidx/appcompat/widget/ActionBarContextView;

    .line 36
    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    iget-object v0, p1, Ldefpackage/bg;->K:Ldefpackage/s75;

    .line 40
    .line 41
    if-eqz v0, :cond_1

    .line 42
    .line 43
    invoke-virtual {v0}, Ldefpackage/s75;->b()V

    .line 44
    .line 45
    .line 46
    :cond_1
    iget-object v0, p1, Ldefpackage/bg;->H:Landroidx/appcompat/widget/ActionBarContextView;

    .line 47
    .line 48
    invoke-static {v0}, Ldefpackage/j65;->a(Landroid/view/View;)Ldefpackage/s75;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    const/4 v1, 0x0

    .line 53
    invoke-virtual {v0, v1}, Ldefpackage/s75;->a(F)V

    .line 54
    .line 55
    .line 56
    iput-object v0, p1, Ldefpackage/bg;->K:Ldefpackage/s75;

    .line 57
    .line 58
    new-instance v1, Ldefpackage/sf;

    .line 59
    .line 60
    const/4 v2, 0x2

    .line 61
    invoke-direct {v1, v2, p0}, Ldefpackage/sf;-><init>(ILjava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, v1}, Ldefpackage/s75;->d(Ldefpackage/u75;)V

    .line 65
    .line 66
    .line 67
    :cond_2
    const/4 p0, 0x0

    .line 68
    iput-object p0, p1, Ldefpackage/bg;->G:Ldefpackage/d5;

    .line 69
    .line 70
    iget-object p0, p1, Ldefpackage/bg;->N:Landroid/view/ViewGroup;

    .line 71
    .line 72
    sget-object v0, Ldefpackage/j65;->a:Ljava/util/WeakHashMap;

    .line 73
    .line 74
    invoke-virtual {p0}, Landroid/view/View;->requestApplyInsets()V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1}, Ldefpackage/bg;->O()V

    .line 78
    .line 79
    .line 80
    return-void
.end method

.method public I(Ldefpackage/d5;Landroid/view/Menu;)Z
    .locals 4

    .line 1
    iget-object v0, p0, Ldefpackage/rm3;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ldefpackage/bg;

    .line 4
    .line 5
    iget-object v0, v0, Ldefpackage/bg;->N:Landroid/view/ViewGroup;

    .line 6
    .line 7
    sget-object v1, Ldefpackage/j65;->a:Ljava/util/WeakHashMap;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/view/View;->requestApplyInsets()V

    .line 10
    .line 11
    .line 12
    iget-object p0, p0, Ldefpackage/rm3;->n:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, Ldefpackage/bq4;

    .line 15
    .line 16
    iget-object v0, p0, Ldefpackage/bq4;->n:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Landroid/view/ActionMode$Callback;

    .line 19
    .line 20
    invoke-virtual {p0, p1}, Ldefpackage/bq4;->i(Ldefpackage/d5;)Ldefpackage/jo4;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iget-object v1, p0, Ldefpackage/bq4;->q:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v1, Ldefpackage/yd4;

    .line 27
    .line 28
    invoke-virtual {v1, p2}, Ldefpackage/yd4;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    check-cast v2, Landroid/view/Menu;

    .line 33
    .line 34
    if-nez v2, :cond_0

    .line 35
    .line 36
    new-instance v2, Ldefpackage/jv2;

    .line 37
    .line 38
    iget-object p0, p0, Ldefpackage/bq4;->o:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p0, Landroid/content/Context;

    .line 41
    .line 42
    move-object v3, p2

    .line 43
    check-cast v3, Ldefpackage/qu2;

    .line 44
    .line 45
    invoke-direct {v2, p0, v3}, Ldefpackage/jv2;-><init>(Landroid/content/Context;Ldefpackage/qu2;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1, p2, v2}, Ldefpackage/yd4;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    :cond_0
    invoke-interface {v0, p1, v2}, Landroid/view/ActionMode$Callback;->onPrepareActionMode(Landroid/view/ActionMode;Landroid/view/Menu;)Z

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    return p0
.end method

.method public J(Landroid/content/Context;Landroid/content/res/XmlResourceParser;)V
    .locals 11

    .line 1
    new-instance v0, Ldefpackage/wb0;

    .line 2
    .line 3
    invoke-direct {v0}, Ldefpackage/wb0;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeCount()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x0

    .line 11
    move v3, v2

    .line 12
    :goto_0
    if-ge v3, v1, :cond_f

    .line 13
    .line 14
    invoke-interface {p2, v3}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeName(I)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    invoke-interface {p2, v3}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(I)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v5

    .line 22
    if-eqz v4, :cond_e

    .line 23
    .line 24
    if-nez v5, :cond_0

    .line 25
    .line 26
    goto/16 :goto_a

    .line 27
    .line 28
    :cond_0
    const-string v6, "id"

    .line 29
    .line 30
    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    if-eqz v4, :cond_e

    .line 35
    .line 36
    const-string v1, "/"

    .line 37
    .line 38
    invoke-virtual {v5, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    const/4 v3, -0x1

    .line 43
    const/4 v4, 0x1

    .line 44
    if-eqz v1, :cond_1

    .line 45
    .line 46
    const/16 v1, 0x2f

    .line 47
    .line 48
    invoke-virtual {v5, v1}, Ljava/lang/String;->indexOf(I)I

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    add-int/2addr v1, v4

    .line 53
    invoke-virtual {v5, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 58
    .line 59
    .line 60
    move-result-object v7

    .line 61
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v8

    .line 65
    invoke-virtual {v7, v1, v6, v8}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    goto :goto_1

    .line 70
    :cond_1
    move v1, v3

    .line 71
    :goto_1
    if-ne v1, v3, :cond_3

    .line 72
    .line 73
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    if-le v3, v4, :cond_2

    .line 78
    .line 79
    invoke-virtual {v5, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    goto :goto_2

    .line 88
    :cond_2
    const-string v3, "ConstraintLayoutStates"

    .line 89
    .line 90
    const-string v5, "error in parsing id"

    .line 91
    .line 92
    invoke-static {v3, v5}, Landroid/util/Ldefpackage/og;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 93
    .line 94
    .line 95
    :cond_3
    :goto_2
    const-string v3, "Error parsing XML resource"

    .line 96
    .line 97
    const-string v5, "ConstraintSet"

    .line 98
    .line 99
    :try_start_0
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    .line 100
    .line 101
    .line 102
    move-result v6

    .line 103
    const/4 v7, 0x0

    .line 104
    move-object v8, v7

    .line 105
    :goto_3
    if-eq v6, v4, :cond_d

    .line 106
    .line 107
    if-eqz v6, :cond_b

    .line 108
    .line 109
    const/4 v9, 0x2

    .line 110
    if-eq v6, v9, :cond_5

    .line 111
    .line 112
    const/4 v9, 0x3

    .line 113
    if-eq v6, v9, :cond_4

    .line 114
    .line 115
    goto/16 :goto_6

    .line 116
    .line 117
    :cond_4
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v6

    .line 121
    sget-object v9, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 122
    .line 123
    invoke-virtual {v6, v9}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v6

    .line 127
    invoke-virtual {v6}, Ljava/lang/String;->hashCode()I

    .line 128
    .line 129
    .line 130
    move-result v9

    .line 131
    sparse-switch v9, :sswitch_data_0

    .line 132
    .line 133
    .line 134
    goto/16 :goto_6

    .line 135
    .line 136
    :sswitch_0
    const-string v9, "constraintset"

    .line 137
    .line 138
    invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result v6

    .line 142
    if-eqz v6, :cond_c

    .line 143
    .line 144
    goto/16 :goto_9

    .line 145
    .line 146
    :catch_0
    move-exception p1

    .line 147
    goto/16 :goto_7

    .line 148
    .line 149
    :catch_1
    move-exception p1

    .line 150
    goto/16 :goto_8

    .line 151
    .line 152
    :sswitch_1
    const-string v9, "constraintoverride"

    .line 153
    .line 154
    invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    move-result v6

    .line 158
    if-eqz v6, :cond_c

    .line 159
    .line 160
    goto :goto_4

    .line 161
    :sswitch_2
    const-string v9, "constraint"

    .line 162
    .line 163
    invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    move-result v6

    .line 167
    if-eqz v6, :cond_c

    .line 168
    .line 169
    goto :goto_4

    .line 170
    :sswitch_3
    const-string v9, "guideline"

    .line 171
    .line 172
    invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result v6

    .line 176
    if-eqz v6, :cond_c

    .line 177
    .line 178
    :goto_4
    iget-object v6, v0, Ldefpackage/wb0;->c:Ljava/util/HashMap;

    .line 179
    .line 180
    iget v9, v8, Ldefpackage/rb0;->a:I

    .line 181
    .line 182
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 183
    .line 184
    .line 185
    move-result-object v9

    .line 186
    invoke-virtual {v6, v9, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-object v8, v7

    .line 190
    goto/16 :goto_6

    .line 191
    .line 192
    :cond_5
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v6

    .line 196
    invoke-virtual {v6}, Ljava/lang/String;->hashCode()I

    .line 197
    .line 198
    .line 199
    move-result v9
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 200
    const-string v10, "XML parser error must be within a Constraint "

    .line 201
    .line 202
    sparse-switch v9, :sswitch_data_1

    .line 203
    .line 204
    .line 205
    goto/16 :goto_6

    .line 206
    .line 207
    :sswitch_4
    :try_start_1
    const-string v9, "Constraint"

    .line 208
    .line 209
    invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 210
    .line 211
    .line 212
    move-result v6

    .line 213
    if-eqz v6, :cond_c

    .line 214
    .line 215
    invoke-static {p2}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    .line 216
    .line 217
    .line 218
    move-result-object v6

    .line 219
    invoke-static {p1, v6, v2}, Ldefpackage/wb0;->e(Landroid/content/Context;Landroid/util/AttributeSet;Z)Ldefpackage/rb0;

    .line 220
    .line 221
    .line 222
    move-result-object v8

    .line 223
    goto/16 :goto_6

    .line 224
    .line 225
    :sswitch_5
    const-string v9, "CustomAttribute"

    .line 226
    .line 227
    invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 228
    .line 229
    .line 230
    move-result v6

    .line 231
    if-eqz v6, :cond_c

    .line 232
    .line 233
    goto :goto_5

    .line 234
    :sswitch_6
    const-string v9, "Barrier"

    .line 235
    .line 236
    invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 237
    .line 238
    .line 239
    move-result v6

    .line 240
    if-eqz v6, :cond_c

    .line 241
    .line 242
    invoke-static {p2}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    .line 243
    .line 244
    .line 245
    move-result-object v6

    .line 246
    invoke-static {p1, v6, v2}, Ldefpackage/wb0;->e(Landroid/content/Context;Landroid/util/AttributeSet;Z)Ldefpackage/rb0;

    .line 247
    .line 248
    .line 249
    move-result-object v8

    .line 250
    iget-object v6, v8, Ldefpackage/rb0;->d:Ldefpackage/sb0;

    .line 251
    .line 252
    iput v4, v6, Ldefpackage/sb0;->h0:I

    .line 253
    .line 254
    goto/16 :goto_6

    .line 255
    .line 256
    :sswitch_7
    const-string v9, "CustomMethod"

    .line 257
    .line 258
    invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 259
    .line 260
    .line 261
    move-result v6

    .line 262
    if-eqz v6, :cond_c

    .line 263
    .line 264
    :goto_5
    if-eqz v8, :cond_6

    .line 265
    .line 266
    iget-object v6, v8, Ldefpackage/rb0;->f:Ljava/util/HashMap;

    .line 267
    .line 268
    invoke-static {p1, p2, v6}, Ldefpackage/ib0;->a(Landroid/content/Context;Landroid/content/res/XmlResourceParser;Ljava/util/HashMap;)V

    .line 269
    .line 270
    .line 271
    goto/16 :goto_6

    .line 272
    .line 273
    :cond_6
    new-instance p1, Ljava/lang/RuntimeException;

    .line 274
    .line 275
    new-instance v2, Ljava/lang/StringBuilder;

    .line 276
    .line 277
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 278
    .line 279
    .line 280
    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 281
    .line 282
    .line 283
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getLineNumber()I

    .line 284
    .line 285
    .line 286
    move-result p2

    .line 287
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 288
    .line 289
    .line 290
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 291
    .line 292
    .line 293
    move-result-object p2

    .line 294
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 295
    .line 296
    .line 297
    throw p1

    .line 298
    :sswitch_8
    const-string v9, "Guideline"

    .line 299
    .line 300
    invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 301
    .line 302
    .line 303
    move-result v6

    .line 304
    if-eqz v6, :cond_c

    .line 305
    .line 306
    invoke-static {p2}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    .line 307
    .line 308
    .line 309
    move-result-object v6

    .line 310
    invoke-static {p1, v6, v2}, Ldefpackage/wb0;->e(Landroid/content/Context;Landroid/util/AttributeSet;Z)Ldefpackage/rb0;

    .line 311
    .line 312
    .line 313
    move-result-object v8

    .line 314
    iget-object v6, v8, Ldefpackage/rb0;->d:Ldefpackage/sb0;

    .line 315
    .line 316
    iput-boolean v4, v6, Ldefpackage/sb0;->a:Z

    .line 317
    .line 318
    goto/16 :goto_6

    .line 319
    .line 320
    :sswitch_9
    const-string v9, "Transform"

    .line 321
    .line 322
    invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 323
    .line 324
    .line 325
    move-result v6

    .line 326
    if-eqz v6, :cond_c

    .line 327
    .line 328
    if-eqz v8, :cond_7

    .line 329
    .line 330
    iget-object v6, v8, Ldefpackage/rb0;->e:Ldefpackage/vb0;

    .line 331
    .line 332
    invoke-static {p2}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    .line 333
    .line 334
    .line 335
    move-result-object v9

    .line 336
    invoke-virtual {v6, p1, v9}, Ldefpackage/vb0;->a(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 337
    .line 338
    .line 339
    goto/16 :goto_6

    .line 340
    .line 341
    :cond_7
    new-instance p1, Ljava/lang/RuntimeException;

    .line 342
    .line 343
    new-instance v2, Ljava/lang/StringBuilder;

    .line 344
    .line 345
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 346
    .line 347
    .line 348
    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 349
    .line 350
    .line 351
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getLineNumber()I

    .line 352
    .line 353
    .line 354
    move-result p2

    .line 355
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 356
    .line 357
    .line 358
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 359
    .line 360
    .line 361
    move-result-object p2

    .line 362
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 363
    .line 364
    .line 365
    throw p1

    .line 366
    :sswitch_a
    const-string v9, "PropertySet"

    .line 367
    .line 368
    invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 369
    .line 370
    .line 371
    move-result v6

    .line 372
    if-eqz v6, :cond_c

    .line 373
    .line 374
    if-eqz v8, :cond_8

    .line 375
    .line 376
    iget-object v6, v8, Ldefpackage/rb0;->b:Ldefpackage/ub0;

    .line 377
    .line 378
    invoke-static {p2}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    .line 379
    .line 380
    .line 381
    move-result-object v9

    .line 382
    invoke-virtual {v6, p1, v9}, Ldefpackage/ub0;->a(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 383
    .line 384
    .line 385
    goto/16 :goto_6

    .line 386
    .line 387
    :cond_8
    new-instance p1, Ljava/lang/RuntimeException;

    .line 388
    .line 389
    new-instance v2, Ljava/lang/StringBuilder;

    .line 390
    .line 391
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 392
    .line 393
    .line 394
    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 395
    .line 396
    .line 397
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getLineNumber()I

    .line 398
    .line 399
    .line 400
    move-result p2

    .line 401
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 402
    .line 403
    .line 404
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 405
    .line 406
    .line 407
    move-result-object p2

    .line 408
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 409
    .line 410
    .line 411
    throw p1

    .line 412
    :sswitch_b
    const-string v9, "ConstraintOverride"

    .line 413
    .line 414
    invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 415
    .line 416
    .line 417
    move-result v6

    .line 418
    if-eqz v6, :cond_c

    .line 419
    .line 420
    invoke-static {p2}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    .line 421
    .line 422
    .line 423
    move-result-object v6

    .line 424
    invoke-static {p1, v6, v4}, Ldefpackage/wb0;->e(Landroid/content/Context;Landroid/util/AttributeSet;Z)Ldefpackage/rb0;

    .line 425
    .line 426
    .line 427
    move-result-object v8

    .line 428
    goto :goto_6

    .line 429
    :sswitch_c
    const-string v9, "Motion"

    .line 430
    .line 431
    invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 432
    .line 433
    .line 434
    move-result v6

    .line 435
    if-eqz v6, :cond_c

    .line 436
    .line 437
    if-eqz v8, :cond_9

    .line 438
    .line 439
    iget-object v6, v8, Ldefpackage/rb0;->c:Ldefpackage/tb0;

    .line 440
    .line 441
    invoke-static {p2}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    .line 442
    .line 443
    .line 444
    move-result-object v9

    .line 445
    invoke-virtual {v6, p1, v9}, Ldefpackage/tb0;->a(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 446
    .line 447
    .line 448
    goto :goto_6

    .line 449
    :cond_9
    new-instance p1, Ljava/lang/RuntimeException;

    .line 450
    .line 451
    new-instance v2, Ljava/lang/StringBuilder;

    .line 452
    .line 453
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 454
    .line 455
    .line 456
    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 457
    .line 458
    .line 459
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getLineNumber()I

    .line 460
    .line 461
    .line 462
    move-result p2

    .line 463
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 464
    .line 465
    .line 466
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 467
    .line 468
    .line 469
    move-result-object p2

    .line 470
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 471
    .line 472
    .line 473
    throw p1

    .line 474
    :sswitch_d
    const-string v9, "Layout"

    .line 475
    .line 476
    invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 477
    .line 478
    .line 479
    move-result v6

    .line 480
    if-eqz v6, :cond_c

    .line 481
    .line 482
    if-eqz v8, :cond_a

    .line 483
    .line 484
    iget-object v6, v8, Ldefpackage/rb0;->d:Ldefpackage/sb0;

    .line 485
    .line 486
    invoke-static {p2}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    .line 487
    .line 488
    .line 489
    move-result-object v9

    .line 490
    invoke-virtual {v6, p1, v9}, Ldefpackage/sb0;->a(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 491
    .line 492
    .line 493
    goto :goto_6

    .line 494
    :cond_a
    new-instance p1, Ljava/lang/RuntimeException;

    .line 495
    .line 496
    new-instance v2, Ljava/lang/StringBuilder;

    .line 497
    .line 498
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 499
    .line 500
    .line 501
    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 502
    .line 503
    .line 504
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getLineNumber()I

    .line 505
    .line 506
    .line 507
    move-result p2

    .line 508
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 509
    .line 510
    .line 511
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 512
    .line 513
    .line 514
    move-result-object p2

    .line 515
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 516
    .line 517
    .line 518
    throw p1

    .line 519
    :cond_b
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 520
    .line 521
    .line 522
    :cond_c
    :goto_6
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 523
    .line 524
    .line 525
    move-result v6
    :try_end_1
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 526
    goto/16 :goto_3

    .line 527
    .line 528
    :goto_7
    invoke-static {v5, v3, p1}, Landroid/util/Ldefpackage/og;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 529
    .line 530
    .line 531
    goto :goto_9

    .line 532
    :goto_8
    invoke-static {v5, v3, p1}, Landroid/util/Ldefpackage/og;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 533
    .line 534
    .line 535
    :cond_d
    :goto_9
    iget-object p0, p0, Ldefpackage/rm3;->o:Ljava/lang/Object;

    .line 536
    .line 537
    check-cast p0, Landroid/util/SparseArray;

    .line 538
    .line 539
    invoke-virtual {p0, v1, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 540
    .line 541
    .line 542
    return-void

    .line 543
    :cond_e
    :goto_a
    add-int/lit8 v3, v3, 0x1

    .line 544
    .line 545
    goto/16 :goto_0

    .line 546
    .line 547
    :cond_f
    return-void

    .line 548
    nop

    .line 549
    :sswitch_data_0
    .sparse-switch
        -0x7bb8f310 -> :sswitch_3
        -0xb58ea23 -> :sswitch_2
        0x196d04a9 -> :sswitch_1
        0x7feafd65 -> :sswitch_0
    .end sparse-switch

    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    :sswitch_data_1
    .sparse-switch
        -0x78c018b6 -> :sswitch_d
        -0x7648542a -> :sswitch_c
        -0x74f4db17 -> :sswitch_b
        -0x4bab3dd3 -> :sswitch_a
        -0x49cf74b4 -> :sswitch_9
        -0x446d330 -> :sswitch_8
        0x15d883d2 -> :sswitch_7
        0x4f5d3b97 -> :sswitch_6
        0x6acd460b -> :sswitch_5
        0x6b78f1fd -> :sswitch_4
    .end sparse-switch
.end method

.method public K(Ldefpackage/cx3;I)Ldefpackage/n50;
    .locals 4

    .line 1
    iget-object p0, p0, Ldefpackage/rm3;->n:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ldefpackage/yd4;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Ldefpackage/yd4;->d(Ljava/lang/Object;)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    const/4 v0, 0x0

    .line 10
    if-gez p1, :cond_0

    .line 11
    .line 12
    goto :goto_1

    .line 13
    :cond_0
    invoke-virtual {p0, p1}, Ldefpackage/yd4;->j(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Ldefpackage/r65;

    .line 18
    .line 19
    if-eqz v1, :cond_4

    .line 20
    .line 21
    iget v2, v1, Ldefpackage/r65;->a:I

    .line 22
    .line 23
    and-int v3, v2, p2

    .line 24
    .line 25
    if-eqz v3, :cond_4

    .line 26
    .line 27
    not-int v3, p2

    .line 28
    and-int/2addr v2, v3

    .line 29
    iput v2, v1, Ldefpackage/r65;->a:I

    .line 30
    .line 31
    const/4 v3, 0x4

    .line 32
    if-ne p2, v3, :cond_1

    .line 33
    .line 34
    iget-object p2, v1, Ldefpackage/r65;->b:Ldefpackage/n50;

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    const/16 v3, 0x8

    .line 38
    .line 39
    if-ne p2, v3, :cond_3

    .line 40
    .line 41
    iget-object p2, v1, Ldefpackage/r65;->c:Ldefpackage/n50;

    .line 42
    .line 43
    :goto_0
    and-int/lit8 v2, v2, 0xc

    .line 44
    .line 45
    if-nez v2, :cond_2

    .line 46
    .line 47
    invoke-virtual {p0, p1}, Ldefpackage/yd4;->h(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    const/4 p0, 0x0

    .line 51
    iput p0, v1, Ldefpackage/r65;->a:I

    .line 52
    .line 53
    iput-object v0, v1, Ldefpackage/r65;->b:Ldefpackage/n50;

    .line 54
    .line 55
    iput-object v0, v1, Ldefpackage/r65;->c:Ldefpackage/n50;

    .line 56
    .line 57
    sget-object p0, Ldefpackage/r65;->d:Ldefpackage/jo3;

    .line 58
    .line 59
    invoke-virtual {p0, v1}, Ldefpackage/jo3;->a(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    :cond_2
    return-object p2

    .line 63
    :cond_3
    const-string p0, "Must provide flag PRE or POST"

    .line 64
    .line 65
    invoke-static {p0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    :cond_4
    :goto_1
    return-object v0
.end method

.method public L(Ljava/lang/String;Ldefpackage/i54;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Ldefpackage/rm3;->n:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p0, Ldefpackage/xm2;

    .line 7
    .line 8
    iget-object v0, p0, Ldefpackage/xm2;->f:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Ldefpackage/xi4;

    .line 11
    .line 12
    monitor-enter v0

    .line 13
    :try_start_0
    iget-object v1, p0, Ldefpackage/xm2;->g:Ljava/io/Serializable;

    .line 14
    .line 15
    check-cast v1, Ljava/util/LinkedHashMap;

    .line 16
    .line 17
    invoke-interface {v1, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_0

    .line 22
    .line 23
    iget-object p0, p0, Ldefpackage/xm2;->g:Ljava/io/Serializable;

    .line 24
    .line 25
    check-cast p0, Ljava/util/LinkedHashMap;

    .line 26
    .line 27
    invoke-interface {p0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    .line 29
    .line 30
    monitor-exit v0

    .line 31
    return-void

    .line 32
    :catchall_0
    move-exception p0

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    :try_start_1
    const-string p0, "SavedStateProvider with the given key is already registered"

    .line 35
    .line 36
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 37
    .line 38
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 42
    :goto_0
    monitor-exit v0

    .line 43
    throw p0
.end method

.method public M(Ljava/lang/String;)V
    .locals 5

    .line 1
    const-string v0, "Removed the wrong lock, expected to remove: "

    .line 2
    .line 3
    const-string v1, "Cannot release a lock that is not held, safeKey: "

    .line 4
    .line 5
    monitor-enter p0

    .line 6
    :try_start_0
    iget-object v2, p0, Ldefpackage/rm3;->n:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v2, Ljava/util/HashMap;

    .line 9
    .line 10
    invoke-virtual {v2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    const-string v3, "Argument must not be null"

    .line 15
    .line 16
    invoke-static {v2, v3}, Ldefpackage/h12;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    check-cast v2, Ldefpackage/yq0;

    .line 20
    .line 21
    iget v3, v2, Ldefpackage/yq0;->b:I

    .line 22
    .line 23
    const/4 v4, 0x1

    .line 24
    if-lt v3, v4, :cond_3

    .line 25
    .line 26
    sub-int/2addr v3, v4

    .line 27
    iput v3, v2, Ldefpackage/yq0;->b:I

    .line 28
    .line 29
    if-nez v3, :cond_2

    .line 30
    .line 31
    iget-object v1, p0, Ldefpackage/rm3;->n:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v1, Ljava/util/HashMap;

    .line 34
    .line 35
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    check-cast v1, Ldefpackage/yq0;

    .line 40
    .line 41
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-eqz v3, :cond_1

    .line 46
    .line 47
    iget-object p1, p0, Ldefpackage/rm3;->o:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p1, Ldefpackage/zg5;

    .line 50
    .line 51
    iget-object v0, p1, Ldefpackage/zg5;->n:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v0, Ljava/util/ArrayDeque;

    .line 54
    .line 55
    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 56
    :try_start_1
    iget-object v3, p1, Ldefpackage/zg5;->n:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v3, Ljava/util/ArrayDeque;

    .line 59
    .line 60
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->size()I

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    const/16 v4, 0xa

    .line 65
    .line 66
    if-ge v3, v4, :cond_0

    .line 67
    .line 68
    iget-object p1, p1, Ldefpackage/zg5;->n:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast p1, Ljava/util/ArrayDeque;

    .line 71
    .line 72
    invoke-virtual {p1, v1}, Ljava/util/ArrayDeque;->offer(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :catchall_0
    move-exception p1

    .line 77
    goto :goto_1

    .line 78
    :cond_0
    :goto_0
    monitor-exit v0

    .line 79
    goto :goto_2

    .line 80
    :goto_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 81
    :try_start_2
    throw p1

    .line 82
    :cond_1
    new-instance v3, Ljava/lang/IllegalStateException;

    .line 83
    .line 84
    new-instance v4, Ljava/lang/StringBuilder;

    .line 85
    .line 86
    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    const-string v0, ", but actually removed: "

    .line 93
    .line 94
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    const-string v0, ", safeKey: "

    .line 101
    .line 102
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    invoke-direct {v3, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    throw v3

    .line 116
    :catchall_1
    move-exception p1

    .line 117
    goto :goto_3

    .line 118
    :cond_2
    :goto_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 119
    iget-object p0, v2, Ldefpackage/yq0;->a:Ljava/util/concurrent/locks/ReentrantLock;

    .line 120
    .line 121
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 122
    .line 123
    .line 124
    return-void

    .line 125
    :cond_3
    :try_start_3
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 126
    .line 127
    new-instance v3, Ljava/lang/StringBuilder;

    .line 128
    .line 129
    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    const-string p1, ", interestedThreads: "

    .line 136
    .line 137
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    iget p1, v2, Ldefpackage/yq0;->b:I

    .line 141
    .line 142
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    throw v0

    .line 153
    :goto_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 154
    throw p1
.end method

.method public N(Ldefpackage/cx3;)V
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/rm3;->n:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ldefpackage/yd4;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Ldefpackage/yd4;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Ldefpackage/r65;

    .line 10
    .line 11
    if-nez p0, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget p1, p0, Ldefpackage/r65;->a:I

    .line 15
    .line 16
    and-int/lit8 p1, p1, -0x2

    .line 17
    .line 18
    iput p1, p0, Ldefpackage/r65;->a:I

    .line 19
    .line 20
    return-void
.end method

.method public O(Ldefpackage/cx3;)V
    .locals 6

    .line 1
    iget-object v0, p0, Ldefpackage/rm3;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ldefpackage/xe2;

    .line 4
    .line 5
    invoke-virtual {v0}, Ldefpackage/xe2;->h()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x1

    .line 10
    sub-int/2addr v1, v2

    .line 11
    :goto_0
    if-ltz v1, :cond_1

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ldefpackage/xe2;->i(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    if-ne p1, v3, :cond_0

    .line 18
    .line 19
    iget-object v3, v0, Ldefpackage/xe2;->p:[Ljava/lang/Object;

    .line 20
    .line 21
    aget-object v4, v3, v1

    .line 22
    .line 23
    sget-object v5, Ldefpackage/ud3;->b:Ljava/lang/Object;

    .line 24
    .line 25
    if-eq v4, v5, :cond_1

    .line 26
    .line 27
    aput-object v5, v3, v1

    .line 28
    .line 29
    iput-boolean v2, v0, Ldefpackage/xe2;->n:Z

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_0
    add-int/lit8 v1, v1, -0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    :goto_1
    iget-object p0, p0, Ldefpackage/rm3;->n:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p0, Ldefpackage/yd4;

    .line 38
    .line 39
    invoke-virtual {p0, p1}, Ldefpackage/yd4;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    check-cast p0, Ldefpackage/r65;

    .line 44
    .line 45
    if-eqz p0, :cond_2

    .line 46
    .line 47
    const/4 p1, 0x0

    .line 48
    iput p1, p0, Ldefpackage/r65;->a:I

    .line 49
    .line 50
    const/4 p1, 0x0

    .line 51
    iput-object p1, p0, Ldefpackage/r65;->b:Ldefpackage/n50;

    .line 52
    .line 53
    iput-object p1, p0, Ldefpackage/r65;->c:Ldefpackage/n50;

    .line 54
    .line 55
    sget-object p1, Ldefpackage/r65;->d:Ldefpackage/jo3;

    .line 56
    .line 57
    invoke-virtual {p1, p0}, Ldefpackage/jo3;->a(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    :cond_2
    return-void
.end method

.method public P()V
    .locals 4

    .line 1
    const-class v0, Ldefpackage/g92;

    .line 2
    .line 3
    iget-object v1, p0, Ldefpackage/rm3;->n:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Ldefpackage/xm2;

    .line 6
    .line 7
    iget-boolean v1, v1, Ldefpackage/xm2;->c:Z

    .line 8
    .line 9
    if-eqz v1, :cond_2

    .line 10
    .line 11
    iget-object v1, p0, Ldefpackage/rm3;->o:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, Ldefpackage/bf;

    .line 14
    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    new-instance v1, Ldefpackage/bf;

    .line 18
    .line 19
    invoke-direct {v1, p0}, Ldefpackage/bf;-><init>(Ldefpackage/rm3;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    iput-object v1, p0, Ldefpackage/rm3;->o:Ljava/lang/Object;

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    :try_start_0
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 26
    .line 27
    .line 28
    iget-object p0, p0, Ldefpackage/rm3;->o:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p0, Ldefpackage/bf;

    .line 31
    .line 32
    if-eqz p0, :cond_1

    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    iget-object p0, p0, Ldefpackage/bf;->b:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p0, Ljava/util/LinkedHashSet;

    .line 41
    .line 42
    invoke-interface {p0, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    :cond_1
    return-void

    .line 46
    :catch_0
    move-exception p0

    .line 47
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    new-instance v2, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    const-string v3, "Class "

    .line 56
    .line 57
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v0, " must have default constructor in order to be automatically recreated"

    .line 64
    .line 65
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-direct {v1, v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 73
    .line 74
    .line 75
    throw v1

    .line 76
    :cond_2
    const-string p0, "Can not perform this action after onSaveInstanceState"

    .line 77
    .line 78
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    return-void
.end method

.method public Q(Ldefpackage/gl4;Ldefpackage/z45;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ldefpackage/rm3;->o:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Ldefpackage/bq4;

    .line 7
    .line 8
    new-instance v1, Ldefpackage/qo2;

    .line 9
    .line 10
    const/16 v2, 0x15

    .line 11
    .line 12
    invoke-direct {v1, p0, p1, p2, v2}, Ldefpackage/qo2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ldefpackage/bq4;->h(Ljava/lang/Runnable;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public R(Ldefpackage/gl4;I)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ldefpackage/rm3;->o:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Ldefpackage/bq4;

    .line 7
    .line 8
    new-instance v1, Ldefpackage/am4;

    .line 9
    .line 10
    iget-object p0, p0, Ldefpackage/rm3;->n:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Ldefpackage/pq3;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    invoke-direct {v1, p0, p1, v2, p2}, Ldefpackage/am4;-><init>(Ldefpackage/pq3;Ldefpackage/gl4;ZI)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ldefpackage/bq4;->h(Ljava/lang/Runnable;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public S(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/ArrayList;Ljava/util/ArrayList;)Lretrofit2/Call;
    .locals 8

    .line 1
    const-string v0, "BrowsingClient"

    .line 2
    .line 3
    const-string v1, "updatePlaylist()"

    .line 4
    .line 5
    invoke-static {v0, v1}, Landroid/util/Ldefpackage/og;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Ldefpackage/rm3;->o:Ljava/lang/Object;

    .line 9
    .line 10
    move-object v1, v0

    .line 11
    check-cast v1, Ldefpackage/qm3;

    .line 12
    .line 13
    iget-object p0, p0, Ldefpackage/rm3;->n:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, Ldefpackage/pn4;

    .line 16
    .line 17
    invoke-virtual {p0}, Ldefpackage/pn4;->f()Ljava/util/HashMap;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    move-object v3, p1

    .line 22
    move-object v4, p2

    .line 23
    move-object v5, p3

    .line 24
    move-object v6, p4

    .line 25
    move-object v7, p5

    .line 26
    invoke-interface/range {v1 .. v7}, Ldefpackage/qm3;->b(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/ArrayList;Ljava/util/ArrayList;)Lretrofit2/Call;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0
.end method

.method public a()V
    .locals 4

    .line 1
    iget-object v0, p0, Ldefpackage/rm3;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ldefpackage/ns3;

    .line 4
    .line 5
    iget-object p0, p0, Ldefpackage/rm3;->n:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Landroid/media/MediaCodec;

    .line 8
    .line 9
    const/16 v1, 0x23

    .line 10
    .line 11
    :try_start_0
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 12
    .line 13
    const/16 v3, 0x1e

    .line 14
    .line 15
    if-lt v2, v3, :cond_0

    .line 16
    .line 17
    const/16 v3, 0x21

    .line 18
    .line 19
    if-ge v2, v3, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/media/MediaCodec;->stop()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-exception v2

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    :goto_0
    if-lt v2, v1, :cond_1

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    invoke-virtual {v0, p0}, Ldefpackage/ns3;->e(Landroid/media/MediaCodec;)V

    .line 32
    .line 33
    .line 34
    :cond_1
    invoke-virtual {p0}, Landroid/media/MediaCodec;->release()V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :goto_1
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 39
    .line 40
    if-lt v3, v1, :cond_2

    .line 41
    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    invoke-virtual {v0, p0}, Ldefpackage/ns3;->e(Landroid/media/MediaCodec;)V

    .line 45
    .line 46
    .line 47
    :cond_2
    invoke-virtual {p0}, Landroid/media/MediaCodec;->release()V

    .line 48
    .line 49
    .line 50
    throw v2
.end method

.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/rm3;->n:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ldefpackage/hg3;

    .line 4
    .line 5
    iget-object p0, p0, Ldefpackage/hg3;->o:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Ldefpackage/eg1;

    .line 8
    .line 9
    invoke-interface {p0, p1}, Ldefpackage/eg1;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public b()I
    .locals 4

    .line 1
    iget-object v0, p0, Ldefpackage/rm3;->n:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ldefpackage/hg3;

    .line 4
    .line 5
    iget-object v0, v0, Ldefpackage/hg3;->o:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;

    .line 8
    .line 9
    iget-object p0, p0, Ldefpackage/rm3;->o:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;

    .line 12
    .line 13
    iget v1, p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->U:I

    .line 14
    .line 15
    const/4 v2, -0x1

    .line 16
    const/4 v3, -0x2

    .line 17
    if-ne v1, v2, :cond_3

    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    instance-of v1, v1, Landroid/view/View;

    .line 24
    .line 25
    if-nez v1, :cond_0

    .line 26
    .line 27
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    return p0

    .line 32
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    check-cast v1, Landroid/view/View;

    .line 37
    .line 38
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    if-eqz v2, :cond_1

    .line 43
    .line 44
    iget v2, v2, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 45
    .line 46
    if-ne v2, v3, :cond_1

    .line 47
    .line 48
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    return p0

    .line 53
    :cond_1
    invoke-virtual {v1}, Landroid/view/View;->getPaddingTop()I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    invoke-virtual {v1}, Landroid/view/View;->getPaddingBottom()I

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    add-int/2addr v2, v0

    .line 62
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    instance-of v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 67
    .line 68
    if-eqz v0, :cond_2

    .line 69
    .line 70
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    check-cast p0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 75
    .line 76
    if-eqz p0, :cond_2

    .line 77
    .line 78
    iget v0, p0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 79
    .line 80
    iget p0, p0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 81
    .line 82
    add-int/2addr v0, p0

    .line 83
    goto :goto_0

    .line 84
    :cond_2
    const/4 v0, 0x0

    .line 85
    :goto_0
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    .line 86
    .line 87
    .line 88
    move-result p0

    .line 89
    sub-int/2addr p0, v0

    .line 90
    sub-int/2addr p0, v2

    .line 91
    return p0

    .line 92
    :cond_3
    if-eqz v1, :cond_5

    .line 93
    .line 94
    if-ne v1, v3, :cond_4

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_4
    return v1

    .line 98
    :cond_5
    :goto_1
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    .line 99
    .line 100
    .line 101
    move-result p0

    .line 102
    return p0
.end method

.method public c(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/rm3;->n:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/media/MediaCodec;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Landroid/media/MediaCodec;->setParameters(Landroid/os/Bundle;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public d()I
    .locals 4

    .line 1
    iget-object v0, p0, Ldefpackage/rm3;->n:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ldefpackage/hg3;

    .line 4
    .line 5
    iget-object p0, p0, Ldefpackage/rm3;->o:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    instance-of v1, v1, Landroid/view/View;

    .line 14
    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0}, Ldefpackage/hg3;->d()I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    return p0

    .line 22
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, Landroid/view/View;

    .line 27
    .line 28
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    if-eqz v2, :cond_1

    .line 33
    .line 34
    iget v2, v2, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 35
    .line 36
    const/4 v3, -0x2

    .line 37
    if-ne v2, v3, :cond_1

    .line 38
    .line 39
    invoke-virtual {v0}, Ldefpackage/hg3;->d()I

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    return p0

    .line 44
    :cond_1
    invoke-virtual {v1}, Landroid/view/View;->getPaddingLeft()I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    invoke-virtual {v1}, Landroid/view/View;->getPaddingRight()I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    add-int/2addr v2, v0

    .line 53
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    instance-of v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 58
    .line 59
    if-eqz v0, :cond_2

    .line 60
    .line 61
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    check-cast p0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 66
    .line 67
    if-eqz p0, :cond_2

    .line 68
    .line 69
    iget v0, p0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 70
    .line 71
    iget p0, p0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 72
    .line 73
    add-int/2addr v0, p0

    .line 74
    goto :goto_0

    .line 75
    :cond_2
    const/4 v0, 0x0

    .line 76
    :goto_0
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    .line 77
    .line 78
    .line 79
    move-result p0

    .line 80
    sub-int/2addr p0, v0

    .line 81
    sub-int/2addr p0, v2

    .line 82
    return p0
.end method

.method public e(ILdefpackage/fg0;JI)V
    .locals 7

    .line 1
    iget-object p0, p0, Ldefpackage/rm3;->n:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v0, p0

    .line 4
    check-cast v0, Landroid/media/MediaCodec;

    .line 5
    .line 6
    iget-object v3, p2, Ldefpackage/fg0;->i:Landroid/media/MediaCodec$CryptoInfo;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    move v1, p1

    .line 10
    move-wide v4, p3

    .line 11
    move v6, p5

    .line 12
    invoke-virtual/range {v0 .. v6}, Landroid/media/MediaCodec;->queueSecureInputBuffer(IILandroid/media/MediaCodec$CryptoInfo;JI)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public f(IIIJ)V
    .locals 7

    .line 1
    iget-object p0, p0, Ldefpackage/rm3;->n:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v0, p0

    .line 4
    check-cast v0, Landroid/media/MediaCodec;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    move v1, p1

    .line 8
    move v3, p2

    .line 9
    move v6, p3

    .line 10
    move-wide v4, p4

    .line 11
    invoke-virtual/range {v0 .. v6}, Landroid/media/MediaCodec;->queueInputBuffer(IIIJI)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public flush()V
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/rm3;->n:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/media/MediaCodec;

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/media/MediaCodec;->flush()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public g(I)V
    .locals 1

    .line 1
    iget-object p0, p0, Ldefpackage/rm3;->n:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/media/MediaCodec;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-virtual {p0, p1, v0}, Landroid/media/MediaCodec;->releaseOutputBuffer(IZ)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public h()Landroid/media/MediaFormat;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/rm3;->n:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/media/MediaCodec;

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/media/MediaCodec;->getOutputFormat()Landroid/media/MediaFormat;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public i()V
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/rm3;->n:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/media/MediaCodec;

    .line 4
    .line 5
    invoke-static {p0}, Ldefpackage/vk;->k(Landroid/media/MediaCodec;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public j()I
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/rm3;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;

    .line 4
    .line 5
    iget p0, p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->N:I

    .line 6
    .line 7
    return p0
.end method

.method public l(IJ)V
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/rm3;->n:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/media/MediaCodec;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2, p3}, Landroid/media/MediaCodec;->releaseOutputBuffer(IJ)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public m()I
    .locals 2

    .line 1
    iget-object p0, p0, Ldefpackage/rm3;->n:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/media/MediaCodec;

    .line 4
    .line 5
    const-wide/16 v0, 0x0

    .line 6
    .line 7
    invoke-virtual {p0, v0, v1}, Landroid/media/MediaCodec;->dequeueInputBuffer(J)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public n(Landroid/media/MediaCodec$BufferInfo;)I
    .locals 3

    .line 1
    :cond_0
    iget-object v0, p0, Ldefpackage/rm3;->n:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/media/MediaCodec;

    .line 4
    .line 5
    const-wide/16 v1, 0x0

    .line 6
    .line 7
    invoke-virtual {v0, p1, v1, v2}, Landroid/media/MediaCodec;->dequeueOutputBuffer(Landroid/media/MediaCodec$BufferInfo;J)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, -0x3

    .line 12
    if-eq v0, v1, :cond_0

    .line 13
    .line 14
    return v0
.end method

.method public o()Landroid/view/ViewGroup$LayoutParams;
    .locals 2

    .line 1
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/rm3;->o:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;

    .line 6
    .line 7
    iget p0, p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->U:I

    .line 8
    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    const/4 p0, -0x2

    .line 12
    :cond_0
    const/4 v1, -0x1

    .line 13
    invoke-direct {v0, v1, p0}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public onQueryTextChange(Ljava/lang/String;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/rm3;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/AlbumListPageFragment;

    .line 4
    .line 5
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumListPageFragment;->o0:Ldefpackage/b8;

    .line 6
    .line 7
    iget-object p0, p0, Ldefpackage/b8;->v:Landroid/widget/Filter;

    .line 8
    .line 9
    check-cast p0, Ldefpackage/o7;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Landroid/widget/Filter;->filter(Ljava/lang/CharSequence;)V

    .line 12
    .line 13
    .line 14
    const/4 p0, 0x0

    .line 15
    return p0
.end method

.method public onQueryTextSubmit(Ljava/lang/String;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/rm3;->n:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroidx/appcompat/widget/SearchView;

    .line 4
    .line 5
    invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->clearFocus()V

    .line 6
    .line 7
    .line 8
    const/4 p0, 0x0

    .line 9
    return p0
.end method

.method public p(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/rm3;->n:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/media/MediaCodec;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Landroid/media/MediaCodec;->setVideoScalingMode(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public q(I)Ljava/nio/ByteBuffer;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/rm3;->n:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/media/MediaCodec;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Landroid/media/MediaCodec;->getInputBuffer(I)Ljava/nio/ByteBuffer;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public r(Landroid/view/Surface;)V
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/rm3;->n:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/media/MediaCodec;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Landroid/media/MediaCodec;->setOutputSurface(Landroid/view/Surface;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public s()I
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/rm3;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;

    .line 4
    .line 5
    iget p0, p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->M:I

    .line 6
    .line 7
    return p0
.end method

.method public t(I)Ljava/nio/ByteBuffer;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/rm3;->n:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/media/MediaCodec;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Landroid/media/MediaCodec;->getOutputBuffer(I)Ljava/nio/ByteBuffer;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public u(Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/rm3;->n:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/media/MediaCodec;

    .line 4
    .line 5
    invoke-static {p0, p1}, Ldefpackage/go2;->B(Landroid/media/MediaCodec;Ljava/util/ArrayList;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public v(Ldefpackage/nk2;Landroid/os/Handler;)V
    .locals 3

    .line 1
    iget-object v0, p0, Ldefpackage/rm3;->n:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/media/MediaCodec;

    .line 4
    .line 5
    new-instance v1, Ldefpackage/wk;

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-direct {v1, p0, p1, v2}, Ldefpackage/wk;-><init>(Ldefpackage/ak2;Ldefpackage/nk2;I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1, p2}, Landroid/media/MediaCodec;->setOnFrameRenderedListener(Landroid/media/MediaCodec$OnFrameRenderedListener;Landroid/os/Handler;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public x(Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/rm3;->n:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/media/MediaCodec;

    .line 4
    .line 5
    invoke-static {p0, p1}, Ldefpackage/go2;->l(Landroid/media/MediaCodec;Ljava/util/ArrayList;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public y(Ldefpackage/cx3;Ldefpackage/n50;)V
    .locals 1

    .line 1
    iget-object p0, p0, Ldefpackage/rm3;->n:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ldefpackage/yd4;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Ldefpackage/yd4;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ldefpackage/r65;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-static {}, Ldefpackage/r65;->a()Ldefpackage/r65;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {p0, p1, v0}, Ldefpackage/yd4;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    :cond_0
    iput-object p2, v0, Ldefpackage/r65;->c:Ldefpackage/n50;

    .line 21
    .line 22
    iget p0, v0, Ldefpackage/r65;->a:I

    .line 23
    .line 24
    or-int/lit8 p0, p0, 0x8

    .line 25
    .line 26
    iput p0, v0, Ldefpackage/r65;->a:I

    .line 27
    .line 28
    return-void
.end method

.method public z()V
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/rm3;->n:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/LinkedHashSet;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->clear()V

    .line 13
    .line 14
    .line 15
    iget-object p0, p0, Ldefpackage/rm3;->o:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p0, Ldefpackage/vo1;

    .line 18
    .line 19
    if-eqz p0, :cond_1

    .line 20
    .line 21
    invoke-virtual {p0}, Ldefpackage/vo1;->invoke()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    :cond_1
    :goto_0
    return-void
.end method

.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
