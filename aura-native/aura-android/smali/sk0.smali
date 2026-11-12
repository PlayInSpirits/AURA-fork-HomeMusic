.class public final Lsk0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ln51;


# static fields
.field public static final h:[I

.field public static final i:Lrm3;

.field public static final j:Lrm3;


# instance fields
.field public b:I

.field public c:Lgy3;

.field public d:Z

.field public e:Lom0;

.field public f:I

.field public g:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const/16 v0, 0x15

    .line 2
    .line 3
    new-array v0, v0, [I

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, Lsk0;->h:[I

    .line 9
    .line 10
    new-instance v0, Lrm3;

    .line 11
    .line 12
    new-instance v1, Lmj0;

    .line 13
    .line 14
    const/4 v2, 0x2

    .line 15
    invoke-direct {v1, v2}, Lmj0;-><init>(I)V

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, v1}, Lrm3;-><init>(Lmj0;)V

    .line 19
    .line 20
    .line 21
    sput-object v0, Lsk0;->i:Lrm3;

    .line 22
    .line 23
    new-instance v0, Lrm3;

    .line 24
    .line 25
    new-instance v1, Lmj0;

    .line 26
    .line 27
    const/4 v2, 0x3

    .line 28
    invoke-direct {v1, v2}, Lmj0;-><init>(I)V

    .line 29
    .line 30
    .line 31
    invoke-direct {v0, v1}, Lrm3;-><init>(Lmj0;)V

    .line 32
    .line 33
    .line 34
    sput-object v0, Lsk0;->j:Lrm3;

    .line 35
    .line 36
    return-void

    .line 37
    :array_0
    .array-data 4
        0x5
        0x4
        0xc
        0x8
        0x3
        0xa
        0x9
        0xb
        0x6
        0x2
        0x0
        0x1
        0x7
        0x10
        0xf
        0xe
        0x11
        0x12
        0x13
        0x14
        0x15
    .end array-data
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lom0;

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-direct {v0, v1}, Lom0;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lsk0;->e:Lom0;

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    iput-boolean v0, p0, Lsk0;->d:Z

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final a(Lom0;)V
    .locals 0

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iput-object p1, p0, Lsk0;->e:Lom0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return-void

    .line 6
    :catchall_0
    move-exception p1

    .line 7
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    throw p1
.end method

.method public final b()V
    .locals 0

    .line 1
    monitor-enter p0

    .line 2
    monitor-exit p0

    .line 3
    return-void
.end method

.method public final declared-synchronized c()[Lk51;
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget-object v0, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    .line 3
    .line 4
    new-instance v1, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v0, v1}, Lsk0;->e(Landroid/net/Uri;Ljava/util/Map;)[Lk51;

    .line 10
    .line 11
    .line 12
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    monitor-exit p0

    .line 14
    return-object v0

    .line 15
    :catchall_0
    move-exception v0

    .line 16
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 17
    throw v0
.end method

.method public final d(Z)V
    .locals 0

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iput-boolean p1, p0, Lsk0;->d:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return-void

    .line 6
    :catchall_0
    move-exception p1

    .line 7
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    throw p1
.end method

.method public final declared-synchronized e(Landroid/net/Uri;Ljava/util/Map;)[Lk51;
    .locals 6

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    sget-object v1, Lsk0;->h:[I

    .line 5
    .line 6
    const/16 v2, 0x15

    .line 7
    .line 8
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 9
    .line 10
    .line 11
    const-string v3, "Content-Type"

    .line 12
    .line 13
    invoke-interface {p2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    check-cast p2, Ljava/util/List;

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    if-eqz p2, :cond_1

    .line 21
    .line 22
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    if-eqz v4, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    check-cast p2, Ljava/lang/String;

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    :goto_0
    const/4 p2, 0x0

    .line 37
    :goto_1
    invoke-static {p2}, Lh12;->x(Ljava/lang/String;)I

    .line 38
    .line 39
    .line 40
    move-result p2

    .line 41
    const/4 v4, -0x1

    .line 42
    if-eq p2, v4, :cond_2

    .line 43
    .line 44
    invoke-virtual {p0, p2, v0}, Lsk0;->f(ILjava/util/ArrayList;)V

    .line 45
    .line 46
    .line 47
    goto :goto_2

    .line 48
    :catchall_0
    move-exception p1

    .line 49
    goto :goto_4

    .line 50
    :cond_2
    :goto_2
    invoke-static {p1}, Lh12;->y(Landroid/net/Uri;)I

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    if-eq p1, v4, :cond_3

    .line 55
    .line 56
    if-eq p1, p2, :cond_3

    .line 57
    .line 58
    invoke-virtual {p0, p1, v0}, Lsk0;->f(ILjava/util/ArrayList;)V

    .line 59
    .line 60
    .line 61
    :cond_3
    move v4, v3

    .line 62
    :goto_3
    if-ge v4, v2, :cond_5

    .line 63
    .line 64
    aget v5, v1, v4

    .line 65
    .line 66
    if-eq v5, p2, :cond_4

    .line 67
    .line 68
    if-eq v5, p1, :cond_4

    .line 69
    .line 70
    invoke-virtual {p0, v5, v0}, Lsk0;->f(ILjava/util/ArrayList;)V

    .line 71
    .line 72
    .line 73
    :cond_4
    add-int/lit8 v4, v4, 0x1

    .line 74
    .line 75
    goto :goto_3

    .line 76
    :cond_5
    new-array p1, v3, [Lk51;

    .line 77
    .line 78
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    check-cast p1, [Lk51;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 83
    .line 84
    monitor-exit p0

    .line 85
    return-object p1

    .line 86
    :goto_4
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 87
    throw p1
.end method

.method public final f(ILjava/util/ArrayList;)V
    .locals 9

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :pswitch_0
    goto :goto_0

    .line 7
    :pswitch_1
    new-instance p0, Lgo;

    .line 8
    .line 9
    invoke-direct {p0, v1}, Lgo;-><init>(I)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p2, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_2
    new-instance p1, Lxl1;

    .line 17
    .line 18
    iget p0, p0, Lsk0;->g:I

    .line 19
    .line 20
    invoke-direct {p1, p0}, Lxl1;-><init>(I)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :pswitch_3
    new-instance p0, Lkt;

    .line 28
    .line 29
    invoke-direct {p0, v1}, Lkt;-><init>(I)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p2, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :pswitch_4
    new-instance p0, Lgo;

    .line 37
    .line 38
    invoke-direct {p0, v0}, Lgo;-><init>(I)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p2, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :pswitch_5
    new-instance p0, Lkt;

    .line 46
    .line 47
    invoke-direct {p0, v0}, Lkt;-><init>(I)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p2, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :pswitch_6
    new-instance p1, Lco;

    .line 55
    .line 56
    iget-boolean v1, p0, Lsk0;->d:Z

    .line 57
    .line 58
    xor-int/2addr v0, v1

    .line 59
    iget-object p0, p0, Lsk0;->e:Lom0;

    .line 60
    .line 61
    invoke-direct {p1, v0, p0}, Lco;-><init>(ILom0;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :pswitch_7
    sget-object p0, Lsk0;->j:Lrm3;

    .line 69
    .line 70
    new-array p1, v1, [Ljava/lang/Object;

    .line 71
    .line 72
    invoke-virtual {p0, p1}, Lrm3;->E([Ljava/lang/Object;)Lk51;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    if-eqz p0, :cond_0

    .line 77
    .line 78
    invoke-virtual {p2, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    :cond_0
    :goto_0
    return-void

    .line 82
    :pswitch_8
    new-instance p1, Lcm0;

    .line 83
    .line 84
    iget p0, p0, Lsk0;->f:I

    .line 85
    .line 86
    invoke-direct {p1, p0}, Lcm0;-><init>(I)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    return-void

    .line 93
    :pswitch_9
    new-instance p0, Ld95;

    .line 94
    .line 95
    invoke-direct {p0}, Ld95;-><init>()V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p2, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    return-void

    .line 102
    :pswitch_a
    iget-object p1, p0, Lsk0;->c:Lgy3;

    .line 103
    .line 104
    if-nez p1, :cond_1

    .line 105
    .line 106
    sget-object p1, Lyw1;->o:Lvw1;

    .line 107
    .line 108
    sget-object p1, Lgy3;->r:Lgy3;

    .line 109
    .line 110
    iput-object p1, p0, Lsk0;->c:Lgy3;

    .line 111
    .line 112
    :cond_1
    new-instance v2, Lqy4;

    .line 113
    .line 114
    iget-boolean p1, p0, Lsk0;->d:Z

    .line 115
    .line 116
    xor-int/lit8 v4, p1, 0x1

    .line 117
    .line 118
    iget-object v5, p0, Lsk0;->e:Lom0;

    .line 119
    .line 120
    new-instance v6, Liu4;

    .line 121
    .line 122
    const-wide/16 v7, 0x0

    .line 123
    .line 124
    invoke-direct {v6, v7, v8}, Liu4;-><init>(J)V

    .line 125
    .line 126
    .line 127
    new-instance v7, Lqn0;

    .line 128
    .line 129
    iget-object p0, p0, Lsk0;->c:Lgy3;

    .line 130
    .line 131
    invoke-direct {v7, p0, v1}, Lqn0;-><init>(Ljava/util/List;I)V

    .line 132
    .line 133
    .line 134
    const/4 v3, 0x1

    .line 135
    invoke-direct/range {v2 .. v7}, Lqy4;-><init>(IILxn4;Liu4;Lqn0;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    return-void

    .line 142
    :pswitch_b
    new-instance p0, Lur3;

    .line 143
    .line 144
    invoke-direct {p0}, Lur3;-><init>()V

    .line 145
    .line 146
    .line 147
    invoke-virtual {p2, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    return-void

    .line 151
    :pswitch_c
    new-instance p0, Li83;

    .line 152
    .line 153
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 154
    .line 155
    .line 156
    invoke-virtual {p2, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    return-void

    .line 160
    :pswitch_d
    new-instance p1, Loe1;

    .line 161
    .line 162
    iget-object v0, p0, Lsk0;->e:Lom0;

    .line 163
    .line 164
    iget-boolean v2, p0, Lsk0;->d:Z

    .line 165
    .line 166
    if-eqz v2, :cond_2

    .line 167
    .line 168
    move v2, v1

    .line 169
    goto :goto_1

    .line 170
    :cond_2
    const/16 v2, 0x20

    .line 171
    .line 172
    :goto_1
    sget-object v3, Lyw1;->o:Lvw1;

    .line 173
    .line 174
    sget-object v3, Lgy3;->r:Lgy3;

    .line 175
    .line 176
    const/4 v4, 0x0

    .line 177
    invoke-direct {p1, v0, v2, v4, v3}, Loe1;-><init>(Lxn4;ILiu4;Ljava/util/List;)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    new-instance p1, Lsy2;

    .line 184
    .line 185
    iget-object v0, p0, Lsk0;->e:Lom0;

    .line 186
    .line 187
    iget v2, p0, Lsk0;->b:I

    .line 188
    .line 189
    iget-boolean p0, p0, Lsk0;->d:Z

    .line 190
    .line 191
    if-eqz p0, :cond_3

    .line 192
    .line 193
    goto :goto_2

    .line 194
    :cond_3
    const/16 v1, 0x10

    .line 195
    .line 196
    :goto_2
    or-int p0, v2, v1

    .line 197
    .line 198
    invoke-direct {p1, v0, p0}, Lsy2;-><init>(Lxn4;I)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    return-void

    .line 205
    :pswitch_e
    new-instance p0, Lky2;

    .line 206
    .line 207
    invoke-direct {p0, v1}, Lky2;-><init>(I)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {p2, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    return-void

    .line 214
    :pswitch_f
    new-instance p1, Lni2;

    .line 215
    .line 216
    iget-object v0, p0, Lsk0;->e:Lom0;

    .line 217
    .line 218
    iget-boolean p0, p0, Lsk0;->d:Z

    .line 219
    .line 220
    if-eqz p0, :cond_4

    .line 221
    .line 222
    goto :goto_3

    .line 223
    :cond_4
    const/4 v1, 0x2

    .line 224
    :goto_3
    invoke-direct {p1, v0, v1}, Lni2;-><init>(Lxn4;I)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 228
    .line 229
    .line 230
    return-void

    .line 231
    :pswitch_10
    new-instance p0, Ln91;

    .line 232
    .line 233
    invoke-direct {p0}, Ln91;-><init>()V

    .line 234
    .line 235
    .line 236
    invoke-virtual {p2, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 237
    .line 238
    .line 239
    return-void

    .line 240
    :pswitch_11
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 241
    .line 242
    .line 243
    move-result-object p0

    .line 244
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object p0

    .line 248
    sget-object p1, Lsk0;->i:Lrm3;

    .line 249
    .line 250
    invoke-virtual {p1, p0}, Lrm3;->E([Ljava/lang/Object;)Lk51;

    .line 251
    .line 252
    .line 253
    move-result-object p0

    .line 254
    if-eqz p0, :cond_5

    .line 255
    .line 256
    invoke-virtual {p2, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 257
    .line 258
    .line 259
    return-void

    .line 260
    :cond_5
    new-instance p0, Ls71;

    .line 261
    .line 262
    invoke-direct {p0}, Ls71;-><init>()V

    .line 263
    .line 264
    .line 265
    invoke-virtual {p2, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 266
    .line 267
    .line 268
    return-void

    .line 269
    :pswitch_12
    new-instance p0, Lp9;

    .line 270
    .line 271
    invoke-direct {p0}, Lp9;-><init>()V

    .line 272
    .line 273
    .line 274
    invoke-virtual {p2, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 275
    .line 276
    .line 277
    return-void

    .line 278
    :pswitch_13
    new-instance p0, Lh6;

    .line 279
    .line 280
    invoke-direct {p0, v1}, Lh6;-><init>(I)V

    .line 281
    .line 282
    .line 283
    invoke-virtual {p2, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 284
    .line 285
    .line 286
    return-void

    .line 287
    :pswitch_14
    new-instance p0, Lt2;

    .line 288
    .line 289
    invoke-direct {p0}, Lt2;-><init>()V

    .line 290
    .line 291
    .line 292
    invoke-virtual {p2, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 293
    .line 294
    .line 295
    return-void

    .line 296
    :pswitch_15
    new-instance p0, Lr2;

    .line 297
    .line 298
    invoke-direct {p0}, Lr2;-><init>()V

    .line 299
    .line 300
    .line 301
    invoke-virtual {p2, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 302
    .line 303
    .line 304
    return-void

    .line 305
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
