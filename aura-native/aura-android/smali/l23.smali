.class public final Ll23;
.super Lq42;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lgf1;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ln23;


# direct methods
.method public synthetic constructor <init>(Ln23;I)V
    .locals 0

    .line 1
    iput p2, p0, Ll23;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Ll23;->o:Ln23;

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-direct {p0, p1}, Lq42;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 15

    .line 1
    iget v0, p0, Ll23;->n:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x1

    .line 6
    const/4 v4, 0x0

    .line 7
    iget-object p0, p0, Ll23;->o:Ln23;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Ln23;->a:Ljava/lang/String;

    .line 13
    .line 14
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 15
    .line 16
    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 17
    .line 18
    .line 19
    iget-object v5, p0, Ln23;->g:Lrp4;

    .line 20
    .line 21
    invoke-virtual {v5}, Lrp4;->getValue()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    check-cast v5, Ljava/lang/Boolean;

    .line 26
    .line 27
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    if-nez v5, :cond_0

    .line 32
    .line 33
    goto/16 :goto_2

    .line 34
    .line 35
    :cond_0
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    invoke-virtual {v5}, Landroid/net/Uri;->getQueryParameterNames()Ljava/util/Set;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 44
    .line 45
    .line 46
    move-result-object v6

    .line 47
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v7

    .line 51
    if-eqz v7, :cond_5

    .line 52
    .line 53
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v7

    .line 57
    check-cast v7, Ljava/lang/String;

    .line 58
    .line 59
    new-instance v8, Ljava/lang/StringBuilder;

    .line 60
    .line 61
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v5, v7}, Landroid/net/Uri;->getQueryParameters(Ljava/lang/String;)Ljava/util/List;

    .line 65
    .line 66
    .line 67
    move-result-object v9

    .line 68
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 69
    .line 70
    .line 71
    move-result v10

    .line 72
    if-gt v10, v3, :cond_4

    .line 73
    .line 74
    invoke-static {v9}, Lq40;->x0(Ljava/util/List;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v9

    .line 78
    check-cast v9, Ljava/lang/String;

    .line 79
    .line 80
    if-nez v9, :cond_1

    .line 81
    .line 82
    iput-boolean v3, p0, Ln23;->i:Z

    .line 83
    .line 84
    move-object v9, v7

    .line 85
    :cond_1
    sget-object v10, Ln23;->r:Ljava/util/regex/Pattern;

    .line 86
    .line 87
    invoke-virtual {v10, v9}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 88
    .line 89
    .line 90
    move-result-object v10

    .line 91
    new-instance v11, Lk23;

    .line 92
    .line 93
    invoke-direct {v11}, Lk23;-><init>()V

    .line 94
    .line 95
    .line 96
    move v12, v2

    .line 97
    :goto_1
    invoke-virtual {v10}, Ljava/util/regex/Matcher;->find()Z

    .line 98
    .line 99
    .line 100
    move-result v13

    .line 101
    if-eqz v13, :cond_2

    .line 102
    .line 103
    invoke-virtual {v10, v3}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v13

    .line 107
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    iget-object v14, v11, Lk23;->b:Ljava/util/ArrayList;

    .line 111
    .line 112
    invoke-virtual {v14, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v10}, Ljava/util/regex/Matcher;->start()I

    .line 119
    .line 120
    .line 121
    move-result v13

    .line 122
    invoke-virtual {v9, v12, v13}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v12

    .line 126
    invoke-static {v12}, Ljava/util/regex/Pattern;->quote(Ljava/lang/String;)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v12

    .line 130
    invoke-virtual {v8, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    const-string v12, "(.+?)?"

    .line 134
    .line 135
    invoke-virtual {v8, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v10}, Ljava/util/regex/Matcher;->end()I

    .line 139
    .line 140
    .line 141
    move-result v12

    .line 142
    goto :goto_1

    .line 143
    :cond_2
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 144
    .line 145
    .line 146
    move-result v10

    .line 147
    if-ge v12, v10, :cond_3

    .line 148
    .line 149
    invoke-virtual {v9, v12}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v9

    .line 153
    invoke-static {v9}, Ljava/util/regex/Pattern;->quote(Ljava/lang/String;)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v9

    .line 157
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    :cond_3
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v8

    .line 164
    const-string v9, ".*"

    .line 165
    .line 166
    const-string v10, "\\E.*\\Q"

    .line 167
    .line 168
    invoke-static {v8, v9, v10}, Lxm4;->i0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v8

    .line 172
    iput-object v8, v11, Lk23;->a:Ljava/lang/String;

    .line 173
    .line 174
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    invoke-interface {v1, v7, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    goto/16 :goto_0

    .line 181
    .line 182
    :cond_4
    const-string p0, " must only be present once in "

    .line 183
    .line 184
    const-string v1, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."

    .line 185
    .line 186
    const-string v2, "Query parameter "

    .line 187
    .line 188
    invoke-static {v2, v7, p0, v0, v1}, Lf34;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object p0

    .line 192
    invoke-static {p0}, Lkf2;->e(Ljava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    goto :goto_3

    .line 196
    :cond_5
    :goto_2
    move-object v4, v1

    .line 197
    :goto_3
    return-object v4

    .line 198
    :pswitch_0
    iget-object p0, p0, Ln23;->e:Ljava/lang/String;

    .line 199
    .line 200
    if-eqz p0, :cond_6

    .line 201
    .line 202
    invoke-static {p0, v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    .line 203
    .line 204
    .line 205
    move-result-object v4

    .line 206
    :cond_6
    return-object v4

    .line 207
    :pswitch_1
    iget-object p0, p0, Ln23;->n:Ljava/lang/String;

    .line 208
    .line 209
    if-eqz p0, :cond_7

    .line 210
    .line 211
    invoke-static {p0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 212
    .line 213
    .line 214
    move-result-object v4

    .line 215
    :cond_7
    return-object v4

    .line 216
    :pswitch_2
    iget-object p0, p0, Ln23;->a:Ljava/lang/String;

    .line 217
    .line 218
    if-eqz p0, :cond_8

    .line 219
    .line 220
    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 221
    .line 222
    .line 223
    move-result-object p0

    .line 224
    invoke-virtual {p0}, Landroid/net/Uri;->getQuery()Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object p0

    .line 228
    if-eqz p0, :cond_8

    .line 229
    .line 230
    move v2, v3

    .line 231
    :cond_8
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 232
    .line 233
    .line 234
    move-result-object p0

    .line 235
    return-object p0

    .line 236
    :pswitch_3
    iget-object p0, p0, Ln23;->j:Lr72;

    .line 237
    .line 238
    invoke-interface {p0}, Lr72;->getValue()Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object p0

    .line 242
    check-cast p0, Lkd3;

    .line 243
    .line 244
    if-eqz p0, :cond_9

    .line 245
    .line 246
    iget-object p0, p0, Lkd3;->o:Ljava/lang/Object;

    .line 247
    .line 248
    move-object v4, p0

    .line 249
    check-cast v4, Ljava/lang/String;

    .line 250
    .line 251
    :cond_9
    return-object v4

    .line 252
    :pswitch_4
    iget-object p0, p0, Ln23;->l:Lr72;

    .line 253
    .line 254
    invoke-interface {p0}, Lr72;->getValue()Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object p0

    .line 258
    check-cast p0, Ljava/lang/String;

    .line 259
    .line 260
    if-eqz p0, :cond_a

    .line 261
    .line 262
    invoke-static {p0, v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    .line 263
    .line 264
    .line 265
    move-result-object v4

    .line 266
    :cond_a
    return-object v4

    .line 267
    :pswitch_5
    iget-object p0, p0, Ln23;->a:Ljava/lang/String;

    .line 268
    .line 269
    if-eqz p0, :cond_c

    .line 270
    .line 271
    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    invoke-virtual {v0}, Landroid/net/Uri;->getFragment()Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    if-nez v0, :cond_b

    .line 280
    .line 281
    goto :goto_4

    .line 282
    :cond_b
    new-instance v0, Ljava/util/ArrayList;

    .line 283
    .line 284
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 285
    .line 286
    .line 287
    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 288
    .line 289
    .line 290
    move-result-object p0

    .line 291
    invoke-virtual {p0}, Landroid/net/Uri;->getFragment()Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object p0

    .line 295
    new-instance v1, Ljava/lang/StringBuilder;

    .line 296
    .line 297
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 298
    .line 299
    .line 300
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 301
    .line 302
    .line 303
    invoke-static {p0, v0, v1}, Ln23;->a(Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/StringBuilder;)V

    .line 304
    .line 305
    .line 306
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    move-result-object p0

    .line 310
    new-instance v4, Lkd3;

    .line 311
    .line 312
    invoke-direct {v4, v0, p0}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 313
    .line 314
    .line 315
    :cond_c
    :goto_4
    return-object v4

    .line 316
    :pswitch_6
    iget-object p0, p0, Ln23;->j:Lr72;

    .line 317
    .line 318
    invoke-interface {p0}, Lr72;->getValue()Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    move-result-object p0

    .line 322
    check-cast p0, Lkd3;

    .line 323
    .line 324
    if-eqz p0, :cond_d

    .line 325
    .line 326
    iget-object p0, p0, Lkd3;->n:Ljava/lang/Object;

    .line 327
    .line 328
    check-cast p0, Ljava/util/List;

    .line 329
    .line 330
    if-nez p0, :cond_e

    .line 331
    .line 332
    :cond_d
    new-instance p0, Ljava/util/ArrayList;

    .line 333
    .line 334
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 335
    .line 336
    .line 337
    :cond_e
    return-object p0

    .line 338
    nop

    .line 339
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
