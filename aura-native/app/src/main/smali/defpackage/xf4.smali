.class public Ldefpackage/xf4;
.super Ldefpackage/pp0;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final C0:[I


# instance fields
.field public B0:Ldefpackage/pz1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x9

    .line 2
    .line 3
    new-array v0, v0, [I

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, Ldefpackage/xf4;->C0:[I

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 4
        0x5
        0xa
        0xf
        0x14
        0x1e
        0x2d
        0x3c
        -0x2
        -0x1
    .end array-data
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ldefpackage/pp0;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final j0(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 6

    .line 1
    invoke-virtual {p0}, Ldefpackage/kc1;->r()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const v0, 0x7f03002e

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-static {}, Ldefpackage/u52;->c()Ldefpackage/v52;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget-boolean v0, v0, Ldefpackage/v52;->a:Z

    .line 17
    .line 18
    invoke-static {}, Ldefpackage/u52;->c()Ldefpackage/v52;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    iget-boolean v2, v1, Ldefpackage/v52;->A:Z

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-static {}, Ldefpackage/yf4;->c()Ldefpackage/yf4;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    iget-boolean v2, v2, Ldefpackage/yf4;->f:Z

    .line 32
    .line 33
    :goto_0
    new-instance v3, Ldefpackage/vg2;

    .line 34
    .line 35
    invoke-virtual {p0}, Ldefpackage/kc1;->X()Ldefpackage/nc1;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    const/4 v5, 0x0

    .line 40
    invoke-direct {v3, v4, v5}, Ldefpackage/vg2;-><init>(Landroid/content/Context;I)V

    .line 41
    .line 42
    .line 43
    const v4, 0x7f130534

    .line 44
    .line 45
    .line 46
    invoke-virtual {v3, v4}, Ldefpackage/vg2;->p(I)V

    .line 47
    .line 48
    .line 49
    new-instance v4, Ldefpackage/wf4;

    .line 50
    .line 51
    invoke-direct {v4, p0, v5}, Ldefpackage/wf4;-><init>(Ldefpackage/xf4;I)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v3, p1, v4}, Ldefpackage/vg2;->n([Ljava/lang/CharSequence;Ldefpackage/wf4;)V

    .line 55
    .line 56
    .line 57
    new-instance p1, Ldefpackage/wr;

    .line 58
    .line 59
    const/16 v4, 0xe

    .line 60
    .line 61
    invoke-direct {p1, v4}, Ldefpackage/wr;-><init>(I)V

    .line 62
    .line 63
    .line 64
    const v4, 0x7f130532

    .line 65
    .line 66
    .line 67
    invoke-virtual {v3, v4, p1}, Ldefpackage/vg2;->j(ILandroid/content/DialogInterface$OnClickListener;)Ldefpackage/vg2;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    if-eqz v2, :cond_4

    .line 72
    .line 73
    if-eqz v0, :cond_1

    .line 74
    .line 75
    iget-boolean v2, v1, Ldefpackage/v52;->B:Z

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_1
    invoke-static {}, Ldefpackage/yf4;->c()Ldefpackage/yf4;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    iget-boolean v2, v2, Ldefpackage/yf4;->g:Z

    .line 83
    .line 84
    :goto_1
    if-eqz v2, :cond_2

    .line 85
    .line 86
    const v0, 0x7f130533

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0, v0}, Ldefpackage/kc1;->s(I)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    goto :goto_3

    .line 94
    :cond_2
    if-eqz v0, :cond_3

    .line 95
    .line 96
    iget-object v0, v1, Ldefpackage/v52;->C:Ljava/lang/String;

    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_3
    invoke-static {}, Ldefpackage/yf4;->c()Ldefpackage/yf4;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    invoke-virtual {v0}, Ldefpackage/yf4;->d()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    :goto_2
    const v1, 0x7f130530

    .line 108
    .line 109
    .line 110
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    invoke-virtual {p0, v1, v0}, Ldefpackage/kc1;->t(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    :goto_3
    iget-object v1, p1, Ldefpackage/e9;->a:Ldefpackage/a9;

    .line 119
    .line 120
    iput-object v0, v1, Ldefpackage/a9;->f:Ljava/lang/CharSequence;

    .line 121
    .line 122
    new-instance v0, Ldefpackage/wf4;

    .line 123
    .line 124
    const/4 v1, 0x1

    .line 125
    invoke-direct {v0, p0, v1}, Ldefpackage/wf4;-><init>(Ldefpackage/xf4;I)V

    .line 126
    .line 127
    .line 128
    const p0, 0x7f130531

    .line 129
    .line 130
    .line 131
    invoke-virtual {p1, p0, v0}, Ldefpackage/vg2;->k(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 132
    .line 133
    .line 134
    :cond_4
    invoke-virtual {p1}, Ldefpackage/vg2;->create()Ldefpackage/f9;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    return-object p0
.end method
