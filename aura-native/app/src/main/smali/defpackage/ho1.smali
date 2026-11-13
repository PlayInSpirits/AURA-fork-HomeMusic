.class public final synthetic Ldefpackage/ho1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ldefpackage/cp1;

.field public final synthetic p:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(Ldefpackage/cp1;Landroid/view/View;I)V
    .locals 0

    .line 1
    iput p3, p0, Ldefpackage/ho1;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Ldefpackage/ho1;->o:Ldefpackage/cp1;

    .line 4
    .line 5
    iput-object p2, p0, Ldefpackage/ho1;->p:Landroid/view/View;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 8

    .line 1
    iget p1, p0, Ldefpackage/ho1;->n:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    iget-object v1, p0, Ldefpackage/ho1;->p:Landroid/view/View;

    .line 5
    .line 6
    packed-switch p1, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    instance-of v1, p1, Lcom/eddyizm/tempus/homemusic/HubMixToday;

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    check-cast p1, Lcom/eddyizm/tempus/homemusic/HubMixToday;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move-object p1, v0

    .line 21
    :goto_0
    if-eqz p1, :cond_1

    .line 22
    .line 23
    invoke-virtual {p1}, Lcom/eddyizm/tempus/homemusic/HubMixToday;->getMix()Lcom/eddyizm/tempus/homemusic/HubMix;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    move-object p1, v0

    .line 29
    :goto_1
    iget-object p0, p0, Ldefpackage/ho1;->o:Ldefpackage/cp1;

    .line 30
    .line 31
    invoke-virtual {p0}, Ldefpackage/kc1;->l()Ldefpackage/nc1;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    instance-of v1, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 36
    .line 37
    if-eqz v1, :cond_2

    .line 38
    .line 39
    check-cast p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_2
    move-object p0, v0

    .line 43
    :goto_2
    if-nez p0, :cond_3

    .line 44
    .line 45
    goto :goto_4

    .line 46
    :cond_3
    if-eqz p1, :cond_4

    .line 47
    .line 48
    invoke-virtual {p1}, Lcom/eddyizm/tempus/homemusic/HubMix;->getTracks()Ljava/util/List;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    :cond_4
    if-nez v0, :cond_5

    .line 53
    .line 54
    sget-object v0, Ldefpackage/u01;->n:Ldefpackage/u01;

    .line 55
    .line 56
    :cond_5
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    const/4 v2, 0x0

    .line 61
    if-eqz v1, :cond_6

    .line 62
    .line 63
    const p1, 0x7f1301f7

    .line 64
    .line 65
    .line 66
    invoke-static {p0, p1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 71
    .line 72
    .line 73
    goto :goto_4

    .line 74
    :cond_6
    sget-object v1, Ldefpackage/ms1;->a:Ljava/util/concurrent/ExecutorService;

    .line 75
    .line 76
    new-instance v1, Ljava/util/ArrayList;

    .line 77
    .line 78
    const/16 v3, 0xa

    .line 79
    .line 80
    invoke-static {v0, v3}, Ldefpackage/r40;->k0(Ljava/lang/Iterable;I)I

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 85
    .line 86
    .line 87
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 92
    .line 93
    .line 94
    move-result v3

    .line 95
    if-eqz v3, :cond_7

    .line 96
    .line 97
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    check-cast v3, Lcom/eddyizm/tempus/homemusic/WaveTrack;

    .line 102
    .line 103
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    invoke-virtual {p1}, Lcom/eddyizm/tempus/homemusic/HubMix;->getId()J

    .line 107
    .line 108
    .line 109
    move-result-wide v4

    .line 110
    new-instance v6, Ljava/lang/StringBuilder;

    .line 111
    .line 112
    const-string v7, "mix:"

    .line 113
    .line 114
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v6, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v4

    .line 124
    invoke-virtual {v3, v4}, Lcom/eddyizm/tempus/homemusic/WaveTrack;->item(Ljava/lang/String;)Lcom/eddyizm/tempus/homemusic/HubTracks$Item;

    .line 125
    .line 126
    .line 127
    move-result-object v3

    .line 128
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    goto :goto_3

    .line 132
    :cond_7
    const-string p1, "mix_card"

    .line 133
    .line 134
    invoke-static {p0, v1, v2, p1}, Ldefpackage/ms1;->a(Lcom/eddyizm/tempus/ui/activity/MainActivity;Ljava/util/List;ILjava/lang/String;)V

    .line 135
    .line 136
    .line 137
    :goto_4
    return-void

    .line 138
    :pswitch_0
    invoke-virtual {v1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    instance-of v1, p1, Lcom/eddyizm/tempus/homemusic/HubMixToday;

    .line 143
    .line 144
    if-eqz v1, :cond_8

    .line 145
    .line 146
    check-cast p1, Lcom/eddyizm/tempus/homemusic/HubMixToday;

    .line 147
    .line 148
    goto :goto_5

    .line 149
    :cond_8
    move-object p1, v0

    .line 150
    :goto_5
    iget-object v3, p0, Ldefpackage/ho1;->o:Ldefpackage/cp1;

    .line 151
    .line 152
    invoke-virtual {v3}, Ldefpackage/kc1;->l()Ldefpackage/nc1;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    instance-of v1, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 157
    .line 158
    if-eqz v1, :cond_9

    .line 159
    .line 160
    check-cast p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 161
    .line 162
    move-object v4, p0

    .line 163
    goto :goto_6

    .line 164
    :cond_9
    move-object v4, v0

    .line 165
    :goto_6
    if-nez v4, :cond_a

    .line 166
    .line 167
    goto :goto_a

    .line 168
    :cond_a
    if-eqz p1, :cond_b

    .line 169
    .line 170
    invoke-virtual {p1}, Lcom/eddyizm/tempus/homemusic/HubMixToday;->getMix()Lcom/eddyizm/tempus/homemusic/HubMix;

    .line 171
    .line 172
    .line 173
    move-result-object p0

    .line 174
    move-object v5, p0

    .line 175
    goto :goto_7

    .line 176
    :cond_b
    move-object v5, v0

    .line 177
    :goto_7
    if-eqz v5, :cond_c

    .line 178
    .line 179
    invoke-virtual {v5}, Lcom/eddyizm/tempus/homemusic/HubMix;->getNdPlaylistId()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    :cond_c
    move-object v2, v0

    .line 184
    if-eqz v5, :cond_e

    .line 185
    .line 186
    if-eqz v2, :cond_e

    .line 187
    .line 188
    invoke-static {v2}, Ldefpackage/qm4;->u0(Ljava/lang/CharSequence;)Z

    .line 189
    .line 190
    .line 191
    move-result p0

    .line 192
    if-eqz p0, :cond_d

    .line 193
    .line 194
    goto :goto_8

    .line 195
    :cond_d
    sget-object p0, Ldefpackage/io1;->a:Ljava/util/concurrent/ExecutorService;

    .line 196
    .line 197
    new-instance v1, Ldefpackage/t6;

    .line 198
    .line 199
    const/4 v6, 0x4

    .line 200
    invoke-direct/range {v1 .. v6}, Ldefpackage/t6;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 201
    .line 202
    .line 203
    invoke-interface {p0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 204
    .line 205
    .line 206
    goto :goto_a

    .line 207
    :cond_e
    :goto_8
    if-eqz p1, :cond_f

    .line 208
    .line 209
    invoke-virtual {p1}, Lcom/eddyizm/tempus/homemusic/HubMixToday;->getOnboarding()Z

    .line 210
    .line 211
    .line 212
    move-result p0

    .line 213
    const/4 p1, 0x1

    .line 214
    if-ne p0, p1, :cond_f

    .line 215
    .line 216
    const-string p0, "/taste"

    .line 217
    .line 218
    goto :goto_9

    .line 219
    :cond_f
    const-string p0, "/"

    .line 220
    .line 221
    :goto_9
    invoke-static {v4, p0}, Ldefpackage/js1;->a(Lcom/eddyizm/tempus/ui/activity/MainActivity;Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    :goto_a
    return-void

    .line 225
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
