.class public final synthetic Lxt0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxt0;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lxt0;->b:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 2
    .line 3
    new-instance v0, Lcom/eddyizm/tempus/model/Download;

    .line 4
    .line 5
    invoke-direct {v0, p1}, Lcom/eddyizm/tempus/model/Download;-><init>(Lcom/eddyizm/tempus/subsonic/models/Child;)V

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Lxt0;->a:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lcom/eddyizm/tempus/model/Download;->setPlaylistId(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    iget-object p0, p0, Lxt0;->b:Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {v0, p0}, Lcom/eddyizm/tempus/model/Download;->setPlaylistName(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method
