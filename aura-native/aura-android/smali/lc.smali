.class public final synthetic Llc;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lyf1;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Llc;->n:I

    .line 2
    .line 3
    iput-object p2, p0, Llc;->o:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final d(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Llc;->n:I

    .line 4
    .line 5
    iget-object v0, v0, Llc;->o:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast v0, Lps1;

    .line 11
    .line 12
    iget-object v0, v0, Lps1;->o:Ljava/util/LinkedHashMap;

    .line 13
    .line 14
    move-object/from16 v1, p1

    .line 15
    .line 16
    check-cast v1, Ljava/lang/String;

    .line 17
    .line 18
    move-object/from16 v2, p2

    .line 19
    .line 20
    check-cast v2, Loh3;

    .line 21
    .line 22
    move-object/from16 v6, p3

    .line 23
    .line 24
    check-cast v6, Ljava/lang/Long;

    .line 25
    .line 26
    move-object/from16 v3, p4

    .line 27
    .line 28
    check-cast v3, Ljava/lang/Long;

    .line 29
    .line 30
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    const-string v3, "start"

    .line 40
    .line 41
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-eqz v3, :cond_0

    .line 46
    .line 47
    iget-object v3, v2, Loh3;->f:Ljava/lang/String;

    .line 48
    .line 49
    sget-object v4, Lb00;->a:Lb00;

    .line 50
    .line 51
    invoke-static {}, Lb00;->a()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    invoke-interface {v0, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    :cond_0
    sget-object v3, Lcom/eddyizm/tempus/homemusic/PlayEvent;->Companion:Lih3;

    .line 59
    .line 60
    iget-object v4, v2, Loh3;->a:Ljava/lang/String;

    .line 61
    .line 62
    move-object v5, v3

    .line 63
    invoke-static {}, Lrs1;->f()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    move-object v8, v4

    .line 68
    move-object v7, v5

    .line 69
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 70
    .line 71
    .line 72
    move-result-wide v4

    .line 73
    iget-wide v9, v2, Loh3;->b:J

    .line 74
    .line 75
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 76
    .line 77
    .line 78
    move-result-object v9

    .line 79
    move-object v10, v8

    .line 80
    iget-object v8, v2, Loh3;->c:Ljava/lang/String;

    .line 81
    .line 82
    move-object v11, v7

    .line 83
    move-object v7, v9

    .line 84
    iget-object v9, v2, Loh3;->f:Ljava/lang/String;

    .line 85
    .line 86
    sget-object v12, Lrs1;->a:Lrs1;

    .line 87
    .line 88
    sget-object v12, Lrs1;->k:Lrp4;

    .line 89
    .line 90
    invoke-virtual {v12}, Lrp4;->getValue()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v12

    .line 94
    check-cast v12, Ljava/lang/String;

    .line 95
    .line 96
    iget-wide v13, v2, Loh3;->g:J

    .line 97
    .line 98
    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 99
    .line 100
    .line 101
    move-result-object v13

    .line 102
    iget-object v14, v2, Loh3;->f:Ljava/lang/String;

    .line 103
    .line 104
    invoke-virtual {v0, v14}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v14

    .line 108
    check-cast v14, Ljava/lang/String;

    .line 109
    .line 110
    move-object v15, v11

    .line 111
    move-object v11, v13

    .line 112
    iget-object v13, v2, Loh3;->d:Lag2;

    .line 113
    .line 114
    move-object/from16 p0, v1

    .line 115
    .line 116
    iget-object v1, v2, Loh3;->e:Lk62;

    .line 117
    .line 118
    const/16 v16, 0x0

    .line 119
    .line 120
    move-object/from16 p1, v2

    .line 121
    .line 122
    if-eqz v1, :cond_1

    .line 123
    .line 124
    iget-object v2, v1, Lk62;->a:Ljava/lang/String;

    .line 125
    .line 126
    goto :goto_0

    .line 127
    :cond_1
    move-object/from16 v2, v16

    .line 128
    .line 129
    :goto_0
    if-eqz v1, :cond_2

    .line 130
    .line 131
    iget-object v1, v1, Lk62;->b:Ljava/lang/String;

    .line 132
    .line 133
    move-object/from16 v16, v1

    .line 134
    .line 135
    :cond_2
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    move-object v1, v14

    .line 139
    move-object v14, v2

    .line 140
    move-object v2, v10

    .line 141
    move-object v10, v12

    .line 142
    move-object v12, v1

    .line 143
    move-object/from16 v1, p0

    .line 144
    .line 145
    move-object/from16 v17, v0

    .line 146
    .line 147
    move-object/from16 v15, v16

    .line 148
    .line 149
    move-object/from16 v0, p1

    .line 150
    .line 151
    invoke-static/range {v1 .. v15}, Lih3;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)Lcom/eddyizm/tempus/homemusic/PlayEvent;

    .line 152
    .line 153
    .line 154
    move-result-object v2

    .line 155
    invoke-static {v2}, Lrs1;->j(Lcom/eddyizm/tempus/homemusic/PlayEvent;)V

    .line 156
    .line 157
    .line 158
    const-string v2, "interrupted"

    .line 159
    .line 160
    const-string v3, "error"

    .line 161
    .line 162
    const-string v4, "skip"

    .line 163
    .line 164
    const-string v5, "finish"

    .line 165
    .line 166
    filled-new-array {v4, v5, v2, v3}, [Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    invoke-static {v2}, Lti;->t0([Ljava/lang/Object;)Ljava/util/Set;

    .line 171
    .line 172
    .line 173
    move-result-object v2

    .line 174
    invoke-interface {v2, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    move-result v1

    .line 178
    if-eqz v1, :cond_3

    .line 179
    .line 180
    iget-object v0, v0, Loh3;->f:Ljava/lang/String;

    .line 181
    .line 182
    move-object/from16 v1, v17

    .line 183
    .line 184
    invoke-interface {v1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    :cond_3
    sget-object v0, Lj15;->a:Lj15;

    .line 188
    .line 189
    return-object v0

    .line 190
    :pswitch_0
    check-cast v0, Lwo4;

    .line 191
    .line 192
    move-object/from16 v1, p1

    .line 193
    .line 194
    check-cast v1, Landroid/database/sqlite/SQLiteDatabase;

    .line 195
    .line 196
    move-object/from16 v1, p2

    .line 197
    .line 198
    check-cast v1, Landroid/database/sqlite/SQLiteCursorDriver;

    .line 199
    .line 200
    move-object/from16 v2, p3

    .line 201
    .line 202
    check-cast v2, Ljava/lang/String;

    .line 203
    .line 204
    move-object/from16 v3, p4

    .line 205
    .line 206
    check-cast v3, Landroid/database/sqlite/SQLiteQuery;

    .line 207
    .line 208
    new-instance v4, Lcf1;

    .line 209
    .line 210
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 211
    .line 212
    .line 213
    invoke-direct {v4, v3}, Lcf1;-><init>(Landroid/database/sqlite/SQLiteProgram;)V

    .line 214
    .line 215
    .line 216
    invoke-interface {v0, v4}, Lwo4;->n(Lvo4;)V

    .line 217
    .line 218
    .line 219
    new-instance v0, Landroid/database/sqlite/SQLiteCursor;

    .line 220
    .line 221
    invoke-direct {v0, v1, v2, v3}, Landroid/database/sqlite/SQLiteCursor;-><init>(Landroid/database/sqlite/SQLiteCursorDriver;Ljava/lang/String;Landroid/database/sqlite/SQLiteQuery;)V

    .line 222
    .line 223
    .line 224
    return-object v0

    .line 225
    :pswitch_1
    check-cast v0, Lmc;

    .line 226
    .line 227
    move-object/from16 v1, p1

    .line 228
    .line 229
    check-cast v1, Lvk0;

    .line 230
    .line 231
    move-object/from16 v2, p2

    .line 232
    .line 233
    check-cast v2, Lgb1;

    .line 234
    .line 235
    move-object/from16 v3, p3

    .line 236
    .line 237
    check-cast v3, Leb1;

    .line 238
    .line 239
    move-object/from16 v4, p4

    .line 240
    .line 241
    check-cast v4, Lfb1;

    .line 242
    .line 243
    iget-object v5, v0, Lmc;->r:Lha1;

    .line 244
    .line 245
    iget v3, v3, Leb1;->a:I

    .line 246
    .line 247
    iget v4, v4, Lfb1;->a:I

    .line 248
    .line 249
    check-cast v5, Lia1;

    .line 250
    .line 251
    invoke-virtual {v5, v1, v2, v3, v4}, Lia1;->b(Lvk0;Lgb1;II)Ln05;

    .line 252
    .line 253
    .line 254
    move-result-object v1

    .line 255
    instance-of v2, v1, Ln05;

    .line 256
    .line 257
    if-nez v2, :cond_4

    .line 258
    .line 259
    new-instance v2, Lz05;

    .line 260
    .line 261
    iget-object v3, v0, Lmc;->w:Lz05;

    .line 262
    .line 263
    invoke-direct {v2, v1, v3}, Lz05;-><init>(Ln05;Lz05;)V

    .line 264
    .line 265
    .line 266
    iput-object v2, v0, Lmc;->w:Lz05;

    .line 267
    .line 268
    iget-object v0, v2, Lz05;->q:Ljava/lang/Object;

    .line 269
    .line 270
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 271
    .line 272
    .line 273
    check-cast v0, Landroid/graphics/Typeface;

    .line 274
    .line 275
    goto :goto_1

    .line 276
    :cond_4
    iget-object v0, v1, Ln05;->n:Ljava/lang/Object;

    .line 277
    .line 278
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 279
    .line 280
    .line 281
    check-cast v0, Landroid/graphics/Typeface;

    .line 282
    .line 283
    :goto_1
    return-object v0

    .line 284
    nop

    .line 285
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
