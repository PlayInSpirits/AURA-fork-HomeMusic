.class public final synthetic Ldefpackage/vs0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/a83;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/eddyizm/tempus/ui/fragment/DownloadFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/eddyizm/tempus/ui/fragment/DownloadFragment;I)V
    .locals 0

    .line 1
    iput p2, p0, Ldefpackage/vs0;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Ldefpackage/vs0;->b:Lcom/eddyizm/tempus/ui/fragment/DownloadFragment;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 5

    .line 1
    iget v0, p0, Ldefpackage/vs0;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, Ldefpackage/vs0;->b:Lcom/eddyizm/tempus/ui/fragment/DownloadFragment;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p1, Ljava/lang/Integer;

    .line 10
    .line 11
    if-eqz p1, :cond_3

    .line 12
    .line 13
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/DownloadFragment;->l0:Ldefpackage/up0;

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/4 v2, -0x1

    .line 23
    if-ne v0, v2, :cond_1

    .line 24
    .line 25
    invoke-virtual {p0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    const p1, 0x7f1300eb

    .line 30
    .line 31
    .line 32
    invoke-static {p0, p1, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-nez v0, :cond_2

    .line 45
    .line 46
    invoke-virtual {p0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    const p1, 0x7f1300ea

    .line 51
    .line 52
    .line 53
    invoke-static {p0, p1, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_2
    invoke-virtual {p0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-virtual {p0}, Ldefpackage/kc1;->r()Landroid/content/res/Resources;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    const/high16 v3, 0x7f120000

    .line 78
    .line 79
    invoke-virtual {p0, v3, v2, p1}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    invoke-static {v0, p0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 88
    .line 89
    .line 90
    :cond_3
    :goto_0
    return-void

    .line 91
    :pswitch_0
    check-cast p1, Ljava/util/List;

    .line 92
    .line 93
    if-eqz p1, :cond_6

    .line 94
    .line 95
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    iget-object v2, p0, Lcom/eddyizm/tempus/ui/fragment/DownloadFragment;->l0:Ldefpackage/up0;

    .line 100
    .line 101
    const/16 v3, 0x8

    .line 102
    .line 103
    if-eqz v0, :cond_4

    .line 104
    .line 105
    if-eqz v2, :cond_5

    .line 106
    .line 107
    iget-object p1, v2, Ldefpackage/up0;->b:Landroid/widget/LinearLayout;

    .line 108
    .line 109
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 110
    .line 111
    .line 112
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/DownloadFragment;->l0:Ldefpackage/up0;

    .line 113
    .line 114
    iget-object p1, p1, Ldefpackage/up0;->c:Landroid/view/View;

    .line 115
    .line 116
    check-cast p1, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 117
    .line 118
    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 119
    .line 120
    .line 121
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/DownloadFragment;->l0:Ldefpackage/up0;

    .line 122
    .line 123
    iget-object p1, p1, Ldefpackage/up0;->e:Landroid/view/View;

    .line 124
    .line 125
    check-cast p1, Landroid/widget/ImageView;

    .line 126
    .line 127
    invoke-virtual {p1, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 128
    .line 129
    .line 130
    goto :goto_1

    .line 131
    :cond_4
    if-eqz v2, :cond_5

    .line 132
    .line 133
    iget-object v0, v2, Ldefpackage/up0;->b:Landroid/widget/LinearLayout;

    .line 134
    .line 135
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 136
    .line 137
    .line 138
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/DownloadFragment;->l0:Ldefpackage/up0;

    .line 139
    .line 140
    iget-object v0, v0, Ldefpackage/up0;->c:Landroid/view/View;

    .line 141
    .line 142
    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 143
    .line 144
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 145
    .line 146
    .line 147
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/DownloadFragment;->l0:Ldefpackage/up0;

    .line 148
    .line 149
    iget-object v0, v0, Ldefpackage/up0;->e:Landroid/view/View;

    .line 150
    .line 151
    check-cast v0, Landroid/widget/ImageView;

    .line 152
    .line 153
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 154
    .line 155
    .line 156
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/DownloadFragment;->o0:Ldefpackage/bu0;

    .line 157
    .line 158
    iget-object v0, v0, Ldefpackage/bu0;->e:Ldefpackage/k03;

    .line 159
    .line 160
    invoke-virtual {p0}, Ldefpackage/kc1;->v()Ldefpackage/le1;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    new-instance v2, Ldefpackage/f7;

    .line 165
    .line 166
    const/4 v4, 0x1

    .line 167
    invoke-direct {v2, v4, p0, p1}, Ldefpackage/f7;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v0, v1, v2}, Ldefpackage/ad2;->e(Ldefpackage/ba2;Ldefpackage/a83;)V

    .line 171
    .line 172
    .line 173
    :cond_5
    :goto_1
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/DownloadFragment;->l0:Ldefpackage/up0;

    .line 174
    .line 175
    if-eqz p0, :cond_6

    .line 176
    .line 177
    iget-object p0, p0, Ldefpackage/up0;->h:Landroid/view/View;

    .line 178
    .line 179
    check-cast p0, Landroid/widget/ProgressBar;

    .line 180
    .line 181
    invoke-virtual {p0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 182
    .line 183
    .line 184
    :cond_6
    return-void

    .line 185
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
