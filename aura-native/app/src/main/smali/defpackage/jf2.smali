.class public final Ldefpackage/jf2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/media/LoudnessCodecController$OnLoudnessCodecUpdateListener;


# instance fields
.field public final synthetic a:Ldefpackage/ns3;


# direct methods
.method public constructor <init>(Ldefpackage/ns3;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldefpackage/jf2;->a:Ldefpackage/ns3;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onLoudnessCodecUpdate(Landroid/media/MediaCodec;Landroid/os/Bundle;)Landroid/os/Bundle;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/jf2;->a:Ldefpackage/ns3;

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/ns3;->p:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Ldefpackage/kf2;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    return-object p2
.end method
