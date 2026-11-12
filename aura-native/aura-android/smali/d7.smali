.class public final synthetic Ld7;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Ld7;->a:I

    .line 2
    .line 3
    iput-object p2, p0, Ld7;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget v0, p0, Ld7;->a:I

    .line 2
    .line 3
    iget-object p0, p0, Ld7;->b:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Luv4;

    .line 9
    .line 10
    check-cast p1, Ljava/lang/String;

    .line 11
    .line 12
    iget-object v0, p0, Luv4;->B0:Lvp0;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    if-nez p1, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iget-object v0, v0, Lvp0;->n:Landroid/widget/TextView;

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 22
    .line 23
    .line 24
    iget-object p0, p0, Luv4;->B0:Lvp0;

    .line 25
    .line 26
    iget-object p0, p0, Lvp0;->m:Landroid/widget/LinearLayout;

    .line 27
    .line 28
    const/4 p1, 0x0

    .line 29
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 30
    .line 31
    .line 32
    :cond_1
    :goto_0
    return-void

    .line 33
    :pswitch_0
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;

    .line 34
    .line 35
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 36
    .line 37
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->L0:Laj3;

    .line 38
    .line 39
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-virtual {v0, p0, p1}, Laj3;->h(Landroid/content/Context;Lcom/eddyizm/tempus/subsonic/models/Child;)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :pswitch_1
    check-cast p0, Landroid/widget/TextView;

    .line 48
    .line 49
    check-cast p1, Ljava/util/List;

    .line 50
    .line 51
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    if-nez p1, :cond_2

    .line 59
    .line 60
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    const v0, 0x7f1301bd

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    goto :goto_1

    .line 72
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    const v2, 0x7f12000a

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0, v2, p1, v1}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    :goto_1
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 92
    .line 93
    .line 94
    return-void

    .line 95
    :pswitch_2
    check-cast p0, Lqq0;

    .line 96
    .line 97
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 98
    .line 99
    iget-object p0, p0, Lqq0;->n:Lcom/eddyizm/tempus/ui/fragment/DirectoryFragment;

    .line 100
    .line 101
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    invoke-static {p0, p1}, Li51;->a(Landroid/content/Context;Lcom/eddyizm/tempus/subsonic/models/Child;)V

    .line 106
    .line 107
    .line 108
    return-void

    .line 109
    :pswitch_3
    check-cast p0, Lk03;

    .line 110
    .line 111
    check-cast p1, Ljava/util/List;

    .line 112
    .line 113
    invoke-virtual {p0, p1}, Lad2;->k(Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    return-void

    .line 117
    :pswitch_4
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;

    .line 118
    .line 119
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 120
    .line 121
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    invoke-static {p0, p1}, Li51;->a(Landroid/content/Context;Lcom/eddyizm/tempus/subsonic/models/Child;)V

    .line 126
    .line 127
    .line 128
    return-void

    .line 129
    :pswitch_5
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/AlbumBottomSheetDialog;

    .line 130
    .line 131
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 132
    .line 133
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    invoke-static {p0, p1}, Li51;->a(Landroid/content/Context;Lcom/eddyizm/tempus/subsonic/models/Child;)V

    .line 138
    .line 139
    .line 140
    return-void

    .line 141
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
