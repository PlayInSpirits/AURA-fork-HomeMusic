.class public final synthetic Ldefpackage/te1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/media/MediaDrm$OnEventListener;


# instance fields
.field public final synthetic a:Ldefpackage/zg5;


# direct methods
.method public synthetic constructor <init>(Ldefpackage/ue1;Ldefpackage/zg5;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Ldefpackage/te1;->a:Ldefpackage/zg5;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onEvent(Landroid/media/MediaDrm;[BII[B)V
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/te1;->a:Ldefpackage/zg5;

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/zg5;->n:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Ldefpackage/kk0;

    .line 6
    .line 7
    iget-object p0, p0, Ldefpackage/kk0;->x:Ldefpackage/zk;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p3, p2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {p0}, Landroid/os/Message;->sendToTarget()V

    .line 17
    .line 18
    .line 19
    return-void
.end method
