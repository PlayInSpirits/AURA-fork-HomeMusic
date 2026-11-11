.class public Lhg;
.super Landroid/widget/EditText;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lg93;


# instance fields
.field public final n:Lc6;

.field public final o:Lih;

.field public final p:Lxc5;

.field public final q:Let4;

.field public final r:Lgp3;

.field public s:Lgg;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3

    .line 1
    invoke-static {p1}, Lju4;->a(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/EditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {p0, p1}, Lgt4;->a(Landroid/view/View;Landroid/content/Context;)V

    .line 12
    .line 13
    .line 14
    new-instance p1, Lc6;

    .line 15
    .line 16
    invoke-direct {p1, p0}, Lc6;-><init>(Landroid/view/View;)V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lhg;->n:Lc6;

    .line 20
    .line 21
    invoke-virtual {p1, p2, p3}, Lc6;->n(Landroid/util/AttributeSet;I)V

    .line 22
    .line 23
    .line 24
    new-instance p1, Lih;

    .line 25
    .line 26
    invoke-direct {p1, p0}, Lih;-><init>(Landroid/widget/TextView;)V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, Lhg;->o:Lih;

    .line 30
    .line 31
    invoke-virtual {p1, p2, p3}, Lih;->f(Landroid/util/AttributeSet;I)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1}, Lih;->b()V

    .line 35
    .line 36
    .line 37
    new-instance p1, Lxc5;

    .line 38
    .line 39
    const/4 v0, 0x2

    .line 40
    const/4 v1, 0x0

    .line 41
    invoke-direct {p1, v0, v1}, Lxc5;-><init>(IZ)V

    .line 42
    .line 43
    .line 44
    iput-object p0, p1, Lxc5;->o:Ljava/lang/Object;

    .line 45
    .line 46
    iput-object p1, p0, Lhg;->p:Lxc5;

    .line 47
    .line 48
    new-instance p1, Let4;

    .line 49
    .line 50
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 51
    .line 52
    .line 53
    iput-object p1, p0, Lhg;->q:Let4;

    .line 54
    .line 55
    new-instance p1, Lgp3;

    .line 56
    .line 57
    invoke-direct {p1, p0}, Lgp3;-><init>(Landroid/widget/EditText;)V

    .line 58
    .line 59
    .line 60
    iput-object p1, p0, Lhg;->r:Lgp3;

    .line 61
    .line 62
    invoke-virtual {p1, p2, p3}, Lgp3;->p(Landroid/util/AttributeSet;I)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0}, Landroid/widget/TextView;->getKeyListener()Landroid/text/method/KeyListener;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    instance-of p3, p2, Landroid/text/method/NumberKeyListener;

    .line 70
    .line 71
    if-nez p3, :cond_1

    .line 72
    .line 73
    invoke-super {p0}, Landroid/view/View;->isFocusable()Z

    .line 74
    .line 75
    .line 76
    move-result p3

    .line 77
    invoke-super {p0}, Landroid/view/View;->isClickable()Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    invoke-super {p0}, Landroid/view/View;->isLongClickable()Z

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    invoke-super {p0}, Landroid/widget/TextView;->getInputType()I

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    invoke-virtual {p1, p2}, Lgp3;->k(Landroid/text/method/KeyListener;)Landroid/text/method/KeyListener;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    if-ne p1, p2, :cond_0

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_0
    invoke-super {p0, p1}, Landroid/widget/TextView;->setKeyListener(Landroid/text/method/KeyListener;)V

    .line 97
    .line 98
    .line 99
    invoke-super {p0, v2}, Landroid/widget/TextView;->setRawInputType(I)V

    .line 100
    .line 101
    .line 102
    invoke-super {p0, p3}, Landroid/view/View;->setFocusable(Z)V

    .line 103
    .line 104
    .line 105
    invoke-super {p0, v0}, Landroid/view/View;->setClickable(Z)V

    .line 106
    .line 107
    .line 108
    invoke-super {p0, v1}, Landroid/view/View;->setLongClickable(Z)V

    .line 109
    .line 110
    .line 111
    :cond_1
    :goto_0
    return-void
.end method

