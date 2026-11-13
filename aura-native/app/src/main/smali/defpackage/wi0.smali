.class public final Ldefpackage/wi0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final a:Ljava/util/ArrayList;

.field public final b:Ljava/util/ArrayList;

.field public c:Ldefpackage/ii1;

.field public d:Ljava/lang/Object;

.field public e:I

.field public f:I

.field public g:Ljava/lang/Class;

.field public h:Ldefpackage/sd0;

.field public i:Ldefpackage/db3;

.field public j:Ljava/util/Map;

.field public k:Ljava/lang/Class;

.field public l:Z

.field public m:Z

.field public n:Ldefpackage/f42;

.field public o:Ldefpackage/eq3;

.field public p:Ldefpackage/xq0;

.field public q:Z

.field public r:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Ldefpackage/wi0;->a:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Ldefpackage/wi0;->b:Ljava/util/ArrayList;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final a()Ljava/util/ArrayList;
    .locals 7

    .line 1
    iget-boolean v0, p0, Ldefpackage/wi0;->m:Z

    .line 2
    .line 3
    iget-object v1, p0, Ldefpackage/wi0;->b:Ljava/util/ArrayList;

    .line 4
    .line 5
    if-nez v0, :cond_3

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, Ldefpackage/wi0;->m:Z

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Ldefpackage/wi0;->b()Ljava/util/ArrayList;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    const/4 v2, 0x0

    .line 22
    move v3, v2

    .line 23
    :goto_0
    if-ge v3, v0, :cond_3

    .line 24
    .line 25
    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    check-cast v4, Ldefpackage/tw2;

    .line 30
    .line 31
    iget-object v5, v4, Ldefpackage/tw2;->a:Ldefpackage/f42;

    .line 32
    .line 33
    iget-object v6, v4, Ldefpackage/tw2;->b:Ljava/util/List;

    .line 34
    .line 35
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    if-nez v5, :cond_0

    .line 40
    .line 41
    iget-object v4, v4, Ldefpackage/tw2;->a:Ldefpackage/f42;

    .line 42
    .line 43
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    :cond_0
    move v4, v2

    .line 47
    :goto_1
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 48
    .line 49
    .line 50
    move-result v5

    .line 51
    if-ge v4, v5, :cond_2

    .line 52
    .line 53
    invoke-interface {v6, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v5

    .line 61
    if-nez v5, :cond_1

    .line 62
    .line 63
    invoke-interface {v6, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_3
    return-object v1
.end method

.method public final b()Ljava/util/ArrayList;
    .locals 9

    .line 1
    iget-boolean v0, p0, Ldefpackage/wi0;->l:Z

    .line 2
    .line 3
    iget-object v1, p0, Ldefpackage/wi0;->a:Ljava/util/ArrayList;

    .line 4
    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, Ldefpackage/wi0;->l:Z

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Ldefpackage/wi0;->c:Ldefpackage/ii1;

    .line 14
    .line 15
    invoke-virtual {v0}, Ldefpackage/ii1;->a()Ldefpackage/ey3;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-object v2, p0, Ldefpackage/wi0;->d:Ljava/lang/Object;

    .line 20
    .line 21
    invoke-virtual {v0, v2}, Ldefpackage/ey3;->f(Ljava/lang/Object;)Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    const/4 v3, 0x0

    .line 30
    :goto_0
    if-ge v3, v2, :cond_1

    .line 31
    .line 32
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    check-cast v4, Ldefpackage/uw2;

    .line 37
    .line 38
    iget-object v5, p0, Ldefpackage/wi0;->d:Ljava/lang/Object;

    .line 39
    .line 40
    iget v6, p0, Ldefpackage/wi0;->e:I

    .line 41
    .line 42
    iget v7, p0, Ldefpackage/wi0;->f:I

    .line 43
    .line 44
    iget-object v8, p0, Ldefpackage/wi0;->i:Ldefpackage/db3;

    .line 45
    .line 46
    invoke-interface {v4, v5, v6, v7, v8}, Ldefpackage/uw2;->b(Ljava/lang/Object;IILdefpackage/db3;)Ldefpackage/tw2;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    if-eqz v4, :cond_0

    .line 51
    .line 52
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    return-object v1
.end method

.method public final c(Ljava/lang/Class;)Ldefpackage/fd2;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Ldefpackage/wi0;->c:Ldefpackage/ii1;

    .line 6
    .line 7
    invoke-virtual {v2}, Ldefpackage/ii1;->a()Ldefpackage/ey3;

    .line 8
    .line 9
    .line 10
    move-result-object v7

    .line 11
    iget-object v8, v0, Ldefpackage/wi0;->g:Ljava/lang/Class;

    .line 12
    .line 13
    iget-object v9, v0, Ldefpackage/wi0;->k:Ljava/lang/Class;

    .line 14
    .line 15
    iget-object v0, v7, Ldefpackage/ey3;->i:Ldefpackage/gd2;

    .line 16
    .line 17
    iget-object v2, v0, Ldefpackage/gd2;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 18
    .line 19
    const/4 v10, 0x0

    .line 20
    invoke-virtual {v2, v10}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    check-cast v2, Ldefpackage/yy2;

    .line 25
    .line 26
    if-nez v2, :cond_0

    .line 27
    .line 28
    new-instance v2, Ldefpackage/yy2;

    .line 29
    .line 30
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 31
    .line 32
    .line 33
    :cond_0
    iput-object v1, v2, Ldefpackage/yy2;->a:Ljava/lang/Class;

    .line 34
    .line 35
    iput-object v8, v2, Ldefpackage/yy2;->b:Ljava/lang/Class;

    .line 36
    .line 37
    iput-object v9, v2, Ldefpackage/yy2;->c:Ljava/lang/Class;

    .line 38
    .line 39
    iget-object v3, v0, Ldefpackage/gd2;->a:Ldefpackage/oi;

    .line 40
    .line 41
    monitor-enter v3

    .line 42
    :try_start_0
    iget-object v4, v0, Ldefpackage/gd2;->a:Ldefpackage/oi;

    .line 43
    .line 44
    invoke-virtual {v4, v2}, Ldefpackage/yd4;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    check-cast v4, Ldefpackage/fd2;

    .line 49
    .line 50
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 51
    iget-object v0, v0, Ldefpackage/gd2;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 52
    .line 53
    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    iget-object v0, v7, Ldefpackage/ey3;->i:Ldefpackage/gd2;

    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    sget-object v0, Ldefpackage/gd2;->c:Ldefpackage/fd2;

    .line 62
    .line 63
    invoke-virtual {v0, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-eqz v0, :cond_1

    .line 68
    .line 69
    return-object v10

    .line 70
    :cond_1
    if-nez v4, :cond_f

    .line 71
    .line 72
    new-instance v11, Ljava/util/ArrayList;

    .line 73
    .line 74
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 75
    .line 76
    .line 77
    iget-object v0, v7, Ldefpackage/ey3;->c:Ldefpackage/rf2;

    .line 78
    .line 79
    invoke-virtual {v0, v1, v8}, Ldefpackage/rf2;->f(Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 80
    .line 81
    .line 82
    move-result-object v12

    .line 83
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 84
    .line 85
    .line 86
    move-result v13

    .line 87
    const/4 v0, 0x0

    .line 88
    :goto_0
    if-ge v0, v13, :cond_c

    .line 89
    .line 90
    invoke-virtual {v12, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    add-int/lit8 v15, v0, 0x1

    .line 95
    .line 96
    check-cast v2, Ljava/lang/Class;

    .line 97
    .line 98
    iget-object v0, v7, Ldefpackage/ey3;->f:Ldefpackage/c52;

    .line 99
    .line 100
    invoke-virtual {v0, v2, v9}, Ldefpackage/c52;->e(Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 105
    .line 106
    .line 107
    move-result v3

    .line 108
    const/4 v4, 0x0

    .line 109
    :goto_1
    if-ge v4, v3, :cond_b

    .line 110
    .line 111
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v5

    .line 115
    add-int/lit8 v16, v4, 0x1

    .line 116
    .line 117
    check-cast v5, Ljava/lang/Class;

    .line 118
    .line 119
    iget-object v4, v7, Ldefpackage/ey3;->c:Ldefpackage/rf2;

    .line 120
    .line 121
    monitor-enter v4

    .line 122
    :try_start_1
    new-instance v6, Ljava/util/ArrayList;

    .line 123
    .line 124
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 125
    .line 126
    .line 127
    iget-object v10, v4, Ldefpackage/rf2;->n:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v10, Ljava/util/ArrayList;

    .line 130
    .line 131
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 132
    .line 133
    .line 134
    move-result v14

    .line 135
    move-object/from16 v17, v0

    .line 136
    .line 137
    const/4 v0, 0x0

    .line 138
    :goto_2
    const/16 v18, 0x1

    .line 139
    .line 140
    if-ge v0, v14, :cond_6

    .line 141
    .line 142
    invoke-virtual {v10, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v19

    .line 146
    add-int/lit8 v0, v0, 0x1

    .line 147
    .line 148
    move/from16 v20, v0

    .line 149
    .line 150
    move-object/from16 v0, v19

    .line 151
    .line 152
    check-cast v0, Ljava/lang/String;

    .line 153
    .line 154
    move/from16 v19, v3

    .line 155
    .line 156
    iget-object v3, v4, Ldefpackage/rf2;->o:Ljava/lang/Object;

    .line 157
    .line 158
    check-cast v3, Ljava/util/HashMap;

    .line 159
    .line 160
    invoke-virtual {v3, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    check-cast v0, Ljava/util/List;

    .line 165
    .line 166
    if-nez v0, :cond_3

    .line 167
    .line 168
    :cond_2
    move/from16 v3, v19

    .line 169
    .line 170
    move/from16 v0, v20

    .line 171
    .line 172
    goto :goto_2

    .line 173
    :cond_3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 178
    .line 179
    .line 180
    move-result v3

    .line 181
    if-eqz v3, :cond_2

    .line 182
    .line 183
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v3

    .line 187
    check-cast v3, Ldefpackage/u04;

    .line 188
    .line 189
    move-object/from16 v21, v0

    .line 190
    .line 191
    iget-object v0, v3, Ldefpackage/u04;->a:Ljava/lang/Class;

    .line 192
    .line 193
    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 194
    .line 195
    .line 196
    move-result v0

    .line 197
    if-eqz v0, :cond_4

    .line 198
    .line 199
    iget-object v0, v3, Ldefpackage/u04;->b:Ljava/lang/Class;

    .line 200
    .line 201
    invoke-virtual {v2, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 202
    .line 203
    .line 204
    move-result v0

    .line 205
    if-eqz v0, :cond_4

    .line 206
    .line 207
    move/from16 v0, v18

    .line 208
    .line 209
    goto :goto_4

    .line 210
    :cond_4
    const/4 v0, 0x0

    .line 211
    :goto_4
    if-eqz v0, :cond_5

    .line 212
    .line 213
    iget-object v0, v3, Ldefpackage/u04;->c:Ldefpackage/t04;

    .line 214
    .line 215
    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 216
    .line 217
    .line 218
    goto :goto_5

    .line 219
    :catchall_0
    move-exception v0

    .line 220
    goto/16 :goto_a

    .line 221
    .line 222
    :cond_5
    :goto_5
    move-object/from16 v0, v21

    .line 223
    .line 224
    goto :goto_3

    .line 225
    :cond_6
    move/from16 v19, v3

    .line 226
    .line 227
    monitor-exit v4

    .line 228
    iget-object v3, v7, Ldefpackage/ey3;->f:Ldefpackage/c52;

    .line 229
    .line 230
    monitor-enter v3

    .line 231
    :try_start_2
    invoke-virtual {v5, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 232
    .line 233
    .line 234
    move-result v0

    .line 235
    if-eqz v0, :cond_7

    .line 236
    .line 237
    sget-object v0, Ldefpackage/rv2;->I:Ldefpackage/rv2;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 238
    .line 239
    monitor-exit v3

    .line 240
    goto :goto_8

    .line 241
    :catchall_1
    move-exception v0

    .line 242
    goto/16 :goto_9

    .line 243
    .line 244
    :cond_7
    :try_start_3
    iget-object v0, v3, Ldefpackage/c52;->a:Ljava/util/ArrayList;

    .line 245
    .line 246
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 247
    .line 248
    .line 249
    move-result v4

    .line 250
    const/4 v10, 0x0

    .line 251
    :goto_6
    if-ge v10, v4, :cond_a

    .line 252
    .line 253
    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v14

    .line 257
    add-int/lit8 v10, v10, 0x1

    .line 258
    .line 259
    check-cast v14, Ldefpackage/nw4;

    .line 260
    .line 261
    move-object/from16 v20, v0

    .line 262
    .line 263
    iget-object v0, v14, Ldefpackage/nw4;->a:Ljava/lang/Class;

    .line 264
    .line 265
    invoke-virtual {v0, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 266
    .line 267
    .line 268
    move-result v0

    .line 269
    if-eqz v0, :cond_8

    .line 270
    .line 271
    iget-object v0, v14, Ldefpackage/nw4;->b:Ljava/lang/Class;

    .line 272
    .line 273
    invoke-virtual {v5, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 274
    .line 275
    .line 276
    move-result v0

    .line 277
    if-eqz v0, :cond_8

    .line 278
    .line 279
    move/from16 v0, v18

    .line 280
    .line 281
    goto :goto_7

    .line 282
    :cond_8
    const/4 v0, 0x0

    .line 283
    :goto_7
    if-eqz v0, :cond_9

    .line 284
    .line 285
    iget-object v0, v14, Ldefpackage/nw4;->c:Ldefpackage/d14;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 286
    .line 287
    monitor-exit v3

    .line 288
    :goto_8
    new-instance v3, Ldefpackage/yi0;

    .line 289
    .line 290
    move-object v4, v6

    .line 291
    iget-object v6, v7, Ldefpackage/ey3;->j:Ldefpackage/i61;

    .line 292
    .line 293
    move-object/from16 v22, v5

    .line 294
    .line 295
    move-object v5, v0

    .line 296
    move-object v0, v3

    .line 297
    move-object/from16 v3, v22

    .line 298
    .line 299
    invoke-direct/range {v0 .. v6}, Ldefpackage/yi0;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/util/List;Ldefpackage/d14;Ldefpackage/io3;)V

    .line 300
    .line 301
    .line 302
    invoke-virtual {v11, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 303
    .line 304
    .line 305
    move-object/from16 v1, p1

    .line 306
    .line 307
    move/from16 v4, v16

    .line 308
    .line 309
    move-object/from16 v0, v17

    .line 310
    .line 311
    move/from16 v3, v19

    .line 312
    .line 313
    const/4 v10, 0x0

    .line 314
    goto/16 :goto_1

    .line 315
    .line 316
    :cond_9
    move-object/from16 v1, p1

    .line 317
    .line 318
    move-object/from16 v0, v20

    .line 319
    .line 320
    goto :goto_6

    .line 321
    :cond_a
    :try_start_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 322
    .line 323
    new-instance v1, Ljava/lang/StringBuilder;

    .line 324
    .line 325
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 326
    .line 327
    .line 328
    const-string v4, "No transcoder registered to transcode from "

    .line 329
    .line 330
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 331
    .line 332
    .line 333
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 334
    .line 335
    .line 336
    const-string v2, " to "

    .line 337
    .line 338
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 339
    .line 340
    .line 341
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 342
    .line 343
    .line 344
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 345
    .line 346
    .line 347
    move-result-object v1

    .line 348
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 349
    .line 350
    .line 351
    throw v0

    .line 352
    :goto_9
    monitor-exit v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 353
    throw v0

    .line 354
    :goto_a
    :try_start_5
    monitor-exit v4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 355
    throw v0

    .line 356
    :cond_b
    move-object/from16 v1, p1

    .line 357
    .line 358
    move v0, v15

    .line 359
    goto/16 :goto_0

    .line 360
    .line 361
    :cond_c
    invoke-virtual {v11}, Ljava/util/ArrayList;->isEmpty()Z

    .line 362
    .line 363
    .line 364
    move-result v0

    .line 365
    if-eqz v0, :cond_d

    .line 366
    .line 367
    move-object/from16 v1, p1

    .line 368
    .line 369
    move-object v2, v8

    .line 370
    move-object v3, v9

    .line 371
    const/4 v10, 0x0

    .line 372
    goto :goto_b

    .line 373
    :cond_d
    new-instance v0, Ldefpackage/fd2;

    .line 374
    .line 375
    iget-object v5, v7, Ldefpackage/ey3;->j:Ldefpackage/i61;

    .line 376
    .line 377
    move-object/from16 v1, p1

    .line 378
    .line 379
    move-object v2, v8

    .line 380
    move-object v3, v9

    .line 381
    move-object v4, v11

    .line 382
    invoke-direct/range {v0 .. v5}, Ldefpackage/fd2;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/util/List;Ldefpackage/io3;)V

    .line 383
    .line 384
    .line 385
    move-object v10, v0

    .line 386
    :goto_b
    iget-object v0, v7, Ldefpackage/ey3;->i:Ldefpackage/gd2;

    .line 387
    .line 388
    iget-object v5, v0, Ldefpackage/gd2;->a:Ldefpackage/oi;

    .line 389
    .line 390
    monitor-enter v5

    .line 391
    :try_start_6
    iget-object v0, v0, Ldefpackage/gd2;->a:Ldefpackage/oi;

    .line 392
    .line 393
    new-instance v4, Ldefpackage/yy2;

    .line 394
    .line 395
    invoke-direct {v4, v1, v2, v3}, Ldefpackage/yy2;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)V

    .line 396
    .line 397
    .line 398
    if-eqz v10, :cond_e

    .line 399
    .line 400
    move-object v1, v10

    .line 401
    goto :goto_c

    .line 402
    :cond_e
    sget-object v1, Ldefpackage/gd2;->c:Ldefpackage/fd2;

    .line 403
    .line 404
    :goto_c
    invoke-virtual {v0, v4, v1}, Ldefpackage/yd4;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 405
    .line 406
    .line 407
    monitor-exit v5

    .line 408
    return-object v10

    .line 409
    :catchall_2
    move-exception v0

    .line 410
    monitor-exit v5
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 411
    throw v0

    .line 412
    :cond_f
    return-object v4

    .line 413
    :catchall_3
    move-exception v0

    .line 414
    :try_start_7
    monitor-exit v3
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 415
    throw v0
.end method

.method public final d(Ljava/lang/Object;)Ldefpackage/c11;
    .locals 6

    .line 1
    iget-object p0, p0, Ldefpackage/wi0;->c:Ldefpackage/ii1;

    .line 2
    .line 3
    invoke-virtual {p0}, Ldefpackage/ii1;->a()Ldefpackage/ey3;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    iget-object p0, p0, Ldefpackage/ey3;->b:Ldefpackage/hg3;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    monitor-enter p0

    .line 14
    :try_start_0
    iget-object v1, p0, Ldefpackage/hg3;->o:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    const/4 v3, 0x0

    .line 23
    :cond_0
    if-ge v3, v2, :cond_1

    .line 24
    .line 25
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    add-int/lit8 v3, v3, 0x1

    .line 30
    .line 31
    check-cast v4, Ldefpackage/d11;

    .line 32
    .line 33
    iget-object v5, v4, Ldefpackage/d11;->a:Ljava/lang/Class;

    .line 34
    .line 35
    invoke-virtual {v5, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    if-eqz v5, :cond_0

    .line 40
    .line 41
    iget-object v0, v4, Ldefpackage/d11;->b:Ldefpackage/c11;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    .line 43
    monitor-exit p0

    .line 44
    goto :goto_0

    .line 45
    :catchall_0
    move-exception p1

    .line 46
    goto :goto_1

    .line 47
    :cond_1
    monitor-exit p0

    .line 48
    const/4 v0, 0x0

    .line 49
    :goto_0
    if-eqz v0, :cond_2

    .line 50
    .line 51
    return-object v0

    .line 52
    :cond_2
    new-instance p0, Lcom/bumptech/glide/Registry$NoSourceEncoderAvailableException;

    .line 53
    .line 54
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    new-instance v0, Ljava/lang/StringBuilder;

    .line 59
    .line 60
    const-string v1, "Failed to find source encoder for data class: "

    .line 61
    .line 62
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    throw p0

    .line 76
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 77
    throw p1
.end method

.method public final e(Ljava/lang/Class;)Ldefpackage/uw4;
    .locals 4

    .line 1
    iget-object v0, p0, Ldefpackage/wi0;->j:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ldefpackage/uw4;

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    iget-object v1, p0, Ldefpackage/wi0;->j:Ljava/util/Map;

    .line 12
    .line 13
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_1

    .line 26
    .line 27
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    check-cast v2, Ljava/util/Map$Entry;

    .line 32
    .line 33
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    check-cast v3, Ljava/lang/Class;

    .line 38
    .line 39
    invoke-virtual {v3, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    if-eqz v3, :cond_0

    .line 44
    .line 45
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    check-cast v0, Ldefpackage/uw4;

    .line 50
    .line 51
    :cond_1
    if-nez v0, :cond_4

    .line 52
    .line 53
    iget-object v0, p0, Ldefpackage/wi0;->j:Ljava/util/Map;

    .line 54
    .line 55
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-eqz v0, :cond_3

    .line 60
    .line 61
    iget-boolean p0, p0, Ldefpackage/wi0;->q:Z

    .line 62
    .line 63
    if-nez p0, :cond_2

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_2
    const-string p0, "Missing transformation for "

    .line 67
    .line 68
    const-string v0, ". If you wish to ignore unknown resource types, use the optional transformation methods."

    .line 69
    .line 70
    invoke-static {p1, v0, p0}, Ldefpackage/nz2;->A(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    const/4 p0, 0x0

    .line 74
    return-object p0

    .line 75
    :cond_3
    :goto_0
    sget-object p0, Ldefpackage/m15;->b:Ldefpackage/m15;

    .line 76
    .line 77
    return-object p0

    .line 78
    :cond_4
    return-object v0
.end method
