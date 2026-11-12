.class public final Lri1;
.super Landroid/os/Handler;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final a:Ljava/util/ArrayList;

.field public final b:Ljava/util/ArrayList;

.field public final synthetic c:Lui1;


# direct methods
.method public constructor <init>(Lui1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lri1;->c:Lui1;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance p1, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lri1;->a:Ljava/util/ArrayList;

    .line 12
    .line 13
    new-instance p1, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Lri1;->b:Ljava/util/ArrayList;

    .line 19
    .line 20
    return-void
.end method

.method public static a(Lsq2;ILjava/lang/Object;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lsq2;->a:Lyq2;

    .line 2
    .line 3
    iget-object v0, p0, Lsq2;->b:Luo;

    .line 4
    .line 5
    const v1, 0xff00

    .line 6
    .line 7
    .line 8
    and-int/2addr v1, p1

    .line 9
    const/16 v2, 0x100

    .line 10
    .line 11
    if-eq v1, v2, :cond_4

    .line 12
    .line 13
    const/16 p0, 0x200

    .line 14
    .line 15
    if-eq v1, p0, :cond_3

    .line 16
    .line 17
    const/16 p0, 0x300

    .line 18
    .line 19
    if-eq v1, p0, :cond_0

    .line 20
    .line 21
    goto/16 :goto_3

    .line 22
    .line 23
    :cond_0
    const/16 p0, 0x301

    .line 24
    .line 25
    if-eq p1, p0, :cond_1

    .line 26
    .line 27
    goto/16 :goto_3

    .line 28
    .line 29
    :cond_1
    if-nez p2, :cond_2

    .line 30
    .line 31
    invoke-virtual {v0}, Luo;->M()V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_2
    invoke-static {}, Lkf2;->k()V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_3
    check-cast p2, Lvq2;

    .line 40
    .line 41
    packed-switch p1, :pswitch_data_0

    .line 42
    .line 43
    .line 44
    goto/16 :goto_3

    .line 45
    .line 46
    :pswitch_0
    invoke-virtual {v0}, Luo;->E()V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :pswitch_1
    invoke-virtual {v0}, Luo;->F()V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :pswitch_2
    invoke-virtual {v0}, Luo;->D()V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :cond_4
    const/16 v1, 0x108

    .line 59
    .line 60
    if-eq p1, v1, :cond_7

    .line 61
    .line 62
    const/16 v1, 0x106

    .line 63
    .line 64
    if-ne p1, v1, :cond_5

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_5
    const/16 v1, 0x109

    .line 68
    .line 69
    if-eq p1, v1, :cond_6

    .line 70
    .line 71
    const/16 v1, 0x10a

    .line 72
    .line 73
    if-eq p1, v1, :cond_6

    .line 74
    .line 75
    check-cast p2, Lwq2;

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    invoke-static {}, Lkf2;->k()V

    .line 82
    .line 83
    .line 84
    return-void

    .line 85
    :cond_7
    :goto_0
    check-cast p2, Lti1;

    .line 86
    .line 87
    iget-object p2, p2, Lti1;->a:Lwq2;

    .line 88
    .line 89
    :goto_1
    if-eqz p2, :cond_a

    .line 90
    .line 91
    iget v1, p0, Lsq2;->d:I

    .line 92
    .line 93
    and-int/lit8 v1, v1, 0x2

    .line 94
    .line 95
    if-nez v1, :cond_9

    .line 96
    .line 97
    iget-object p0, p0, Lsq2;->c:Lrq2;

    .line 98
    .line 99
    invoke-virtual {p2, p0}, Lwq2;->h(Lrq2;)Z

    .line 100
    .line 101
    .line 102
    move-result p0

    .line 103
    if-eqz p0, :cond_8

    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_8
    invoke-static {}, Lyq2;->c()Lui1;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    return-void

    .line 114
    :cond_9
    :goto_2
    packed-switch p1, :pswitch_data_1

    .line 115
    .line 116
    .line 117
    goto :goto_3

    .line 118
    :pswitch_3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    return-void

    .line 122
    :pswitch_4
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    return-void

    .line 126
    :pswitch_5
    invoke-virtual {v0, p2}, Luo;->J(Lwq2;)V

    .line 127
    .line 128
    .line 129
    return-void

    .line 130
    :pswitch_6
    invoke-virtual {v0}, Luo;->K()V

    .line 131
    .line 132
    .line 133
    return-void

    .line 134
    :pswitch_7
    invoke-virtual {v0, p2}, Luo;->J(Lwq2;)V

    .line 135
    .line 136
    .line 137
    return-void

    .line 138
    :pswitch_8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    return-void

    .line 142
    :pswitch_9
    invoke-virtual {v0, p2}, Luo;->L(Lwq2;)V

    .line 143
    .line 144
    .line 145
    return-void

    .line 146
    :pswitch_a
    invoke-virtual {v0, p2}, Luo;->H(Lwq2;)V

    .line 147
    .line 148
    .line 149
    return-void

    .line 150
    :pswitch_b
    invoke-virtual {v0}, Luo;->I()V

    .line 151
    .line 152
    .line 153
    return-void

    .line 154
    :pswitch_c
    invoke-virtual {v0}, Luo;->G()V

    .line 155
    .line 156
    .line 157
    :cond_a
    :goto_3
    return-void

    .line 158
    nop

    .line 159
    :pswitch_data_0
    .packed-switch 0x201
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    :pswitch_data_1
    .packed-switch 0x101
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
    .end packed-switch
.end method


# virtual methods
.method public final b(ILjava/lang/Object;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Landroid/os/Message;->sendToTarget()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final handleMessage(Landroid/os/Message;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lri1;->a:Ljava/util/ArrayList;

    .line 2
    .line 3
    iget-object v1, p0, Lri1;->c:Lui1;

    .line 4
    .line 5
    iget-object v2, v1, Lui1;->g:Ljava/util/ArrayList;

    .line 6
    .line 7
    iget-object v3, v1, Lui1;->r:Lvg3;

    .line 8
    .line 9
    iget v4, p1, Landroid/os/Message;->what:I

    .line 10
    .line 11
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 12
    .line 13
    const/16 v5, 0x103

    .line 14
    .line 15
    if-ne v4, v5, :cond_0

    .line 16
    .line 17
    invoke-virtual {v1}, Lui1;->g()Lwq2;

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    iget-object v5, v5, Lwq2;->c:Ljava/lang/String;

    .line 22
    .line 23
    move-object v6, p1

    .line 24
    check-cast v6, Lwq2;

    .line 25
    .line 26
    iget-object v6, v6, Lwq2;->c:Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    if-eqz v5, :cond_0

    .line 33
    .line 34
    const/4 v5, 0x1

    .line 35
    invoke-virtual {v1, v5}, Lui1;->o(Z)V

    .line 36
    .line 37
    .line 38
    :cond_0
    const/16 v5, 0x106

    .line 39
    .line 40
    const/4 v6, 0x0

    .line 41
    iget-object p0, p0, Lri1;->b:Ljava/util/ArrayList;

    .line 42
    .line 43
    if-eq v4, v5, :cond_2

    .line 44
    .line 45
    const/16 v1, 0x108

    .line 46
    .line 47
    if-eq v4, v1, :cond_1

    .line 48
    .line 49
    packed-switch v4, :pswitch_data_0

    .line 50
    .line 51
    .line 52
    goto/16 :goto_1

    .line 53
    .line 54
    :pswitch_0
    move-object p0, p1

    .line 55
    check-cast p0, Lwq2;

    .line 56
    .line 57
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0}, Lwq2;->c()Lqq2;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    if-eq v1, v3, :cond_5

    .line 65
    .line 66
    invoke-virtual {v3, p0}, Lvg3;->k(Lwq2;)I

    .line 67
    .line 68
    .line 69
    move-result p0

    .line 70
    if-ltz p0, :cond_5

    .line 71
    .line 72
    iget-object v1, v3, Lvg3;->E:Ljava/util/ArrayList;

    .line 73
    .line 74
    invoke-virtual {v1, p0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    check-cast p0, Lyg3;

    .line 79
    .line 80
    invoke-static {p0}, Lvg3;->t(Lyg3;)V

    .line 81
    .line 82
    .line 83
    goto :goto_1

    .line 84
    :pswitch_1
    move-object p0, p1

    .line 85
    check-cast p0, Lwq2;

    .line 86
    .line 87
    invoke-virtual {v3, p0}, Lvg3;->o(Lwq2;)V

    .line 88
    .line 89
    .line 90
    goto :goto_1

    .line 91
    :pswitch_2
    move-object p0, p1

    .line 92
    check-cast p0, Lwq2;

    .line 93
    .line 94
    invoke-virtual {v3, p0}, Lvg3;->n(Lwq2;)V

    .line 95
    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_1
    move-object v1, p1

    .line 99
    check-cast v1, Lti1;

    .line 100
    .line 101
    iget-object v5, v1, Lti1;->a:Lwq2;

    .line 102
    .line 103
    invoke-virtual {p0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    invoke-virtual {v3, v5}, Lvg3;->n(Lwq2;)V

    .line 107
    .line 108
    .line 109
    iget-boolean p0, v1, Lti1;->b:Z

    .line 110
    .line 111
    if-eqz p0, :cond_5

    .line 112
    .line 113
    invoke-virtual {v3, v5}, Lvg3;->p(Lwq2;)V

    .line 114
    .line 115
    .line 116
    goto :goto_1

    .line 117
    :cond_2
    move-object v5, p1

    .line 118
    check-cast v5, Lti1;

    .line 119
    .line 120
    iget-object v7, v5, Lti1;->a:Lwq2;

    .line 121
    .line 122
    iget-boolean v5, v5, Lti1;->b:Z

    .line 123
    .line 124
    if-eqz v5, :cond_3

    .line 125
    .line 126
    invoke-virtual {v3, v7}, Lvg3;->p(Lwq2;)V

    .line 127
    .line 128
    .line 129
    :cond_3
    iget-object v1, v1, Lui1;->t:Lwq2;

    .line 130
    .line 131
    if-eqz v1, :cond_5

    .line 132
    .line 133
    invoke-virtual {v7}, Lwq2;->d()Z

    .line 134
    .line 135
    .line 136
    move-result v1

    .line 137
    if-eqz v1, :cond_5

    .line 138
    .line 139
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 140
    .line 141
    .line 142
    move-result v1

    .line 143
    move v5, v6

    .line 144
    :goto_0
    if-ge v5, v1, :cond_4

    .line 145
    .line 146
    invoke-virtual {p0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v7

    .line 150
    add-int/lit8 v5, v5, 0x1

    .line 151
    .line 152
    check-cast v7, Lwq2;

    .line 153
    .line 154
    invoke-virtual {v3, v7}, Lvg3;->o(Lwq2;)V

    .line 155
    .line 156
    .line 157
    goto :goto_0

    .line 158
    :cond_4
    invoke-virtual {p0}, Ljava/util/ArrayList;->clear()V

    .line 159
    .line 160
    .line 161
    :cond_5
    :goto_1
    :try_start_0
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 162
    .line 163
    .line 164
    move-result p0

    .line 165
    :goto_2
    add-int/lit8 p0, p0, -0x1

    .line 166
    .line 167
    if-ltz p0, :cond_7

    .line 168
    .line 169
    invoke-virtual {v2, p0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    check-cast v1, Ljava/lang/ref/WeakReference;

    .line 174
    .line 175
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    check-cast v1, Lyq2;

    .line 180
    .line 181
    if-nez v1, :cond_6

    .line 182
    .line 183
    invoke-virtual {v2, p0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    goto :goto_2

    .line 187
    :catchall_0
    move-exception p0

    .line 188
    goto :goto_4

    .line 189
    :cond_6
    iget-object v1, v1, Lyq2;->b:Ljava/util/ArrayList;

    .line 190
    .line 191
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 192
    .line 193
    .line 194
    goto :goto_2

    .line 195
    :cond_7
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 196
    .line 197
    .line 198
    move-result p0

    .line 199
    :goto_3
    if-ge v6, p0, :cond_8

    .line 200
    .line 201
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    add-int/lit8 v6, v6, 0x1

    .line 206
    .line 207
    check-cast v1, Lsq2;

    .line 208
    .line 209
    invoke-static {v1, v4, p1}, Lri1;->a(Lsq2;ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 210
    .line 211
    .line 212
    goto :goto_3

    .line 213
    :cond_8
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 214
    .line 215
    .line 216
    return-void

    .line 217
    :goto_4
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 218
    .line 219
    .line 220
    throw p0

    .line 221
    :pswitch_data_0
    .packed-switch 0x101
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