.method private getSuperCaller()Lgg;
    .locals 1

    .line 1
    iget-object v0, p0, Lhg;->s:Lgg;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lgg;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Lgg;-><init>(Lhg;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lhg;->s:Lgg;

    .line 11
    .line 12
    :cond_0
    iget-object p0, p0, Lhg;->s:Lgg;

    .line 13
    .line 14
    return-object p0
.end method


# virtual methods
.method public final a(Lld0;)Lld0;
    .locals 1

    .line 1
    iget-object v0, p0, Lhg;->q:Let4;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {p0, p1}, Let4;->a(Landroid/view/View;Lld0;)Lld0;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public final drawableStateChanged()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/view/View;->drawableStateChanged()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lhg;->n:Lc6;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Lc6;->b()V

    .line 9
    .line 10
    .line 11
    :cond_0
    iget-object p0, p0, Lhg;->o:Lih;

    .line 12
    .line 13
    if-eqz p0, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0}, Lih;->b()V

    .line 16
    .line 17
    .line 18
    :cond_1
    return-void
.end method

.method public getCustomSelectionActionModeCallback()Landroid/view/ActionMode$Callback;
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/widget/TextView;->getCustomSelectionActionModeCallback()Landroid/view/ActionMode$Callback;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Lya4;->O(Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode$Callback;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public getSupportBackgroundTintList()Landroid/content/res/ColorStateList;
    .locals 0

    .line 1
    iget-object p0, p0, Lhg;->n:Lc6;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lc6;->k()Landroid/content/res/ColorStateList;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return-object p0
.end method

.method public getSupportBackgroundTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 0

    .line 1
    iget-object p0, p0, Lhg;->n:Lc6;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lc6;->l()Landroid/graphics/PorterDuff$Mode;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return-object p0
.end method

.method public getSupportCompoundDrawablesTintList()Landroid/content/res/ColorStateList;
    .locals 0

    .line 1
    iget-object p0, p0, Lhg;->o:Lih;

    .line 2
    .line 3
    invoke-virtual {p0}, Lih;->d()Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getSupportCompoundDrawablesTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 0

    .line 1
    iget-object p0, p0, Lhg;->o:Lih;

    .line 2
    .line 3
    invoke-virtual {p0}, Lih;->e()Landroid/graphics/PorterDuff$Mode;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getText()Landroid/text/Editable;
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1c

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    invoke-super {p0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    invoke-super {p0}, Landroid/widget/TextView;->getEditableText()Landroid/text/Editable;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public bridge synthetic getText()Ljava/lang/CharSequence;
    .locals 0

    .line 17
    invoke-virtual {p0}, Lhg;->getText()Landroid/text/Editable;

    move-result-object p0

    return-object p0
.end method

.method public getTextClassifier()Landroid/view/textclassifier/TextClassifier;
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1c

    .line 4
    .line 5
    if-ge v0, v1, :cond_2

    .line 6
    .line 7
    iget-object v0, p0, Lhg;->p:Lxc5;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object p0, v0, Lxc5;->p:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, Landroid/view/textclassifier/TextClassifier;

    .line 15
    .line 16
    if-nez p0, :cond_1

    .line 17
    .line 18
    iget-object p0, v0, Lxc5;->o:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p0, Landroid/widget/TextView;

    .line 21
    .line 22
    invoke-static {p0}, Lch;->a(Landroid/widget/TextView;)Landroid/view/textclassifier/TextClassifier;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    :cond_1
    return-object p0

    .line 27
    :cond_2
    :goto_0
    invoke-direct {p0}, Lhg;->getSuperCaller()Lgg;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    iget-object p0, p0, Lgg;->a:Lhg;

    .line 32
    .line 33
    invoke-super {p0}, Landroid/widget/EditText;->getTextClassifier()Landroid/view/textclassifier/TextClassifier;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0
.end method

.method public onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-super/range {p0 .. p1}, Landroid/view/View;->onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    iget-object v3, v0, Lhg;->o:Lih;

    .line 10
    .line 11
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 15
    .line 16
    const/16 v4, 0x12

    .line 17
    .line 18
    const/16 v5, 0x1e

    .line 19
    .line 20
    if-ge v3, v5, :cond_d

    .line 21
    .line 22
    if-eqz v2, :cond_d

    .line 23
    .line 24
    invoke-virtual {v0}, Lhg;->getText()Ljava/lang/CharSequence;

    .line 25
    .line 26
    .line 27
    move-result-object v6

    .line 28
    if-lt v3, v5, :cond_0

    .line 29
    .line 30
    invoke-static {v1, v6}, Lp3;->h(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;)V

    .line 31
    .line 32
    .line 33
    goto/16 :goto_6

    .line 34
    .line 35
    :cond_0
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    if-lt v3, v5, :cond_1

    .line 39
    .line 40
    invoke-static {v1, v6}, Lp3;->h(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;)V

    .line 41
    .line 42
    .line 43
    goto/16 :goto_6

    .line 44
    .line 45
    :cond_1
    iget v7, v1, Landroid/view/inputmethod/EditorInfo;->initialSelStart:I

    .line 46
    .line 47
    iget v8, v1, Landroid/view/inputmethod/EditorInfo;->initialSelEnd:I

    .line 48
    .line 49
    if-le v7, v8, :cond_2

    .line 50
    .line 51
    move v9, v8

    .line 52
    goto :goto_0

    .line 53
    :cond_2
    move v9, v7

    .line 54
    :goto_0
    if-le v7, v8, :cond_3

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_3
    move v7, v8

    .line 58
    :goto_1
    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    .line 59
    .line 60
    .line 61
    move-result v8

    .line 62
    const/4 v10, 0x0

    .line 63
    const/4 v11, 0x0

    .line 64
    if-ltz v9, :cond_c

    .line 65
    .line 66
    if-le v7, v8, :cond_4

    .line 67
    .line 68
    goto/16 :goto_5

    .line 69
    .line 70
    :cond_4
    iget v12, v1, Landroid/view/inputmethod/EditorInfo;->inputType:I

    .line 71
    .line 72
    and-int/lit16 v12, v12, 0xfff

    .line 73
    .line 74
    const/16 v13, 0x81

    .line 75
    .line 76
    if-eq v12, v13, :cond_b

    .line 77
    .line 78
    const/16 v13, 0xe1

    .line 79
    .line 80
    if-eq v12, v13, :cond_b

    .line 81
    .line 82
    if-ne v12, v4, :cond_5

    .line 83
    .line 84
    goto/16 :goto_4

    .line 85
    .line 86
    :cond_5
    const/16 v11, 0x800

    .line 87
    .line 88
    if-gt v8, v11, :cond_6

    .line 89
    .line 90
    invoke-static {v1, v6, v9, v7}, Luo;->S(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;II)V

    .line 91
    .line 92
    .line 93
    goto/16 :goto_6

    .line 94
    .line 95
    :cond_6
    sub-int v8, v7, v9

    .line 96
    .line 97
    const/16 v11, 0x400

    .line 98
    .line 99
    if-le v8, v11, :cond_7

    .line 100
    .line 101
    move v11, v10

    .line 102
    goto :goto_2

    .line 103
    :cond_7
    move v11, v8

    .line 104
    :goto_2
    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    .line 105
    .line 106
    .line 107
    move-result v12

    .line 108
    sub-int/2addr v12, v7

    .line 109
    rsub-int v13, v11, 0x800

    .line 110
    .line 111
    const-wide v16, 0x3fe999999999999aL    # 0.8

    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    int-to-double v14, v13

    .line 117
    mul-double v14, v14, v16

    .line 118
    .line 119
    double-to-int v14, v14

    .line 120
    invoke-static {v9, v14}, Ljava/lang/Math;->min(II)I

    .line 121
    .line 122
    .line 123
    move-result v14

    .line 124
    sub-int v14, v13, v14

    .line 125
    .line 126
    invoke-static {v12, v14}, Ljava/lang/Math;->min(II)I

    .line 127
    .line 128
    .line 129
    move-result v12

    .line 130
    sub-int/2addr v13, v12

    .line 131
    invoke-static {v9, v13}, Ljava/lang/Math;->min(II)I

    .line 132
    .line 133
    .line 134
    move-result v13

    .line 135
    sub-int/2addr v9, v13

    .line 136
    invoke-interface {v6, v9}, Ljava/lang/CharSequence;->charAt(I)C

    .line 137
    .line 138
    .line 139
    move-result v14

    .line 140
    invoke-static {v14}, Ljava/lang/Character;->isLowSurrogate(C)Z

    .line 141
    .line 142
    .line 143
    move-result v14

    .line 144
    if-eqz v14, :cond_8

    .line 145
    .line 146
    add-int/lit8 v9, v9, 0x1

    .line 147
    .line 148
    add-int/lit8 v13, v13, -0x1

    .line 149
    .line 150
    :cond_8
    add-int v14, v7, v12

    .line 151
    .line 152
    const/4 v15, 0x1

    .line 153
    sub-int/2addr v14, v15

    .line 154
    invoke-interface {v6, v14}, Ljava/lang/CharSequence;->charAt(I)C

    .line 155
    .line 156
    .line 157
    move-result v14

    .line 158
    invoke-static {v14}, Ljava/lang/Character;->isHighSurrogate(C)Z

    .line 159
    .line 160
    .line 161
    move-result v14

    .line 162
    if-eqz v14, :cond_9

    .line 163
    .line 164
    add-int/lit8 v12, v12, -0x1

    .line 165
    .line 166
    :cond_9
    add-int v14, v13, v11

    .line 167
    .line 168
    add-int v16, v14, v12

    .line 169
    .line 170
    if-eq v11, v8, :cond_a

    .line 171
    .line 172
    add-int v8, v9, v13

    .line 173
    .line 174
    invoke-interface {v6, v9, v8}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 175
    .line 176
    .line 177
    move-result-object v8

    .line 178
    add-int/2addr v12, v7

    .line 179
    invoke-interface {v6, v7, v12}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 180
    .line 181
    .line 182
    move-result-object v6

    .line 183
    const/4 v7, 0x2

    .line 184
    new-array v7, v7, [Ljava/lang/CharSequence;

    .line 185
    .line 186
    aput-object v8, v7, v10

    .line 187
    .line 188
    aput-object v6, v7, v15

    .line 189
    .line 190
    invoke-static {v7}, Landroid/text/TextUtils;->concat([Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 191
    .line 192
    .line 193
    move-result-object v6

    .line 194
    goto :goto_3

    .line 195
    :cond_a
    add-int v7, v9, v16

    .line 196
    .line 197
    invoke-interface {v6, v9, v7}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 198
    .line 199
    .line 200
    move-result-object v6

    .line 201
    :goto_3
    invoke-static {v1, v6, v13, v14}, Luo;->S(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;II)V

    .line 202
    .line 203
    .line 204
    goto :goto_6

    .line 205
    :cond_b
    :goto_4
    invoke-static {v1, v11, v10, v10}, Luo;->S(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;II)V

    .line 206
    .line 207
    .line 208
    goto :goto_6

    .line 209
    :cond_c
    :goto_5
    invoke-static {v1, v11, v10, v10}, Luo;->S(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;II)V

    .line 210
    .line 211
    .line 212
    :cond_d
    :goto_6
    invoke-static {v1, v2, v0}, Lwr1;->O(Landroid/view/inputmethod/EditorInfo;Landroid/view/inputmethod/InputConnection;Landroid/widget/TextView;)V

    .line 213
    .line 214
    .line 215
    if-eqz v2, :cond_16

    .line 216
    .line 217
    if-gt v3, v5, :cond_16

    .line 218
    .line 219
    invoke-static {v0}, Lj65;->g(Lhg;)[Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object v5

    .line 223
    if-eqz v5, :cond_16

    .line 224
    .line 225
    const-string v6, "android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"

    .line 226
    .line 227
    const-string v7, "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"

    .line 228
    .line 229
    const/16 v8, 0x19

    .line 230
    .line 231
    if-lt v3, v8, :cond_e

    .line 232
    .line 233
    invoke-static {v1, v5}, Lkz0;->i(Landroid/view/inputmethod/EditorInfo;[Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    goto :goto_7

    .line 237
    :cond_e
    iget-object v9, v1, Landroid/view/inputmethod/EditorInfo;->extras:Landroid/os/Bundle;

    .line 238
    .line 239
    if-nez v9, :cond_f

    .line 240
    .line 241
    new-instance v9, Landroid/os/Bundle;

    .line 242
    .line 243
    invoke-direct {v9}, Landroid/os/Bundle;-><init>()V

    .line 244
    .line 245
    .line 246
    iput-object v9, v1, Landroid/view/inputmethod/EditorInfo;->extras:Landroid/os/Bundle;

    .line 247
    .line 248
    :cond_f
    iget-object v9, v1, Landroid/view/inputmethod/EditorInfo;->extras:Landroid/os/Bundle;

    .line 249
    .line 250
    invoke-virtual {v9, v7, v5}, Landroid/os/BaseBundle;->putStringArray(Ljava/lang/String;[Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    iget-object v9, v1, Landroid/view/inputmethod/EditorInfo;->extras:Landroid/os/Bundle;

    .line 254
    .line 255
    invoke-virtual {v9, v6, v5}, Landroid/os/BaseBundle;->putStringArray(Ljava/lang/String;[Ljava/lang/String;)V

    .line 256
    .line 257
    .line 258
    :goto_7
    new-instance v5, Lcn;

    .line 259
    .line 260
    invoke-direct {v5, v4, v0}, Lcn;-><init>(ILjava/lang/Object;)V

    .line 261
    .line 262
    .line 263
    if-lt v3, v8, :cond_10

    .line 264
    .line 265
    new-instance v3, Lkz1;

    .line 266
    .line 267
    invoke-direct {v3, v2, v5}, Lkz1;-><init>(Landroid/view/inputmethod/InputConnection;Lcn;)V

    .line 268
    .line 269
    .line 270
    :goto_8
    move-object v2, v3

    .line 271
    goto :goto_b

    .line 272
    :cond_10
    sget-object v4, Luo;->q:[Ljava/lang/String;

    .line 273
    .line 274
    if-lt v3, v8, :cond_11

    .line 275
    .line 276
    invoke-static {v1}, Lkz0;->j(Landroid/view/inputmethod/EditorInfo;)[Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object v3

    .line 280
    if-eqz v3, :cond_14

    .line 281
    .line 282
    :goto_9
    move-object v4, v3

    .line 283
    goto :goto_a

    .line 284
    :cond_11
    iget-object v3, v1, Landroid/view/inputmethod/EditorInfo;->extras:Landroid/os/Bundle;

    .line 285
    .line 286
    if-nez v3, :cond_12

    .line 287
    .line 288
    goto :goto_a

    .line 289
    :cond_12
    invoke-virtual {v3, v7}, Landroid/os/BaseBundle;->getStringArray(Ljava/lang/String;)[Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object v3

    .line 293
    if-nez v3, :cond_13

    .line 294
    .line 295
    iget-object v3, v1, Landroid/view/inputmethod/EditorInfo;->extras:Landroid/os/Bundle;

    .line 296
    .line 297
    invoke-virtual {v3, v6}, Landroid/os/BaseBundle;->getStringArray(Ljava/lang/String;)[Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object v3

    .line 301
    :cond_13
    if-eqz v3, :cond_14

    .line 302
    .line 303
    goto :goto_9

    .line 304
    :cond_14
    :goto_a
    array-length v3, v4

    .line 305
    if-nez v3, :cond_15

    .line 306
    .line 307
    goto :goto_b

    .line 308
    :cond_15
    new-instance v3, Llz1;

    .line 309
    .line 310
    invoke-direct {v3, v2, v5}, Llz1;-><init>(Landroid/view/inputmethod/InputConnection;Lcn;)V

    .line 311
    .line 312
    .line 313
    goto :goto_8

    .line 314
    :cond_16
    :goto_b
    iget-object v0, v0, Lhg;->r:Lgp3;

    .line 315
    .line 316
    invoke-virtual {v0, v2, v1}, Lgp3;->r(Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;)La01;

    .line 317
    .line 318
    .line 319
    move-result-object v0

    .line 320
    return-object v0
.end method

.method public final onDetachedFromWindow()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 5
    .line 6
    const/16 v1, 0x1e

    .line 7
    .line 8
    if-lt v0, v1, :cond_0

    .line 9
    .line 10
    const/16 v1, 0x21

    .line 11
    .line 12
    if-ge v0, v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-string v1, "input_method"

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 25
    .line 26
    invoke-virtual {v0, p0}, Landroid/view/inputmethod/InputMethodManager;->isActive(Landroid/view/View;)Z

    .line 27
    .line 28
    .line 29
    :cond_0
    return-void
.end method

.method public final onDragEvent(Landroid/view/DragEvent;)Z
    .locals 5

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1f

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    if-ge v0, v1, :cond_5

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/view/DragEvent;->getLocalState()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-nez v0, :cond_5

    .line 14
    .line 15
    invoke-static {p0}, Lj65;->g(Lhg;)[Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    goto :goto_2

    .line 22
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    :goto_0
    instance-of v1, v0, Landroid/content/ContextWrapper;

    .line 27
    .line 28
    if-eqz v1, :cond_2

    .line 29
    .line 30
    instance-of v1, v0, Landroid/app/Activity;

    .line 31
    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    check-cast v0, Landroid/app/Activity;

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    check-cast v0, Landroid/content/ContextWrapper;

    .line 38
    .line 39
    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    goto :goto_0

    .line 44
    :cond_2
    const/4 v0, 0x0

    .line 45
    :goto_1
    if-nez v0, :cond_3

    .line 46
    .line 47
    new-instance v0, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    const-string v1, "Can\'t handle drop: no activity: view="

    .line 50
    .line 51
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    const-string v1, "ReceiveContent"

    .line 62
    .line 63
    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 64
    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_3
    invoke-virtual {p1}, Landroid/view/DragEvent;->getAction()I

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-ne v1, v2, :cond_4

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_4
    invoke-virtual {p1}, Landroid/view/DragEvent;->getAction()I

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    const/4 v4, 0x3

    .line 79
    if-ne v1, v4, :cond_5

    .line 80
    .line 81
    invoke-static {p1, p0, v0}, Log;->a(Landroid/view/DragEvent;Landroid/widget/TextView;Landroid/app/Activity;)Z

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    :cond_5
    :goto_2
    if-eqz v3, :cond_6

    .line 86
    .line 87
    return v2

    .line 88
    :cond_6
    invoke-super {p0, p1}, Landroid/view/View;->onDragEvent(Landroid/view/DragEvent;)Z

    .line 89
    .line 90
    .line 91
    move-result p0

    .line 92
    return p0
.end method

.method public final onTextContextMenuItem(I)Z
    .locals 6

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1f

    .line 4
    .line 5
    if-ge v0, v1, :cond_5

    .line 6
    .line 7
    invoke-static {p0}, Lj65;->g(Lhg;)[Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    if-eqz v2, :cond_5

    .line 12
    .line 13
    const v2, 0x1020022

    .line 14
    .line 15
    .line 16
    if-eq p1, v2, :cond_0

    .line 17
    .line 18
    const v3, 0x1020031

    .line 19
    .line 20
    .line 21
    if-eq p1, v3, :cond_0

    .line 22
    .line 23
    goto :goto_3

    .line 24
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    const-string v4, "clipboard"

    .line 29
    .line 30
    invoke-virtual {v3, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    check-cast v3, Landroid/content/ClipboardManager;

    .line 35
    .line 36
    if-nez v3, :cond_1

    .line 37
    .line 38
    const/4 v3, 0x0

    .line 39
    goto :goto_0

    .line 40
    :cond_1
    invoke-virtual {v3}, Landroid/content/ClipboardManager;->getPrimaryClip()Landroid/content/ClipData;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    :goto_0
    const/4 v4, 0x1

    .line 45
    if-eqz v3, :cond_4

    .line 46
    .line 47
    invoke-virtual {v3}, Landroid/content/ClipData;->getItemCount()I

    .line 48
    .line 49
    .line 50
    move-result v5

    .line 51
    if-lez v5, :cond_4

    .line 52
    .line 53
    if-lt v0, v1, :cond_2

    .line 54
    .line 55
    new-instance v0, Ld34;

    .line 56
    .line 57
    invoke-direct {v0, v3, v4}, Ld34;-><init>(Landroid/content/ClipData;I)V

    .line 58
    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_2
    new-instance v0, Ljd0;

    .line 62
    .line 63
    invoke-direct {v0}, Ljd0;-><init>()V

    .line 64
    .line 65
    .line 66
    iput-object v3, v0, Ljd0;->o:Landroid/content/ClipData;

    .line 67
    .line 68
    iput v4, v0, Ljd0;->p:I

    .line 69
    .line 70
    :goto_1
    if-ne p1, v2, :cond_3

    .line 71
    .line 72
    const/4 p1, 0x0

    .line 73
    goto :goto_2

    .line 74
    :cond_3
    move p1, v4

    .line 75
    :goto_2
    invoke-interface {v0, p1}, Lid0;->i(I)V

    .line 76
    .line 77
    .line 78
    invoke-interface {v0}, Lid0;->build()Lld0;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-static {p0, p1}, Lj65;->j(Landroid/view/View;Lld0;)Lld0;

    .line 83
    .line 84
    .line 85
    :cond_4
    return v4

    .line 86
    :cond_5
    :goto_3
    invoke-super {p0, p1}, Landroid/widget/EditText;->onTextContextMenuItem(I)Z

    .line 87
    .line 88
    .line 89
    move-result p0

    .line 90
    return p0
.end method

.method public setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lhg;->n:Lc6;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Lc6;->p()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public setBackgroundResource(I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lhg;->n:Lc6;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lc6;->q(I)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lhg;->o:Lih;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Lih;->b()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final setCompoundDrawablesRelative(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->setCompoundDrawablesRelative(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lhg;->o:Lih;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Lih;->b()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public setCustomSelectionActionModeCallback(Landroid/view/ActionMode$Callback;)V
    .locals 0

    .line 1
    invoke-static {p1, p0}, Lya4;->P(Landroid/view/ActionMode$Callback;Landroid/widget/TextView;)Landroid/view/ActionMode$Callback;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-super {p0, p1}, Landroid/widget/TextView;->setCustomSelectionActionModeCallback(Landroid/view/ActionMode$Callback;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setEmojiCompatEnabled(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Lhg;->r:Lgp3;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lgp3;->v(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setKeyListener(Landroid/text/method/KeyListener;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lhg;->r:Lgp3;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lgp3;->k(Landroid/text/method/KeyListener;)Landroid/text/method/KeyListener;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-super {p0, p1}, Landroid/widget/TextView;->setKeyListener(Landroid/text/method/KeyListener;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public setSupportBackgroundTintList(Landroid/content/res/ColorStateList;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lhg;->n:Lc6;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lc6;->y(Landroid/content/res/ColorStateList;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public setSupportBackgroundTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lhg;->n:Lc6;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lc6;->z(Landroid/graphics/PorterDuff$Mode;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public setSupportCompoundDrawablesTintList(Landroid/content/res/ColorStateList;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lhg;->o:Lih;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lih;->k(Landroid/content/res/ColorStateList;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lih;->b()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setSupportCompoundDrawablesTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lhg;->o:Lih;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lih;->l(Landroid/graphics/PorterDuff$Mode;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lih;->b()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final setTextAppearance(Landroid/content/Context;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lhg;->o:Lih;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0, p1, p2}, Lih;->g(Landroid/content/Context;I)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public setTextClassifier(Landroid/view/textclassifier/TextClassifier;)V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1c

    .line 4
    .line 5
    if-ge v0, v1, :cond_1

    .line 6
    .line 7
    iget-object v0, p0, Lhg;->p:Lxc5;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iput-object p1, v0, Lxc5;->p:Ljava/lang/Object;

    .line 13
    .line 14
    return-void

    .line 15
    :cond_1
    :goto_0
    invoke-direct {p0}, Lhg;->getSuperCaller()Lgg;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    iget-object p0, p0, Lgg;->a:Lhg;

    .line 20
    .line 21
    invoke-super {p0, p1}, Landroid/widget/EditText;->setTextClassifier(Landroid/view/textclassifier/TextClassifier;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method
