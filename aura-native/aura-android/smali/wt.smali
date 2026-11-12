.class public final Lwt;
.super Lut;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lwt;->a:I

    .line 2
    .line 3
    iput-object p2, p0, Lwt;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private final d(Landroid/view/View;F)V
    .locals 0

    .line 1
    return-void
.end method

.method private final e(Landroid/view/View;F)V
    .locals 0

    .line 1
    return-void
.end method

.method private final f(Landroid/view/View;F)V
    .locals 0

    .line 1
    return-void
.end method

.method private final g(Landroid/view/View;F)V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public final b(Landroid/view/View;F)V
    .locals 0

    .line 1
    iget p1, p0, Lwt;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lwt;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 9
    .line 10
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->V:Lzg5;

    .line 11
    .line 12
    iget-object p1, p1, Lzg5;->n:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p1, Lau;

    .line 15
    .line 16
    invoke-virtual {p1, p2}, Lau;->a(F)V

    .line 17
    .line 18
    .line 19
    iget-boolean p1, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->X:Z

    .line 20
    .line 21
    if-nez p1, :cond_0

    .line 22
    .line 23
    invoke-static {p0, p2}, Lcom/eddyizm/tempus/ui/activity/MainActivity;->p(Lcom/eddyizm/tempus/ui/activity/MainActivity;F)V

    .line 24
    .line 25
    .line 26
    :cond_0
    :pswitch_0
    return-void

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final c(Landroid/view/View;I)V
    .locals 5

    .line 1
    iget p1, p0, Lwt;->a:I

    .line 2
    .line 3
    const/4 v0, 0x4

    .line 4
    const/4 v1, 0x3

    .line 5
    const/4 v2, 0x5

    .line 6
    const/4 v3, 0x0

    .line 7
    iget-object p0, p0, Lwt;->b:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch p1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 13
    .line 14
    invoke-virtual {p0}, Lnc1;->k()Lmd1;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    const-string v4, "PlayerBottomSheet"

    .line 19
    .line 20
    invoke-virtual {p1, v4}, Lld1;->D(Ljava/lang/String;)Lkc1;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    check-cast p1, Lxi3;

    .line 25
    .line 26
    if-eq p2, v1, :cond_5

    .line 27
    .line 28
    if-eq p2, v0, :cond_1

    .line 29
    .line 30
    if-eq p2, v2, :cond_0

    .line 31
    .line 32
    goto/16 :goto_0

    .line 33
    .line 34
    :cond_0
    invoke-static {}, Lu52;->f()V
    invoke-static {}, Lapp/homemusic/AURAWavePlaybackListener;->resetWaveState()V

    .line 35
    .line 36
    .line 37
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->P:Lbl2;

    .line 38
    .line 39
    sget-object p1, Lbo2;->a:Ljava/lang/ref/WeakReference;

    .line 40
    .line 41
    if-eqz p0, :cond_6

    .line 42
    .line 43
    new-instance p1, Ljr1;

    .line 44
    .line 45
    const/4 p2, 0x2

    .line 46
    invoke-direct {p1, p0, p2}, Ljr1;-><init>(Lbl2;I)V

    .line 47
    .line 48
    .line 49
    sget-object p2, Lgq0;->n:Lgq0;

    .line 50
    .line 51
    invoke-virtual {p0, p1, p2}, Lu0;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 52
    .line 53
    .line 54
    goto/16 :goto_0

    .line 55
    .line 56
    :cond_1
    iget-object p2, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->V:Lzg5;

    .line 57
    .line 58
    iget-object p2, p2, Lzg5;->n:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast p2, Lau;

    .line 61
    .line 62
    const/4 v0, 0x0

    .line 63
    invoke-virtual {p2, v0}, Lau;->a(F)V

    .line 64
    .line 65
    .line 66
    iget-boolean p2, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->X:Z

    .line 67
    .line 68
    if-nez p2, :cond_2

    .line 69
    .line 70
    invoke-static {p0, v0}, Lcom/eddyizm/tempus/ui/activity/MainActivity;->p(Lcom/eddyizm/tempus/ui/activity/MainActivity;F)V

    .line 71
    .line 72
    .line 73
    :cond_2
    if-eqz p1, :cond_6

    .line 74
    .line 75
    invoke-virtual {p1}, Lkc1;->n()Landroid/content/Context;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    if-eqz p0, :cond_6

    .line 80
    .line 81
    invoke-virtual {p1}, Lkc1;->y()Z

    .line 82
    .line 83
    .line 84
    move-result p0

    .line 85
    if-eqz p0, :cond_6

    .line 86
    .line 87
    iget-object p0, p1, Lkc1;->T:Landroid/view/View;

    .line 88
    .line 89
    if-nez p0, :cond_3

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_3
    iget-object p0, p1, Lxi3;->o0:Lns3;

    .line 93
    .line 94
    iget-object p0, p0, Lns3;->p:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast p0, Lom1;

    .line 97
    .line 98
    iget-object p0, p0, Lom1;->o:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast p0, Landroidx/viewpager2/widget/ViewPager2;

    .line 101
    .line 102
    invoke-virtual {p0, v3, v3}, Landroidx/viewpager2/widget/ViewPager2;->c(IZ)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {p1}, Lkc1;->n()Landroid/content/Context;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    if-eqz p0, :cond_6

    .line 110
    .line 111
    invoke-virtual {p1}, Lkc1;->y()Z

    .line 112
    .line 113
    .line 114
    move-result p0

    .line 115
    if-eqz p0, :cond_6

    .line 116
    .line 117
    iget-object p0, p1, Lkc1;->T:Landroid/view/View;

    .line 118
    .line 119
    if-nez p0, :cond_4

    .line 120
    .line 121
    goto :goto_0

    .line 122
    :cond_4
    iget-object p0, p1, Lxi3;->o0:Lns3;

    .line 123
    .line 124
    iget-object p0, p0, Lns3;->p:Ljava/lang/Object;

    .line 125
    .line 126
    check-cast p0, Lom1;

    .line 127
    .line 128
    iget-object p0, p0, Lom1;->o:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast p0, Landroidx/viewpager2/widget/ViewPager2;

    .line 131
    .line 132
    invoke-virtual {p0}, Landroidx/viewpager2/widget/ViewPager2;->getAdapter()Ldw3;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    check-cast p0, Lck3;

    .line 137
    .line 138
    if-eqz p0, :cond_6

    .line 139
    .line 140
    iget-object p0, p0, Lck3;->z:Ljava/util/HashMap;

    .line 141
    .line 142
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    invoke-virtual {p0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    check-cast p0, Lkc1;

    .line 151
    .line 152
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;

    .line 153
    .line 154
    if-eqz p0, :cond_6

    .line 155
    .line 156
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->o0:Landroidx/viewpager2/widget/ViewPager2;

    .line 157
    .line 158
    invoke-virtual {p0, v3, v3}, Landroidx/viewpager2/widget/ViewPager2;->c(IZ)V

    .line 159
    .line 160
    .line 161
    goto :goto_0

    .line 162
    :cond_5
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->V:Lzg5;

    .line 163
    .line 164
    iget-object p1, p1, Lzg5;->n:Ljava/lang/Object;

    .line 165
    .line 166
    check-cast p1, Lau;

    .line 167
    .line 168
    const/high16 p2, 0x3f800000    # 1.0f

    .line 169
    .line 170
    invoke-virtual {p1, p2}, Lau;->a(F)V

    .line 171
    .line 172
    .line 173
    iget-boolean p1, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->X:Z

    .line 174
    .line 175
    if-nez p1, :cond_6

    .line 176
    .line 177
    invoke-static {p0, p2}, Lcom/eddyizm/tempus/ui/activity/MainActivity;->p(Lcom/eddyizm/tempus/ui/activity/MainActivity;F)V

    .line 178
    .line 179
    .line 180
    :cond_6
    :goto_0
    return-void

    .line 181
    :pswitch_0
    check-cast p0, Lbd1;

    .line 182
    .line 183
    if-ne p2, v1, :cond_7

    .line 184
    .line 185
    const/4 v3, 0x1

    .line 186
    :cond_7
    invoke-virtual {p0, v3}, Lv83;->c(Z)V

    .line 187
    .line 188
    .line 189
    return-void

    .line 190
    :pswitch_1
    check-cast p0, Lcom/eddyizm/tempus/homemusic/HubFragment;

    .line 191
    .line 192
    sget-object p1, Lcom/eddyizm/tempus/homemusic/HubFragment;->y0:Ljava/util/List;

    .line 193
    .line 194
    invoke-virtual {p0}, Lcom/eddyizm/tempus/homemusic/HubFragment;->n0()V

    .line 195
    .line 196
    .line 197
    return-void

    .line 198
    :pswitch_2
    if-eq p2, v0, :cond_8

    .line 199
    .line 200
    if-ne p2, v2, :cond_9

    .line 201
    .line 202
    :cond_8
    check-cast p0, Lau;

    .line 203
    .line 204
    iput-boolean v3, p0, Lau;->a:Z

    .line 205
    .line 206
    :cond_9
    return-void

    .line 207
    :pswitch_3
    if-ne p2, v2, :cond_a

    .line 208
    .line 209
    check-cast p0, Lyt;

    .line 210
    .line 211
    invoke-virtual {p0}, Lyt;->cancel()V

    .line 212
    .line 213
    .line 214
    :cond_a
    return-void

    .line 215
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
