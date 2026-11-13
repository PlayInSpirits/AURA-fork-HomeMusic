.class public final Ldefpackage/wu4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Ldefpackage/wu4;->n:I

    .line 2
    .line 3
    iput-object p2, p0, Ldefpackage/wu4;->o:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget v0, p0, Ldefpackage/wu4;->n:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x4

    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Ldefpackage/wu4;->o:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, Ldefpackage/rf5;

    .line 11
    .line 12
    iget-object p0, p0, Ldefpackage/rf5;->l:Ldefpackage/nq;

    .line 13
    .line 14
    new-instance v0, Ldefpackage/ka0;

    .line 15
    .line 16
    invoke-direct {v0, v2}, Ldefpackage/ka0;-><init>(I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, v0}, Ldefpackage/nq;->a(Ldefpackage/ka0;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :pswitch_0
    iget-object p0, p0, Ldefpackage/wu4;->o:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p0, Ldefpackage/h45;

    .line 26
    .line 27
    iget-object p0, p0, Ldefpackage/h45;->o:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p0, Ldefpackage/gf5;

    .line 30
    .line 31
    iget-object p0, p0, Ldefpackage/gf5;->f:Ldefpackage/me;

    .line 32
    .line 33
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    const-string v1, " disconnecting because it was signed out."

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-interface {p0, v0}, Ldefpackage/me;->a0(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :pswitch_1
    iget-object p0, p0, Ldefpackage/wu4;->o:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast p0, Ldefpackage/gf5;

    .line 54
    .line 55
    invoke-virtual {p0}, Ldefpackage/gf5;->e()V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :pswitch_2
    iget-object p0, p0, Ldefpackage/wu4;->o:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast p0, Ldefpackage/o65;

    .line 62
    .line 63
    invoke-virtual {p0, v1}, Ldefpackage/o65;->p(I)V

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :pswitch_3
    iget-object v0, p0, Ldefpackage/wu4;->o:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v0, Ldefpackage/s25;

    .line 70
    .line 71
    iget-boolean v0, v0, Ldefpackage/s25;->A:Z

    .line 72
    .line 73
    if-nez v0, :cond_0

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_0
    iget-object v0, p0, Ldefpackage/wu4;->o:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v0, Ldefpackage/s25;

    .line 79
    .line 80
    iget-boolean v0, v0, Ldefpackage/s25;->C:Z

    .line 81
    .line 82
    if-nez v0, :cond_1

    .line 83
    .line 84
    iget-object v0, p0, Ldefpackage/wu4;->o:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v0, Ldefpackage/s25;

    .line 87
    .line 88
    iget-object v0, v0, Ldefpackage/s25;->x:Ljava/util/concurrent/ExecutorService;

    .line 89
    .line 90
    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    if-nez v0, :cond_1

    .line 95
    .line 96
    iget-object v0, p0, Ldefpackage/wu4;->o:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v0, Ldefpackage/s25;

    .line 99
    .line 100
    const/4 v1, 0x1

    .line 101
    iput-boolean v1, v0, Ldefpackage/s25;->C:Z

    .line 102
    .line 103
    iget-object v0, p0, Ldefpackage/wu4;->o:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v0, Ldefpackage/s25;

    .line 106
    .line 107
    iget-object v2, v0, Ldefpackage/s25;->x:Ljava/util/concurrent/ExecutorService;

    .line 108
    .line 109
    new-instance v3, Ldefpackage/r25;

    .line 110
    .line 111
    invoke-direct {v3, v0, v1}, Ldefpackage/r25;-><init>(Ldefpackage/s25;I)V

    .line 112
    .line 113
    .line 114
    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 115
    .line 116
    .line 117
    :cond_1
    iget-object v0, p0, Ldefpackage/wu4;->o:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast v0, Ldefpackage/s25;

    .line 120
    .line 121
    iget-object v1, v0, Ldefpackage/s25;->y:Landroid/os/Handler;

    .line 122
    .line 123
    iget-boolean v0, v0, Ldefpackage/s25;->B:Z

    .line 124
    .line 125
    if-eqz v0, :cond_2

    .line 126
    .line 127
    sget-wide v2, Ldefpackage/s25;->F:J

    .line 128
    .line 129
    goto :goto_0

    .line 130
    :cond_2
    sget-wide v2, Ldefpackage/s25;->G:J

    .line 131
    .line 132
    :goto_0
    invoke-virtual {v1, p0, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 133
    .line 134
    .line 135
    :goto_1
    return-void

    .line 136
    :pswitch_4
    iget-object v0, p0, Ldefpackage/wu4;->o:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast v0, Ldefpackage/q25;

    .line 139
    .line 140
    iget-boolean v0, v0, Ldefpackage/q25;->C:Z

    .line 141
    .line 142
    if-nez v0, :cond_4

    .line 143
    .line 144
    iget-object v0, p0, Ldefpackage/wu4;->o:Ljava/lang/Object;

    .line 145
    .line 146
    check-cast v0, Ldefpackage/q25;

    .line 147
    .line 148
    iget-boolean v0, v0, Ldefpackage/q25;->M:Z

    .line 149
    .line 150
    if-nez v0, :cond_3

    .line 151
    .line 152
    goto :goto_2

    .line 153
    :cond_3
    iget-object v0, p0, Ldefpackage/wu4;->o:Ljava/lang/Object;

    .line 154
    .line 155
    check-cast v0, Ldefpackage/q25;

    .line 156
    .line 157
    iget-object v1, v0, Ldefpackage/q25;->l:Ldefpackage/mx2;

    .line 158
    .line 159
    new-instance v3, Ldefpackage/o25;

    .line 160
    .line 161
    invoke-direct {v3, v0, v2}, Ldefpackage/o25;-><init>(Ldefpackage/q25;I)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v1, v3}, Ldefpackage/mx2;->execute(Ljava/lang/Runnable;)V

    .line 165
    .line 166
    .line 167
    iget-object v0, p0, Ldefpackage/wu4;->o:Ljava/lang/Object;

    .line 168
    .line 169
    check-cast v0, Ldefpackage/q25;

    .line 170
    .line 171
    iget-object v0, v0, Ldefpackage/q25;->n:Landroid/os/Handler;

    .line 172
    .line 173
    sget-object v1, Ldefpackage/q25;->Q:Ljava/util/Set;

    .line 174
    .line 175
    const-wide/16 v1, 0x7d0

    .line 176
    .line 177
    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 178
    .line 179
    .line 180
    :cond_4
    :goto_2
    return-void

    .line 181
    :pswitch_5
    iget-object p0, p0, Ldefpackage/wu4;->o:Ljava/lang/Object;

    .line 182
    .line 183
    check-cast p0, Ldefpackage/cv4;

    .line 184
    .line 185
    iget-object v0, p0, Ldefpackage/cv4;->e:Landroid/view/Window$Callback;

    .line 186
    .line 187
    invoke-virtual {p0}, Ldefpackage/cv4;->u0()Landroid/view/Menu;

    .line 188
    .line 189
    .line 190
    move-result-object p0

    .line 191
    instance-of v2, p0, Ldefpackage/qu2;

    .line 192
    .line 193
    const/4 v3, 0x0

    .line 194
    if-eqz v2, :cond_5

    .line 195
    .line 196
    move-object v2, p0

    .line 197
    check-cast v2, Ldefpackage/qu2;

    .line 198
    .line 199
    goto :goto_3

    .line 200
    :cond_5
    move-object v2, v3

    .line 201
    :goto_3
    if-eqz v2, :cond_6

    .line 202
    .line 203
    invoke-virtual {v2}, Ldefpackage/qu2;->y()V

    .line 204
    .line 205
    .line 206
    :cond_6
    :try_start_0
    invoke-interface {p0}, Landroid/view/Menu;->clear()V

    .line 207
    .line 208
    .line 209
    invoke-interface {v0, v1, p0}, Landroid/view/Window$Callback;->onCreatePanelMenu(ILandroid/view/Menu;)Z

    .line 210
    .line 211
    .line 212
    move-result v4

    .line 213
    if-eqz v4, :cond_7

    .line 214
    .line 215
    invoke-interface {v0, v1, v3, p0}, Landroid/view/Window$Callback;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    .line 216
    .line 217
    .line 218
    move-result v0

    .line 219
    if-nez v0, :cond_8

    .line 220
    .line 221
    goto :goto_4

    .line 222
    :catchall_0
    move-exception p0

    .line 223
    goto :goto_5

    .line 224
    :cond_7
    :goto_4
    invoke-interface {p0}, Landroid/view/Menu;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 225
    .line 226
    .line 227
    :cond_8
    if-eqz v2, :cond_9

    .line 228
    .line 229
    invoke-virtual {v2}, Ldefpackage/qu2;->x()V

    .line 230
    .line 231
    .line 232
    :cond_9
    return-void

    .line 233
    :goto_5
    if-eqz v2, :cond_a

    .line 234
    .line 235
    invoke-virtual {v2}, Ldefpackage/qu2;->x()V

    .line 236
    .line 237
    .line 238
    :cond_a
    throw p0

    .line 239
    :pswitch_6
    iget-object p0, p0, Ldefpackage/wu4;->o:Ljava/lang/Object;

    .line 240
    .line 241
    check-cast p0, Landroidx/appcompat/widget/Toolbar;

    .line 242
    .line 243
    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->v()Z

    .line 244
    .line 245
    .line 246
    return-void

    .line 247
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
