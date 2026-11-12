.class public final Ltw2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final a:Lf42;

.field public final b:Ljava/util/List;

.field public final c:Lsh0;


# direct methods
.method public constructor <init>(Lf42;Lsh0;)V
    .locals 2

    .line 1
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "Argument must not be null"

    .line 7
    .line 8
    invoke-static {p1, v1}, Lh12;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Ltw2;->a:Lf42;

    .line 12
    .line 13
    invoke-static {v0, v1}, Lh12;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Ltw2;->b:Ljava/util/List;

    .line 17
    .line 18
    invoke-static {p2, v1}, Lh12;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    iput-object p2, p0, Ltw2;->c:Lsh0;

    .line 22
    .line 23
    return-void
.end method
