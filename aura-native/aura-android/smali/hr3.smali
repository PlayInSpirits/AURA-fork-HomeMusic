.class public final Lhr3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lno2;
.implements Lm51;
.implements Lhd2;
.implements Lkd2;
.implements Lo44;


# static fields
.field public static final e0:Ljava/util/Map;

.field public static final f0:Ltb1;


# instance fields
.field public final A:Lz05;

.field public final B:Lq90;

.field public final C:Lar3;

.field public final D:Lar3;

.field public final E:Landroid/os/Handler;

.field public F:Lmo2;

.field public G:Liv1;

.field public H:[Ldr3;

.field public I:[Lp44;

.field public J:[Lgr3;

.field public K:Z

.field public L:Z

.field public M:Z

.field public N:Z

.field public O:Lss0;

.field public P:Lm84;

.field public Q:J

.field public R:Z

.field public S:I

.field public T:Z

.field public U:Z

.field public V:Z

.field public W:I

.field public X:Z

.field public Y:J

.field public Z:J

.field public a0:Z

.field public b0:I

.field public c0:Z

.field public d0:Z

.field public final n:Landroid/net/Uri;

.field public final o:Lci0;

.field public final p:Lww0;

.field public final q:Li80;

.field public final r:Lue1;

.field public final s:Lsw0;

.field public final t:Lkr3;

.field public final u:Ln9;

.field public final v:Ljava/lang/String;

.field public final w:J

.field public final x:Ltb1;

.field public final y:J

.field public final z:Li61;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "Icy-MetaData"

    .line 7
    .line 8
    const-string v2, "1"

    .line 9
    .line 10
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, Lhr3;->e0:Ljava/util/Map;

    .line 18
    .line 19
    new-instance v0, Lsb1;

    .line 20
    .line 21
    invoke-direct {v0}, Lsb1;-><init>()V

    .line 22
    .line 23
    .line 24
    const-string v1, "icy"

    .line 25
    .line 26
    iput-object v1, v0, Lsb1;->a:Ljava/lang/String;

    .line 27
    .line 28
    const-string v1, "application/x-icy"

    .line 29
    .line 30
    invoke-static {v1}, Llw2;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    iput-object v1, v0, Lsb1;->m:Ljava/lang/String;

    .line 35
    .line 36
    new-instance v1, Ltb1;

    .line 37
    .line 38
    invoke-direct {v1, v0}, Ltb1;-><init>(Lsb1;)V

    .line 39
    .line 40
    .line 41
    sput-object v1, Lhr3;->f0:Ltb1;

    .line 42
    .line 43
    return-void
.end method

.method public constructor <init>(Landroid/net/Uri;Lci0;Lz05;Lww0;Lsw0;Li80;Lue1;Lkr3;Ln9;Ljava/lang/String;ILtb1;JLty3;)V
    .locals 1

    .line 1
    move-object/from16 v0, p15

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lhr3;->n:Landroid/net/Uri;

    .line 7
    .line 8
    iput-object p2, p0, Lhr3;->o:Lci0;

    .line 9
    .line 10
    iput-object p4, p0, Lhr3;->p:Lww0;

    .line 11
    .line 12
    iput-object p5, p0, Lhr3;->s:Lsw0;

    .line 13
    .line 14
    iput-object p6, p0, Lhr3;->q:Li80;

    .line 15
    .line 16
    iput-object p7, p0, Lhr3;->r:Lue1;

    .line 17
    .line 18
    iput-object p8, p0, Lhr3;->t:Lkr3;

    .line 19
    .line 20
    iput-object p9, p0, Lhr3;->u:Ln9;

    .line 21
    .line 22
    iput-object p10, p0, Lhr3;->v:Ljava/lang/String;

    .line 23
    .line 24
    int-to-long p1, p11

    .line 25
    iput-wide p1, p0, Lhr3;->w:J

    .line 26
    .line 27
    iput-object p12, p0, Lhr3;->x:Ltb1;

    .line 28
    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    new-instance p1, Li61;

    .line 32
    .line 33
    invoke-direct {p1, v0}, Li61;-><init>(Lty3;)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    new-instance p1, Li61;

    .line 38
    .line 39
    const-string p2, "ProgressiveMediaPeriod"

    .line 40
    .line 41
    invoke-direct {p1, p2}, Li61;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    :goto_0
    iput-object p1, p0, Lhr3;->z:Li61;

    .line 45
    .line 46
    iput-object p3, p0, Lhr3;->A:Lz05;

    .line 47
    .line 48
    iput-wide p13, p0, Lhr3;->y:J

    .line 49
    .line 50
    new-instance p1, Lq90;

    .line 51
    .line 52
    invoke-direct {p1}, Lq90;-><init>()V

    .line 53
    .line 54
    .line 55
    iput-object p1, p0, Lhr3;->B:Lq90;

    .line 56
    .line 57
    new-instance p1, Lar3;

    .line 58
    .line 59
    const/4 p2, 0x1

    .line 60
    invoke-direct {p1, p0, p2}, Lar3;-><init>(Lhr3;I)V

    .line 61
    .line 62
    .line 63
    iput-object p1, p0, Lhr3;->C:Lar3;

    .line 64
    .line 65
    new-instance p1, Lar3;

    .line 66
    .line 67
    const/4 p3, 0x2

    .line 68
    invoke-direct {p1, p0, p3}, Lar3;-><init>(Lhr3;I)V

    .line 69
    .line 70
    .line 71
    iput-object p1, p0, Lhr3;->D:Lar3;

    .line 72
    .line 73
    const/4 p1, 0x0

    .line 74
    invoke-static {p1}, Lf35;->p(Lnk2;)Landroid/os/Handler;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    iput-object p1, p0, Lhr3;->E:Landroid/os/Handler;

    .line 79
    .line 80
    const/4 p1, 0x0

    .line 81
    new-array p3, p1, [Lgr3;

    .line 82
    .line 83
    iput-object p3, p0, Lhr3;->J:[Lgr3;

    .line 84
    .line 85
    new-array p3, p1, [Lp44;

    .line 86
    .line 87
    iput-object p3, p0, Lhr3;->I:[Lp44;

    .line 88
    .line 89
    new-array p1, p1, [Ldr3;

    .line 90
    .line 91
    iput-object p1, p0, Lhr3;->H:[Ldr3;

    .line 92
    .line 93
    const-wide p3, -0x7fffffffffffffffL    # -4.9E-324

    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    iput-wide p3, p0, Lhr3;->Z:J

    .line 99
    .line 100
    iput p2, p0, Lhr3;->S:I

    .line 101
    .line 102
    return-void
.end method


# virtual methods
.method public final A()V
    .locals 15

    .line 1
    iget-wide v0, p0, Lhr3;->y:J

    .line 2
    .line 3
    iget-boolean v2, p0, Lhr3;->d0:Z

    .line 4
    .line 5
    if-nez v2, :cond_c

    .line 6
    .line 7
    iget-boolean v2, p0, Lhr3;->L:Z

    .line 8
    .line 9
    if-nez v2, :cond_c

    .line 10
    .line 11
    iget-boolean v2, p0, Lhr3;->K:Z

    .line 12
    .line 13
    if-eqz v2, :cond_c

    .line 14
    .line 15
    iget-object v2, p0, Lhr3;->P:Lm84;

    .line 16
    .line 17
    if-nez v2, :cond_0

    .line 18
    .line 19
    goto/16 :goto_6

    .line 20
    .line 21
    :cond_0
    iget-object v2, p0, Lhr3;->I:[Lp44;

    .line 22
    .line 23
    array-length v3, v2

    .line 24
    const/4 v4, 0x0

    .line 25
    move v5, v4

    .line 26
    :goto_0
    if-ge v5, v3, :cond_2

    .line 27
    .line 28
    aget-object v6, v2, v5

    .line 29
    .line 30
    invoke-virtual {v6}, Lp44;->r()Ltb1;

    .line 31
    .line 32
    .line 33
    move-result-object v6

    .line 34
    if-nez v6, :cond_1

    .line 35
    .line 36
    goto/16 :goto_6

    .line 37
    .line 38
    :cond_1
    add-int/lit8 v5, v5, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    iget-object v2, p0, Lhr3;->B:Lq90;

    .line 42
    .line 43
    monitor-enter v2

    .line 44
    :try_start_0
    iput-boolean v4, v2, Lq90;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    .line 46
    monitor-exit v2

    .line 47
    iget-object v2, p0, Lhr3;->I:[Lp44;

    .line 48
    .line 49
    array-length v2, v2

    .line 50
    new-array v3, v2, [Lsv4;

    .line 51
    .line 52
    new-array v5, v2, [Z

    .line 53
    .line 54
    move v6, v4

    .line 55
    :goto_1
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    const/4 v9, 0x1

    .line 61
    if-ge v6, v2, :cond_a

    .line 62
    .line 63
    iget-object v10, p0, Lhr3;->I:[Lp44;

    .line 64
    .line 65
    aget-object v10, v10, v6

    .line 66
    .line 67
    invoke-virtual {v10}, Lp44;->r()Ltb1;

    .line 68
    .line 69
    .line 70
    move-result-object v10

    .line 71
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    iget-object v11, v10, Ltb1;->n:Ljava/lang/String;

    .line 75
    .line 76
    invoke-static {v11}, Llw2;->i(Ljava/lang/String;)Z

    .line 77
    .line 78
    .line 79
    move-result v12

    .line 80
    if-nez v12, :cond_4

    .line 81
    .line 82
    invoke-static {v11}, Llw2;->l(Ljava/lang/String;)Z

    .line 83
    .line 84
    .line 85
    move-result v13

    .line 86
    if-eqz v13, :cond_3

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_3
    move v13, v4

    .line 90
    goto :goto_3

    .line 91
    :cond_4
    :goto_2
    move v13, v9

    .line 92
    :goto_3
    aput-boolean v13, v5, v6

    .line 93
    .line 94
    iget-boolean v14, p0, Lhr3;->M:Z

    .line 95
    .line 96
    or-int/2addr v13, v14

    .line 97
    iput-boolean v13, p0, Lhr3;->M:Z

    .line 98
    .line 99
    invoke-static {v11}, Llw2;->j(Ljava/lang/String;)Z

    .line 100
    .line 101
    .line 102
    move-result v11

    .line 103
    cmp-long v7, v0, v7

    .line 104
    .line 105
    if-eqz v7, :cond_5

    .line 106
    .line 107
    if-ne v2, v9, :cond_5

    .line 108
    .line 109
    if-eqz v11, :cond_5

    .line 110
    .line 111
    move v7, v9

    .line 112
    goto :goto_4

    .line 113
    :cond_5
    move v7, v4

    .line 114
    :goto_4
    iput-boolean v7, p0, Lhr3;->N:Z

    .line 115
    .line 116
    iget-object v7, p0, Lhr3;->G:Liv1;

    .line 117
    .line 118
    if-eqz v7, :cond_9

    .line 119
    .line 120
    iget v8, v7, Liv1;->a:I

    .line 121
    .line 122
    if-nez v12, :cond_6

    .line 123
    .line 124
    iget-object v11, p0, Lhr3;->J:[Lgr3;

    .line 125
    .line 126
    aget-object v11, v11, v6

    .line 127
    .line 128
    iget-boolean v11, v11, Lgr3;->b:Z

    .line 129
    .line 130
    if-eqz v11, :cond_8

    .line 131
    .line 132
    :cond_6
    iget-object v11, v10, Ltb1;->l:Lqv2;

    .line 133
    .line 134
    if-nez v11, :cond_7

    .line 135
    .line 136
    new-instance v11, Lqv2;

    .line 137
    .line 138
    new-array v9, v9, [Lpv2;

    .line 139
    .line 140
    aput-object v7, v9, v4

    .line 141
    .line 142
    invoke-direct {v11, v9}, Lqv2;-><init>([Lpv2;)V

    .line 143
    .line 144
    .line 145
    goto :goto_5

    .line 146
    :cond_7
    new-array v9, v9, [Lpv2;

    .line 147
    .line 148
    aput-object v7, v9, v4

    .line 149
    .line 150
    invoke-virtual {v11, v9}, Lqv2;->a([Lpv2;)Lqv2;

    .line 151
    .line 152
    .line 153
    move-result-object v11

    .line 154
    :goto_5
    invoke-virtual {v10}, Ltb1;->a()Lsb1;

    .line 155
    .line 156
    .line 157
    move-result-object v7

    .line 158
    iput-object v11, v7, Lsb1;->k:Lqv2;

    .line 159
    .line 160
    new-instance v10, Ltb1;

    .line 161
    .line 162
    invoke-direct {v10, v7}, Ltb1;-><init>(Lsb1;)V

    .line 163
    .line 164
    .line 165
    :cond_8
    if-eqz v12, :cond_9

    .line 166
    .line 167
    iget v7, v10, Ltb1;->h:I

    .line 168
    .line 169
    const/4 v9, -0x1

    .line 170
    if-ne v7, v9, :cond_9

    .line 171
    .line 172
    iget v7, v10, Ltb1;->i:I

    .line 173
    .line 174
    if-ne v7, v9, :cond_9

    .line 175
    .line 176
    if-eq v8, v9, :cond_9

    .line 177
    .line 178
    invoke-virtual {v10}, Ltb1;->a()Lsb1;

    .line 179
    .line 180
    .line 181
    move-result-object v7

    .line 182
    iput v8, v7, Lsb1;->h:I

    .line 183
    .line 184
    new-instance v10, Ltb1;

    .line 185
    .line 186
    invoke-direct {v10, v7}, Ltb1;-><init>(Lsb1;)V

    .line 187
    .line 188
    .line 189
    :cond_9
    iget-object v7, p0, Lhr3;->p:Lww0;

    .line 190
    .line 191
    invoke-interface {v7, v10}, Lww0;->f(Ltb1;)I

    .line 192
    .line 193
    .line 194
    move-result v7

    .line 195
    invoke-virtual {v10}, Ltb1;->a()Lsb1;

    .line 196
    .line 197
    .line 198
    move-result-object v8

    .line 199
    iput v7, v8, Lsb1;->N:I

    .line 200
    .line 201
    new-instance v7, Ltb1;

    .line 202
    .line 203
    invoke-direct {v7, v8}, Ltb1;-><init>(Lsb1;)V

    .line 204
    .line 205
    .line 206
    new-instance v8, Lsv4;

    .line 207
    .line 208
    invoke-static {v6}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v9

    .line 212
    filled-new-array {v7}, [Ltb1;

    .line 213
    .line 214
    .line 215
    move-result-object v10

    .line 216
    invoke-direct {v8, v9, v10}, Lsv4;-><init>(Ljava/lang/String;[Ltb1;)V

    .line 217
    .line 218
    .line 219
    aput-object v8, v3, v6

    .line 220
    .line 221
    iget-boolean v8, p0, Lhr3;->V:Z

    .line 222
    .line 223
    iget-boolean v7, v7, Ltb1;->t:Z

    .line 224
    .line 225
    or-int/2addr v7, v8

    .line 226
    iput-boolean v7, p0, Lhr3;->V:Z

    .line 227
    .line 228
    add-int/lit8 v6, v6, 0x1

    .line 229
    .line 230
    goto/16 :goto_1

    .line 231
    .line 232
    :cond_a
    new-instance v2, Lss0;

    .line 233
    .line 234
    new-instance v4, Ltv4;

    .line 235
    .line 236
    invoke-direct {v4, v3}, Ltv4;-><init>([Lsv4;)V

    .line 237
    .line 238
    .line 239
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 240
    .line 241
    .line 242
    iput-object v4, v2, Lss0;->n:Ljava/lang/Object;

    .line 243
    .line 244
    iput-object v5, v2, Lss0;->o:Ljava/lang/Object;

    .line 245
    .line 246
    iget v3, v4, Ltv4;->a:I

    .line 247
    .line 248
    new-array v4, v3, [Z

    .line 249
    .line 250
    iput-object v4, v2, Lss0;->p:Ljava/lang/Object;

    .line 251
    .line 252
    new-array v3, v3, [Z

    .line 253
    .line 254
    iput-object v3, v2, Lss0;->q:Ljava/lang/Object;

    .line 255
    .line 256
    iput-object v2, p0, Lhr3;->O:Lss0;

    .line 257
    .line 258
    iget-boolean v2, p0, Lhr3;->N:Z

    .line 259
    .line 260
    if-eqz v2, :cond_b

    .line 261
    .line 262
    iget-wide v2, p0, Lhr3;->Q:J

    .line 263
    .line 264
    cmp-long v2, v2, v7

    .line 265
    .line 266
    if-nez v2, :cond_b

    .line 267
    .line 268
    iput-wide v0, p0, Lhr3;->Q:J

    .line 269
    .line 270
    new-instance v0, Lbr3;

    .line 271
    .line 272
    iget-object v1, p0, Lhr3;->P:Lm84;

    .line 273
    .line 274
    invoke-direct {v0, p0, v1}, Lbr3;-><init>(Lhr3;Lm84;)V

    .line 275
    .line 276
    .line 277
    iput-object v0, p0, Lhr3;->P:Lm84;

    .line 278
    .line 279
    :cond_b
    iget-object v0, p0, Lhr3;->t:Lkr3;

    .line 280
    .line 281
    iget-wide v1, p0, Lhr3;->Q:J

    .line 282
    .line 283
    iget-object v3, p0, Lhr3;->P:Lm84;

    .line 284
    .line 285
    iget-boolean v4, p0, Lhr3;->R:Z

    .line 286
    .line 287
    invoke-virtual {v0, v1, v2, v3, v4}, Lkr3;->u(JLm84;Z)V

    .line 288
    .line 289
    .line 290
    iput-boolean v9, p0, Lhr3;->L:Z

    .line 291
    .line 292
    iget-object v0, p0, Lhr3;->F:Lmo2;

    .line 293
    .line 294
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 295
    .line 296
    .line 297
    invoke-interface {v0, p0}, Lmo2;->b(Lno2;)V

    .line 298
    .line 299
    .line 300
    return-void

    .line 301
    :catchall_0
    move-exception p0

    .line 302
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 303
    throw p0

    .line 304
    :cond_c
    :goto_6
    return-void
.end method

.method public final B(I)V
    .locals 13

    .line 1
    invoke-virtual {p0}, Lhr3;->v()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lhr3;->O:Lss0;

    .line 5
    .line 6
    iget-object v1, v0, Lss0;->q:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, [Z

    .line 9
    .line 10
    aget-boolean v2, v1, p1

    .line 11
    .line 12
    if-nez v2, :cond_0

    .line 13
    .line 14
    iget-object v0, v0, Lss0;->n:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Ltv4;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Ltv4;->a(I)Lsv4;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const/4 v2, 0x0

    .line 23
    iget-object v0, v0, Lsv4;->d:[Ltb1;

    .line 24
    .line 25
    aget-object v6, v0, v2

    .line 26
    .line 27
    iget-object v0, v6, Ltb1;->n:Ljava/lang/String;

    .line 28
    .line 29
    invoke-static {v0}, Llw2;->h(Ljava/lang/String;)I

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    iget-wide v2, p0, Lhr3;->Y:J

    .line 34
    .line 35
    move-wide v7, v2

    .line 36
    new-instance v3, Lun2;

    .line 37
    .line 38
    invoke-static {v7, v8}, Lf35;->i0(J)J

    .line 39
    .line 40
    .line 41
    move-result-wide v9

    .line 42
    const-wide v11, -0x7fffffffffffffffL    # -4.9E-324

    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    const/4 v4, 0x1

    .line 48
    const/4 v7, 0x0

    .line 49
    const/4 v8, 0x0

    .line 50
    invoke-direct/range {v3 .. v12}, Lun2;-><init>(IILtb1;ILjava/lang/Object;JJ)V

    .line 51
    .line 52
    .line 53
    new-instance v0, Lbt2;

    .line 54
    .line 55
    iget-object p0, p0, Lhr3;->r:Lue1;

    .line 56
    .line 57
    invoke-direct {v0, p0, v3}, Lbt2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0, v0}, Lue1;->i(Lwc0;)V

    .line 61
    .line 62
    .line 63
    const/4 p0, 0x1

    .line 64
    aput-boolean p0, v1, p1

    .line 65
    .line 66
    :cond_0
    return-void
.end method

.method public final C(I)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lhr3;->v()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lhr3;->a0:Z

    .line 5
    .line 6
    if-eqz v0, :cond_3

    .line 7
    .line 8
    iget-boolean v0, p0, Lhr3;->M:Z

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lhr3;->O:Lss0;

    .line 13
    .line 14
    iget-object v0, v0, Lss0;->o:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, [Z

    .line 17
    .line 18
    aget-boolean v0, v0, p1

    .line 19
    .line 20
    if-eqz v0, :cond_3

    .line 21
    .line 22
    :cond_0
    iget-object v0, p0, Lhr3;->I:[Lp44;

    .line 23
    .line 24
    aget-object p1, v0, p1

    .line 25
    .line 26
    const/4 v0, 0x0

    .line 27
    invoke-virtual {p1, v0}, Lp44;->s(Z)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-eqz p1, :cond_1

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    const-wide/16 v1, 0x0

    .line 35
    .line 36
    iput-wide v1, p0, Lhr3;->Z:J

    .line 37
    .line 38
    iput-boolean v0, p0, Lhr3;->a0:Z

    .line 39
    .line 40
    const/4 p1, 0x1

    .line 41
    iput-boolean p1, p0, Lhr3;->U:Z

    .line 42
    .line 43
    iput-wide v1, p0, Lhr3;->Y:J

    .line 44
    .line 45
    iput v0, p0, Lhr3;->b0:I

    .line 46
    .line 47
    iget-object p1, p0, Lhr3;->I:[Lp44;

    .line 48
    .line 49
    array-length v1, p1

    .line 50
    move v2, v0

    .line 51
    :goto_0
    if-ge v2, v1, :cond_2

    .line 52
    .line 53
    aget-object v3, p1, v2

    .line 54
    .line 55
    invoke-virtual {v3, v0}, Lp44;->x(Z)V

    .line 56
    .line 57
    .line 58
    add-int/lit8 v2, v2, 0x1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_2
    iget-object p1, p0, Lhr3;->F:Lmo2;

    .line 62
    .line 63
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    invoke-interface {p1, p0}, Lca4;->j(Lda4;)V

    .line 67
    .line 68
    .line 69
    :cond_3
    :goto_1
    return-void
.end method

.method public final D(Lgr3;)Lwv4;
    .locals 5

    .line 1
    iget-object v0, p0, Lhr3;->I:[Lp44;

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    const/4 v1, 0x0

    .line 5
    :goto_0
    if-ge v1, v0, :cond_1

    .line 6
    .line 7
    iget-object v2, p0, Lhr3;->J:[Lgr3;

    .line 8
    .line 9
    aget-object v2, v2, v1

    .line 10
    .line 11
    invoke-virtual {p1, v2}, Lgr3;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    iget-object p0, p0, Lhr3;->I:[Lp44;

    .line 18
    .line 19
    aget-object p0, p0, v1

    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    iget-boolean v1, p0, Lhr3;->K:Z

    .line 26
    .line 27
    if-eqz v1, :cond_2

    .line 28
    .line 29
    new-instance p0, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    const-string v0, "Extractor added new track (id="

    .line 32
    .line 33
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    iget p1, p1, Lgr3;->a:I

    .line 37
    .line 38
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string p1, ") after finishing tracks."

    .line 42
    .line 43
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    const-string p1, "ProgressiveMediaPeriod"

    .line 51
    .line 52
    invoke-static {p1, p0}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    new-instance p0, Ltq0;

    .line 56
    .line 57
    invoke-direct {p0}, Ltq0;-><init>()V

    .line 58
    .line 59
    .line 60
    return-object p0

    .line 61
    :cond_2
    new-instance v1, Lp44;

    .line 62
    .line 63
    iget-object v2, p0, Lhr3;->p:Lww0;

    .line 64
    .line 65
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    iget-object v3, p0, Lhr3;->u:Ln9;

    .line 69
    .line 70
    iget-object v4, p0, Lhr3;->s:Lsw0;

    .line 71
    .line 72
    invoke-direct {v1, v3, v2, v4}, Lp44;-><init>(Ln9;Lww0;Lsw0;)V

    .line 73
    .line 74
    .line 75
    new-instance v2, Ldr3;

    .line 76
    .line 77
    invoke-direct {v2, v1}, Ldr3;-><init>(Lp44;)V

    .line 78
    .line 79
    .line 80
    iput-object p0, v1, Lp44;->f:Lo44;

    .line 81
    .line 82
    iget-object v3, p0, Lhr3;->J:[Lgr3;

    .line 83
    .line 84
    add-int/lit8 v4, v0, 0x1

    .line 85
    .line 86
    invoke-static {v3, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    check-cast v3, [Lgr3;

    .line 91
    .line 92
    aput-object p1, v3, v0

    .line 93
    .line 94
    iput-object v3, p0, Lhr3;->J:[Lgr3;

    .line 95
    .line 96
    iget-object p1, p0, Lhr3;->I:[Lp44;

    .line 97
    .line 98
    invoke-static {p1, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    check-cast p1, [Lp44;

    .line 103
    .line 104
    aput-object v1, p1, v0

    .line 105
    .line 106
    iput-object p1, p0, Lhr3;->I:[Lp44;

    .line 107
    .line 108
    iget-object p1, p0, Lhr3;->H:[Ldr3;

    .line 109
    .line 110
    invoke-static {p1, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    check-cast p1, [Ldr3;

    .line 115
    .line 116
    aput-object v2, p1, v0

    .line 117
    .line 118
    iput-object p1, p0, Lhr3;->H:[Ldr3;

    .line 119
    .line 120
    return-object v2
.end method

.method public final E(Lm84;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lhr3;->G:Liv1;

    .line 2
    .line 3
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    move-object v0, p1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    new-instance v0, Lbo;

    .line 13
    .line 14
    invoke-direct {v0, v1, v2}, Lbo;-><init>(J)V

    .line 15
    .line 16
    .line 17
    :goto_0
    iput-object v0, p0, Lhr3;->P:Lm84;

    .line 18
    .line 19
    invoke-interface {p1}, Lm84;->g()J

    .line 20
    .line 21
    .line 22
    move-result-wide v3

    .line 23
    iput-wide v3, p0, Lhr3;->Q:J

    .line 24
    .line 25
    iget-boolean v0, p0, Lhr3;->X:Z

    .line 26
    .line 27
    const/4 v3, 0x1

    .line 28
    if-nez v0, :cond_1

    .line 29
    .line 30
    invoke-interface {p1}, Lm84;->g()J

    .line 31
    .line 32
    .line 33
    move-result-wide v4

    .line 34
    cmp-long v0, v4, v1

    .line 35
    .line 36
    if-nez v0, :cond_1

    .line 37
    .line 38
    move v0, v3

    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const/4 v0, 0x0

    .line 41
    :goto_1
    iput-boolean v0, p0, Lhr3;->R:Z

    .line 42
    .line 43
    if-eqz v0, :cond_2

    .line 44
    .line 45
    const/4 v3, 0x7

    .line 46
    :cond_2
    iput v3, p0, Lhr3;->S:I

    .line 47
    .line 48
    iget-boolean v1, p0, Lhr3;->L:Z

    .line 49
    .line 50
    if-eqz v1, :cond_3

    .line 51
    .line 52
    iget-object v1, p0, Lhr3;->t:Lkr3;

    .line 53
    .line 54
    iget-wide v2, p0, Lhr3;->Q:J

    .line 55
    .line 56
    invoke-virtual {v1, v2, v3, p1, v0}, Lkr3;->u(JLm84;Z)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_3
    invoke-virtual {p0}, Lhr3;->A()V

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method public final F()V
    .locals 9

    .line 1
    new-instance v0, Ler3;

    .line 2
    .line 3
    iget-object v4, p0, Lhr3;->A:Lz05;

    .line 4
    .line 5
    iget-object v6, p0, Lhr3;->B:Lq90;

    .line 6
    .line 7
    iget-object v2, p0, Lhr3;->n:Landroid/net/Uri;

    .line 8
    .line 9
    iget-object v3, p0, Lhr3;->o:Lci0;

    .line 10
    .line 11
    move-object v5, p0

    .line 12
    move-object v1, p0

    .line 13
    invoke-direct/range {v0 .. v6}, Ler3;-><init>(Lhr3;Landroid/net/Uri;Lci0;Lz05;Lhr3;Lq90;)V

    .line 14
    .line 15
    .line 16
    iget-boolean p0, v1, Lhr3;->L:Z

    .line 17
    .line 18
    if-eqz p0, :cond_2

    .line 19
    .line 20
    invoke-virtual {v1}, Lhr3;->z()Z

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    invoke-static {p0}, Lrr2;->w(Z)V

    .line 25
    .line 26
    .line 27
    iget-wide v2, v1, Lhr3;->Q:J

    .line 28
    .line 29
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    cmp-long p0, v2, v4

    .line 35
    .line 36
    const/4 v6, 0x1

    .line 37
    if-eqz p0, :cond_0

    .line 38
    .line 39
    iget-wide v7, v1, Lhr3;->Z:J

    .line 40
    .line 41
    cmp-long p0, v7, v2

    .line 42
    .line 43
    if-lez p0, :cond_0

    .line 44
    .line 45
    iput-boolean v6, v1, Lhr3;->c0:Z

    .line 46
    .line 47
    iput-wide v4, v1, Lhr3;->Z:J

    .line 48
    .line 49
    return-void

    .line 50
    :cond_0
    iget-object p0, v1, Lhr3;->P:Lm84;

    .line 51
    .line 52
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    iget-wide v2, v1, Lhr3;->Z:J

    .line 56
    .line 57
    invoke-interface {p0, v2, v3}, Lm84;->e(J)Ll84;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    iget-object p0, p0, Ll84;->a:Lo84;

    .line 62
    .line 63
    iget-wide v2, p0, Lo84;->b:J

    .line 64
    .line 65
    iget-wide v7, v1, Lhr3;->Z:J

    .line 66
    .line 67
    iget-object p0, v0, Ler3;->f:Lt71;

    .line 68
    .line 69
    iput-wide v2, p0, Lt71;->a:J

    .line 70
    .line 71
    iput-wide v7, v0, Ler3;->i:J

    .line 72
    .line 73
    iput-boolean v6, v0, Ler3;->h:Z

    .line 74
    .line 75
    const/4 p0, 0x0

    .line 76
    iput-boolean p0, v0, Ler3;->l:Z

    .line 77
    .line 78
    iget-object v2, v1, Lhr3;->I:[Lp44;

    .line 79
    .line 80
    array-length v3, v2

    .line 81
    :goto_0
    if-ge p0, v3, :cond_1

    .line 82
    .line 83
    aget-object v6, v2, p0

    .line 84
    .line 85
    iget-wide v7, v1, Lhr3;->Z:J

    .line 86
    .line 87
    iput-wide v7, v6, Lp44;->t:J

    .line 88
    .line 89
    add-int/lit8 p0, p0, 0x1

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_1
    iput-wide v4, v1, Lhr3;->Z:J

    .line 93
    .line 94
    :cond_2
    invoke-virtual {v1}, Lhr3;->x()I

    .line 95
    .line 96
    .line 97
    move-result p0

    .line 98
    iput p0, v1, Lhr3;->b0:I

    .line 99
    .line 100
    iget-object p0, v1, Lhr3;->q:Li80;

    .line 101
    .line 102
    iget v2, v1, Lhr3;->S:I

    .line 103
    .line 104
    invoke-virtual {p0, v2}, Li80;->D(I)I

    .line 105
    .line 106
    .line 107
    move-result p0

    .line 108
    iget-object v2, v1, Lhr3;->z:Li61;

    .line 109
    .line 110
    invoke-virtual {v2, v0, v1, p0}, Li61;->u(Ljd2;Lhd2;I)V

    .line 111
    .line 112
    .line 113
    return-void
.end method

.method public final G()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lhr3;->U:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p0}, Lhr3;->z()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return p0

    .line 14
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 15
    return p0
.end method

.method public final a()V
    .locals 7

    .line 1
    iget-object v0, p0, Lhr3;->I:[Lp44;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    :goto_0
    const/4 v3, 0x0

    .line 6
    if-ge v2, v1, :cond_1

    .line 7
    .line 8
    aget-object v4, v0, v2

    .line 9
    .line 10
    const/4 v5, 0x1

    .line 11
    invoke-virtual {v4, v5}, Lp44;->x(Z)V

    .line 12
    .line 13
    .line 14
    iget-object v5, v4, Lp44;->h:Lpw0;

    .line 15
    .line 16
    if-eqz v5, :cond_0

    .line 17
    .line 18
    iget-object v6, v4, Lp44;->e:Lsw0;

    .line 19
    .line 20
    invoke-interface {v5, v6}, Lpw0;->d(Lsw0;)V

    .line 21
    .line 22
    .line 23
    iput-object v3, v4, Lp44;->h:Lpw0;

    .line 24
    .line 25
    iput-object v3, v4, Lp44;->g:Ltb1;

    .line 26
    .line 27
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    iget-object p0, p0, Lhr3;->A:Lz05;

    .line 31
    .line 32
    iget-object v0, p0, Lz05;->p:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v0, Lk51;

    .line 35
    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    invoke-interface {v0}, Lk51;->a()V

    .line 39
    .line 40
    .line 41
    iput-object v3, p0, Lz05;->p:Ljava/lang/Object;

    .line 42
    .line 43
    :cond_2
    iput-object v3, p0, Lz05;->q:Ljava/lang/Object;

    .line 44
    .line 45
    return-void
.end method

.method public final b(Ljd2;JJZ)V
    .locals 12

    .line 1
    check-cast p1, Ler3;

    .line 2
    .line 3
    iget-object v0, p1, Ler3;->b:Lyl4;

    .line 4
    .line 5
    new-instance v1, Led2;

    .line 6
    .line 7
    iget-object v2, p1, Ler3;->j:Lii0;

    .line 8
    .line 9
    iget-object v3, v0, Lyl4;->p:Landroid/net/Uri;

    .line 10
    .line 11
    iget-object v4, v0, Lyl4;->q:Ljava/util/Map;

    .line 12
    .line 13
    iget-wide v9, v0, Lyl4;->o:J

    .line 14
    .line 15
    move-wide v5, p2

    .line 16
    move-wide/from16 v7, p4

    .line 17
    .line 18
    invoke-direct/range {v1 .. v10}, Led2;-><init>(Lii0;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lhr3;->q:Li80;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    iget-wide v8, p1, Ler3;->i:J

    .line 27
    .line 28
    iget-wide v10, p0, Lhr3;->Q:J

    .line 29
    .line 30
    move-object v2, v1

    .line 31
    iget-object v1, p0, Lhr3;->r:Lue1;

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    const/4 v4, -0x1

    .line 35
    const/4 v5, 0x0

    .line 36
    const/4 v6, 0x0

    .line 37
    const/4 v7, 0x0

    .line 38
    invoke-virtual/range {v1 .. v11}, Lue1;->q(Led2;IILtb1;ILjava/lang/Object;JJ)V

    .line 39
    .line 40
    .line 41
    if-nez p6, :cond_1

    .line 42
    .line 43
    iget-object p1, p0, Lhr3;->I:[Lp44;

    .line 44
    .line 45
    array-length v0, p1

    .line 46
    const/4 v1, 0x0

    .line 47
    move v2, v1

    .line 48
    :goto_0
    if-ge v2, v0, :cond_0

    .line 49
    .line 50
    aget-object v3, p1, v2

    .line 51
    .line 52
    invoke-virtual {v3, v1}, Lp44;->x(Z)V

    .line 53
    .line 54
    .line 55
    add-int/lit8 v2, v2, 0x1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_0
    iget p1, p0, Lhr3;->W:I

    .line 59
    .line 60
    if-lez p1, :cond_1

    .line 61
    .line 62
    iget-object p1, p0, Lhr3;->F:Lmo2;

    .line 63
    .line 64
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    invoke-interface {p1, p0}, Lca4;->j(Lda4;)V

    .line 68
    .line 69
    .line 70
    :cond_1
    return-void
.end method

.method public final c([Lt41;[Z[Lq44;[ZJ)J
    .locals 8

    .line 1
    invoke-virtual {p0}, Lhr3;->v()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lhr3;->O:Lss0;

    .line 5
    .line 6
    iget-object v1, v0, Lss0;->n:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Ltv4;

    .line 9
    .line 10
    iget-object v0, v0, Lss0;->p:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, [Z

    .line 13
    .line 14
    iget v2, p0, Lhr3;->W:I

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    move v4, v3

    .line 18
    :goto_0
    array-length v5, p1

    .line 19
    const/4 v6, 0x1

    .line 20
    if-ge v4, v5, :cond_2

    .line 21
    .line 22
    aget-object v5, p3, v4

    .line 23
    .line 24
    if-eqz v5, :cond_1

    .line 25
    .line 26
    aget-object v7, p1, v4

    .line 27
    .line 28
    if-eqz v7, :cond_0

    .line 29
    .line 30
    aget-boolean v7, p2, v4

    .line 31
    .line 32
    if-nez v7, :cond_1

    .line 33
    .line 34
    :cond_0
    check-cast v5, Lfr3;

    .line 35
    .line 36
    iget v5, v5, Lfr3;->n:I

    .line 37
    .line 38
    aget-boolean v7, v0, v5

    .line 39
    .line 40
    invoke-static {v7}, Lrr2;->w(Z)V

    .line 41
    .line 42
    .line 43
    iget v7, p0, Lhr3;->W:I

    .line 44
    .line 45
    sub-int/2addr v7, v6

    .line 46
    iput v7, p0, Lhr3;->W:I

    .line 47
    .line 48
    aput-boolean v3, v0, v5

    .line 49
    .line 50
    const/4 v5, 0x0

    .line 51
    aput-object v5, p3, v4

    .line 52
    .line 53
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_2
    iget-boolean p2, p0, Lhr3;->T:Z

    .line 57
    .line 58
    if-eqz p2, :cond_4

    .line 59
    .line 60
    if-nez v2, :cond_3

    .line 61
    .line 62
    :goto_1
    move p2, v6

    .line 63
    goto :goto_2

    .line 64
    :cond_3
    move p2, v3

    .line 65
    goto :goto_2

    .line 66
    :cond_4
    const-wide/16 v4, 0x0

    .line 67
    .line 68
    cmp-long p2, p5, v4

    .line 69
    .line 70
    if-eqz p2, :cond_3

    .line 71
    .line 72
    iget-boolean p2, p0, Lhr3;->N:Z

    .line 73
    .line 74
    if-nez p2, :cond_3

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :goto_2
    move v2, v3

    .line 78
    :goto_3
    array-length v4, p1

    .line 79
    if-ge v2, v4, :cond_9

    .line 80
    .line 81
    aget-object v4, p3, v2

    .line 82
    .line 83
    if-nez v4, :cond_8

    .line 84
    .line 85
    aget-object v4, p1, v2

    .line 86
    .line 87
    if-eqz v4, :cond_8

    .line 88
    .line 89
    invoke-interface {v4}, Lt41;->length()I

    .line 90
    .line 91
    .line 92
    move-result v5

    .line 93
    if-ne v5, v6, :cond_5

    .line 94
    .line 95
    move v5, v6

    .line 96
    goto :goto_4

    .line 97
    :cond_5
    move v5, v3

    .line 98
    :goto_4
    invoke-static {v5}, Lrr2;->w(Z)V

    .line 99
    .line 100
    .line 101
    invoke-interface {v4, v3}, Lt41;->i(I)I

    .line 102
    .line 103
    .line 104
    move-result v5

    .line 105
    if-nez v5, :cond_6

    .line 106
    .line 107
    move v5, v6

    .line 108
    goto :goto_5

    .line 109
    :cond_6
    move v5, v3

    .line 110
    :goto_5
    invoke-static {v5}, Lrr2;->w(Z)V

    .line 111
    .line 112
    .line 113
    invoke-interface {v4}, Lt41;->c()Lsv4;

    .line 114
    .line 115
    .line 116
    move-result-object v5

    .line 117
    invoke-virtual {v1, v5}, Ltv4;->b(Lsv4;)I

    .line 118
    .line 119
    .line 120
    move-result v5

    .line 121
    aget-boolean v7, v0, v5

    .line 122
    .line 123
    xor-int/2addr v7, v6

    .line 124
    invoke-static {v7}, Lrr2;->w(Z)V

    .line 125
    .line 126
    .line 127
    iget v7, p0, Lhr3;->W:I

    .line 128
    .line 129
    add-int/2addr v7, v6

    .line 130
    iput v7, p0, Lhr3;->W:I

    .line 131
    .line 132
    aput-boolean v6, v0, v5

    .line 133
    .line 134
    iget-boolean v7, p0, Lhr3;->V:Z

    .line 135
    .line 136
    invoke-interface {v4}, Lt41;->m()Ltb1;

    .line 137
    .line 138
    .line 139
    move-result-object v4

    .line 140
    iget-boolean v4, v4, Ltb1;->t:Z

    .line 141
    .line 142
    or-int/2addr v4, v7

    .line 143
    iput-boolean v4, p0, Lhr3;->V:Z

    .line 144
    .line 145
    new-instance v4, Lfr3;

    .line 146
    .line 147
    invoke-direct {v4, p0, v5}, Lfr3;-><init>(Lhr3;I)V

    .line 148
    .line 149
    .line 150
    aput-object v4, p3, v2

    .line 151
    .line 152
    aput-boolean v6, p4, v2

    .line 153
    .line 154
    if-nez p2, :cond_8

    .line 155
    .line 156
    iget-object p2, p0, Lhr3;->I:[Lp44;

    .line 157
    .line 158
    aget-object p2, p2, v5

    .line 159
    .line 160
    invoke-virtual {p2}, Lp44;->o()I

    .line 161
    .line 162
    .line 163
    move-result v4

    .line 164
    if-eqz v4, :cond_7

    .line 165
    .line 166
    invoke-virtual {p2, v6, p5, p6}, Lp44;->z(ZJ)Z

    .line 167
    .line 168
    .line 169
    move-result p2

    .line 170
    if-nez p2, :cond_7

    .line 171
    .line 172
    move p2, v6

    .line 173
    goto :goto_6

    .line 174
    :cond_7
    move p2, v3

    .line 175
    :cond_8
    :goto_6
    add-int/lit8 v2, v2, 0x1

    .line 176
    .line 177
    goto :goto_3

    .line 178
    :cond_9
    iget p1, p0, Lhr3;->W:I

    .line 179
    .line 180
    if-nez p1, :cond_c

    .line 181
    .line 182
    iput-boolean v3, p0, Lhr3;->a0:Z

    .line 183
    .line 184
    iput-boolean v3, p0, Lhr3;->U:Z

    .line 185
    .line 186
    iput-boolean v3, p0, Lhr3;->V:Z

    .line 187
    .line 188
    iget-object p1, p0, Lhr3;->z:Li61;

    .line 189
    .line 190
    invoke-virtual {p1}, Li61;->l()Z

    .line 191
    .line 192
    .line 193
    move-result p2

    .line 194
    if-eqz p2, :cond_b

    .line 195
    .line 196
    iget-object p2, p0, Lhr3;->I:[Lp44;

    .line 197
    .line 198
    array-length p3, p2

    .line 199
    :goto_7
    if-ge v3, p3, :cond_a

    .line 200
    .line 201
    aget-object p4, p2, v3

    .line 202
    .line 203
    invoke-virtual {p4}, Lp44;->j()V

    .line 204
    .line 205
    .line 206
    add-int/lit8 v3, v3, 0x1

    .line 207
    .line 208
    goto :goto_7

    .line 209
    :cond_a
    invoke-virtual {p1}, Li61;->d()V

    .line 210
    .line 211
    .line 212
    goto :goto_a

    .line 213
    :cond_b
    iput-boolean v3, p0, Lhr3;->c0:Z

    .line 214
    .line 215
    iget-object p1, p0, Lhr3;->I:[Lp44;

    .line 216
    .line 217
    array-length p2, p1

    .line 218
    move p3, v3

    .line 219
    :goto_8
    if-ge p3, p2, :cond_e

    .line 220
    .line 221
    aget-object p4, p1, p3

    .line 222
    .line 223
    invoke-virtual {p4, v3}, Lp44;->x(Z)V

    .line 224
    .line 225
    .line 226
    add-int/lit8 p3, p3, 0x1

    .line 227
    .line 228
    goto :goto_8

    .line 229
    :cond_c
    if-eqz p2, :cond_e

    .line 230
    .line 231
    invoke-virtual {p0, p5, p6}, Lhr3;->i(J)J

    .line 232
    .line 233
    .line 234
    move-result-wide p5

    .line 235
    :goto_9
    array-length p1, p3

    .line 236
    if-ge v3, p1, :cond_e

    .line 237
    .line 238
    aget-object p1, p3, v3

    .line 239
    .line 240
    if-eqz p1, :cond_d

    .line 241
    .line 242
    aput-boolean v6, p4, v3

    .line 243
    .line 244
    :cond_d
    add-int/lit8 v3, v3, 0x1

    .line 245
    .line 246
    goto :goto_9

    .line 247
    :cond_e
    :goto_a
    iput-boolean v6, p0, Lhr3;->T:Z

    .line 248
    .line 249
    return-wide p5
.end method

.method public final d()J
    .locals 2

    .line 1
    invoke-virtual {p0}, Lhr3;->q()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    return-wide v0
.end method

.method public final e(JLn84;)J
    .locals 8

    .line 1
    invoke-virtual {p0}, Lhr3;->v()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lhr3;->P:Lm84;

    .line 5
    .line 6
    invoke-interface {v0}, Lm84;->b()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const-wide/16 p0, 0x0

    .line 13
    .line 14
    return-wide p0

    .line 15
    :cond_0
    iget-object p0, p0, Lhr3;->P:Lm84;

    .line 16
    .line 17
    invoke-interface {p0, p1, p2}, Lm84;->e(J)Ll84;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    iget-object v0, p0, Ll84;->a:Lo84;

    .line 22
    .line 23
    iget-wide v4, v0, Lo84;->a:J

    .line 24
    .line 25
    iget-object p0, p0, Ll84;->b:Lo84;

    .line 26
    .line 27
    iget-wide v6, p0, Lo84;->a:J

    .line 28
    .line 29
    move-wide v2, p1

    .line 30
    move-object v1, p3

    .line 31
    invoke-virtual/range {v1 .. v7}, Ln84;->a(JJJ)J

    .line 32
    .line 33
    .line 34
    move-result-wide p0

    .line 35
    return-wide p0
.end method

.method public final f()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lhr3;->z:Li61;

    .line 2
    .line 3
    invoke-virtual {v0}, Li61;->l()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object p0, p0, Lhr3;->B:Lq90;

    .line 10
    .line 11
    monitor-enter p0

    .line 12
    :try_start_0
    iget-boolean v0, p0, Lq90;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    monitor-exit p0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 p0, 0x1

    .line 18
    return p0

    .line 19
    :catchall_0
    move-exception v0

    .line 20
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 21
    throw v0

    .line 22
    :cond_0
    const/4 p0, 0x0

    .line 23
    return p0
.end method

.method public final g(Ljd2;JJ)V
    .locals 13

    .line 1
    check-cast p1, Ler3;

    .line 2
    .line 3
    iget-wide v0, p0, Lhr3;->Q:J

    .line 4
    .line 5
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    cmp-long v0, v0, v2

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    iget-object v0, p0, Lhr3;->P:Lm84;

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    invoke-virtual {p0, v1}, Lhr3;->y(Z)J

    .line 20
    .line 21
    .line 22
    move-result-wide v2

    .line 23
    const-wide/high16 v4, -0x8000000000000000L

    .line 24
    .line 25
    cmp-long v0, v2, v4

    .line 26
    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    const-wide/16 v2, 0x0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const-wide/16 v4, 0x2710

    .line 33
    .line 34
    add-long/2addr v2, v4

    .line 35
    :goto_0
    iput-wide v2, p0, Lhr3;->Q:J

    .line 36
    .line 37
    iget-object v0, p0, Lhr3;->P:Lm84;

    .line 38
    .line 39
    iget-boolean v4, p0, Lhr3;->R:Z

    .line 40
    .line 41
    iget-object v5, p0, Lhr3;->t:Lkr3;

    .line 42
    .line 43
    invoke-virtual {v5, v2, v3, v0, v4}, Lkr3;->u(JLm84;Z)V

    .line 44
    .line 45
    .line 46
    :cond_1
    iget-object v0, p1, Ler3;->b:Lyl4;

    .line 47
    .line 48
    new-instance v2, Led2;

    .line 49
    .line 50
    iget-object v3, p1, Ler3;->j:Lii0;

    .line 51
    .line 52
    iget-object v4, v0, Lyl4;->p:Landroid/net/Uri;

    .line 53
    .line 54
    iget-object v5, v0, Lyl4;->q:Ljava/util/Map;

    .line 55
    .line 56
    iget-wide v10, v0, Lyl4;->o:J

    .line 57
    .line 58
    move-wide v6, p2

    .line 59
    move-wide/from16 v8, p4

    .line 60
    .line 61
    invoke-direct/range {v2 .. v11}, Led2;-><init>(Lii0;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    .line 62
    .line 63
    .line 64
    iget-object v0, p0, Lhr3;->q:Li80;

    .line 65
    .line 66
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    iget-wide v9, p1, Ler3;->i:J

    .line 70
    .line 71
    iget-wide v11, p0, Lhr3;->Q:J

    .line 72
    .line 73
    move-object v3, v2

    .line 74
    iget-object v2, p0, Lhr3;->r:Lue1;

    .line 75
    .line 76
    const/4 v4, 0x1

    .line 77
    const/4 v5, -0x1

    .line 78
    const/4 v6, 0x0

    .line 79
    const/4 v7, 0x0

    .line 80
    const/4 v8, 0x0

    .line 81
    invoke-virtual/range {v2 .. v12}, Lue1;->r(Led2;IILtb1;ILjava/lang/Object;JJ)V

    .line 82
    .line 83
    .line 84
    iput-boolean v1, p0, Lhr3;->c0:Z

    .line 85
    .line 86
    iget-object p1, p0, Lhr3;->F:Lmo2;

    .line 87
    .line 88
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    invoke-interface {p1, p0}, Lca4;->j(Lda4;)V

    .line 92
    .line 93
    .line 94
    return-void
.end method

.method public final h()V
    .locals 3

    .line 1
    iget-object v0, p0, Lhr3;->q:Li80;

    .line 2
    .line 3
    iget v1, p0, Lhr3;->S:I

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Li80;->D(I)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget-object v1, p0, Lhr3;->z:Li61;

    .line 10
    .line 11
    iget-object v2, v1, Li61;->q:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v2, Ljava/io/IOException;

    .line 14
    .line 15
    if-nez v2, :cond_5

    .line 16
    .line 17
    iget-object v1, v1, Li61;->p:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v1, Lid2;

    .line 20
    .line 21
    if-eqz v1, :cond_2

    .line 22
    .line 23
    const/high16 v2, -0x80000000

    .line 24
    .line 25
    if-ne v0, v2, :cond_0

    .line 26
    .line 27
    iget v0, v1, Lid2;->n:I

    .line 28
    .line 29
    :cond_0
    iget-object v2, v1, Lid2;->r:Ljava/io/IOException;

    .line 30
    .line 31
    if-eqz v2, :cond_2

    .line 32
    .line 33
    iget v1, v1, Lid2;->s:I

    .line 34
    .line 35
    if-gt v1, v0, :cond_1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    throw v2

    .line 39
    :cond_2
    :goto_0
    iget-boolean v0, p0, Lhr3;->c0:Z

    .line 40
    .line 41
    if-eqz v0, :cond_4

    .line 42
    .line 43
    iget-boolean p0, p0, Lhr3;->L:Z

    .line 44
    .line 45
    if-eqz p0, :cond_3

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_3
    const-string p0, "Loading finished before preparation is complete."

    .line 49
    .line 50
    const/4 v0, 0x0

    .line 51
    invoke-static {v0, p0}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    throw p0

    .line 56
    :cond_4
    :goto_1
    return-void

    .line 57
    :cond_5
    throw v2
.end method

.method public final i(J)J
    .locals 9

    .line 1
    invoke-virtual {p0}, Lhr3;->v()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lhr3;->O:Lss0;

    .line 5
    .line 6
    iget-object v0, v0, Lss0;->o:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, [Z

    .line 9
    .line 10
    iget-object v1, p0, Lhr3;->P:Lm84;

    .line 11
    .line 12
    invoke-interface {v1}, Lm84;->b()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const-wide/16 p1, 0x0

    .line 20
    .line 21
    :goto_0
    const/4 v1, 0x0

    .line 22
    iput-boolean v1, p0, Lhr3;->U:Z

    .line 23
    .line 24
    iget-wide v2, p0, Lhr3;->Y:J

    .line 25
    .line 26
    cmp-long v2, v2, p1

    .line 27
    .line 28
    if-nez v2, :cond_1

    .line 29
    .line 30
    const/4 v2, 0x1

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    move v2, v1

    .line 33
    :goto_1
    iput-wide p1, p0, Lhr3;->Y:J

    .line 34
    .line 35
    invoke-virtual {p0}, Lhr3;->z()Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-eqz v3, :cond_2

    .line 40
    .line 41
    iput-wide p1, p0, Lhr3;->Z:J

    .line 42
    .line 43
    return-wide p1

    .line 44
    :cond_2
    iget v3, p0, Lhr3;->S:I

    .line 45
    .line 46
    const/4 v4, 0x7

    .line 47
    iget-object v5, p0, Lhr3;->z:Li61;

    .line 48
    .line 49
    if-eq v3, v4, :cond_7

    .line 50
    .line 51
    iget-boolean v3, p0, Lhr3;->c0:Z

    .line 52
    .line 53
    if-nez v3, :cond_3

    .line 54
    .line 55
    invoke-virtual {v5}, Li61;->l()Z

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    if-eqz v3, :cond_7

    .line 60
    .line 61
    :cond_3
    iget-object v3, p0, Lhr3;->I:[Lp44;

    .line 62
    .line 63
    array-length v3, v3

    .line 64
    move v4, v1

    .line 65
    :goto_2
    if-ge v4, v3, :cond_a

    .line 66
    .line 67
    iget-object v6, p0, Lhr3;->I:[Lp44;

    .line 68
    .line 69
    aget-object v6, v6, v4

    .line 70
    .line 71
    iget-object v7, p0, Lhr3;->H:[Ldr3;

    .line 72
    .line 73
    aget-object v7, v7, v4

    .line 74
    .line 75
    iget-object v7, v7, Ldr3;->d:Ljava/util/concurrent/atomic/AtomicReference;

    .line 76
    .line 77
    invoke-virtual {v7}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v7

    .line 81
    sget-object v8, Lcr3;->n:Lcr3;

    .line 82
    .line 83
    if-ne v7, v8, :cond_6

    .line 84
    .line 85
    invoke-virtual {v6}, Lp44;->o()I

    .line 86
    .line 87
    .line 88
    move-result v7

    .line 89
    if-nez v7, :cond_4

    .line 90
    .line 91
    if-eqz v2, :cond_4

    .line 92
    .line 93
    goto :goto_4

    .line 94
    :cond_4
    iget-boolean v7, p0, Lhr3;->N:Z

    .line 95
    .line 96
    if-eqz v7, :cond_5

    .line 97
    .line 98
    iget v7, v6, Lp44;->q:I

    .line 99
    .line 100
    invoke-virtual {v6, v7}, Lp44;->y(I)Z

    .line 101
    .line 102
    .line 103
    move-result v6

    .line 104
    goto :goto_3

    .line 105
    :cond_5
    iget-boolean v7, p0, Lhr3;->c0:Z

    .line 106
    .line 107
    invoke-virtual {v6, v7, p1, p2}, Lp44;->z(ZJ)Z

    .line 108
    .line 109
    .line 110
    move-result v6

    .line 111
    :goto_3
    if-nez v6, :cond_6

    .line 112
    .line 113
    aget-boolean v6, v0, v4

    .line 114
    .line 115
    if-nez v6, :cond_7

    .line 116
    .line 117
    iget-boolean v6, p0, Lhr3;->M:Z

    .line 118
    .line 119
    if-nez v6, :cond_6

    .line 120
    .line 121
    goto :goto_5

    .line 122
    :cond_6
    :goto_4
    add-int/lit8 v4, v4, 0x1

    .line 123
    .line 124
    goto :goto_2

    .line 125
    :cond_7
    :goto_5
    iput-boolean v1, p0, Lhr3;->a0:Z

    .line 126
    .line 127
    iput-wide p1, p0, Lhr3;->Z:J

    .line 128
    .line 129
    iput-boolean v1, p0, Lhr3;->c0:Z

    .line 130
    .line 131
    iput-boolean v1, p0, Lhr3;->V:Z

    .line 132
    .line 133
    invoke-virtual {v5}, Li61;->l()Z

    .line 134
    .line 135
    .line 136
    move-result v0

    .line 137
    if-eqz v0, :cond_9

    .line 138
    .line 139
    iget-object p0, p0, Lhr3;->I:[Lp44;

    .line 140
    .line 141
    array-length v0, p0

    .line 142
    :goto_6
    if-ge v1, v0, :cond_8

    .line 143
    .line 144
    aget-object v2, p0, v1

    .line 145
    .line 146
    invoke-virtual {v2}, Lp44;->j()V

    .line 147
    .line 148
    .line 149
    add-int/lit8 v1, v1, 0x1

    .line 150
    .line 151
    goto :goto_6

    .line 152
    :cond_8
    invoke-virtual {v5}, Li61;->d()V

    .line 153
    .line 154
    .line 155
    return-wide p1

    .line 156
    :cond_9
    const/4 v0, 0x0

    .line 157
    iput-object v0, v5, Li61;->q:Ljava/lang/Object;

    .line 158
    .line 159
    iget-object p0, p0, Lhr3;->I:[Lp44;

    .line 160
    .line 161
    array-length v0, p0

    .line 162
    move v2, v1

    .line 163
    :goto_7
    if-ge v2, v0, :cond_a

    .line 164
    .line 165
    aget-object v3, p0, v2

    .line 166
    .line 167
    invoke-virtual {v3, v1}, Lp44;->x(Z)V

    .line 168
    .line 169
    .line 170
    add-int/lit8 v2, v2, 0x1

    .line 171
    .line 172
    goto :goto_7

    .line 173
    :cond_a
    return-wide p1
.end method

.method public final j(Ljd2;JJI)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, Ler3;

    .line 6
    .line 7
    iget-object v2, v1, Ler3;->b:Lyl4;

    .line 8
    .line 9
    if-nez p6, :cond_0

    .line 10
    .line 11
    new-instance v2, Led2;

    .line 12
    .line 13
    iget-object v3, v1, Ler3;->j:Lii0;

    .line 14
    .line 15
    move-wide/from16 v8, p2

    .line 16
    .line 17
    invoke-direct {v2, v8, v9, v3}, Led2;-><init>(JLii0;)V

    .line 18
    .line 19
    .line 20
    move-object v6, v2

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move-wide/from16 v8, p2

    .line 23
    .line 24
    new-instance v4, Led2;

    .line 25
    .line 26
    iget-object v5, v1, Ler3;->j:Lii0;

    .line 27
    .line 28
    iget-object v6, v2, Lyl4;->p:Landroid/net/Uri;

    .line 29
    .line 30
    iget-object v7, v2, Lyl4;->q:Ljava/util/Map;

    .line 31
    .line 32
    iget-wide v12, v2, Lyl4;->o:J

    .line 33
    .line 34
    move-wide/from16 v10, p4

    .line 35
    .line 36
    invoke-direct/range {v4 .. v13}, Led2;-><init>(Lii0;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    .line 37
    .line 38
    .line 39
    move-object v6, v4

    .line 40
    :goto_0
    iget-wide v12, v1, Ler3;->i:J

    .line 41
    .line 42
    iget-wide v14, v0, Lhr3;->Q:J

    .line 43
    .line 44
    iget-object v5, v0, Lhr3;->r:Lue1;

    .line 45
    .line 46
    const/4 v7, 0x1

    .line 47
    const/4 v8, -0x1

    .line 48
    const/4 v9, 0x0

    .line 49
    const/4 v10, 0x0

    .line 50
    const/4 v11, 0x0

    .line 51
    move/from16 v16, p6

    .line 52
    .line 53
    invoke-virtual/range {v5 .. v16}, Lue1;->u(Led2;IILtb1;ILjava/lang/Object;JJI)V

    .line 54
    .line 55
    .line 56
    return-void
.end method

.method public final k(ZJ)V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lhr3;->N:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    invoke-virtual {p0}, Lhr3;->v()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lhr3;->z()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_1
    iget-object v0, p0, Lhr3;->O:Lss0;

    .line 17
    .line 18
    iget-object v0, v0, Lss0;->p:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, [Z

    .line 21
    .line 22
    iget-object v1, p0, Lhr3;->I:[Lp44;

    .line 23
    .line 24
    array-length v1, v1

    .line 25
    const/4 v2, 0x0

    .line 26
    :goto_0
    if-ge v2, v1, :cond_2

    .line 27
    .line 28
    iget-object v3, p0, Lhr3;->I:[Lp44;

    .line 29
    .line 30
    aget-object v3, v3, v2

    .line 31
    .line 32
    aget-boolean v4, v0, v2

    .line 33
    .line 34
    invoke-virtual {v3, p2, p3, p1, v4}, Lp44;->i(JZZ)V

    .line 35
    .line 36
    .line 37
    add-int/lit8 v2, v2, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_2
    :goto_1
    return-void
.end method

.method public final l()J
    .locals 3

    .line 1
    iget-boolean v0, p0, Lhr3;->V:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iput-boolean v1, p0, Lhr3;->V:Z

    .line 7
    .line 8
    iget-wide v0, p0, Lhr3;->Y:J

    .line 9
    .line 10
    return-wide v0

    .line 11
    :cond_0
    iget-boolean v0, p0, Lhr3;->U:Z

    .line 12
    .line 13
    if-eqz v0, :cond_2

    .line 14
    .line 15
    iget-boolean v0, p0, Lhr3;->c0:Z

    .line 16
    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    invoke-virtual {p0}, Lhr3;->x()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    iget v2, p0, Lhr3;->b0:I

    .line 24
    .line 25
    if-le v0, v2, :cond_2

    .line 26
    .line 27
    :cond_1
    iput-boolean v1, p0, Lhr3;->U:Z

    .line 28
    .line 29
    iget-wide v0, p0, Lhr3;->Y:J

    .line 30
    .line 31
    return-wide v0

    .line 32
    :cond_2
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    return-wide v0
.end method

.method public final m(Lmo2;J)V
    .locals 5

    .line 1
    iput-object p1, p0, Lhr3;->F:Lmo2;

    .line 2
    .line 3
    iget-object p1, p0, Lhr3;->x:Ltb1;

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x3

    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-virtual {p0, v1, v0}, Lhr3;->t(II)Lwv4;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-interface {v0, p1}, Lwv4;->g(Ltb1;)V

    .line 14
    .line 15
    .line 16
    new-instance p1, Lux1;

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    new-array v2, v0, [J

    .line 20
    .line 21
    const-wide/16 v3, 0x0

    .line 22
    .line 23
    aput-wide v3, v2, v1

    .line 24
    .line 25
    new-array v0, v0, [J

    .line 26
    .line 27
    aput-wide v3, v0, v1

    .line 28
    .line 29
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    invoke-direct {p1, v3, v4, v2, v0}, Lux1;-><init>(J[J[J)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, p1}, Lhr3;->E(Lm84;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Lhr3;->p()V

    .line 41
    .line 42
    .line 43
    iput-wide p2, p0, Lhr3;->Z:J

    .line 44
    .line 45
    return-void

    .line 46
    :cond_0
    iget-object p1, p0, Lhr3;->B:Lq90;

    .line 47
    .line 48
    invoke-virtual {p1}, Lq90;->d()Z

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Lhr3;->F()V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public final n()Ltv4;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lhr3;->v()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lhr3;->O:Lss0;

    .line 5
    .line 6
    iget-object p0, p0, Lss0;->n:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Ltv4;

    .line 9
    .line 10
    return-object p0
.end method

.method public final o(Lpd2;)Z
    .locals 1

    .line 1
    iget-boolean p1, p0, Lhr3;->c0:Z

    .line 2
    .line 3
    if-nez p1, :cond_4

    .line 4
    .line 5
    iget-object p1, p0, Lhr3;->z:Li61;

    .line 6
    .line 7
    iget-object v0, p1, Li61;->q:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Ljava/io/IOException;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-boolean v0, p0, Lhr3;->a0:Z

    .line 15
    .line 16
    if-nez v0, :cond_4

    .line 17
    .line 18
    iget-boolean v0, p0, Lhr3;->L:Z

    .line 19
    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    iget-object v0, p0, Lhr3;->x:Ltb1;

    .line 23
    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    :cond_1
    iget v0, p0, Lhr3;->W:I

    .line 27
    .line 28
    if-nez v0, :cond_2

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_2
    iget-object v0, p0, Lhr3;->B:Lq90;

    .line 32
    .line 33
    invoke-virtual {v0}, Lq90;->d()Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    invoke-virtual {p1}, Li61;->l()Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-nez p1, :cond_3

    .line 42
    .line 43
    invoke-virtual {p0}, Lhr3;->F()V

    .line 44
    .line 45
    .line 46
    const/4 p0, 0x1

    .line 47
    return p0

    .line 48
    :cond_3
    return v0

    .line 49
    :cond_4
    :goto_0
    const/4 p0, 0x0

    .line 50
    return p0
.end method

.method public final p()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lhr3;->K:Z

    .line 3
    .line 4
    iget-object v0, p0, Lhr3;->E:Landroid/os/Handler;

    .line 5
    .line 6
    iget-object p0, p0, Lhr3;->C:Lar3;

    .line 7
    .line 8
    invoke-virtual {v0, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final q()J
    .locals 12

    .line 1
    invoke-virtual {p0}, Lhr3;->v()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lhr3;->c0:Z

    .line 5
    .line 6
    const-wide/high16 v1, -0x8000000000000000L

    .line 7
    .line 8
    if-nez v0, :cond_7

    .line 9
    .line 10
    iget v0, p0, Lhr3;->W:I

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    goto :goto_2

    .line 15
    :cond_0
    invoke-virtual {p0}, Lhr3;->z()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    iget-wide v0, p0, Lhr3;->Z:J

    .line 22
    .line 23
    return-wide v0

    .line 24
    :cond_1
    iget-boolean v0, p0, Lhr3;->M:Z

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    const-wide v4, 0x7fffffffffffffffL

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    if-eqz v0, :cond_3

    .line 33
    .line 34
    iget-object v0, p0, Lhr3;->I:[Lp44;

    .line 35
    .line 36
    array-length v0, v0

    .line 37
    move v6, v3

    .line 38
    move-wide v7, v4

    .line 39
    :goto_0
    if-ge v6, v0, :cond_4

    .line 40
    .line 41
    iget-object v9, p0, Lhr3;->O:Lss0;

    .line 42
    .line 43
    iget-object v10, v9, Lss0;->o:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v10, [Z

    .line 46
    .line 47
    aget-boolean v10, v10, v6

    .line 48
    .line 49
    if-eqz v10, :cond_2

    .line 50
    .line 51
    iget-object v9, v9, Lss0;->p:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v9, [Z

    .line 54
    .line 55
    aget-boolean v9, v9, v6

    .line 56
    .line 57
    if-eqz v9, :cond_2

    .line 58
    .line 59
    iget-object v9, p0, Lhr3;->I:[Lp44;

    .line 60
    .line 61
    aget-object v9, v9, v6

    .line 62
    .line 63
    monitor-enter v9

    .line 64
    :try_start_0
    iget-boolean v10, v9, Lp44;->w:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 65
    .line 66
    monitor-exit v9

    .line 67
    if-nez v10, :cond_2

    .line 68
    .line 69
    iget-object v9, p0, Lhr3;->I:[Lp44;

    .line 70
    .line 71
    aget-object v9, v9, v6

    .line 72
    .line 73
    monitor-enter v9

    .line 74
    :try_start_1
    iget-wide v10, v9, Lp44;->v:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 75
    .line 76
    monitor-exit v9

    .line 77
    invoke-static {v7, v8, v10, v11}, Ljava/lang/Math;->min(JJ)J

    .line 78
    .line 79
    .line 80
    move-result-wide v7

    .line 81
    goto :goto_1

    .line 82
    :catchall_0
    move-exception p0

    .line 83
    :try_start_2
    monitor-exit v9
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 84
    throw p0

    .line 85
    :catchall_1
    move-exception p0

    .line 86
    :try_start_3
    monitor-exit v9
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 87
    throw p0

    .line 88
    :cond_2
    :goto_1
    add-int/lit8 v6, v6, 0x1

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_3
    move-wide v7, v4

    .line 92
    :cond_4
    cmp-long v0, v7, v4

    .line 93
    .line 94
    if-nez v0, :cond_5

    .line 95
    .line 96
    invoke-virtual {p0, v3}, Lhr3;->y(Z)J

    .line 97
    .line 98
    .line 99
    move-result-wide v7

    .line 100
    :cond_5
    cmp-long v0, v7, v1

    .line 101
    .line 102
    if-nez v0, :cond_6

    .line 103
    .line 104
    iget-wide v0, p0, Lhr3;->Y:J

    .line 105
    .line 106
    return-wide v0

    .line 107
    :cond_6
    return-wide v7

    .line 108
    :cond_7
    :goto_2
    return-wide v1
.end method

.method public final r()V
    .locals 1

    .line 1
    iget-object v0, p0, Lhr3;->E:Landroid/os/Handler;

    .line 2
    .line 3
    iget-object p0, p0, Lhr3;->C:Lar3;

    .line 4
    .line 5
    invoke-virtual {v0, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final s(Ljd2;JJLjava/io/IOException;I)Ldd2;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, Ler3;

    .line 6
    .line 7
    iget-object v2, v1, Ler3;->b:Lyl4;

    .line 8
    .line 9
    new-instance v3, Led2;

    .line 10
    .line 11
    iget-object v4, v1, Ler3;->j:Lii0;

    .line 12
    .line 13
    iget-object v5, v2, Lyl4;->p:Landroid/net/Uri;

    .line 14
    .line 15
    iget-object v6, v2, Lyl4;->q:Ljava/util/Map;

    .line 16
    .line 17
    iget-wide v11, v2, Lyl4;->o:J

    .line 18
    .line 19
    move-wide/from16 v7, p2

    .line 20
    .line 21
    move-wide/from16 v9, p4

    .line 22
    .line 23
    invoke-direct/range {v3 .. v12}, Led2;-><init>(Lii0;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    .line 24
    .line 25
    .line 26
    sget-object v2, Lf35;->a:Ljava/lang/String;

    .line 27
    .line 28
    iget-object v2, v0, Lhr3;->q:Li80;

    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    move-object/from16 v2, p6

    .line 34
    .line 35
    :goto_0
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    const/4 v6, 0x1

    .line 41
    if-eqz v2, :cond_2

    .line 42
    .line 43
    instance-of v7, v2, Landroidx/media3/common/ParserException;

    .line 44
    .line 45
    if-nez v7, :cond_1

    .line 46
    .line 47
    instance-of v7, v2, Ljava/io/FileNotFoundException;

    .line 48
    .line 49
    if-nez v7, :cond_1

    .line 50
    .line 51
    instance-of v7, v2, Landroidx/media3/datasource/HttpDataSource$CleartextNotPermittedException;

    .line 52
    .line 53
    if-nez v7, :cond_1

    .line 54
    .line 55
    instance-of v7, v2, Landroidx/media3/exoplayer/upstream/Loader$UnexpectedLoaderException;

    .line 56
    .line 57
    if-nez v7, :cond_1

    .line 58
    .line 59
    instance-of v7, v2, Landroidx/media3/datasource/DataSourceException;

    .line 60
    .line 61
    if-eqz v7, :cond_0

    .line 62
    .line 63
    move-object v7, v2

    .line 64
    check-cast v7, Landroidx/media3/datasource/DataSourceException;

    .line 65
    .line 66
    iget v7, v7, Landroidx/media3/datasource/DataSourceException;->n:I

    .line 67
    .line 68
    const/16 v8, 0x7d8

    .line 69
    .line 70
    if-ne v7, v8, :cond_0

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_0
    invoke-virtual {v2}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    goto :goto_0

    .line 78
    :cond_1
    :goto_1
    move-wide v7, v4

    .line 79
    goto :goto_2

    .line 80
    :cond_2
    add-int/lit8 v2, p7, -0x1

    .line 81
    .line 82
    mul-int/lit16 v2, v2, 0x3e8

    .line 83
    .line 84
    const/16 v7, 0x1388

    .line 85
    .line 86
    invoke-static {v2, v7}, Ljava/lang/Math;->min(II)I

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    int-to-long v7, v2

    .line 91
    :goto_2
    cmp-long v2, v7, v4

    .line 92
    .line 93
    const/4 v9, 0x0

    .line 94
    if-nez v2, :cond_3

    .line 95
    .line 96
    sget-object v2, Li61;->t:Ldd2;

    .line 97
    .line 98
    goto :goto_7

    .line 99
    :cond_3
    invoke-virtual {v0}, Lhr3;->x()I

    .line 100
    .line 101
    .line 102
    move-result v2

    .line 103
    iget v10, v0, Lhr3;->b0:I

    .line 104
    .line 105
    if-le v2, v10, :cond_4

    .line 106
    .line 107
    move v10, v6

    .line 108
    goto :goto_3

    .line 109
    :cond_4
    move v10, v9

    .line 110
    :goto_3
    iget-boolean v11, v0, Lhr3;->X:Z

    .line 111
    .line 112
    if-nez v11, :cond_8

    .line 113
    .line 114
    iget-object v11, v0, Lhr3;->P:Lm84;

    .line 115
    .line 116
    if-eqz v11, :cond_5

    .line 117
    .line 118
    invoke-interface {v11}, Lm84;->g()J

    .line 119
    .line 120
    .line 121
    move-result-wide v11

    .line 122
    cmp-long v4, v11, v4

    .line 123
    .line 124
    if-eqz v4, :cond_5

    .line 125
    .line 126
    goto :goto_5

    .line 127
    :cond_5
    iget-boolean v2, v0, Lhr3;->L:Z

    .line 128
    .line 129
    if-eqz v2, :cond_6

    .line 130
    .line 131
    invoke-virtual {v0}, Lhr3;->G()Z

    .line 132
    .line 133
    .line 134
    move-result v2

    .line 135
    if-nez v2, :cond_6

    .line 136
    .line 137
    iput-boolean v6, v0, Lhr3;->a0:Z

    .line 138
    .line 139
    sget-object v2, Li61;->s:Ldd2;

    .line 140
    .line 141
    goto :goto_7

    .line 142
    :cond_6
    iget-boolean v2, v0, Lhr3;->L:Z

    .line 143
    .line 144
    iput-boolean v2, v0, Lhr3;->U:Z

    .line 145
    .line 146
    const-wide/16 v4, 0x0

    .line 147
    .line 148
    iput-wide v4, v0, Lhr3;->Y:J

    .line 149
    .line 150
    iput v9, v0, Lhr3;->b0:I

    .line 151
    .line 152
    iget-object v2, v0, Lhr3;->I:[Lp44;

    .line 153
    .line 154
    array-length v11, v2

    .line 155
    move v12, v9

    .line 156
    :goto_4
    if-ge v12, v11, :cond_7

    .line 157
    .line 158
    aget-object v13, v2, v12

    .line 159
    .line 160
    invoke-virtual {v13, v9}, Lp44;->x(Z)V

    .line 161
    .line 162
    .line 163
    add-int/lit8 v12, v12, 0x1

    .line 164
    .line 165
    goto :goto_4

    .line 166
    :cond_7
    iget-object v2, v1, Ler3;->f:Lt71;

    .line 167
    .line 168
    iput-wide v4, v2, Lt71;->a:J

    .line 169
    .line 170
    iput-wide v4, v1, Ler3;->i:J

    .line 171
    .line 172
    iput-boolean v6, v1, Ler3;->h:Z

    .line 173
    .line 174
    iput-boolean v9, v1, Ler3;->l:Z

    .line 175
    .line 176
    goto :goto_6

    .line 177
    :cond_8
    :goto_5
    iput v2, v0, Lhr3;->b0:I

    .line 178
    .line 179
    :goto_6
    new-instance v2, Ldd2;

    .line 180
    .line 181
    invoke-direct {v2, v10, v7, v8, v9}, Ldd2;-><init>(IJZ)V

    .line 182
    .line 183
    .line 184
    :goto_7
    iget v4, v2, Ldd2;->a:I

    .line 185
    .line 186
    if-eqz v4, :cond_9

    .line 187
    .line 188
    if-ne v4, v6, :cond_a

    .line 189
    .line 190
    :cond_9
    move v9, v6

    .line 191
    :cond_a
    xor-int/lit8 v15, v9, 0x1

    .line 192
    .line 193
    iget-wide v10, v1, Ler3;->i:J

    .line 194
    .line 195
    iget-wide v12, v0, Lhr3;->Q:J

    .line 196
    .line 197
    iget-object v0, v0, Lhr3;->r:Lue1;

    .line 198
    .line 199
    const/4 v5, 0x1

    .line 200
    const/4 v6, -0x1

    .line 201
    const/4 v7, 0x0

    .line 202
    const/4 v8, 0x0

    .line 203
    const/4 v9, 0x0

    .line 204
    move-object/from16 v14, p6

    .line 205
    .line 206
    move-object v4, v3

    .line 207
    move-object v3, v0

    .line 208
    invoke-virtual/range {v3 .. v15}, Lue1;->s(Led2;IILtb1;ILjava/lang/Object;JJLjava/io/IOException;Z)V

    .line 209
    .line 210
    .line 211
    return-object v2
.end method

.method public final t(II)Lwv4;
    .locals 1

    .line 1
    new-instance p2, Lgr3;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {p2, p1, v0}, Lgr3;-><init>(IZ)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p2}, Lhr3;->D(Lgr3;)Lwv4;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public final u(J)V
    .locals 0

    .line 1
    return-void
.end method

.method public final v()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lhr3;->L:Z

    .line 2
    .line 3
    invoke-static {v0}, Lrr2;->w(Z)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lhr3;->O:Lss0;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, Lhr3;->P:Lm84;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final w(Lm84;)V
    .locals 2

    .line 1
    new-instance v0, Lur2;

    .line 2
    .line 3
    const/16 v1, 0xd

    .line 4
    .line 5
    invoke-direct {v0, v1, p0, p1}, Lur2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lhr3;->E:Landroid/os/Handler;

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final x()I
    .locals 5

    .line 1
    iget-object p0, p0, Lhr3;->I:[Lp44;

    .line 2
    .line 3
    array-length v0, p0

    .line 4
    const/4 v1, 0x0

    .line 5
    move v2, v1

    .line 6
    :goto_0
    if-ge v1, v0, :cond_0

    .line 7
    .line 8
    aget-object v3, p0, v1

    .line 9
    .line 10
    iget v4, v3, Lp44;->q:I

    .line 11
    .line 12
    iget v3, v3, Lp44;->p:I

    .line 13
    .line 14
    add-int/2addr v4, v3

    .line 15
    add-int/2addr v2, v4

    .line 16
    add-int/lit8 v1, v1, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    return v2
.end method

.method public final y(Z)J
    .locals 6

    .line 1
    const-wide/high16 v0, -0x8000000000000000L

    .line 2
    .line 3
    const/4 v2, 0x0

    .line 4
    :goto_0
    iget-object v3, p0, Lhr3;->I:[Lp44;

    .line 5
    .line 6
    array-length v3, v3

    .line 7
    if-ge v2, v3, :cond_2

    .line 8
    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    iget-object v3, p0, Lhr3;->O:Lss0;

    .line 12
    .line 13
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    iget-object v3, v3, Lss0;->p:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v3, [Z

    .line 19
    .line 20
    aget-boolean v3, v3, v2

    .line 21
    .line 22
    if-eqz v3, :cond_1

    .line 23
    .line 24
    :cond_0
    iget-object v3, p0, Lhr3;->I:[Lp44;

    .line 25
    .line 26
    aget-object v3, v3, v2

    .line 27
    .line 28
    monitor-enter v3

    .line 29
    :try_start_0
    iget-wide v4, v3, Lp44;->v:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    .line 31
    monitor-exit v3

    .line 32
    invoke-static {v0, v1, v4, v5}, Ljava/lang/Math;->max(JJ)J

    .line 33
    .line 34
    .line 35
    move-result-wide v0

    .line 36
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :catchall_0
    move-exception p0

    .line 40
    :try_start_1
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 41
    throw p0

    .line 42
    :cond_2
    return-wide v0
.end method

.method public final z()Z
    .locals 4

    .line 1
    iget-wide v0, p0, Lhr3;->Z:J

    .line 2
    .line 3
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    cmp-long p0, v0, v2

    .line 9
    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    const/4 p0, 0x1

    .line 13
    return p0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    return p0
.end method
