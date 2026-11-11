.class public final Lcf;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ld93;


# instance fields
.field public final synthetic a:Ldf;


# direct methods
.method public constructor <init>(Ldf;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcf;->a:Ldf;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Ll70;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lcf;->a:Ldf;

    .line 2
    .line 3
    invoke-virtual {p0}, Ldf;->m()Lpf;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, Lpf;->c()V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Ll70;->q:Lgp3;

    .line 11
    .line 12
    iget-object p0, p0, Lgp3;->p:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, Lrm3;

    .line 15
    .line 16
    const-string v0, "androidx:appcompat"

    .line 17
    .line 18
    invoke-virtual {p0, v0}, Lrm3;->A(Ljava/lang/String;)Landroid/os/Bundle;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Lpf;->f()V

    .line 22
    .line 23
    .line 24
    return-void
.end method
