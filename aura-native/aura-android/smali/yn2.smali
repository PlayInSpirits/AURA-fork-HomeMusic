.class public final Lyn2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lao2;


# instance fields
.field public final synthetic n:Lbj2;


# direct methods
.method public constructor <init>(Lbj2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyn2;->n:Lbj2;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(III)V
    .locals 2

    .line 1
    new-instance v0, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "play_next_insert_pos"

    .line 7
    .line 8
    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 9
    .line 10
    .line 11
    const-string p1, "play_next_count"

    .line 12
    .line 13
    invoke-virtual {v0, p1, p2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 14
    .line 15
    .line 16
    const-string p1, "play_next_target_count"

    .line 17
    .line 18
    invoke-virtual {v0, p1, p3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 19
    .line 20
    .line 21
    new-instance p1, Lva4;

    .line 22
    .line 23
    const-string p2, "com.eddyizm.tempus.PLAY_NEXT_FIXUP"

    .line 24
    .line 25
    sget-object p3, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 26
    .line 27
    invoke-direct {p1, p2, p3}, Lva4;-><init>(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 28
    .line 29
    .line 30
    iget-object p0, p0, Lyn2;->n:Lbj2;

    .line 31
    .line 32
    invoke-virtual {p0, p1, v0}, Lsk2;->b1(Lva4;Landroid/os/Bundle;)Lic2;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    new-instance p1, Ltv1;

    .line 37
    .line 38
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 39
    .line 40
    .line 41
    sget-object p2, Lgq0;->n:Lgq0;

    .line 42
    .line 43
    invoke-static {p0, p1, p2}, Lhw;->b(Lic2;Lkg1;Ljava/util/concurrent/Executor;)V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public final b()Lqi3;
    .locals 0

    .line 1
    iget-object p0, p0, Lyn2;->n:Lbj2;

    .line 2
    .line 3
    return-object p0
.end method
