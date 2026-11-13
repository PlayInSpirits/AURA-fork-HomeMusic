.class public final synthetic Ldefpackage/ok0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lcat/ereza/customactivityoncrash/activity/DefaultErrorActivity;


# direct methods
.method public synthetic constructor <init>(Lcat/ereza/customactivityoncrash/activity/DefaultErrorActivity;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Ldefpackage/ok0;->n:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Ldefpackage/ok0;->o:Lcat/ereza/customactivityoncrash/activity/DefaultErrorActivity;

    .line 8
    .line 9
    return-void
.end method

.method public synthetic constructor <init>(Lcat/ereza/customactivityoncrash/activity/DefaultErrorActivity;Ldefpackage/oz;)V
    .locals 0

    .line 10
    const/4 p2, 0x0

    iput p2, p0, Ldefpackage/ok0;->n:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldefpackage/ok0;->o:Lcat/ereza/customactivityoncrash/activity/DefaultErrorActivity;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    iget p1, p0, Ldefpackage/ok0;->n:I

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/ok0;->o:Lcat/ereza/customactivityoncrash/activity/DefaultErrorActivity;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget p1, Lcat/ereza/customactivityoncrash/activity/DefaultErrorActivity;->N:I

    .line 9
    .line 10
    new-instance p1, Ldefpackage/e9;

    .line 11
    .line 12
    invoke-direct {p1, p0}, Ldefpackage/e9;-><init>(Landroid/content/Context;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p1, Ldefpackage/e9;->a:Ldefpackage/a9;

    .line 16
    .line 17
    iget-object v1, v0, Ldefpackage/a9;->a:Landroid/view/ContextThemeWrapper;

    .line 18
    .line 19
    const v2, 0x7f1300d1

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, v2}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    iput-object v1, v0, Ldefpackage/a9;->d:Ljava/lang/CharSequence;

    .line 27
    .line 28
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-static {p0, v1}, Ldefpackage/sg0;->b(Landroid/content/Context;Landroid/content/Intent;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    iput-object v1, v0, Ldefpackage/a9;->f:Ljava/lang/CharSequence;

    .line 37
    .line 38
    const v0, 0x7f1300ce

    .line 39
    .line 40
    .line 41
    const/4 v1, 0x0

    .line 42
    invoke-virtual {p1, v0, v1}, Ldefpackage/e9;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Ldefpackage/e9;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    new-instance v0, Ldefpackage/vr;

    .line 47
    .line 48
    const/4 v1, 0x1

    .line 49
    invoke-direct {v0, v1, p0}, Ldefpackage/vr;-><init>(ILjava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    const v1, 0x7f1300d0

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1, v1, v0}, Ldefpackage/e9;->e(ILandroid/content/DialogInterface$OnClickListener;)Ldefpackage/e9;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-virtual {p1}, Ldefpackage/e9;->h()Ldefpackage/f9;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    const v0, 0x102000b

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1, v0}, Ldefpackage/dg;->findViewById(I)Landroid/view/View;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    check-cast p1, Landroid/widget/TextView;

    .line 71
    .line 72
    if-eqz p1, :cond_0

    .line 73
    .line 74
    invoke-virtual {p0}, Ldefpackage/df;->getResources()Landroid/content/res/Resources;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    const v0, 0x7f0702fa

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getDimension(I)F

    .line 82
    .line 83
    .line 84
    move-result p0

    .line 85
    const/4 v0, 0x0

    .line 86
    invoke-virtual {p1, v0, p0}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 87
    .line 88
    .line 89
    :cond_0
    return-void

    .line 90
    :pswitch_0
    sget p1, Lcat/ereza/customactivityoncrash/activity/DefaultErrorActivity;->N:I

    .line 91
    .line 92
    sget-object p1, Ldefpackage/sg0;->a:Landroid/app/Application;

    .line 93
    .line 94
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 95
    .line 96
    .line 97
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 98
    .line 99
    .line 100
    move-result p0

    .line 101
    invoke-static {p0}, Landroid/os/Process;->killProcess(I)V

    .line 102
    .line 103
    .line 104
    const/16 p0, 0xa

    .line 105
    .line 106
    invoke-static {p0}, Ljava/lang/System;->exit(I)V

    .line 107
    .line 108
    .line 109
    return-void

    .line 110
    nop

    .line 111
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
