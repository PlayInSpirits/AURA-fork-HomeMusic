.class public final Lj13;
.super Lep4;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lwf1;


# instance fields
.field public o:Ll13;

.field public p:Ljava/lang/Object;

.field public q:Lsm0;

.field public r:Lk13;

.field public s:I

.field public synthetic t:Ljava/lang/Object;

.field public final synthetic u:Lh13;

.field public final synthetic v:Lk13;

.field public final synthetic w:Lr;

.field public final synthetic x:Lsm0;


# direct methods
.method public constructor <init>(Lh13;Lk13;Lr;Lsm0;Lvd0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lj13;->u:Lh13;

    .line 2
    .line 3
    iput-object p2, p0, Lj13;->v:Lk13;

    .line 4
    .line 5
    iput-object p3, p0, Lj13;->w:Lr;

    .line 6
    .line 7
    iput-object p4, p0, Lj13;->x:Lsm0;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, Lep4;-><init>(ILvd0;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvd0;)Lvd0;
    .locals 6

    .line 1
    new-instance v0, Lj13;

    .line 2
    .line 3
    iget-object v3, p0, Lj13;->w:Lr;

    .line 4
    .line 5
    iget-object v4, p0, Lj13;->x:Lsm0;

    .line 6
    .line 7
    iget-object v1, p0, Lj13;->u:Lh13;

    .line 8
    .line 9
    iget-object v2, p0, Lj13;->v:Lk13;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, Lj13;-><init>(Lh13;Lk13;Lr;Lsm0;Lvd0;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, v0, Lj13;->t:Ljava/lang/Object;

    .line 16
    .line 17
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lwe0;

    .line 2
    .line 3
    check-cast p2, Lvd0;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lj13;->create(Ljava/lang/Object;Lvd0;)Lvd0;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lj13;

    .line 10
    .line 11
    sget-object p1, Lj15;->a:Lj15;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lj13;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lj13;->s:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    sget-object v4, Lxe0;->n:Lxe0;

    .line 7
    .line 8
    if-eqz v0, :cond_2

    .line 9
    .line 10
    if-eq v0, v2, :cond_1

    .line 11
    .line 12
    if-ne v0, v1, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lj13;->p:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Lk13;

    .line 17
    .line 18
    iget-object v1, p0, Lj13;->o:Ll13;

    .line 19
    .line 20
    iget-object p0, p0, Lj13;->t:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p0, Li13;

    .line 23
    .line 24
    :try_start_0
    invoke-static {p1}, Lkb4;->X(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    .line 26
    .line 27
    goto/16 :goto_4

    .line 28
    .line 29
    :catchall_0
    move-exception p1

    .line 30
    goto/16 :goto_6

    .line 31
    .line 32
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 33
    .line 34
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    return-object v3

    .line 38
    :cond_1
    iget-object v0, p0, Lj13;->r:Lk13;

    .line 39
    .line 40
    iget-object v2, p0, Lj13;->q:Lsm0;

    .line 41
    .line 42
    iget-object v5, p0, Lj13;->p:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v5, Lwf1;

    .line 45
    .line 46
    iget-object v6, p0, Lj13;->o:Ll13;

    .line 47
    .line 48
    iget-object v7, p0, Lj13;->t:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v7, Li13;

    .line 51
    .line 52
    invoke-static {p1}, Lkb4;->X(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    move-object p1, v6

    .line 56
    move-object v6, v5

    .line 57
    move-object v5, p1

    .line 58
    move-object p1, v0

    .line 59
    move-object v0, v7

    .line 60
    goto :goto_2

    .line 61
    :cond_2
    invoke-static {p1}, Lkb4;->X(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    iget-object p1, p0, Lj13;->t:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast p1, Lwe0;

    .line 67
    .line 68
    new-instance v0, Li13;

    .line 69
    .line 70
    invoke-interface {p1}, Lwe0;->e()Lne0;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    sget-object v5, Lfz0;->h0:Lfz0;

    .line 75
    .line 76
    invoke-interface {p1, v5}, Lne0;->K(Lme0;)Lle0;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    check-cast p1, Ls22;

    .line 84
    .line 85
    iget-object v5, p0, Lj13;->u:Lh13;

    .line 86
    .line 87
    invoke-direct {v0, v5, p1}, Li13;-><init>(Lh13;Ls22;)V

    .line 88
    .line 89
    .line 90
    iget-object p1, p0, Lj13;->v:Lk13;

    .line 91
    .line 92
    iget-object v5, p1, Lk13;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 93
    .line 94
    :goto_0
    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v6

    .line 98
    check-cast v6, Li13;

    .line 99
    .line 100
    if-eqz v6, :cond_4

    .line 101
    .line 102
    iget-object v7, v0, Li13;->a:Lh13;

    .line 103
    .line 104
    iget-object v8, v6, Li13;->a:Lh13;

    .line 105
    .line 106
    invoke-virtual {v7, v8}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 107
    .line 108
    .line 109
    move-result v7

    .line 110
    if-ltz v7, :cond_3

    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_3
    new-instance p0, Ljava/util/concurrent/CancellationException;

    .line 114
    .line 115
    const-string p1, "Current mutation had a higher priority"

    .line 116
    .line 117
    invoke-direct {p0, p1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    throw p0

    .line 121
    :cond_4
    :goto_1
    invoke-virtual {v5, v6, v0}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v7

    .line 125
    if-eqz v7, :cond_b

    .line 126
    .line 127
    if-eqz v6, :cond_5

    .line 128
    .line 129
    iget-object v5, v6, Li13;->b:Ls22;

    .line 130
    .line 131
    new-instance v6, Landroidx/compose/foundation/MutationInterruptedException;

    .line 132
    .line 133
    invoke-direct {v6}, Landroidx/compose/foundation/MutationInterruptedException;-><init>()V

    .line 134
    .line 135
    .line 136
    invoke-interface {v5, v6}, Ls22;->f(Ljava/util/concurrent/CancellationException;)V

    .line 137
    .line 138
    .line 139
    :cond_5
    iget-object v5, p1, Lk13;->b:Ln13;

    .line 140
    .line 141
    iput-object v0, p0, Lj13;->t:Ljava/lang/Object;

    .line 142
    .line 143
    iput-object v5, p0, Lj13;->o:Ll13;

    .line 144
    .line 145
    iget-object v6, p0, Lj13;->w:Lr;

    .line 146
    .line 147
    iput-object v6, p0, Lj13;->p:Ljava/lang/Object;

    .line 148
    .line 149
    iget-object v7, p0, Lj13;->x:Lsm0;

    .line 150
    .line 151
    iput-object v7, p0, Lj13;->q:Lsm0;

    .line 152
    .line 153
    iput-object p1, p0, Lj13;->r:Lk13;

    .line 154
    .line 155
    iput v2, p0, Lj13;->s:I

    .line 156
    .line 157
    invoke-virtual {v5, p0}, Ln13;->b(Lwd0;)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    if-ne v2, v4, :cond_6

    .line 162
    .line 163
    goto :goto_3

    .line 164
    :cond_6
    move-object v2, v7

    .line 165
    :goto_2
    :try_start_1
    iput-object v0, p0, Lj13;->t:Ljava/lang/Object;

    .line 166
    .line 167
    iput-object v5, p0, Lj13;->o:Ll13;

    .line 168
    .line 169
    iput-object p1, p0, Lj13;->p:Ljava/lang/Object;

    .line 170
    .line 171
    iput-object v3, p0, Lj13;->q:Lsm0;

    .line 172
    .line 173
    iput-object v3, p0, Lj13;->r:Lk13;

    .line 174
    .line 175
    iput v1, p0, Lj13;->s:I

    .line 176
    .line 177
    invoke-interface {v6, v2, p0}, Lwf1;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 181
    if-ne p0, v4, :cond_7

    .line 182
    .line 183
    :goto_3
    return-object v4

    .line 184
    :cond_7
    move-object v1, p1

    .line 185
    move-object p1, p0

    .line 186
    move-object p0, v0

    .line 187
    move-object v0, v1

    .line 188
    move-object v1, v5

    .line 189
    :goto_4
    :try_start_2
    iget-object v0, v0, Lk13;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 190
    .line 191
    :cond_8
    invoke-virtual {v0, p0, v3}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    move-result v2

    .line 195
    if-eqz v2, :cond_9

    .line 196
    .line 197
    goto :goto_5

    .line 198
    :cond_9
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 202
    if-eq v2, p0, :cond_8

    .line 203
    .line 204
    :goto_5
    invoke-interface {v1, v3}, Ll13;->f(Ljava/lang/Object;)V

    .line 205
    .line 206
    .line 207
    return-object p1

    .line 208
    :catchall_1
    move-exception p0

    .line 209
    goto :goto_8

    .line 210
    :catchall_2
    move-exception p0

    .line 211
    move-object v1, p1

    .line 212
    move-object p1, p0

    .line 213
    move-object p0, v0

    .line 214
    move-object v0, v1

    .line 215
    move-object v1, v5

    .line 216
    :goto_6
    :try_start_3
    iget-object v0, v0, Lk13;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 217
    .line 218
    :goto_7
    invoke-virtual {v0, p0, v3}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 219
    .line 220
    .line 221
    move-result v2

    .line 222
    if-nez v2, :cond_a

    .line 223
    .line 224
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v2

    .line 228
    if-ne v2, p0, :cond_a

    .line 229
    .line 230
    goto :goto_7

    .line 231
    :cond_a
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 232
    :goto_8
    invoke-interface {v1, v3}, Ll13;->f(Ljava/lang/Object;)V

    .line 233
    .line 234
    .line 235
    throw p0

    .line 236
    :cond_b
    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v7

    .line 240
    if-eq v7, v6, :cond_4

    .line 241
    .line 242
    goto/16 :goto_0
.end method
