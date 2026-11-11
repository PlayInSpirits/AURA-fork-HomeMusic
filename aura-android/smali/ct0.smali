.class public final synthetic Lct0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:I

.field public final synthetic p:Ljava/lang/Object;

.field public final synthetic q:Ljava/lang/Object;

.field public final synthetic r:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lft0;Ljava/lang/String;Let0;I)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lct0;->n:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lct0;->q:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lct0;->p:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Lct0;->r:Ljava/lang/Object;

    .line 12
    .line 13
    iput p4, p0, Lct0;->o:I

    .line 14
    .line 15
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 16
    iput p5, p0, Lct0;->n:I

    iput-object p1, p0, Lct0;->q:Ljava/lang/Object;

    iput p2, p0, Lct0;->o:I

    iput-object p3, p0, Lct0;->p:Ljava/lang/Object;

    iput-object p4, p0, Lct0;->r:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 9

    .line 1
    iget v0, p0, Lct0;->n:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    iget-object v4, p0, Lct0;->r:Ljava/lang/Object;

    .line 7
    .line 8
    iget-object v5, p0, Lct0;->p:Ljava/lang/Object;

    .line 9
    .line 10
    iget v6, p0, Lct0;->o:I

    .line 11
    .line 12
    iget-object p0, p0, Lct0;->q:Ljava/lang/Object;

    .line 13
    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    check-cast p0, Lue1;

    .line 18
    .line 19
    check-cast v5, Ljava/util/List;

    .line 20
    .line 21
    check-cast v4, Lfr2;

    .line 22
    .line 23
    iget-object p0, p0, Lue1;->q:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p0, Lls2;

    .line 26
    .line 27
    iget-object p0, p0, Lls2;->g:Ltn2;

    .line 28
    .line 29
    const/4 v0, -0x1

    .line 30
    if-ne v6, v0, :cond_0

    .line 31
    .line 32
    iget-object v0, p0, Ltn2;->s:Lal3;

    .line 33
    .line 34
    invoke-virtual {v0, v5}, Lal3;->w0(Ljava/util/List;)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    iget-object v0, p0, Ltn2;->s:Lal3;

    .line 39
    .line 40
    invoke-virtual {v0, v5, v6}, Lal3;->N0(Ljava/util/List;I)V

    .line 41
    .line 42
    .line 43
    :goto_0
    new-instance v0, Landroid/util/SparseBooleanArray;

    .line 44
    .line 45
    invoke-direct {v0}, Landroid/util/SparseBooleanArray;-><init>()V

    .line 46
    .line 47
    .line 48
    const/16 v1, 0x14

    .line 49
    .line 50
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseBooleanArray;->append(IZ)V

    .line 51
    .line 52
    .line 53
    new-instance v1, Lmi3;

    .line 54
    .line 55
    new-instance v2, Lw71;

    .line 56
    .line 57
    invoke-direct {v2, v0}, Lw71;-><init>(Landroid/util/SparseBooleanArray;)V

    .line 58
    .line 59
    .line 60
    invoke-direct {v1, v2}, Lmi3;-><init>(Lw71;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0, v4, v1}, Ltn2;->v(Lfr2;Lmi3;)V

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :pswitch_0
    check-cast p0, Llo2;

    .line 68
    .line 69
    check-cast v5, Lkn2;

    .line 70
    .line 71
    check-cast v4, Lrm2;

    .line 72
    .line 73
    iget v0, p0, Llo2;->v:I

    .line 74
    .line 75
    if-ne v6, v0, :cond_1

    .line 76
    .line 77
    invoke-virtual {p0, v3}, Llo2;->c(Z)Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    invoke-virtual {p0, v5, v4, v0}, Llo2;->e(Lkn2;Lrm2;Z)V

    .line 82
    .line 83
    .line 84
    :cond_1
    return-void

    .line 85
    :pswitch_1
    check-cast p0, Lfo1;

    .line 86
    .line 87
    check-cast v5, Ljava/lang/String;

    .line 88
    .line 89
    check-cast v4, Lcom/eddyizm/tempus/homemusic/HubAuthOptions;

    .line 90
    .line 91
    invoke-virtual {p0}, Lfo1;->c()Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    iget-object v2, p0, Lfo1;->c:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v2, Luc1;

    .line 98
    .line 99
    if-nez v0, :cond_2

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_2
    invoke-virtual {p0, v3}, Lfo1;->r(Z)V

    .line 103
    .line 104
    .line 105
    if-eqz v6, :cond_4

    .line 106
    .line 107
    iget-object v0, v2, Luc1;->u:Lcom/google/android/material/textfield/TextInputLayout;

    .line 108
    .line 109
    if-eq v6, v1, :cond_3

    .line 110
    .line 111
    const v1, 0x7f1301de

    .line 112
    .line 113
    .line 114
    new-array v2, v3, [Ljava/lang/Object;

    .line 115
    .line 116
    invoke-virtual {p0, v1, v2}, Lfo1;->v(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    invoke-virtual {v0, p0}, Lcom/google/android/material/textfield/TextInputLayout;->setError(Ljava/lang/CharSequence;)V

    .line 121
    .line 122
    .line 123
    goto :goto_1

    .line 124
    :cond_3
    const v1, 0x7f1301db

    .line 125
    .line 126
    .line 127
    new-array v2, v3, [Ljava/lang/Object;

    .line 128
    .line 129
    invoke-virtual {p0, v1, v2}, Lfo1;->v(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    invoke-virtual {v0, p0}, Lcom/google/android/material/textfield/TextInputLayout;->setError(Ljava/lang/CharSequence;)V

    .line 134
    .line 135
    .line 136
    goto :goto_1

    .line 137
    :cond_4
    iput-object v5, p0, Lfo1;->e:Ljava/lang/Object;

    .line 138
    .line 139
    iput-object v4, p0, Lfo1;->i:Ljava/lang/Object;

    .line 140
    .line 141
    iget-object v0, v2, Luc1;->r:Lcom/google/android/material/textfield/TextInputEditText;

    .line 142
    .line 143
    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 144
    .line 145
    .line 146
    sget-object v0, Lco1;->o:Lco1;

    .line 147
    .line 148
    invoke-virtual {p0, v0}, Lfo1;->s(Lco1;)V

    .line 149
    .line 150
    .line 151
    :goto_1
    return-void

    .line 152
    :pswitch_2
    check-cast p0, Lft0;

    .line 153
    .line 154
    check-cast v5, Ljava/lang/String;

    .line 155
    .line 156
    check-cast v4, Let0;

    .line 157
    .line 158
    iget-object v0, v4, Lcx3;->a:Landroid/view/View;

    .line 159
    .line 160
    invoke-static {}, Lcom/eddyizm/tempus/database/AppDatabase;->y()Lcom/eddyizm/tempus/database/AppDatabase;

    .line 161
    .line 162
    .line 163
    move-result-object v4

    .line 164
    invoke-virtual {v4}, Lcom/eddyizm/tempus/database/AppDatabase;->C()Lml3;

    .line 165
    .line 166
    .line 167
    move-result-object v4

    .line 168
    iget-object v4, v4, Lml3;->a:Ljava/lang/Object;

    .line 169
    .line 170
    check-cast v4, Ls24;

    .line 171
    .line 172
    new-instance v7, Lrs0;

    .line 173
    .line 174
    const/16 v8, 0xd

    .line 175
    .line 176
    invoke-direct {v7, v8, v5}, Lrs0;-><init>(ILjava/lang/String;)V

    .line 177
    .line 178
    .line 179
    invoke-static {v4, v2, v3, v7}, Lxl;->E(Ls24;ZZLif1;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v2

    .line 183
    check-cast v2, Ljava/lang/String;

    .line 184
    .line 185
    if-eqz v2, :cond_5

    .line 186
    .line 187
    iget-object v3, p0, Lft0;->x:Ljava/util/HashMap;

    .line 188
    .line 189
    invoke-virtual {v3, v5, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 193
    .line 194
    .line 195
    move-result-object v2

    .line 196
    instance-of v2, v2, Landroid/app/Activity;

    .line 197
    .line 198
    if-eqz v2, :cond_5

    .line 199
    .line 200
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    check-cast v0, Landroid/app/Activity;

    .line 205
    .line 206
    new-instance v2, Lul;

    .line 207
    .line 208
    invoke-direct {v2, v6, v1, p0}, Lul;-><init>(IILjava/lang/Object;)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v0, v2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 212
    .line 213
    .line 214
    :cond_5
    return-void

    .line 215
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
