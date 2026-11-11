.class public final synthetic Lhf0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lif0;


# direct methods
.method public synthetic constructor <init>(Lif0;I)V
    .locals 0

    .line 1
    iput p2, p0, Lhf0;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lhf0;->o:Lif0;

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
    .locals 1

    .line 1
    iget p1, p0, Lhf0;->n:I

    .line 2
    .line 3
    iget-object p0, p0, Lhf0;->o:Lif0;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lkc1;->l()Lnc1;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iget-object p0, p0, Lif0;->l0:Loz;

    .line 13
    .line 14
    invoke-static {p1, p0}, Lsg0;->d(Landroid/app/Activity;Loz;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    invoke-virtual {p0}, Lkc1;->l()Lnc1;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iget-object p0, p0, Lif0;->l0:Loz;

    .line 23
    .line 24
    sget-object v0, Lsg0;->a:Landroid/app/Application;

    .line 25
    .line 26
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    .line 30
    .line 31
    .line 32
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    invoke-static {p0}, Landroid/os/Process;->killProcess(I)V

    .line 37
    .line 38
    .line 39
    const/16 p0, 0xa

    .line 40
    .line 41
    invoke-static {p0}, Ljava/lang/System;->exit(I)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
