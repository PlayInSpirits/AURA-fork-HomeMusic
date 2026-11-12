.class public final synthetic Lmm;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:J

.field public final synthetic p:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(JLjava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, Lmm;->n:I

    .line 2
    .line 3
    iput-wide p1, p0, Lmm;->o:J

    .line 4
    .line 5
    iput-object p3, p0, Lmm;->p:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;JI)V
    .locals 0

    .line 11
    iput p4, p0, Lmm;->n:I

    iput-object p1, p0, Lmm;->p:Ljava/lang/Object;

    iput-wide p2, p0, Lmm;->o:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    iget v0, p0, Lmm;->n:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lmm;->p:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lwk3;

    .line 11
    .line 12
    iget-wide v1, p0, Lmm;->o:J

    .line 13
    .line 14
    iget-object p0, v0, Lwk3;->l0:Llv4;

    .line 15
    .line 16
    iget-object p0, p0, Llv4;->t:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p0, Landroidx/recyclerview/widget/RecyclerView;

    .line 19
    .line 20
    long-to-int v0, v1

    .line 21
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->j0(I)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :pswitch_0
    iget-object v0, p0, Lmm;->p:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, Lh62;

    .line 28
    .line 29
    iget-wide v3, p0, Lmm;->o:J

    .line 30
    .line 31
    invoke-virtual {v0, v3, v4}, Lh62;->l0(J)Z

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    if-eqz p0, :cond_0

    .line 36
    .line 37
    iput-object v2, v0, Lh62;->H0:Lg62;

    .line 38
    .line 39
    iput-boolean v1, v0, Lh62;->I0:Z

    .line 40
    .line 41
    const p0, 0x7f1302bb

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, p0}, Lh62;->s0(I)V

    .line 45
    .line 46
    .line 47
    :cond_0
    return-void

    .line 48
    :pswitch_1
    iget-wide v0, p0, Lmm;->o:J

    .line 49
    .line 50
    iget-object p0, p0, Lmm;->p:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p0, Lbl2;

    .line 53
    .line 54
    :try_start_0
    sget-wide v2, Lu52;->i:J

    .line 55
    .line 56
    cmp-long v0, v2, v0

    .line 57
    .line 58
    if-nez v0, :cond_1

    .line 59
    .line 60
    invoke-static {}, Lu52;->c()Lv52;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iget-boolean v0, v0, Lv52;->a:Z

    .line 65
    .line 66
    if-eqz v0, :cond_1

    .line 67
    .line 68
    invoke-virtual {p0}, Lu0;->get()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    check-cast v0, Lbj2;

    .line 73
    .line 74
    invoke-virtual {v0}, Lsk2;->c()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :catchall_0
    move-exception v0

    .line 79
    goto :goto_3

    .line 80
    :catch_0
    move-exception v0

    .line 81
    goto :goto_1

    .line 82
    :cond_1
    :goto_0
    invoke-static {p0}, Lsk2;->Z0(Ljava/util/concurrent/Future;)V

    .line 83
    .line 84
    .line 85
    goto :goto_2

    .line 86
    :goto_1
    :try_start_1
    sget-object v1, Lw42;->a:Lw42;

    .line 87
    .line 88
    const-string v2, "Controller could not pause local playback"

    .line 89
    .line 90
    invoke-virtual {v1, v2, v0}, Lw42;->a(Ljava/lang/String;Ljava/lang/Exception;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 91
    .line 92
    .line 93
    goto :goto_0

    .line 94
    :goto_2
    return-void

    .line 95
    :goto_3
    invoke-static {p0}, Lsk2;->Z0(Ljava/util/concurrent/Future;)V

    .line 96
    .line 97
    .line 98
    throw v0

    .line 99
    :pswitch_2
    iget-wide v2, p0, Lmm;->o:J

    .line 100
    .line 101
    iget-object p0, p0, Lmm;->p:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast p0, Ljava/lang/Exception;

    .line 104
    .line 105
    sget-wide v4, Lu52;->i:J

    .line 106
    .line 107
    cmp-long v0, v4, v2

    .line 108
    .line 109
    if-nez v0, :cond_5

    .line 110
    .line 111
    invoke-static {}, Lz52;->b()V

    .line 112
    .line 113
    .line 114
    sget-object v0, Lu52;->b:Lk03;

    .line 115
    .line 116
    invoke-static {}, Lu52;->c()Lv52;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    instance-of v3, p0, Lp52;

    .line 121
    .line 122
    if-eqz v3, :cond_2

    .line 123
    .line 124
    const p0, 0x7f1302c8

    .line 125
    .line 126
    .line 127
    goto :goto_4

    .line 128
    :cond_2
    instance-of v3, p0, Ls52;

    .line 129
    .line 130
    if-eqz v3, :cond_3

    .line 131
    .line 132
    const p0, 0x7f1302e5

    .line 133
    .line 134
    .line 135
    goto :goto_4

    .line 136
    :cond_3
    instance-of p0, p0, Lt52;

    .line 137
    .line 138
    if-eqz p0, :cond_4

    .line 139
    .line 140
    const p0, 0x7f1302eb

    .line 141
    .line 142
    .line 143
    goto :goto_4

    .line 144
    :cond_4
    const p0, 0x7f1302b1

    .line 145
    .line 146
    .line 147
    :goto_4
    const v3, 0x1ffdfffd

    .line 148
    .line 149
    .line 150
    invoke-static {v2, v1, v1, p0, v3}, Lv52;->a(Lv52;IIII)Lv52;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    invoke-virtual {v0, p0}, Lad2;->k(Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    :cond_5
    return-void

    .line 158
    :pswitch_3
    iget-object v0, p0, Lmm;->p:Ljava/lang/Object;

    .line 159
    .line 160
    check-cast v0, Lye4;

    .line 161
    .line 162
    iget-wide v3, p0, Lmm;->o:J

    .line 163
    .line 164
    invoke-static {}, La35;->d()Ljava/util/Calendar;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    invoke-static {v2}, La35;->e(Ljava/util/Calendar;)Ljava/util/Calendar;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    invoke-virtual {v1, v3, v4}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 173
    .line 174
    .line 175
    const/4 v2, 0x1

    .line 176
    invoke-virtual {p0, v2}, Ljava/util/Calendar;->get(I)I

    .line 177
    .line 178
    .line 179
    move-result p0

    .line 180
    invoke-virtual {v1, v2}, Ljava/util/Calendar;->get(I)I

    .line 181
    .line 182
    .line 183
    move-result v1

    .line 184
    if-ne p0, v1, :cond_6

    .line 185
    .line 186
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 187
    .line 188
    .line 189
    move-result-object p0

    .line 190
    const-string v1, "MMMd"

    .line 191
    .line 192
    invoke-static {v1, p0}, La35;->b(Ljava/lang/String;Ljava/util/Locale;)Landroid/icu/text/DateFormat;

    .line 193
    .line 194
    .line 195
    move-result-object p0

    .line 196
    new-instance v1, Ljava/util/Date;

    .line 197
    .line 198
    invoke-direct {v1, v3, v4}, Ljava/util/Date;-><init>(J)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {p0, v1}, Landroid/icu/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object p0

    .line 205
    goto :goto_5

    .line 206
    :cond_6
    invoke-static {v3, v4}, Lhw;->q(J)Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object p0

    .line 210
    :goto_5
    iget-object v1, v0, Lye4;->n:Lcom/google/android/material/textfield/TextInputLayout;

    .line 211
    .line 212
    iget-object v2, v0, Lye4;->r:Ljava/lang/String;

    .line 213
    .line 214
    const/16 v3, 0x20

    .line 215
    .line 216
    const/16 v4, 0xa0

    .line 217
    .line 218
    invoke-virtual {p0, v3, v4}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object p0

    .line 222
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object p0

    .line 226
    invoke-static {v2, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object p0

    .line 230
    invoke-virtual {v1, p0}, Lcom/google/android/material/textfield/TextInputLayout;->setError(Ljava/lang/CharSequence;)V

    .line 231
    .line 232
    .line 233
    iget-object p0, v0, Lye4;->x:Lze4;

    .line 234
    .line 235
    iget-object v1, v0, Lye4;->w:Lcom/google/android/material/textfield/TextInputLayout;

    .line 236
    .line 237
    invoke-virtual {v1}, Lcom/google/android/material/textfield/TextInputLayout;->getError()Ljava/lang/CharSequence;

    .line 238
    .line 239
    .line 240
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 241
    .line 242
    .line 243
    iget-object p0, v0, Lye4;->v:Lwh2;

    .line 244
    .line 245
    invoke-virtual {p0}, Lwh2;->a()V

    .line 246
    .line 247
    .line 248
    return-void

    .line 249
    :pswitch_4
    iget-object v0, p0, Lmm;->p:Ljava/lang/Object;

    .line 250
    .line 251
    check-cast v0, Lxc5;

    .line 252
    .line 253
    iget-wide v1, p0, Lmm;->o:J

    .line 254
    .line 255
    iget-object p0, v0, Lxc5;->p:Ljava/lang/Object;

    .line 256
    .line 257
    check-cast p0, Lqm;

    .line 258
    .line 259
    sget-object v0, Lf35;->a:Ljava/lang/String;

    .line 260
    .line 261
    invoke-interface {p0, v1, v2}, Lqm;->F(J)V

    .line 262
    .line 263
    .line 264
    return-void

    .line 265
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
