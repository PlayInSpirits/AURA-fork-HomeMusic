.class public final synthetic La62;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lbp3;
.implements Lcp3;
.implements Lp5;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lh62;


# direct methods
.method public synthetic constructor <init>(Lh62;I)V
    .locals 0

    .line 1
    iput p2, p0, La62;->n:I

    .line 2
    .line 3
    iput-object p1, p0, La62;->o:Lh62;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public g(Landroidx/preference/Preference;Ljava/lang/Object;)Z
    .locals 8

    .line 1
    iget p1, p0, La62;->n:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const-wide/16 v1, 0x0

    .line 5
    .line 6
    iget-object p0, p0, La62;->o:Lh62;

    .line 7
    .line 8
    packed-switch p1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 12
    .line 13
    invoke-static {p2, p1}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_1

    .line 18
    .line 19
    sget-boolean p1, Lcom/eddyizm/tempus/lan/LanReceiverService;->y:Z

    .line 20
    .line 21
    sget-boolean p1, Lcom/eddyizm/tempus/lan/LanReceiverService;->y:Z

    .line 22
    .line 23
    if-nez p1, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    sget-object p1, Lcom/eddyizm/tempus/lan/LanReceiverService;->B:Ljava/util/concurrent/ConcurrentHashMap;

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 29
    .line 30
    .line 31
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 32
    .line 33
    .line 34
    move-result-wide p1

    .line 35
    const-wide/32 v1, 0x1d4c0

    .line 36
    .line 37
    .line 38
    add-long/2addr p1, v1

    .line 39
    sput-wide p1, Lcom/eddyizm/tempus/lan/LanReceiverService;->A:J

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    sget-boolean p1, Lcom/eddyizm/tempus/lan/LanReceiverService;->y:Z

    .line 43
    .line 44
    sput-wide v1, Lcom/eddyizm/tempus/lan/LanReceiverService;->A:J

    .line 45
    .line 46
    sget-object p1, Lcom/eddyizm/tempus/lan/LanReceiverService;->B:Ljava/util/concurrent/ConcurrentHashMap;

    .line 47
    .line 48
    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 49
    .line 50
    .line 51
    :goto_0
    invoke-virtual {p0}, Lh62;->p0()V

    .line 52
    .line 53
    .line 54
    return v0

    .line 55
    :pswitch_0
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 56
    .line 57
    invoke-static {p2, p1}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    const/4 p2, 0x0

    .line 62
    const-string v3, "app"

    .line 63
    .line 64
    const/4 v4, 0x1

    .line 65
    if-eqz p1, :cond_b

    .line 66
    .line 67
    iget-wide v5, p0, Lh62;->P0:J

    .line 68
    .line 69
    cmp-long p1, v5, v1

    .line 70
    .line 71
    if-eqz p1, :cond_2

    .line 72
    .line 73
    goto/16 :goto_3

    .line 74
    .line 75
    :cond_2
    invoke-static {}, Lud3;->D()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    if-eqz p1, :cond_a

    .line 80
    .line 81
    invoke-static {p1}, Lqm4;->u0(Ljava/lang/CharSequence;)Z

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    if-eqz p1, :cond_3

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_3
    iput-boolean v4, p0, Lh62;->V0:Z

    .line 89
    .line 90
    new-instance p1, Ljava/util/ArrayList;

    .line 91
    .line 92
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 93
    .line 94
    .line 95
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 96
    .line 97
    const/16 v2, 0x21

    .line 98
    .line 99
    if-lt v1, v2, :cond_4

    .line 100
    .line 101
    const-string v2, "android.permission.POST_NOTIFICATIONS"

    .line 102
    .line 103
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    :cond_4
    const/16 v2, 0x25

    .line 107
    .line 108
    if-lt v1, v2, :cond_5

    .line 109
    .line 110
    const-string v1, "android.permission.ACCESS_LOCAL_NETWORK"

    .line 111
    .line 112
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    :cond_5
    new-instance v1, Ljava/util/ArrayList;

    .line 116
    .line 117
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 118
    .line 119
    .line 120
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 121
    .line 122
    .line 123
    move-result v2

    .line 124
    move v4, v0

    .line 125
    :cond_6
    :goto_1
    if-ge v4, v2, :cond_8

    .line 126
    .line 127
    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v5

    .line 131
    add-int/lit8 v4, v4, 0x1

    .line 132
    .line 133
    move-object v6, v5

    .line 134
    check-cast v6, Ljava/lang/String;

    .line 135
    .line 136
    iget-object v7, p0, Lh62;->t0:Landroid/content/Context;

    .line 137
    .line 138
    if-eqz v7, :cond_7

    .line 139
    .line 140
    invoke-static {v7, v6}, Lud3;->c(Landroid/content/Context;Ljava/lang/String;)I

    .line 141
    .line 142
    .line 143
    move-result v6

    .line 144
    if-eqz v6, :cond_6

    .line 145
    .line 146
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    goto :goto_1

    .line 150
    :cond_7
    invoke-static {v3}, Lh12;->Q(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    throw p2

    .line 154
    :cond_8
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 155
    .line 156
    .line 157
    move-result p1

    .line 158
    if-eqz p1, :cond_9

    .line 159
    .line 160
    invoke-virtual {p0}, Lh62;->t0()V

    .line 161
    .line 162
    .line 163
    goto :goto_3

    .line 164
    :cond_9
    iget-object p0, p0, Lh62;->W0:Ldc1;

    .line 165
    .line 166
    new-array p1, v0, [Ljava/lang/String;

    .line 167
    .line 168
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    invoke-virtual {p0, p1}, Ldc1;->a(Ljava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    goto :goto_3

    .line 176
    :cond_a
    :goto_2
    const p1, 0x7f1302be

    .line 177
    .line 178
    .line 179
    invoke-virtual {p0, p1}, Lh62;->s0(I)V

    .line 180
    .line 181
    .line 182
    goto :goto_3

    .line 183
    :cond_b
    iput-wide v1, p0, Lh62;->P0:J

    .line 184
    .line 185
    iput-boolean v4, p0, Lh62;->Q0:Z

    .line 186
    .line 187
    sget-boolean p1, Lcom/eddyizm/tempus/lan/LanReceiverService;->y:Z

    .line 188
    .line 189
    sput-wide v1, Lcom/eddyizm/tempus/lan/LanReceiverService;->A:J

    .line 190
    .line 191
    sget-object p1, Lcom/eddyizm/tempus/lan/LanReceiverService;->B:Ljava/util/concurrent/ConcurrentHashMap;

    .line 192
    .line 193
    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 194
    .line 195
    .line 196
    iget-object p1, p0, Lh62;->t0:Landroid/content/Context;

    .line 197
    .line 198
    if-eqz p1, :cond_d

    .line 199
    .line 200
    new-instance v1, Landroid/content/Intent;

    .line 201
    .line 202
    iget-object v2, p0, Lh62;->t0:Landroid/content/Context;

    .line 203
    .line 204
    if-eqz v2, :cond_c

    .line 205
    .line 206
    const-class p2, Lcom/eddyizm/tempus/lan/LanReceiverService;

    .line 207
    .line 208
    invoke-direct {v1, v2, p2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {p1, v1}, Landroid/content/Context;->stopService(Landroid/content/Intent;)Z

    .line 212
    .line 213
    .line 214
    invoke-virtual {p0}, Lh62;->p0()V

    .line 215
    .line 216
    .line 217
    :goto_3
    return v0

    .line 218
    :cond_c
    invoke-static {v3}, Lh12;->Q(Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    throw p2

    .line 222
    :cond_d
    invoke-static {v3}, Lh12;->Q(Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    throw p2

    .line 226
    nop

    .line 227
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public i(Ljava/lang/Object;)V
    .locals 1

    .line 1
    check-cast p1, Ljava/util/Map;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, La62;->o:Lh62;

    .line 7
    .line 8
    iget-boolean v0, p0, Lh62;->L0:Z

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, Ljava/lang/Iterable;

    .line 18
    .line 19
    instance-of v0, p1, Ljava/util/Collection;

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    move-object v0, p1

    .line 24
    check-cast v0, Ljava/util/Collection;

    .line 25
    .line 26
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_3

    .line 42
    .line 43
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    check-cast v0, Ljava/lang/Boolean;

    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-nez v0, :cond_2

    .line 54
    .line 55
    const p1, 0x7f1302d1

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0, p1}, Lh62;->s0(I)V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :cond_3
    :goto_0
    iget-boolean p1, p0, Lh62;->V0:Z

    .line 63
    .line 64
    if-eqz p1, :cond_4

    .line 65
    .line 66
    invoke-virtual {p0}, Lh62;->t0()V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :cond_4
    invoke-virtual {p0}, Lh62;->q0()V

    .line 71
    .line 72
    .line 73
    return-void
.end method

.method public j(Landroidx/preference/Preference;)V
    .locals 0

    .line 1
    iget p1, p0, La62;->n:I

    .line 2
    .line 3
    iget-object p0, p0, La62;->o:Lh62;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lu52;->f()V

    .line 9
    .line 10
    .line 11
    const p1, 0x7f1302ba

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lh62;->s0(I)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    invoke-virtual {p0}, Lh62;->q0()V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method
