.class public final synthetic Ltn1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;I)V
    .locals 0

    .line 1
    iput p2, p0, Ltn1;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Ltn1;->o:Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;

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
    .locals 3

    .line 1
    iget p1, p0, Ltn1;->n:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const v1, 0x7f1302f5

    .line 5
    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    iget-object p0, p0, Ltn1;->o:Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;

    .line 9
    .line 10
    packed-switch p1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v2}, Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;->h0(Lcom/eddyizm/tempus/subsonic/models/MusicFolder;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :pswitch_0
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-static {p0, v1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :pswitch_1
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-static {p0, v1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :pswitch_2
    const-string p1, "ALL"

    .line 42
    .line 43
    invoke-static {p1, p1}, Lb11;->h(Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 48
    .line 49
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->T:Lv23;

    .line 50
    .line 51
    const v0, 0x7f0a0072

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0, v0, p1, v2}, Lv23;->m(ILandroid/os/Bundle;Ly23;)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :pswitch_3
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 59
    .line 60
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->T:Lv23;

    .line 61
    .line 62
    const p1, 0x7f0a0070

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0, p1, v2, v2}, Lv23;->m(ILandroid/os/Bundle;Ly23;)V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :pswitch_4
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 70
    .line 71
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->T:Lv23;

    .line 72
    .line 73
    const p1, 0x7f0a006e

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0, p1, v2, v2}, Lv23;->m(ILandroid/os/Bundle;Ly23;)V

    .line 77
    .line 78
    .line 79
    return-void

    .line 80
    :pswitch_5
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 81
    .line 82
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->T:Lv23;

    .line 83
    .line 84
    const p1, 0x7f0a006b

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0, p1, v2, v2}, Lv23;->m(ILandroid/os/Bundle;Ly23;)V

    .line 88
    .line 89
    .line 90
    return-void

    .line 91
    :pswitch_6
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    invoke-static {p0, v1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 100
    .line 101
    .line 102
    return-void

    .line 103
    :pswitch_7
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    invoke-static {p0, v1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 112
    .line 113
    .line 114
    return-void

    .line 115
    :pswitch_8
    const-string p1, "MEDIA_STARRED"

    .line 116
    .line 117
    invoke-static {p1, p1}, Lb11;->h(Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    invoke-static {p0}, Lq05;->l(Lkc1;)Lv23;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    const v0, 0x7f0a0596

    .line 126
    .line 127
    .line 128
    invoke-virtual {p0, v0, p1, v2}, Lv23;->m(ILandroid/os/Bundle;Ly23;)V

    .line 129
    .line 130
    .line 131
    return-void

    .line 132
    nop

    .line 133
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
