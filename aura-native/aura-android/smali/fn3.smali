.class public final synthetic Lfn3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/PodcastEpisodeBottomSheetDialog;


# direct methods
.method public synthetic constructor <init>(Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/PodcastEpisodeBottomSheetDialog;I)V
    .locals 0

    .line 1
    iput p2, p0, Lfn3;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lfn3;->o:Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/PodcastEpisodeBottomSheetDialog;

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
    iget p1, p0, Lfn3;->n:I

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    const/4 v1, 0x0

    .line 5
    iget-object p0, p0, Lfn3;->o:Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/PodcastEpisodeBottomSheetDialog;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const-string v0, "Open the channel"

    .line 15
    .line 16
    invoke-static {p1, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lzt;->h0()V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :pswitch_0
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/PodcastEpisodeBottomSheetDialog;->B0:Lgn3;

    .line 28
    .line 29
    iget-object v0, p1, Lgn3;->d:Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;

    .line 30
    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->getId()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    if-eqz v0, :cond_0

    .line 38
    .line 39
    iget-object v0, p1, Lgn3;->c:Lhh3;

    .line 40
    .line 41
    iget-object v2, p1, Lgn3;->d:Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;

    .line 42
    .line 43
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->getId()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    invoke-static {v1}, Lcom/eddyizm/tempus/App;->f(Z)Lpn4;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {v0}, Lpn4;->h()Lwo0;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    const-string v1, "PodcastClient"

    .line 62
    .line 63
    const-string v3, "deletePodcastEpisode()"

    .line 64
    .line 65
    invoke-static {v1, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 66
    .line 67
    .line 68
    iget-object v1, v0, Lwo0;->o:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v1, Lhn3;

    .line 71
    .line 72
    iget-object v0, v0, Lwo0;->n:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v0, Lpn4;

    .line 75
    .line 76
    invoke-virtual {v0}, Lpn4;->f()Ljava/util/HashMap;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-interface {v1, v0, v2}, Lhn3;->e(Ljava/util/Map;Ljava/lang/String;)Lretrofit2/Call;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    new-instance v1, Lrm2;

    .line 85
    .line 86
    const/16 v2, 0x9

    .line 87
    .line 88
    invoke-direct {v1, v2, p1}, Lrm2;-><init>(ILjava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    invoke-interface {v0, v1}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    .line 92
    .line 93
    .line 94
    :cond_0
    invoke-virtual {p0}, Lzt;->h0()V

    .line 95
    .line 96
    .line 97
    return-void

    .line 98
    :pswitch_1
    invoke-virtual {p0}, Lzt;->h0()V

    .line 99
    .line 100
    .line 101
    return-void

    .line 102
    :pswitch_2
    invoke-virtual {p0}, Lzt;->h0()V

    .line 103
    .line 104
    .line 105
    return-void

    .line 106
    :pswitch_3
    invoke-virtual {p0}, Lkc1;->X()Lnc1;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    check-cast p1, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 111
    .line 112
    iget-object p1, p1, Lcom/eddyizm/tempus/ui/activity/MainActivity;->V:Lzg5;

    .line 113
    .line 114
    iget-object p1, p1, Lzg5;->n:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast p1, Lau;

    .line 117
    .line 118
    invoke-virtual {p1, v0}, Lau;->d(Z)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {p0}, Lzt;->h0()V

    .line 122
    .line 123
    .line 124
    return-void

    .line 125
    :pswitch_4
    invoke-virtual {p0}, Lkc1;->X()Lnc1;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    check-cast p1, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 130
    .line 131
    iget-object p1, p1, Lcom/eddyizm/tempus/ui/activity/MainActivity;->V:Lzg5;

    .line 132
    .line 133
    iget-object p1, p1, Lzg5;->n:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast p1, Lau;

    .line 136
    .line 137
    invoke-virtual {p1, v0}, Lau;->d(Z)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {p0}, Lzt;->h0()V

    .line 141
    .line 142
    .line 143
    return-void

    .line 144
    nop

    .line 145
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
