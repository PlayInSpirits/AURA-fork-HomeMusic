.class public final Ltz1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lxh0;


# instance fields
.field public final a:Lqj0;


# direct methods
.method public constructor <init>(Lqj0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ltz1;->a:Lqj0;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Class;
    .locals 0

    .line 1
    const-class p0, Ljava/io/InputStream;

    .line 2
    .line 3
    return-object p0
.end method

.method public final b(Ljava/lang/Object;)Lyh0;
    .locals 1

    .line 1
    check-cast p1, Ljava/io/InputStream;

    .line 2
    .line 3
    new-instance v0, Lhg3;

    .line 4
    .line 5
    iget-object p0, p0, Ltz1;->a:Lqj0;

    .line 6
    .line 7
    invoke-direct {v0, p1, p0}, Lhg3;-><init>(Ljava/io/InputStream;Lqj0;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method
