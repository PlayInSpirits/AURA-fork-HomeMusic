.class public final Lq80;
.super Lm75;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lq80;->a:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    new-instance v0, Ljava/util/ArrayList;

    .line 8
    .line 9
    const/4 v1, 0x3

    .line 10
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lq80;->b:Ljava/lang/Object;

    .line 14
    .line 15
    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 16
    iput p1, p0, Lq80;->a:I

    iput-object p2, p0, Lq80;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 3

    .line 1
    iget v0, p0, Lq80;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, Lq80;->b:Ljava/lang/Object;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    check-cast p0, Lde1;

    .line 11
    .line 12
    invoke-virtual {p0, v1}, Lde1;->b(Z)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_1
    :try_start_0
    check-cast p0, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    :goto_0
    if-ge v1, v0, :cond_0

    .line 23
    .line 24
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    add-int/lit8 v1, v1, 0x1

    .line 29
    .line 30
    check-cast v2, Lm75;

    .line 31
    .line 32
    invoke-virtual {v2, p1}, Lm75;->a(I)V
    :try_end_0
    .catch Ljava/util/ConcurrentModificationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :catch_0
    move-exception p0

    .line 37
    const-string p1, "Adding and removing callbacks during dispatch to callbacks is not supported"

    .line 38
    .line 39
    invoke-static {p1, p0}, Lmj0;->j(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 40
    .line 41
    .line 42
    :cond_0
    return-void

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public b(IFI)V
    .locals 3

    .line 1
    iget v0, p0, Lq80;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :pswitch_0
    :try_start_0
    iget-object p0, p0, Lq80;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x0

    .line 16
    :goto_0
    if-ge v1, v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    add-int/lit8 v1, v1, 0x1

    .line 23
    .line 24
    check-cast v2, Lm75;

    .line 25
    .line 26
    invoke-virtual {v2, p1, p2, p3}, Lm75;->b(IFI)V
    :try_end_0
    .catch Ljava/util/ConcurrentModificationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :catch_0
    move-exception p0

    .line 31
    const-string p1, "Adding and removing callbacks during dispatch to callbacks is not supported"

    .line 32
    .line 33
    invoke-static {p1, p0}, Lmj0;->j(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 34
    .line 35
    .line 36
    :cond_0
    return-void

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final c(I)V
    .locals 3

    .line 1
    iget v0, p0, Lq80;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, Lq80;->b:Ljava/lang/Object;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;

    .line 10
    .line 11
    invoke-virtual {p0}, Lkc1;->X()Lnc1;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Lnc1;->k()Lmd1;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const-string v2, "PlayerBottomSheet"

    .line 20
    .line 21
    invoke-virtual {v0, v2}, Lld1;->D(Ljava/lang/String;)Lkc1;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Lxi3;

    .line 26
    .line 27
    const/4 v2, 0x1

    .line 28
    if-nez p1, :cond_2

    .line 29
    .line 30
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->K0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 31
    .line 32
    iget-object p1, p1, Lcom/eddyizm/tempus/ui/activity/MainActivity;->V:Lzg5;

    .line 33
    .line 34
    iget-object p1, p1, Lzg5;->n:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast p1, Lau;

    .line 37
    .line 38
    iget-object p1, p1, Lau;->b:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 41
    .line 42
    iput-boolean v2, p1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->X:Z

    .line 43
    .line 44
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->o0:Landroidx/viewpager2/widget/ViewPager2;

    .line 45
    .line 46
    invoke-virtual {p1, v1}, Landroidx/viewpager2/widget/ViewPager2;->setUserInputEnabled(Z)V

    .line 47
    .line 48
    .line 49
    if-eqz v0, :cond_0

    .line 50
    .line 51
    iget-object p1, v0, Lxi3;->o0:Lns3;

    .line 52
    .line 53
    iget-object p1, p1, Lns3;->p:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast p1, Lom1;

    .line 56
    .line 57
    iget-object p1, p1, Lom1;->o:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast p1, Landroidx/viewpager2/widget/ViewPager2;

    .line 60
    .line 61
    invoke-virtual {p1, v2}, Landroidx/viewpager2/widget/ViewPager2;->setUserInputEnabled(Z)V

    .line 62
    .line 63
    .line 64
    :cond_0
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->B0:Landroid/widget/ImageButton;

    .line 65
    .line 66
    if-nez p1, :cond_1

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_1
    const v0, 0x7f040124

    .line 70
    .line 71
    .line 72
    invoke-static {p1, v0}, Lg12;->t(Landroid/view/View;I)I

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->B0:Landroid/widget/ImageButton;

    .line 77
    .line 78
    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    .line 83
    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_2
    if-ne p1, v2, :cond_5

    .line 87
    .line 88
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->K0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 89
    .line 90
    iget-object p1, p1, Lcom/eddyizm/tempus/ui/activity/MainActivity;->V:Lzg5;

    .line 91
    .line 92
    iget-object p1, p1, Lzg5;->n:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast p1, Lau;

    .line 95
    .line 96
    iget-object p1, p1, Lau;->b:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast p1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 99
    .line 100
    iput-boolean v2, p1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->X:Z

    .line 101
    .line 102
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->o0:Landroidx/viewpager2/widget/ViewPager2;

    .line 103
    .line 104
    invoke-virtual {p1, v2}, Landroidx/viewpager2/widget/ViewPager2;->setUserInputEnabled(Z)V

    .line 105
    .line 106
    .line 107
    if-eqz v0, :cond_3

    .line 108
    .line 109
    iget-object p1, v0, Lxi3;->o0:Lns3;

    .line 110
    .line 111
    iget-object p1, p1, Lns3;->p:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast p1, Lom1;

    .line 114
    .line 115
    iget-object p1, p1, Lom1;->o:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast p1, Landroidx/viewpager2/widget/ViewPager2;

    .line 118
    .line 119
    invoke-virtual {p1, v1}, Landroidx/viewpager2/widget/ViewPager2;->setUserInputEnabled(Z)V

    .line 120
    .line 121
    .line 122
    :cond_3
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->B0:Landroid/widget/ImageButton;

    .line 123
    .line 124
    if-nez p1, :cond_4

    .line 125
    .line 126
    goto :goto_0

    .line 127
    :cond_4
    const v0, 0x7f04012d

    .line 128
    .line 129
    .line 130
    invoke-static {p1, v0}, Lg12;->t(Landroid/view/View;I)I

    .line 131
    .line 132
    .line 133
    move-result p1

    .line 134
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->B0:Landroid/widget/ImageButton;

    .line 135
    .line 136
    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    .line 141
    .line 142
    .line 143
    :cond_5
    :goto_0
    return-void

    .line 144
    :pswitch_0
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/HomeFragment;

    .line 145
    .line 146
    invoke-virtual {p0}, Lkc1;->m()Lld1;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    const p1, 0x7f0a061c

    .line 151
    .line 152
    .line 153
    invoke-virtual {p0, p1}, Lld1;->C(I)Lkc1;

    .line 154
    .line 155
    .line 156
    move-result-object p0

    .line 157
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/ToolbarFragment;

    .line 158
    .line 159
    if-eqz p0, :cond_6

    .line 160
    .line 161
    invoke-virtual {p0}, Lcom/eddyizm/tempus/ui/fragment/ToolbarFragment;->h0()V

    .line 162
    .line 163
    .line 164
    :cond_6
    return-void

    .line 165
    :pswitch_1
    check-cast p0, Lde1;

    .line 166
    .line 167
    invoke-virtual {p0, v1}, Lde1;->b(Z)V

    .line 168
    .line 169
    .line 170
    return-void

    .line 171
    :pswitch_2
    :try_start_0
    check-cast p0, Ljava/util/ArrayList;

    .line 172
    .line 173
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 174
    .line 175
    .line 176
    move-result v0

    .line 177
    :goto_1
    if-ge v1, v0, :cond_7

    .line 178
    .line 179
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v2

    .line 183
    add-int/lit8 v1, v1, 0x1

    .line 184
    .line 185
    check-cast v2, Lm75;

    .line 186
    .line 187
    invoke-virtual {v2, p1}, Lm75;->c(I)V
    :try_end_0
    .catch Ljava/util/ConcurrentModificationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 188
    .line 189
    .line 190
    goto :goto_1

    .line 191
    :catch_0
    move-exception p0

    .line 192
    const-string p1, "Adding and removing callbacks during dispatch to callbacks is not supported"

    .line 193
    .line 194
    invoke-static {p1, p0}, Lmj0;->j(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 195
    .line 196
    .line 197
    :cond_7
    return-void

    .line 198
    nop

    .line 199
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
