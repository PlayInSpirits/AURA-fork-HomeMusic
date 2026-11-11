.class public final synthetic Lcu0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/DownloadedBottomSheetDialog;


# direct methods
.method public synthetic constructor <init>(Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/DownloadedBottomSheetDialog;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcu0;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lcu0;->o:Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/DownloadedBottomSheetDialog;

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
    iget p1, p0, Lcu0;->n:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x1

    .line 5
    iget-object p0, p0, Lcu0;->o:Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/DownloadedBottomSheetDialog;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-static {}, Lud3;->o()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/DownloadedBottomSheetDialog;->B0:Ljava/util/ArrayList;

    .line 15
    .line 16
    if-nez p1, :cond_0

    .line 17
    .line 18
    invoke-static {v0}, Lgi1;->H(Ljava/util/List;)Ljava/util/ArrayList;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/DownloadedBottomSheetDialog;->B0:Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    new-instance v1, Lhu3;

    .line 29
    .line 30
    const/4 v2, 0x6

    .line 31
    invoke-direct {v1, v2}, Lhu3;-><init>(I)V

    .line 32
    .line 33
    .line 34
    invoke-interface {v0, v1}, Ljava/util/stream/Stream;->map(Ljava/util/function/Function;)Ljava/util/stream/Stream;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-static {}, Ljava/util/stream/Collectors;->toList()Ljava/util/stream/Collector;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-interface {v0, v1}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    check-cast v0, Ljava/util/List;

    .line 47
    .line 48
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-static {v1}, Lau0;->w(Landroid/content/Context;)Leu0;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-virtual {v1, p1, v0}, Leu0;->f(Ljava/util/List;Ljava/util/List;)V

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_0
    new-instance p1, Le7;

    .line 61
    .line 62
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 63
    .line 64
    .line 65
    invoke-interface {v0, p1}, Ljava/lang/Iterable;->forEach(Ljava/util/function/Consumer;)V

    .line 66
    .line 67
    .line 68
    :goto_0
    invoke-virtual {p0}, Lzt;->h0()V

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :pswitch_0
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/DownloadedBottomSheetDialog;->E0:Lbl2;

    .line 73
    .line 74
    iget-object v2, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/DownloadedBottomSheetDialog;->B0:Ljava/util/ArrayList;

    .line 75
    .line 76
    invoke-static {p1, v2, v0}, Lbo2;->e(Lic2;Ljava/util/List;Z)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0}, Lkc1;->X()Lnc1;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    check-cast p1, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 84
    .line 85
    iget-object p1, p1, Lcom/eddyizm/tempus/ui/activity/MainActivity;->V:Lzg5;

    .line 86
    .line 87
    iget-object p1, p1, Lzg5;->n:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast p1, Lau;

    .line 90
    .line 91
    invoke-virtual {p1, v1}, Lau;->d(Z)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p0}, Lzt;->h0()V

    .line 95
    .line 96
    .line 97
    return-void

    .line 98
    :pswitch_1
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/DownloadedBottomSheetDialog;->E0:Lbl2;

    .line 99
    .line 100
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/DownloadedBottomSheetDialog;->B0:Ljava/util/ArrayList;

    .line 101
    .line 102
    invoke-static {p1, v0, v1}, Lbo2;->e(Lic2;Ljava/util/List;Z)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {p0}, Lkc1;->X()Lnc1;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    check-cast p1, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 110
    .line 111
    iget-object p1, p1, Lcom/eddyizm/tempus/ui/activity/MainActivity;->V:Lzg5;

    .line 112
    .line 113
    iget-object p1, p1, Lzg5;->n:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast p1, Lau;

    .line 116
    .line 117
    invoke-virtual {p1, v1}, Lau;->d(Z)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {p0}, Lzt;->h0()V

    .line 121
    .line 122
    .line 123
    return-void

    .line 124
    :pswitch_2
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/DownloadedBottomSheetDialog;->B0:Ljava/util/ArrayList;

    .line 125
    .line 126
    invoke-static {p1}, Ljava/util/Collections;->shuffle(Ljava/util/List;)V

    .line 127
    .line 128
    .line 129
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/DownloadedBottomSheetDialog;->E0:Lbl2;

    .line 130
    .line 131
    iget-object v2, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/DownloadedBottomSheetDialog;->B0:Ljava/util/ArrayList;

    .line 132
    .line 133
    invoke-static {p1, v2, v0}, Lbo2;->o(Lic2;Ljava/util/List;I)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {p0}, Lkc1;->X()Lnc1;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    check-cast p1, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 141
    .line 142
    iget-object p1, p1, Lcom/eddyizm/tempus/ui/activity/MainActivity;->V:Lzg5;

    .line 143
    .line 144
    iget-object p1, p1, Lzg5;->n:Ljava/lang/Object;

    .line 145
    .line 146
    check-cast p1, Lau;

    .line 147
    .line 148
    invoke-virtual {p1, v1}, Lau;->d(Z)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {p0}, Lzt;->h0()V

    .line 152
    .line 153
    .line 154
    return-void

    .line 155
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
