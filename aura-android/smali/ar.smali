.class public final Lar;
.super Lz2;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final synthetic q:I

.field public final synthetic r:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 15
    iput p1, p0, Lar;->q:I

    iput-object p2, p0, Lar;->r:Ljava/lang/Object;

    invoke-direct {p0}, Lz2;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroidx/drawerlayout/widget/DrawerLayout;)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    iput v0, p0, Lar;->q:I

    .line 3
    .line 4
    iput-object p1, p0, Lar;->r:Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {p0}, Lz2;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance p0, Landroid/graphics/Rect;

    .line 10
    .line 11
    invoke-direct {p0}, Landroid/graphics/Rect;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 3

    .line 1
    iget v0, p0, Lar;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2}, Lz2;->a(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0

    .line 11
    :pswitch_0
    iget-object v0, p0, Lar;->r:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Landroidx/drawerlayout/widget/DrawerLayout;

    .line 14
    .line 15
    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityEvent;->getEventType()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const/16 v2, 0x20

    .line 20
    .line 21
    if-ne v1, v2, :cond_1

    .line 22
    .line 23
    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityRecord;->getText()Ljava/util/List;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Landroidx/drawerlayout/widget/DrawerLayout;->g()Landroid/view/View;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    if-eqz p0, :cond_0

    .line 31
    .line 32
    invoke-virtual {v0, p0}, Landroidx/drawerlayout/widget/DrawerLayout;->j(Landroid/view/View;)I

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    sget-object p1, Lj65;->a:Ljava/util/WeakHashMap;

    .line 37
    .line 38
    invoke-virtual {v0}, Landroid/view/View;->getLayoutDirection()I

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    invoke-static {p0, p1}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 43
    .line 44
    .line 45
    :cond_0
    const/4 p0, 0x1

    .line 46
    goto :goto_0

    .line 47
    :cond_1
    iget-object p0, p0, Lz2;->n:Landroid/view/View$AccessibilityDelegate;

    .line 48
    .line 49
    invoke-virtual {p0, p1, p2}, Landroid/view/View$AccessibilityDelegate;->dispatchPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    :goto_0
    return p0

    .line 54
    nop

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method

.method public c(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    .line 1
    iget v0, p0, Lar;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2}, Lz2;->c(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    invoke-super {p0, p1, p2}, Lz2;->c(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    .line 11
    .line 12
    .line 13
    const-string p0, "androidx.drawerlayout.widget.DrawerLayout"

    .line 14
    .line 15
    invoke-virtual {p2, p0}, Landroid/view/accessibility/AccessibilityRecord;->setClassName(Ljava/lang/CharSequence;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_1
    invoke-super {p0, p1, p2}, Lz2;->c(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    .line 20
    .line 21
    .line 22
    iget-object p0, p0, Lar;->r:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast p0, Lcom/google/android/material/internal/CheckableImageButton;

    .line 25
    .line 26
    iget-boolean p0, p0, Lcom/google/android/material/internal/CheckableImageButton;->q:Z

    .line 27
    .line 28
    invoke-virtual {p2, p0}, Landroid/view/accessibility/AccessibilityRecord;->setChecked(Z)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final d(Landroid/view/View;Lv3;)V
    .locals 12

    .line 1
    iget v0, p0, Lar;->q:I

    .line 2
    .line 3
    const/high16 v1, 0x100000

    .line 4
    .line 5
    const/4 v2, -0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x1

    .line 8
    iget-object v5, p0, Lar;->r:Ljava/lang/Object;

    .line 9
    .line 10
    iget-object p0, p0, Lz2;->n:Landroid/view/View$AccessibilityDelegate;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    check-cast v5, Lqp3;

    .line 16
    .line 17
    iget-object p0, v5, Lqp3;->t:Ldx3;

    .line 18
    .line 19
    invoke-virtual {p0, p1, p2}, Ldx3;->d(Landroid/view/View;Lv3;)V

    .line 20
    .line 21
    .line 22
    iget-object p0, v5, Lqp3;->s:Landroidx/recyclerview/widget/RecyclerView;

    .line 23
    .line 24
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->N(Landroid/view/View;)Lcx3;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    if-eqz p1, :cond_0

    .line 32
    .line 33
    invoke-virtual {p1}, Lcx3;->b()I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Ldw3;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    instance-of p1, p0, Lnp3;

    .line 42
    .line 43
    if-nez p1, :cond_1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    check-cast p0, Lnp3;

    .line 47
    .line 48
    invoke-virtual {p0, v2}, Lnp3;->r(I)Landroidx/preference/Preference;

    .line 49
    .line 50
    .line 51
    :goto_0
    return-void

    .line 52
    :pswitch_0
    iget-object p2, p2, Lv3;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 53
    .line 54
    invoke-virtual {p0, p1, p2}, Landroid/view/View$AccessibilityDelegate;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 55
    .line 56
    .line 57
    check-cast v5, Lcom/google/android/material/internal/NavigationMenuItemView;

    .line 58
    .line 59
    iget-boolean p0, v5, Lcom/google/android/material/internal/NavigationMenuItemView;->K:Z

    .line 60
    .line 61
    invoke-virtual {p2, p0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setCheckable(Z)V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :pswitch_1
    iget-object v0, p2, Lv3;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 66
    .line 67
    invoke-virtual {p0, p1, v0}, Landroid/view/View$AccessibilityDelegate;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 68
    .line 69
    .line 70
    check-cast v5, Lnh2;

    .line 71
    .line 72
    iget-object p0, v5, Lnh2;->x0:Landroid/view/View;

    .line 73
    .line 74
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    .line 75
    .line 76
    .line 77
    move-result p0

    .line 78
    if-nez p0, :cond_2

    .line 79
    .line 80
    const p0, 0x7f1303a7

    .line 81
    .line 82
    .line 83
    invoke-virtual {v5, p0}, Lkc1;->s(I)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    goto :goto_1

    .line 88
    :cond_2
    const p0, 0x7f1303a5

    .line 89
    .line 90
    .line 91
    invoke-virtual {v5, p0}, Lkc1;->s(I)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    :goto_1
    invoke-virtual {p2, p0}, Lv3;->l(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    return-void

    .line 99
    :pswitch_2
    iget-object v0, p2, Lv3;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 100
    .line 101
    invoke-virtual {p0, p1, v0}, Landroid/view/View$AccessibilityDelegate;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 102
    .line 103
    .line 104
    check-cast v5, Lcom/google/android/material/button/MaterialButtonToggleGroup;

    .line 105
    .line 106
    sget p0, Lcom/google/android/material/button/MaterialButtonToggleGroup;->x:I

    .line 107
    .line 108
    instance-of p0, p1, Lcom/google/android/material/button/MaterialButton;

    .line 109
    .line 110
    if-nez p0, :cond_4

    .line 111
    .line 112
    :cond_3
    move v8, v2

    .line 113
    goto :goto_3

    .line 114
    :cond_4
    move p0, v3

    .line 115
    :goto_2
    invoke-virtual {v5}, Landroid/view/ViewGroup;->getChildCount()I

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    if-ge v3, v0, :cond_3

    .line 120
    .line 121
    invoke-virtual {v5, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    if-ne v0, p1, :cond_5

    .line 126
    .line 127
    move v8, p0

    .line 128
    goto :goto_3

    .line 129
    :cond_5
    invoke-virtual {v5, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    instance-of v0, v0, Lcom/google/android/material/button/MaterialButton;

    .line 134
    .line 135
    if-eqz v0, :cond_6

    .line 136
    .line 137
    invoke-virtual {v5, v3}, Lcom/google/android/material/button/MaterialButtonToggleGroup;->c(I)Z

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    if-eqz v0, :cond_6

    .line 142
    .line 143
    add-int/lit8 p0, p0, 0x1

    .line 144
    .line 145
    :cond_6
    add-int/lit8 v3, v3, 0x1

    .line 146
    .line 147
    goto :goto_2

    .line 148
    :goto_3
    check-cast p1, Lcom/google/android/material/button/MaterialButton;

    .line 149
    .line 150
    iget-boolean v11, p1, Lcom/google/android/material/button/MaterialButton;->B:Z

    .line 151
    .line 152
    const/4 v6, 0x0

    .line 153
    const/4 v7, 0x1

    .line 154
    const/4 v9, 0x1

    .line 155
    const/4 v10, 0x0

    .line 156
    invoke-static/range {v6 .. v11}, Lu3;->a(IIIIZZ)Lu3;

    .line 157
    .line 158
    .line 159
    move-result-object p0

    .line 160
    invoke-virtual {p2, p0}, Lv3;->k(Lu3;)V

    .line 161
    .line 162
    .line 163
    return-void

    .line 164
    :pswitch_3
    sget-object v0, Landroidx/drawerlayout/widget/DrawerLayout;->P:[I

    .line 165
    .line 166
    iget-object v0, p2, Lv3;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 167
    .line 168
    invoke-virtual {p0, p1, v0}, Landroid/view/View$AccessibilityDelegate;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 169
    .line 170
    .line 171
    const-string p0, "androidx.drawerlayout.widget.DrawerLayout"

    .line 172
    .line 173
    invoke-virtual {p2, p0}, Lv3;->i(Ljava/lang/CharSequence;)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v0, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->setFocusable(Z)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v0, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->setFocused(Z)V

    .line 180
    .line 181
    .line 182
    sget-object p0, Lo3;->e:Lo3;

    .line 183
    .line 184
    iget-object p0, p0, Lo3;->a:Ljava/lang/Object;

    .line 185
    .line 186
    check-cast p0, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;

    .line 187
    .line 188
    invoke-virtual {v0, p0}, Landroid/view/accessibility/AccessibilityNodeInfo;->removeAction(Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;)Z

    .line 189
    .line 190
    .line 191
    sget-object p0, Lo3;->f:Lo3;

    .line 192
    .line 193
    iget-object p0, p0, Lo3;->a:Ljava/lang/Object;

    .line 194
    .line 195
    check-cast p0, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;

    .line 196
    .line 197
    invoke-virtual {v0, p0}, Landroid/view/accessibility/AccessibilityNodeInfo;->removeAction(Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;)Z

    .line 198
    .line 199
    .line 200
    return-void

    .line 201
    :pswitch_4
    iget-object p2, p2, Lv3;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 202
    .line 203
    invoke-virtual {p0, p1, p2}, Landroid/view/View$AccessibilityDelegate;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 204
    .line 205
    .line 206
    check-cast v5, Lcom/google/android/material/internal/CheckableImageButton;

    .line 207
    .line 208
    iget-boolean p0, v5, Lcom/google/android/material/internal/CheckableImageButton;->r:Z

    .line 209
    .line 210
    invoke-virtual {p2, p0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setCheckable(Z)V

    .line 211
    .line 212
    .line 213
    iget-boolean p0, v5, Lcom/google/android/material/internal/CheckableImageButton;->q:Z

    .line 214
    .line 215
    invoke-virtual {p2, p0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setChecked(Z)V

    .line 216
    .line 217
    .line 218
    return-void

    .line 219
    :pswitch_5
    iget-object v0, p2, Lv3;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 220
    .line 221
    invoke-virtual {p0, p1, v0}, Landroid/view/View$AccessibilityDelegate;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 222
    .line 223
    .line 224
    check-cast v5, Lyt;

    .line 225
    .line 226
    iget-boolean p0, v5, Lyt;->x:Z

    .line 227
    .line 228
    if-eqz p0, :cond_7

    .line 229
    .line 230
    invoke-virtual {p2, v1}, Lv3;->a(I)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v0, v4}, Landroid/view/accessibility/AccessibilityNodeInfo;->setDismissable(Z)V

    .line 234
    .line 235
    .line 236
    goto :goto_4

    .line 237
    :cond_7
    invoke-virtual {v0, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->setDismissable(Z)V

    .line 238
    .line 239
    .line 240
    :goto_4
    return-void

    .line 241
    :pswitch_6
    iget-object v0, p2, Lv3;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 242
    .line 243
    invoke-virtual {p0, p1, v0}, Landroid/view/View$AccessibilityDelegate;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {p2, v1}, Lv3;->a(I)V

    .line 247
    .line 248
    .line 249
    invoke-virtual {v0, v4}, Landroid/view/accessibility/AccessibilityNodeInfo;->setDismissable(Z)V

    .line 250
    .line 251
    .line 252
    return-void

    .line 253
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

.method public f(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 1

    .line 1
    iget v0, p0, Lar;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2, p3}, Lz2;->f(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0

    .line 11
    :pswitch_0
    sget-object v0, Landroidx/drawerlayout/widget/DrawerLayout;->P:[I

    .line 12
    .line 13
    iget-object p0, p0, Lz2;->n:Landroid/view/View$AccessibilityDelegate;

    .line 14
    .line 15
    invoke-virtual {p0, p1, p2, p3}, Landroid/view/View$AccessibilityDelegate;->onRequestSendAccessibilityEvent(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method

.method public g(Landroid/view/View;ILandroid/os/Bundle;)Z
    .locals 4

    .line 1
    iget v0, p0, Lar;->q:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/high16 v2, 0x100000

    .line 5
    .line 6
    iget-object v3, p0, Lar;->r:Ljava/lang/Object;

    .line 7
    .line 8
    sparse-switch v0, :sswitch_data_0

    .line 9
    .line 10
    .line 11
    invoke-super {p0, p1, p2, p3}, Lz2;->g(Landroid/view/View;ILandroid/os/Bundle;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0

    .line 16
    :sswitch_0
    check-cast v3, Lqp3;

    .line 17
    .line 18
    iget-object p0, v3, Lqp3;->t:Ldx3;

    .line 19
    .line 20
    invoke-virtual {p0, p1, p2, p3}, Ldx3;->g(Landroid/view/View;ILandroid/os/Bundle;)Z

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    return p0

    .line 25
    :sswitch_1
    if-ne p2, v2, :cond_0

    .line 26
    .line 27
    check-cast v3, Lyt;

    .line 28
    .line 29
    iget-boolean v0, v3, Lyt;->x:Z

    .line 30
    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    invoke-virtual {v3}, Lyt;->cancel()V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    invoke-super {p0, p1, p2, p3}, Lz2;->g(Landroid/view/View;ILandroid/os/Bundle;)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    :goto_0
    return v1

    .line 42
    :sswitch_2
    if-ne p2, v2, :cond_1

    .line 43
    .line 44
    check-cast v3, Lfr;

    .line 45
    .line 46
    check-cast v3, Lqg4;

    .line 47
    .line 48
    const/4 p0, 0x3

    .line 49
    invoke-virtual {v3, p0}, Lfr;->a(I)V

    .line 50
    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_1
    invoke-super {p0, p1, p2, p3}, Lz2;->g(Landroid/view/View;ILandroid/os/Bundle;)Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    :goto_1
    return v1

    .line 58
    nop

    .line 59
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_2
        0x1 -> :sswitch_1
        0x7 -> :sswitch_0
    .end sparse-switch
.end method
