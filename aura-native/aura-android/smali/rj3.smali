.class public final synthetic Lrj3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;I)V
    .locals 0

    .line 1
    iput p2, p0, Lrj3;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lrj3;->o:Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    .line 1
    iget p1, p0, Lrj3;->n:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x1

    .line 5
    iget-object p0, p0, Lrj3;->o:Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->w0:Landroid/widget/ToggleButton;

    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->isChecked()Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    xor-int/2addr p0, v1

    .line 17
    const-string p1, "skip_silence"

    .line 18
    .line 19
    invoke-static {p1, p0}, Lxa3;->t(Ljava/lang/String;Z)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :pswitch_0
    new-instance p1, Lai3;

    .line 24
    .line 25
    invoke-direct {p1}, Lai3;-><init>()V

    .line 26
    .line 27
    .line 28
    new-instance v1, Lvj3;

    .line 29
    .line 30
    invoke-direct {v1, p0}, Lvj3;-><init>(Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;)V

    .line 31
    .line 32
    .line 33
    iput-object v1, p1, Lai3;->B0:Lvj3;

    .line 34
    .line 35
    invoke-virtual {p0}, Lkc1;->X()Lnc1;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-virtual {p0}, Lnc1;->k()Lmd1;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-virtual {p1, p0, v0}, Lpp0;->m0(Lld1;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :pswitch_1
    invoke-virtual {p0}, Lkc1;->X()Lnc1;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-static {p0}, Lgh0;->G(Lnc1;)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :pswitch_2
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->L0:Laj3;

    .line 56
    .line 57
    iget-object p1, p1, Laj3;->n:Lk03;

    .line 58
    .line 59
    invoke-virtual {p1}, Lad2;->d()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 64
    .line 65
    if-eqz p1, :cond_1

    .line 66
    .line 67
    iget-object v2, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->K0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 68
    .line 69
    if-nez v2, :cond_0

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_0
    new-instance v2, Landroid/os/Bundle;

    .line 73
    .line 74
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 75
    .line 76
    .line 77
    const-string v3, "TRACK_OBJECT"

    .line 78
    .line 79
    invoke-virtual {v2, v3, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 80
    .line 81
    .line 82
    const-string p1, "homemusic_song_sheet_from_player"

    .line 83
    .line 84
    invoke-virtual {v2, p1, v1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 85
    .line 86
    .line 87
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->K0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 88
    .line 89
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->T:Lv23;

    .line 90
    .line 91
    const p1, 0x7f0a0595

    .line 92
    .line 93
    .line 94
    invoke-virtual {p0, p1, v2, v0}, Lv23;->m(ILandroid/os/Bundle;Ly23;)V

    .line 95
    .line 96
    .line 97
    :cond_1
    :goto_0
    return-void

    .line 98
    :pswitch_3
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->o0:Landroidx/viewpager2/widget/ViewPager2;

    .line 99
    .line 100
    invoke-virtual {p1}, Landroidx/viewpager2/widget/ViewPager2;->getCurrentItem()I

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    if-nez p1, :cond_2

    .line 105
    .line 106
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->o0:Landroidx/viewpager2/widget/ViewPager2;

    .line 107
    .line 108
    invoke-virtual {p0, v1, v1}, Landroidx/viewpager2/widget/ViewPager2;->c(IZ)V

    .line 109
    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_2
    if-ne p1, v1, :cond_3

    .line 113
    .line 114
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->o0:Landroidx/viewpager2/widget/ViewPager2;

    .line 115
    .line 116
    const/4 p1, 0x0

    .line 117
    invoke-virtual {p0, p1, v1}, Landroidx/viewpager2/widget/ViewPager2;->c(IZ)V

    .line 118
    .line 119
    .line 120
    :cond_3
    :goto_1
    return-void

    .line 121
    :pswitch_4
    invoke-virtual {p0}, Lkc1;->X()Lnc1;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    invoke-virtual {p0}, Lnc1;->k()Lmd1;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    const-string p1, "PlayerBottomSheet"

    .line 130
    .line 131
    invoke-virtual {p0, p1}, Lld1;->D(Ljava/lang/String;)Lkc1;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    check-cast p0, Lxi3;

    .line 136
    .line 137
    if-eqz p0, :cond_5

    .line 138
    .line 139
    invoke-virtual {p0}, Lkc1;->n()Landroid/content/Context;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    if-eqz p1, :cond_5

    .line 144
    .line 145
    invoke-virtual {p0}, Lkc1;->y()Z

    .line 146
    .line 147
    .line 148
    move-result p1

    .line 149
    if-eqz p1, :cond_5

    .line 150
    .line 151
    iget-object p1, p0, Lkc1;->T:Landroid/view/View;

    .line 152
    .line 153
    if-nez p1, :cond_4

    .line 154
    .line 155
    goto :goto_2

    .line 156
    :cond_4
    iget-object p0, p0, Lxi3;->o0:Lns3;

    .line 157
    .line 158
    iget-object p0, p0, Lns3;->p:Ljava/lang/Object;

    .line 159
    .line 160
    check-cast p0, Lom1;

    .line 161
    .line 162
    iget-object p0, p0, Lom1;->o:Ljava/lang/Object;

    .line 163
    .line 164
    check-cast p0, Landroidx/viewpager2/widget/ViewPager2;

    .line 165
    .line 166
    invoke-virtual {p0, v1, v1}, Landroidx/viewpager2/widget/ViewPager2;->c(IZ)V

    .line 167
    .line 168
    .line 169
    :cond_5
    :goto_2
    return-void

    .line 170
    :pswitch_5
    invoke-virtual {p0}, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->u0()V

    .line 171
    .line 172
    .line 173
    return-void

    .line 174
    :pswitch_6
    invoke-virtual {p0}, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->u0()V

    .line 175
    .line 176
    .line 177
    return-void

    .line 178
    nop

    .line 179
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
