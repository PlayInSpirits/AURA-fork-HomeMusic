.class public abstract Landroidx/preference/DialogPreference;
.super Landroidx/preference/Preference;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final b0:Ljava/lang/CharSequence;

.field public final c0:Ljava/lang/String;

.field public final d0:Landroid/graphics/drawable/Drawable;

.field public final e0:Ljava/lang/String;

.field public final f0:Ljava/lang/String;

.field public final g0:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    const v0, 0x7f0401a0

    const v1, 0x1010091

    .line 106
    invoke-static {p1, v0, v1}, Ldefpackage/gi1;->p(Landroid/content/Context;II)I

    move-result v0

    .line 107
    invoke-direct {p0, p1, p2, v0}, Landroidx/preference/DialogPreference;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .line 1
    invoke-direct {p0, p1, p2, p3}, Landroidx/preference/Preference;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 2
    .line 3
    .line 4
    sget-object v0, Ldefpackage/bt3;->c:[I

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-virtual {p1, p2, v0, p3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const/16 p2, 0x9

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    if-nez p2, :cond_0

    .line 18
    .line 19
    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    :cond_0
    iput-object p2, p0, Landroidx/preference/DialogPreference;->b0:Ljava/lang/CharSequence;

    .line 24
    .line 25
    if-nez p2, :cond_1

    .line 26
    .line 27
    iget-object p2, p0, Landroidx/preference/Preference;->u:Ljava/lang/CharSequence;

    .line 28
    .line 29
    iput-object p2, p0, Landroidx/preference/DialogPreference;->b0:Ljava/lang/CharSequence;

    .line 30
    .line 31
    :cond_1
    const/16 p2, 0x8

    .line 32
    .line 33
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    if-nez p2, :cond_2

    .line 38
    .line 39
    const/4 p2, 0x1

    .line 40
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    :cond_2
    iput-object p2, p0, Landroidx/preference/DialogPreference;->c0:Ljava/lang/String;

    .line 45
    .line 46
    const/4 p2, 0x6

    .line 47
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    if-nez p2, :cond_3

    .line 52
    .line 53
    const/4 p2, 0x2

    .line 54
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    :cond_3
    iput-object p2, p0, Landroidx/preference/DialogPreference;->d0:Landroid/graphics/drawable/Drawable;

    .line 59
    .line 60
    const/16 p2, 0xb

    .line 61
    .line 62
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    if-nez p2, :cond_4

    .line 67
    .line 68
    const/4 p2, 0x3

    .line 69
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p2

    .line 73
    :cond_4
    iput-object p2, p0, Landroidx/preference/DialogPreference;->e0:Ljava/lang/String;

    .line 74
    .line 75
    const/16 p2, 0xa

    .line 76
    .line 77
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    if-nez p2, :cond_5

    .line 82
    .line 83
    const/4 p2, 0x4

    .line 84
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p2

    .line 88
    :cond_5
    iput-object p2, p0, Landroidx/preference/DialogPreference;->f0:Ljava/lang/String;

    .line 89
    .line 90
    const/4 p2, 0x5

    .line 91
    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 92
    .line 93
    .line 94
    move-result p2

    .line 95
    const/4 p3, 0x7

    .line 96
    invoke-virtual {p1, p3, p2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 97
    .line 98
    .line 99
    move-result p2

    .line 100
    iput p2, p0, Landroidx/preference/DialogPreference;->g0:I

    .line 101
    .line 102
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 103
    .line 104
    .line 105
    return-void
.end method


# virtual methods
.method public m()V
    .locals 6

    .line 1
    iget-object v0, p0, Landroidx/preference/Preference;->o:Ldefpackage/pp3;

    .line 2
    .line 3
    iget-object v0, v0, Ldefpackage/pp3;->i:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Ldefpackage/kp3;

    .line 6
    .line 7
    if-eqz v0, :cond_5

    .line 8
    .line 9
    move-object v1, v0

    .line 10
    :goto_0
    if-eqz v1, :cond_0

    .line 11
    .line 12
    iget-object v1, v1, Ldefpackage/kc1;->I:Ldefpackage/kc1;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-virtual {v0}, Ldefpackage/kc1;->q()Ldefpackage/ld1;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const-string v2, "androidx.preference.PreferenceFragment.DIALOG"

    .line 20
    .line 21
    invoke-virtual {v1, v2}, Ldefpackage/ld1;->D(Ljava/lang/String;)Ldefpackage/kc1;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    goto :goto_2

    .line 28
    :cond_1
    instance-of v1, p0, Landroidx/preference/EditTextPreference;

    .line 29
    .line 30
    const-string v3, "key"

    .line 31
    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v1, :cond_2

    .line 34
    .line 35
    iget-object p0, p0, Landroidx/preference/Preference;->y:Ljava/lang/String;

    .line 36
    .line 37
    new-instance v1, Ldefpackage/jz0;

    .line 38
    .line 39
    invoke-direct {v1}, Ldefpackage/jz0;-><init>()V

    .line 40
    .line 41
    .line 42
    new-instance v5, Landroid/os/Bundle;

    .line 43
    .line 44
    invoke-direct {v5, v4}, Landroid/os/Bundle;-><init>(I)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v5, v3, p0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1, v5}, Ldefpackage/kc1;->c0(Landroid/os/Bundle;)V

    .line 51
    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_2
    instance-of v1, p0, Landroidx/preference/ListPreference;

    .line 55
    .line 56
    if-eqz v1, :cond_3

    .line 57
    .line 58
    iget-object p0, p0, Landroidx/preference/Preference;->y:Ljava/lang/String;

    .line 59
    .line 60
    new-instance v1, Ldefpackage/ec2;

    .line 61
    .line 62
    invoke-direct {v1}, Ldefpackage/ec2;-><init>()V

    .line 63
    .line 64
    .line 65
    new-instance v5, Landroid/os/Bundle;

    .line 66
    .line 67
    invoke-direct {v5, v4}, Landroid/os/Bundle;-><init>(I)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v5, v3, p0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1, v5}, Ldefpackage/kc1;->c0(Landroid/os/Bundle;)V

    .line 74
    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_3
    instance-of v1, p0, Landroidx/preference/MultiSelectListPreference;

    .line 78
    .line 79
    if-eqz v1, :cond_4

    .line 80
    .line 81
    iget-object p0, p0, Landroidx/preference/Preference;->y:Ljava/lang/String;

    .line 82
    .line 83
    new-instance v1, Ldefpackage/gz2;

    .line 84
    .line 85
    invoke-direct {v1}, Ldefpackage/gz2;-><init>()V

    .line 86
    .line 87
    .line 88
    new-instance v5, Landroid/os/Bundle;

    .line 89
    .line 90
    invoke-direct {v5, v4}, Landroid/os/Bundle;-><init>(I)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v5, v3, p0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v1, v5}, Ldefpackage/kc1;->c0(Landroid/os/Bundle;)V

    .line 97
    .line 98
    .line 99
    :goto_1
    invoke-virtual {v1, v0}, Ldefpackage/kc1;->f0(Ldefpackage/kc1;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0}, Ldefpackage/kc1;->q()Ldefpackage/ld1;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    invoke-virtual {v1, p0, v2}, Ldefpackage/pp0;->m0(Ldefpackage/ld1;Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    return-void

    .line 110
    :cond_4
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    const-string v0, ". Make sure to implement onPreferenceDisplayDialog() to handle displaying a custom dialog for this Preference."

    .line 119
    .line 120
    const-string v1, "Cannot display dialog for an unknown Preference type: "

    .line 121
    .line 122
    invoke-static {p0, v0, v1}, Ldefpackage/nz2;->t(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    :cond_5
    :goto_2
    return-void
.end method
