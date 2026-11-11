.class public final synthetic Lqc4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/ShareBottomSheetDialog;


# direct methods
.method public synthetic constructor <init>(Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/ShareBottomSheetDialog;I)V
    .locals 0

    .line 1
    iput p2, p0, Lqc4;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lqc4;->o:Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/ShareBottomSheetDialog;

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
    iget p1, p0, Lqc4;->n:I

    .line 2
    .line 3
    iget-object p0, p0, Lqc4;->o:Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/ShareBottomSheetDialog;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/ShareBottomSheetDialog;->C0:Lrc4;

    .line 9
    .line 10
    iget-object v0, p1, Lrc4;->c:Lhh3;

    .line 11
    .line 12
    iget-object p1, p1, Lrc4;->d:Lcom/eddyizm/tempus/subsonic/models/Share;

    .line 13
    .line 14
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Share;->getId()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    invoke-static {v0}, Lcom/eddyizm/tempus/App;->f(Z)Lpn4;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v0}, Lpn4;->i()Lwo0;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    const-string v1, "BrowsingClient"

    .line 34
    .line 35
    const-string v2, "deleteShare()"

    .line 36
    .line 37
    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 38
    .line 39
    .line 40
    iget-object v1, v0, Lwo0;->o:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v1, Lhd4;

    .line 43
    .line 44
    iget-object v0, v0, Lwo0;->n:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v0, Lpn4;

    .line 47
    .line 48
    invoke-virtual {v0}, Lpn4;->f()Ljava/util/HashMap;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-interface {v1, v0, p1}, Lhd4;->a(Ljava/util/Map;Ljava/lang/String;)Lretrofit2/Call;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    new-instance v0, Lhh3;

    .line 57
    .line 58
    const/16 v1, 0x1a

    .line 59
    .line 60
    invoke-direct {v0, v1}, Lhh3;-><init>(I)V

    .line 61
    .line 62
    .line 63
    invoke-interface {p1, v0}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    .line 64
    .line 65
    .line 66
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/ShareBottomSheetDialog;->B0:Lcom/eddyizm/tempus/viewmodel/b;

    .line 67
    .line 68
    iget-object v0, p0, Lkc1;->I:Lkc1;

    .line 69
    .line 70
    invoke-virtual {p1, v0}, Lcom/eddyizm/tempus/viewmodel/b;->g(Lba2;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0}, Lzt;->h0()V

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :pswitch_0
    new-instance p1, Lxc4;

    .line 78
    .line 79
    invoke-direct {p1}, Lxc4;-><init>()V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0}, Lkc1;->X()Lnc1;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-virtual {v0}, Lnc1;->k()Lmd1;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    const/4 v1, 0x0

    .line 91
    invoke-virtual {p1, v0, v1}, Lpp0;->m0(Lld1;Ljava/lang/String;)V

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
    invoke-virtual {p0}, Lkc1;->X()Lnc1;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    const-string v0, "clipboard"

    .line 103
    .line 104
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    check-cast p1, Landroid/content/ClipboardManager;

    .line 109
    .line 110
    const v0, 0x7f130056

    .line 111
    .line 112
    .line 113
    invoke-virtual {p0, v0}, Lkc1;->s(I)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    iget-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/ShareBottomSheetDialog;->C0:Lrc4;

    .line 118
    .line 119
    iget-object v1, v1, Lrc4;->d:Lcom/eddyizm/tempus/subsonic/models/Share;

    .line 120
    .line 121
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Share;->getUrl()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    invoke-static {v0, v1}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    invoke-virtual {p1, v0}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {p0}, Lzt;->h0()V

    .line 133
    .line 134
    .line 135
    return-void

    .line 136
    nop

    .line 137
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
