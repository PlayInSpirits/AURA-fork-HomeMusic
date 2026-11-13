.class public final synthetic Ldefpackage/il2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/os/IBinder$DeathRecipient;


# instance fields
.field public final synthetic a:Ldefpackage/bm2;


# direct methods
.method public synthetic constructor <init>(Ldefpackage/bm2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldefpackage/il2;->a:Ldefpackage/bm2;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final binderDied()V
    .locals 3

    .line 1
    iget-object p0, p0, Ldefpackage/il2;->a:Ldefpackage/bm2;

    .line 2
    .line 3
    invoke-virtual {p0}, Ldefpackage/bm2;->f1()Ldefpackage/sk2;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p0}, Ldefpackage/bm2;->f1()Ldefpackage/sk2;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    new-instance v1, Ldefpackage/qa1;

    .line 15
    .line 16
    const/16 v2, 0x12

    .line 17
    .line 18
    invoke-direct {v1, v2, p0}, Ldefpackage/qa1;-><init>(ILjava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ldefpackage/sk2;->a1(Ljava/lang/Runnable;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method
