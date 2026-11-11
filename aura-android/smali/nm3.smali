.class public final synthetic Lnm3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/PlaylistRowBottomSheetDialog;


# direct methods
.method public synthetic constructor <init>(Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/PlaylistRowBottomSheetDialog;I)V
    .locals 0

    .line 1
    iput p2, p0, Lnm3;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lnm3;->o:Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/PlaylistRowBottomSheetDialog;

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
    iget p1, p0, Lnm3;->n:I

    .line 2
    .line 3
    const-string v0, "PLAYLIST_OBJECT"

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    const/4 v3, 0x0

    .line 8
    iget-object p0, p0, Lnm3;->o:Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/PlaylistRowBottomSheetDialog;

    .line 9
    .line 10
    packed-switch p1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v2}, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/PlaylistRowBottomSheetDialog;->o0(Z)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :pswitch_0
    new-instance p1, Lsl3;

    .line 18
    .line 19
    invoke-direct {p1, v3, v1}, Lsl3;-><init>(ILjava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    new-instance v2, Landroid/os/Bundle;

    .line 23
    .line 24
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 25
    .line 26
    .line 27
    iget-object v3, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/PlaylistRowBottomSheetDialog;->C0:Lcom/eddyizm/tempus/subsonic/models/Playlist;

    .line 28
    .line 29
    invoke-virtual {v2, v0, v3}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, v2}, Lkc1;->c0(Landroid/os/Bundle;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Lkc1;->X()Lnc1;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {v0}, Lnc1;->k()Lmd1;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {p1, v0, v1}, Lpp0;->m0(Lld1;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, Lzt;->h0()V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :pswitch_1
    invoke-static {p0}, Lq05;->l(Lkc1;)Lv23;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    new-instance v2, Landroid/os/Bundle;

    .line 55
    .line 56
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 57
    .line 58
    .line 59
    iget-object v3, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/PlaylistRowBottomSheetDialog;->C0:Lcom/eddyizm/tempus/subsonic/models/Playlist;

    .line 60
    .line 61
    invoke-virtual {v2, v0, v3}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 62
    .line 63
    .line 64
    const v0, 0x7f0a049f

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1, v0, v2, v1}, Lv23;->m(ILandroid/os/Bundle;Ly23;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0}, Lzt;->h0()V

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    :pswitch_2
    new-instance p1, Lpm3;

    .line 75
    .line 76
    invoke-direct {p1, p0, v3}, Lpm3;-><init>(Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/PlaylistRowBottomSheetDialog;I)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0, p1}, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/PlaylistRowBottomSheetDialog;->p0(Ljava/util/function/BiConsumer;)V

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :pswitch_3
    new-instance p1, Lom3;

    .line 84
    .line 85
    invoke-direct {p1, v3}, Lom3;-><init>(I)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p0, p1}, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/PlaylistRowBottomSheetDialog;->p0(Ljava/util/function/BiConsumer;)V

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    :pswitch_4
    new-instance p1, Lom3;

    .line 93
    .line 94
    invoke-direct {p1, v2}, Lom3;-><init>(I)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p0, p1}, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/PlaylistRowBottomSheetDialog;->p0(Ljava/util/function/BiConsumer;)V

    .line 98
    .line 99
    .line 100
    return-void

    .line 101
    :pswitch_5
    new-instance p1, Lpm3;

    .line 102
    .line 103
    const/4 v0, 0x2

    .line 104
    invoke-direct {p1, p0, v0}, Lpm3;-><init>(Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/PlaylistRowBottomSheetDialog;I)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p0, p1}, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/PlaylistRowBottomSheetDialog;->p0(Ljava/util/function/BiConsumer;)V

    .line 108
    .line 109
    .line 110
    return-void

    .line 111
    :pswitch_6
    new-instance p1, Lvg2;

    .line 112
    .line 113
    invoke-virtual {p0}, Lkc1;->X()Lnc1;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    invoke-direct {p1, v0, v3}, Lvg2;-><init>(Landroid/content/Context;I)V

    .line 118
    .line 119
    .line 120
    const v0, 0x7f1303fa

    .line 121
    .line 122
    .line 123
    invoke-virtual {p1, v0}, Lvg2;->p(I)V

    .line 124
    .line 125
    .line 126
    iget-object v2, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/PlaylistRowBottomSheetDialog;->C0:Lcom/eddyizm/tempus/subsonic/models/Playlist;

    .line 127
    .line 128
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getName()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    iget-object v3, p1, Le9;->a:La9;

    .line 133
    .line 134
    iput-object v2, v3, La9;->f:Ljava/lang/CharSequence;

    .line 135
    .line 136
    new-instance v2, Lvr;

    .line 137
    .line 138
    const/4 v3, 0x5

    .line 139
    invoke-direct {v2, v3, p0}, Lvr;-><init>(ILjava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {p1, v0, v2}, Lvg2;->l(ILandroid/content/DialogInterface$OnClickListener;)Lvg2;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    const v0, 0x7f1303f9

    .line 147
    .line 148
    .line 149
    invoke-virtual {p1, v0, v1}, Lvg2;->j(ILandroid/content/DialogInterface$OnClickListener;)Lvg2;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    invoke-virtual {p1}, Le9;->h()Lf9;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    iput-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/PlaylistRowBottomSheetDialog;->D0:Lf9;

    .line 158
    .line 159
    return-void

    .line 160
    :pswitch_7
    invoke-virtual {p0, v3}, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/PlaylistRowBottomSheetDialog;->o0(Z)V

    .line 161
    .line 162
    .line 163
    return-void

    .line 164
    :pswitch_8
    new-instance p1, Lpm3;

    .line 165
    .line 166
    invoke-direct {p1, p0, v2}, Lpm3;-><init>(Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/PlaylistRowBottomSheetDialog;I)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {p0, p1}, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/PlaylistRowBottomSheetDialog;->p0(Ljava/util/function/BiConsumer;)V

    .line 170
    .line 171
    .line 172
    return-void

    .line 173
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
