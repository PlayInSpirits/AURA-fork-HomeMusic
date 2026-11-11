.class public final Led;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lle0;


# instance fields
.field public final synthetic n:I

.field public final o:Ljava/lang/Object;

.field public final p:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/view/Choreographer;Lbd;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Led;->n:I

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Led;->o:Ljava/lang/Object;

    .line 21
    iput-object p2, p0, Led;->p:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Led;)V
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    iput v0, p0, Led;->n:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Led;->o:Ljava/lang/Object;

    .line 8
    .line 9
    new-instance p1, Lll;

    .line 10
    .line 11
    const/4 v0, 0x6

    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-direct {p1, v0, v1}, Lll;-><init>(IB)V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Led;->p:Ljava/lang/Object;

    .line 17
    .line 18
    return-void
.end method

.method public constructor <init>(Lmv3;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Led;->n:I

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Led;->o:Ljava/lang/Object;

    .line 23
    new-instance p1, Lz40;

    invoke-direct {p1}, Lz40;-><init>()V

    iput-object p1, p0, Led;->p:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final J(Lne0;)Lne0;
    .locals 1

    .line 1
    iget v0, p0, Led;->n:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-static {p0, p1}, Lya4;->F(Lle0;Lne0;)Lne0;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    invoke-static {p0, p1}, Lya4;->F(Lle0;Lne0;)Lne0;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :pswitch_1
    invoke-static {p0, p1}, Lya4;->F(Lle0;Lne0;)Lne0;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final K(Lme0;)Lle0;
    .locals 1

    .line 1
    iget v0, p0, Led;->n:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-static {p0, p1}, Lya4;->r(Lle0;Lme0;)Lle0;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    invoke-static {p0, p1}, Lya4;->r(Lle0;Lme0;)Lle0;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :pswitch_1
    invoke-static {p0, p1}, Lya4;->r(Lle0;Lme0;)Lle0;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final a(Lif1;Lwd0;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Led;->n:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    instance-of v0, p2, Ldf3;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    move-object v0, p2

    .line 13
    check-cast v0, Ldf3;

    .line 14
    .line 15
    iget v1, v0, Ldf3;->q:I

    .line 16
    .line 17
    const/high16 v3, -0x80000000

    .line 18
    .line 19
    and-int v4, v1, v3

    .line 20
    .line 21
    if-eqz v4, :cond_0

    .line 22
    .line 23
    sub-int/2addr v1, v3

    .line 24
    iput v1, v0, Ldf3;->q:I

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    new-instance v0, Ldf3;

    .line 28
    .line 29
    invoke-direct {v0, p0, p2}, Ldf3;-><init>(Led;Lwd0;)V

    .line 30
    .line 31
    .line 32
    :goto_0
    iget-object p2, v0, Ldf3;->o:Ljava/lang/Object;

    .line 33
    .line 34
    sget-object v1, Lxe0;->n:Lxe0;

    .line 35
    .line 36
    iget v3, v0, Ldf3;->q:I

    .line 37
    .line 38
    const/4 v4, 0x0

    .line 39
    const/4 v5, 0x2

    .line 40
    if-eqz v3, :cond_3

    .line 41
    .line 42
    if-eq v3, v2, :cond_2

    .line 43
    .line 44
    if-ne v3, v5, :cond_1

    .line 45
    .line 46
    invoke-static {p2}, Lkb4;->X(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    goto :goto_4

    .line 50
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    move-object p2, v4

    .line 56
    goto :goto_4

    .line 57
    :cond_2
    iget-object p1, v0, Ldf3;->n:Lif1;

    .line 58
    .line 59
    invoke-static {p2}, Lkb4;->X(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_3
    invoke-static {p2}, Lkb4;->X(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    iget-object p2, p0, Led;->p:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast p2, Lll;

    .line 69
    .line 70
    iput-object p1, v0, Ldf3;->n:Lif1;

    .line 71
    .line 72
    iput v2, v0, Ldf3;->q:I

    .line 73
    .line 74
    iget-object v3, p2, Lll;->p:Ljava/lang/Object;

    .line 75
    .line 76
    monitor-enter v3

    .line 77
    :try_start_0
    iget-boolean v6, p2, Lll;->o:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 78
    .line 79
    monitor-exit v3

    .line 80
    if-eqz v6, :cond_4

    .line 81
    .line 82
    sget-object p2, Lj15;->a:Lj15;

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_4
    new-instance v3, Lcz;

    .line 86
    .line 87
    invoke-static {v0}, Lya4;->x(Lvd0;)Lvd0;

    .line 88
    .line 89
    .line 90
    move-result-object v6

    .line 91
    invoke-direct {v3, v2, v6}, Lcz;-><init>(ILvd0;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v3}, Lcz;->u()V

    .line 95
    .line 96
    .line 97
    iget-object v2, p2, Lll;->p:Ljava/lang/Object;

    .line 98
    .line 99
    monitor-enter v2

    .line 100
    :try_start_1
    iget-object v6, p2, Lll;->q:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v6, Ljava/util/ArrayList;

    .line 103
    .line 104
    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 105
    .line 106
    .line 107
    monitor-exit v2

    .line 108
    new-instance v2, Lcd;

    .line 109
    .line 110
    const/4 v6, 0x3

    .line 111
    invoke-direct {v2, v6, p2, v3}, Lcd;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v3, v2}, Lcz;->w(Lif1;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v3}, Lcz;->q()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object p2

    .line 121
    if-ne p2, v1, :cond_5

    .line 122
    .line 123
    goto :goto_1

    .line 124
    :cond_5
    sget-object p2, Lj15;->a:Lj15;

    .line 125
    .line 126
    :goto_1
    if-ne p2, v1, :cond_6

    .line 127
    .line 128
    goto :goto_3

    .line 129
    :cond_6
    :goto_2
    iget-object p0, p0, Led;->o:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast p0, Led;

    .line 132
    .line 133
    iput-object v4, v0, Ldf3;->n:Lif1;

    .line 134
    .line 135
    iput v5, v0, Ldf3;->q:I

    .line 136
    .line 137
    invoke-virtual {p0, p1, v0}, Led;->a(Lif1;Lwd0;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object p2

    .line 141
    if-ne p2, v1, :cond_7

    .line 142
    .line 143
    :goto_3
    move-object p2, v1

    .line 144
    :cond_7
    :goto_4
    return-object p2

    .line 145
    :catchall_0
    move-exception p0

    .line 146
    monitor-exit v2

    .line 147
    throw p0

    .line 148
    :catchall_1
    move-exception p0

    .line 149
    monitor-exit v3

    .line 150
    throw p0

    .line 151
    :pswitch_0
    new-instance v0, Lcz;

    .line 152
    .line 153
    invoke-static {p2}, Lya4;->x(Lvd0;)Lvd0;

    .line 154
    .line 155
    .line 156
    move-result-object p2

    .line 157
    invoke-direct {v0, v2, p2}, Lcz;-><init>(ILvd0;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v0}, Lcz;->u()V

    .line 161
    .line 162
    .line 163
    iget-object p2, p0, Led;->p:Ljava/lang/Object;

    .line 164
    .line 165
    check-cast p2, Lz40;

    .line 166
    .line 167
    new-instance v2, Ljv;

    .line 168
    .line 169
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 170
    .line 171
    .line 172
    iput-object v0, v2, Ljv;->a:Lcz;

    .line 173
    .line 174
    iput-object p1, v2, Ljv;->b:Lif1;

    .line 175
    .line 176
    iget-object p0, p0, Led;->o:Ljava/lang/Object;

    .line 177
    .line 178
    check-cast p0, Lmv3;

    .line 179
    .line 180
    invoke-virtual {p2, v2, p0}, Lz40;->a(Lko;Lgf1;)Lez;

    .line 181
    .line 182
    .line 183
    move-result-object p0

    .line 184
    new-instance p1, Lkv;

    .line 185
    .line 186
    invoke-direct {p1, v1, p0}, Lkv;-><init>(ILjava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v0, p1}, Lcz;->w(Lif1;)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v0}, Lcz;->q()Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object p0

    .line 196
    return-object p0

    .line 197
    :pswitch_1
    iget-object v0, p0, Led;->p:Ljava/lang/Object;

    .line 198
    .line 199
    check-cast v0, Lbd;

    .line 200
    .line 201
    new-instance v3, Lcz;

    .line 202
    .line 203
    invoke-static {p2}, Lya4;->x(Lvd0;)Lvd0;

    .line 204
    .line 205
    .line 206
    move-result-object p2

    .line 207
    invoke-direct {v3, v2, p2}, Lcz;-><init>(ILvd0;)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v3}, Lcz;->u()V

    .line 211
    .line 212
    .line 213
    new-instance p2, Ldd;

    .line 214
    .line 215
    invoke-direct {p2, v3, p0, p1}, Ldd;-><init>(Lcz;Led;Lif1;)V

    .line 216
    .line 217
    .line 218
    iget-object p1, v0, Lbd;->p:Landroid/view/Choreographer;

    .line 219
    .line 220
    iget-object v4, p0, Led;->o:Ljava/lang/Object;

    .line 221
    .line 222
    check-cast v4, Landroid/view/Choreographer;

    .line 223
    .line 224
    invoke-static {p1, v4}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 225
    .line 226
    .line 227
    move-result p1

    .line 228
    if-eqz p1, :cond_9

    .line 229
    .line 230
    iget-object p0, v0, Lbd;->r:Ljava/lang/Object;

    .line 231
    .line 232
    monitor-enter p0

    .line 233
    :try_start_2
    iget-object p1, v0, Lbd;->t:Ljava/util/ArrayList;

    .line 234
    .line 235
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    iget-boolean p1, v0, Lbd;->w:Z

    .line 239
    .line 240
    if-nez p1, :cond_8

    .line 241
    .line 242
    iput-boolean v2, v0, Lbd;->w:Z

    .line 243
    .line 244
    iget-object p1, v0, Lbd;->p:Landroid/view/Choreographer;

    .line 245
    .line 246
    iget-object v2, v0, Lbd;->x:Lad;

    .line 247
    .line 248
    invoke-virtual {p1, v2}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 249
    .line 250
    .line 251
    goto :goto_5

    .line 252
    :catchall_2
    move-exception p1

    .line 253
    goto :goto_6

    .line 254
    :cond_8
    :goto_5
    monitor-exit p0

    .line 255
    new-instance p0, Lcd;

    .line 256
    .line 257
    invoke-direct {p0, v1, v0, p2}, Lcd;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 258
    .line 259
    .line 260
    invoke-virtual {v3, p0}, Lcz;->w(Lif1;)V

    .line 261
    .line 262
    .line 263
    goto :goto_7

    .line 264
    :goto_6
    monitor-exit p0

    .line 265
    throw p1

    .line 266
    :cond_9
    iget-object p1, p0, Led;->o:Ljava/lang/Object;

    .line 267
    .line 268
    check-cast p1, Landroid/view/Choreographer;

    .line 269
    .line 270
    invoke-virtual {p1, p2}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    .line 271
    .line 272
    .line 273
    new-instance p1, Lcd;

    .line 274
    .line 275
    invoke-direct {p1, v2, p0, p2}, Lcd;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 276
    .line 277
    .line 278
    invoke-virtual {v3, p1}, Lcz;->w(Lif1;)V

    .line 279
    .line 280
    .line 281
    :goto_7
    invoke-virtual {v3}, Lcz;->q()Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object p0

    .line 285
    return-object p0

    .line 286
    nop

    .line 287
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public getKey()Lme0;
    .locals 0

    .line 1
    sget-object p0, Lrv2;->p:Lrv2;

    .line 2
    .line 3
    return-object p0
.end method

.method public final s(Lwf1;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Led;->n:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-interface {p1, p2, p0}, Lwf1;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    invoke-interface {p1, p2, p0}, Lwf1;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :pswitch_1
    invoke-interface {p1, p2, p0}, Lwf1;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final u(Lme0;)Lne0;
    .locals 1

    .line 1
    iget v0, p0, Led;->n:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-static {p0, p1}, Lya4;->C(Lle0;Lme0;)Lne0;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    invoke-static {p0, p1}, Lya4;->C(Lle0;Lme0;)Lne0;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :pswitch_1
    invoke-static {p0, p1}, Lya4;->C(Lle0;Lme0;)Lne0;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
