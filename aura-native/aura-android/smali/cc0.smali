.class public final Lcc0;
.super Lep4;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lwf1;


# instance fields
.field public o:Lic2;

.field public p:Lsk4;

.field public q:I

.field public synthetic r:Ljava/lang/Object;

.field public final synthetic s:Loc2;

.field public final synthetic t:Lc52;

.field public final synthetic u:Ldd5;


# direct methods
.method public constructor <init>(Loc2;Lc52;Ldd5;Lvd0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcc0;->s:Loc2;

    .line 2
    .line 3
    iput-object p2, p0, Lcc0;->t:Lc52;

    .line 4
    .line 5
    iput-object p3, p0, Lcc0;->u:Ldd5;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Lep4;-><init>(ILvd0;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvd0;)Lvd0;
    .locals 3

    .line 1
    new-instance v0, Lcc0;

    .line 2
    .line 3
    iget-object v1, p0, Lcc0;->t:Lc52;

    .line 4
    .line 5
    iget-object v2, p0, Lcc0;->u:Ldd5;

    .line 6
    .line 7
    iget-object p0, p0, Lcc0;->s:Loc2;

    .line 8
    .line 9
    invoke-direct {v0, p0, v1, v2, p2}, Lcc0;-><init>(Loc2;Lc52;Ldd5;Lvd0;)V

    .line 10
    .line 11
    .line 12
    iput-object p1, v0, Lcc0;->r:Ljava/lang/Object;

    .line 13
    .line 14
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
    invoke-virtual {p0, p1, p2}, Lcc0;->create(Ljava/lang/Object;Lvd0;)Lvd0;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lcc0;

    .line 10
    .line 11
    sget-object p1, Lj15;->a:Lj15;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lcc0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget v0, p0, Lcc0;->q:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/16 v2, -0x100

    .line 5
    .line 6
    iget-object v3, p0, Lcc0;->s:Loc2;

    .line 7
    .line 8
    const/4 v4, 0x1

    .line 9
    const-string v5, "Delegated worker "

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    if-ne v0, v4, :cond_0

    .line 14
    .line 15
    iget-object v6, p0, Lcc0;->p:Lsk4;

    .line 16
    .line 17
    iget-object v7, p0, Lcc0;->o:Lic2;

    .line 18
    .line 19
    iget-object p0, p0, Lcc0;->r:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 22
    .line 23
    :try_start_0
    invoke-static {p1}, Lkb4;->X(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception v0

    .line 28
    move-object p0, v0

    .line 29
    goto :goto_1

    .line 30
    :catch_0
    move-exception v0

    .line 31
    move-object p1, v0

    .line 32
    goto :goto_2

    .line 33
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 34
    .line 35
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    return-object v1

    .line 39
    :cond_1
    invoke-static {p1}, Lkb4;->X(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    iget-object p1, p0, Lcc0;->r:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p1, Lwe0;

    .line 45
    .line 46
    new-instance v9, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 47
    .line 48
    invoke-direct {v9, v2}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v3}, Loc2;->c()Lry;

    .line 52
    .line 53
    .line 54
    move-result-object v10

    .line 55
    new-instance v6, Lx70;

    .line 56
    .line 57
    const/4 v11, 0x0

    .line 58
    const/4 v12, 0x1

    .line 59
    iget-object v7, p0, Lcc0;->t:Lc52;

    .line 60
    .line 61
    iget-object v8, p0, Lcc0;->u:Ldd5;

    .line 62
    .line 63
    invoke-direct/range {v6 .. v12}, Lx70;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lvd0;I)V

    .line 64
    .line 65
    .line 66
    const/4 v0, 0x3

    .line 67
    invoke-static {p1, v1, v1, v6, v0}, Lfu;->G(Lwe0;Lne0;Lze0;Lwf1;I)Lsk4;

    .line 68
    .line 69
    .line 70
    move-result-object v6

    .line 71
    :try_start_1
    iput-object v9, p0, Lcc0;->r:Ljava/lang/Object;

    .line 72
    .line 73
    iput-object v10, p0, Lcc0;->o:Lic2;

    .line 74
    .line 75
    iput-object v6, p0, Lcc0;->p:Lsk4;

    .line 76
    .line 77
    iput v4, p0, Lcc0;->q:I

    .line 78
    .line 79
    invoke-static {v10, p0}, Lfu;->e(Lic2;Lep4;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p1
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 83
    sget-object p0, Lxe0;->n:Lxe0;

    .line 84
    .line 85
    if-ne p1, p0, :cond_2

    .line 86
    .line 87
    return-object p0

    .line 88
    :cond_2
    move-object p0, v9

    .line 89
    move-object v7, v10

    .line 90
    :goto_0
    :try_start_2
    check-cast p1, Lnc2;
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 91
    .line 92
    invoke-interface {v6, v1}, Ls22;->f(Ljava/util/concurrent/CancellationException;)V

    .line 93
    .line 94
    .line 95
    return-object p1

    .line 96
    :catch_1
    move-exception v0

    .line 97
    move-object p1, v0

    .line 98
    move-object p0, v9

    .line 99
    move-object v7, v10

    .line 100
    goto :goto_2

    .line 101
    :goto_1
    :try_start_3
    sget-object p1, Lic0;->a:Ljava/lang/String;

    .line 102
    .line 103
    invoke-static {}, Lcx;->f()Lcx;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    new-instance v2, Ljava/lang/StringBuilder;

    .line 108
    .line 109
    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    const-string v3, " threw exception in startWork."

    .line 120
    .line 121
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    invoke-virtual {v0, p1, v2, p0}, Lcx;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 129
    .line 130
    .line 131
    throw p0

    .line 132
    :catchall_1
    move-exception v0

    .line 133
    move-object p0, v0

    .line 134
    goto :goto_4

    .line 135
    :goto_2
    sget-object v0, Lic0;->a:Ljava/lang/String;

    .line 136
    .line 137
    invoke-static {}, Lcx;->f()Lcx;

    .line 138
    .line 139
    .line 140
    move-result-object v8

    .line 141
    new-instance v9, Ljava/lang/StringBuilder;

    .line 142
    .line 143
    invoke-direct {v9, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    move-result-object v3

    .line 150
    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    const-string v3, " was cancelled"

    .line 154
    .line 155
    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v3

    .line 162
    invoke-virtual {v8, v0, v3, p1}, Lcx;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 166
    .line 167
    .line 168
    move-result v0

    .line 169
    if-eq v0, v2, :cond_3

    .line 170
    .line 171
    goto :goto_3

    .line 172
    :cond_3
    const/4 v4, 0x0

    .line 173
    :goto_3
    invoke-interface {v7}, Ljava/util/concurrent/Future;->isCancelled()Z

    .line 174
    .line 175
    .line 176
    move-result v0

    .line 177
    if-eqz v0, :cond_4

    .line 178
    .line 179
    if-eqz v4, :cond_4

    .line 180
    .line 181
    new-instance p1, Lzb0;

    .line 182
    .line 183
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 184
    .line 185
    .line 186
    move-result p0

    .line 187
    invoke-direct {p1, p0}, Lzb0;-><init>(I)V

    .line 188
    .line 189
    .line 190
    throw p1

    .line 191
    :cond_4
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 192
    :goto_4
    invoke-interface {v6, v1}, Ls22;->f(Ljava/util/concurrent/CancellationException;)V

    .line 193
    .line 194
    .line 195
    throw p0
.end method
