.class public final Ldefpackage/xv;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/t85;


# instance fields
.field public n:Ljava/lang/Object;

.field public o:Ldefpackage/cz;

.field public final synthetic p:Ldefpackage/aw;


# direct methods
.method public constructor <init>(Ldefpackage/aw;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldefpackage/xv;->p:Ldefpackage/aw;

    .line 5
    .line 6
    sget-object p1, Ldefpackage/cw;->p:Ldefpackage/f01;

    .line 7
    .line 8
    iput-object p1, p0, Ldefpackage/xv;->n:Ljava/lang/Object;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(Ldefpackage/u84;I)V
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/xv;->o:Ldefpackage/cz;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Ldefpackage/cz;->a(Ldefpackage/u84;I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final b(Ldefpackage/wd0;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-object v0, p0, Ldefpackage/xv;->n:Ljava/lang/Object;

    .line 2
    .line 3
    sget-object v1, Ldefpackage/cw;->p:Ldefpackage/f01;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-eq v0, v1, :cond_0

    .line 7
    .line 8
    sget-object v1, Ldefpackage/cw;->l:Ldefpackage/f01;

    .line 9
    .line 10
    if-eq v0, v1, :cond_0

    .line 11
    .line 12
    goto/16 :goto_5

    .line 13
    .line 14
    :cond_0
    sget-object v0, Ldefpackage/aw;->t:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 15
    .line 16
    iget-object v6, p0, Ldefpackage/xv;->p:Ldefpackage/aw;

    .line 17
    .line 18
    invoke-virtual {v0, v6}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Ldefpackage/k10;

    .line 23
    .line 24
    :goto_0
    invoke-virtual {v6}, Ldefpackage/aw;->B()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_2

    .line 29
    .line 30
    sget-object v0, Ldefpackage/cw;->l:Ldefpackage/f01;

    .line 31
    .line 32
    iput-object v0, p0, Ldefpackage/xv;->n:Ljava/lang/Object;

    .line 33
    .line 34
    invoke-virtual {v6}, Ldefpackage/aw;->s()Ljava/lang/Throwable;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    if-nez v0, :cond_1

    .line 39
    .line 40
    const/4 v2, 0x0

    .line 41
    goto/16 :goto_5

    .line 42
    .line 43
    :cond_1
    sget v1, Ldefpackage/mk4;->a:I

    .line 44
    .line 45
    throw v0

    .line 46
    :cond_2
    sget-object v1, Ldefpackage/aw;->p:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 47
    .line 48
    invoke-virtual {v1, v6}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    .line 49
    .line 50
    .line 51
    move-result-wide v3

    .line 52
    sget v1, Ldefpackage/cw;->b:I

    .line 53
    .line 54
    int-to-long v7, v1

    .line 55
    div-long v9, v3, v7

    .line 56
    .line 57
    rem-long v7, v3, v7

    .line 58
    .line 59
    long-to-int v8, v7

    .line 60
    iget-wide v11, v0, Ldefpackage/u84;->e:J

    .line 61
    .line 62
    cmp-long v1, v11, v9

    .line 63
    .line 64
    if-eqz v1, :cond_3

    .line 65
    .line 66
    invoke-virtual {v6, v9, v10, v0}, Ldefpackage/aw;->q(JLdefpackage/k10;)Ldefpackage/k10;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    if-nez v1, :cond_4

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_3
    move-object v1, v0

    .line 74
    :cond_4
    const/4 v11, 0x0

    .line 75
    move-object v7, v1

    .line 76
    move-wide v9, v3

    .line 77
    invoke-virtual/range {v6 .. v11}, Ldefpackage/aw;->P(Ldefpackage/k10;IJLjava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    sget-object v7, Ldefpackage/cw;->m:Ldefpackage/f01;

    .line 82
    .line 83
    const/4 v9, 0x0

    .line 84
    if-eq v0, v7, :cond_13

    .line 85
    .line 86
    sget-object v10, Ldefpackage/cw;->o:Ldefpackage/f01;

    .line 87
    .line 88
    if-ne v0, v10, :cond_6

    .line 89
    .line 90
    invoke-virtual {v6}, Ldefpackage/aw;->v()J

    .line 91
    .line 92
    .line 93
    move-result-wide v7

    .line 94
    cmp-long v0, v3, v7

    .line 95
    .line 96
    if-gez v0, :cond_5

    .line 97
    .line 98
    invoke-virtual {v1}, Ldefpackage/p90;->a()V

    .line 99
    .line 100
    .line 101
    :cond_5
    move-object v0, v1

    .line 102
    goto :goto_0

    .line 103
    :cond_6
    sget-object v11, Ldefpackage/cw;->n:Ldefpackage/f01;

    .line 104
    .line 105
    if-ne v0, v11, :cond_12

    .line 106
    .line 107
    iget-object v0, p0, Ldefpackage/xv;->p:Ldefpackage/aw;

    .line 108
    .line 109
    invoke-static {p1}, Ldefpackage/ya4;->x(Ldefpackage/vd0;)Ldefpackage/vd0;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    invoke-static {v2}, Ldefpackage/zz1;->s(Ldefpackage/vd0;)Ldefpackage/cz;

    .line 114
    .line 115
    .line 116
    move-result-object v11

    .line 117
    :try_start_0
    iput-object v11, p0, Ldefpackage/xv;->o:Ldefpackage/cz;

    .line 118
    .line 119
    move-object v5, p0

    .line 120
    move v2, v8

    .line 121
    invoke-virtual/range {v0 .. v5}, Ldefpackage/aw;->P(Ldefpackage/k10;IJLjava/lang/Object;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v8

    .line 125
    if-ne v8, v7, :cond_7

    .line 126
    .line 127
    invoke-virtual {p0, v1, v2}, Ldefpackage/xv;->a(Ldefpackage/u84;I)V

    .line 128
    .line 129
    .line 130
    goto/16 :goto_3

    .line 131
    .line 132
    :catchall_0
    move-exception v0

    .line 133
    goto/16 :goto_4

    .line 134
    .line 135
    :cond_7
    if-ne v8, v10, :cond_11

    .line 136
    .line 137
    invoke-virtual {v0}, Ldefpackage/aw;->v()J

    .line 138
    .line 139
    .line 140
    move-result-wide v7

    .line 141
    cmp-long v2, v3, v7

    .line 142
    .line 143
    if-gez v2, :cond_8

    .line 144
    .line 145
    invoke-virtual {v1}, Ldefpackage/p90;->a()V

    .line 146
    .line 147
    .line 148
    :cond_8
    sget-object v1, Ldefpackage/aw;->t:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 149
    .line 150
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    check-cast v1, Ldefpackage/k10;

    .line 155
    .line 156
    :cond_9
    :goto_1
    invoke-virtual {v0}, Ldefpackage/aw;->B()Z

    .line 157
    .line 158
    .line 159
    move-result v2

    .line 160
    if-eqz v2, :cond_b

    .line 161
    .line 162
    iget-object v0, p0, Ldefpackage/xv;->o:Ldefpackage/cz;

    .line 163
    .line 164
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    iput-object v9, p0, Ldefpackage/xv;->o:Ldefpackage/cz;

    .line 168
    .line 169
    sget-object v1, Ldefpackage/cw;->l:Ldefpackage/f01;

    .line 170
    .line 171
    iput-object v1, p0, Ldefpackage/xv;->n:Ljava/lang/Object;

    .line 172
    .line 173
    invoke-virtual {v6}, Ldefpackage/aw;->s()Ljava/lang/Throwable;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    if-nez v1, :cond_a

    .line 178
    .line 179
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 180
    .line 181
    invoke-virtual {v0, v1}, Ldefpackage/cz;->resumeWith(Ljava/lang/Object;)V

    .line 182
    .line 183
    .line 184
    goto :goto_3

    .line 185
    :cond_a
    new-instance v2, Ldefpackage/s14;

    .line 186
    .line 187
    invoke-direct {v2, v1}, Ldefpackage/s14;-><init>(Ljava/lang/Throwable;)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v0, v2}, Ldefpackage/cz;->resumeWith(Ljava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    goto :goto_3

    .line 194
    :cond_b
    sget-object v2, Ldefpackage/aw;->p:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 195
    .line 196
    invoke-virtual {v2, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    .line 197
    .line 198
    .line 199
    move-result-wide v3

    .line 200
    sget v2, Ldefpackage/cw;->b:I

    .line 201
    .line 202
    int-to-long v7, v2

    .line 203
    div-long v12, v3, v7

    .line 204
    .line 205
    rem-long v7, v3, v7

    .line 206
    .line 207
    long-to-int v2, v7

    .line 208
    iget-wide v7, v1, Ldefpackage/u84;->e:J

    .line 209
    .line 210
    cmp-long v7, v7, v12

    .line 211
    .line 212
    if-eqz v7, :cond_d

    .line 213
    .line 214
    invoke-virtual {v0, v12, v13, v1}, Ldefpackage/aw;->q(JLdefpackage/k10;)Ldefpackage/k10;

    .line 215
    .line 216
    .line 217
    move-result-object v7

    .line 218
    if-nez v7, :cond_c

    .line 219
    .line 220
    goto :goto_1

    .line 221
    :cond_c
    move-object v1, v7

    .line 222
    :cond_d
    move-object v5, p0

    .line 223
    invoke-virtual/range {v0 .. v5}, Ldefpackage/aw;->P(Ldefpackage/k10;IJLjava/lang/Object;)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v7

    .line 227
    sget-object v8, Ldefpackage/cw;->m:Ldefpackage/f01;

    .line 228
    .line 229
    if-ne v7, v8, :cond_e

    .line 230
    .line 231
    invoke-virtual {p0, v1, v2}, Ldefpackage/xv;->a(Ldefpackage/u84;I)V

    .line 232
    .line 233
    .line 234
    goto :goto_3

    .line 235
    :cond_e
    sget-object v2, Ldefpackage/cw;->o:Ldefpackage/f01;

    .line 236
    .line 237
    if-ne v7, v2, :cond_f

    .line 238
    .line 239
    invoke-virtual {v0}, Ldefpackage/aw;->v()J

    .line 240
    .line 241
    .line 242
    move-result-wide v7

    .line 243
    cmp-long v2, v3, v7

    .line 244
    .line 245
    if-gez v2, :cond_9

    .line 246
    .line 247
    invoke-virtual {v1}, Ldefpackage/p90;->a()V

    .line 248
    .line 249
    .line 250
    goto :goto_1

    .line 251
    :cond_f
    sget-object v0, Ldefpackage/cw;->n:Ldefpackage/f01;

    .line 252
    .line 253
    if-eq v7, v0, :cond_10

    .line 254
    .line 255
    invoke-virtual {v1}, Ldefpackage/p90;->a()V

    .line 256
    .line 257
    .line 258
    iput-object v7, p0, Ldefpackage/xv;->n:Ljava/lang/Object;

    .line 259
    .line 260
    iput-object v9, p0, Ldefpackage/xv;->o:Ldefpackage/cz;

    .line 261
    .line 262
    :goto_2
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 263
    .line 264
    invoke-virtual {v11, v0, v9}, Ldefpackage/cz;->k(Ljava/lang/Object;Ldefpackage/xf1;)V

    .line 265
    .line 266
    .line 267
    goto :goto_3

    .line 268
    :cond_10
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 269
    .line 270
    const-string v1, "unexpected"

    .line 271
    .line 272
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 273
    .line 274
    .line 275
    throw v0

    .line 276
    :cond_11
    invoke-virtual {v1}, Ldefpackage/p90;->a()V

    .line 277
    .line 278
    .line 279
    iput-object v8, p0, Ldefpackage/xv;->n:Ljava/lang/Object;

    .line 280
    .line 281
    iput-object v9, p0, Ldefpackage/xv;->o:Ldefpackage/cz;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 282
    .line 283
    goto :goto_2

    .line 284
    :goto_3
    invoke-virtual {v11}, Ldefpackage/cz;->q()Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    return-object v0

    .line 289
    :goto_4
    invoke-virtual {v11}, Ldefpackage/cz;->B()V

    .line 290
    .line 291
    .line 292
    throw v0

    .line 293
    :cond_12
    invoke-virtual {v1}, Ldefpackage/p90;->a()V

    .line 294
    .line 295
    .line 296
    iput-object v0, p0, Ldefpackage/xv;->n:Ljava/lang/Object;

    .line 297
    .line 298
    :goto_5
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 299
    .line 300
    .line 301
    move-result-object v0

    .line 302
    return-object v0

    .line 303
    :cond_13
    const-string v0, "unreachable"

    .line 304
    .line 305
    invoke-static {v0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 306
    .line 307
    .line 308
    return-object v9
.end method

.method public final c()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/xv;->n:Ljava/lang/Object;

    .line 2
    .line 3
    sget-object v1, Ldefpackage/cw;->p:Ldefpackage/f01;

    .line 4
    .line 5
    if-eq v0, v1, :cond_1

    .line 6
    .line 7
    iput-object v1, p0, Ldefpackage/xv;->n:Ljava/lang/Object;

    .line 8
    .line 9
    sget-object v1, Ldefpackage/cw;->l:Ldefpackage/f01;

    .line 10
    .line 11
    if-eq v0, v1, :cond_0

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    iget-object p0, p0, Ldefpackage/xv;->p:Ldefpackage/aw;

    .line 15
    .line 16
    invoke-virtual {p0}, Ldefpackage/aw;->t()Ljava/lang/Throwable;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    sget v0, Ldefpackage/mk4;->a:I

    .line 21
    .line 22
    throw p0

    .line 23
    :cond_1
    const-string p0, "`hasNext()` has not been invoked"

    .line 24
    .line 25
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const/4 p0, 0x0

    .line 29
    return-object p0
.end method
